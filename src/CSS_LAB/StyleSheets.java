package CSS_LAB;/**
 * Created by FZL on 7/26/2016.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class StyleSheets extends Application {
    //adding a label for output! where i wanna say Hellow world
    Label lblOutput;
    @Override
    public void start(Stage primaryStage) {

        Label lbl = new Label("Press the button to see a message");
        lblOutput = new Label(null);

        Button btn = new Button();
        btn.setText("Say 'Hello World'");
//      when the button is clicked , take it as an ActionEvent
        btn.setOnAction(new EventHandler<ActionEvent>() {
//      then handle the event , (what to do?)
            @Override
            public void handle(ActionEvent event) {
                lblOutput.setText("Hello World!");
            }
        });

        //in the case of we want to see the Java's Old CSS system!
        //  setUserAgentStylesheet(STYLESHEET_CASPIAN);
        //this would take the textstyle css and apply it to the "lbloutput"
        lblOutput.setId("textstyle");

        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        root.setOrientation(Orientation.VERTICAL);
        root.getChildren().addAll(lbl, btn, lblOutput);

        Scene scene = new Scene(root, 300, 250);
//      say the code that i wanna tie (attach) the CSS code to my code
        scene.getStylesheets().add("CSS_LAB/styles.css");

        primaryStage.setTitle("CSS Lab");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
