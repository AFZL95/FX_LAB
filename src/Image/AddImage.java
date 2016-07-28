package Image;/**
 * Created by FZL on 7/26/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddImage extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        Text title = new Text("this is the heaven ,\n          California");
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
        title.setFill(Color.FIREBRICK);
//      first of all we create an Image with the name of CaliforniaPic
        Image CaliforniaPic = new Image("Image/Desert-to-sea logo.gif");
//      then we must create his sibling , ImageView
        ImageView ivPic = new ImageView(CaliforniaPic);

        pane.setTop(title);
        pane.setCenter(ivPic);

        Scene scene = new Scene(pane, 300, 400);

        primaryStage.setTitle("California");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
