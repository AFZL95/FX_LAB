package Text_with_Style;import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by FZL on 7/19/2016.
 */
public class AddTextWithStyle extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();

        Scene scene = new Scene(pane, 400, 450);

        pane.setTop(addHBox("Top"));
        pane.setLeft(addVBox("Left"));
        pane.setRight(addVBox("Right"));
        pane.setBottom(addHBox("Bottom"));

        scene.getStylesheets().add("textStyles.css");

        primaryStage.setTitle("Text Stuff!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
//  lays out conyent horizontally in a single row
    public static HBox addHBox(String str)
    {
        HBox hbox = new HBox();
        Text text = new Text(str);
        hbox.setId ("hbox");
        text.setId("textstyle");
        hbox.getChildren().add(text);
        return hbox;
    }
//  lays out content vertically in a single column
    public static VBox addVBox(String str)
    {
        VBox vbox = new VBox();
        Text text = new Text(str);
        text.setId("textstyle");
        vbox.setId("vbox");
        vbox.getChildren().add(text);
        return vbox;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }


}
