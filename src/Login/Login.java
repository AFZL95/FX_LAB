package Login;/**
 * Created by FZL on 7/13/2016.
 */
// It's a Simple Login pop Up
//it uses a CSS for being more cool
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        GridPane G = new GridPane();
        G.setAlignment(Pos.CENTER);
        G.setHgap(10);
        G.setVgap(10);
        G.setPadding( new Insets(25,25,25,25));

        Scene scene = new Scene(G , 300 , 275);

        //*************  Declaring the equipment  *************//

        Text scenetitle = new Text("Please Login: ");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        Label userName = new Label("User Name:");
        TextField userTextField = new TextField();

        Label pw = new Label("Password: ");
        PasswordField pwBox = new PasswordField();

        //*************  End of Declaring the equipment  *************//

        //adding the equipment to the appripriate position of gridPane
        G.add(scenetitle,0,0,2,1);
        G.add(userName,0,1);
        G.add(userTextField, 1,1);
        G.add(pw,0,2);
        G.add(pwBox,1,2);

        //G.setGridLinesVisible(true);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        G.add(hbBtn,1,4);

        final Text actiontarget = new Text();
        G.add(actiontarget,1,6);

        btn.setOnAction(event ->
        {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Sign in button pressed");

        });


        // and adding the CSS file to our project
        scene.getStylesheets().add(Login.class.getResource("Login.css").toExternalForm());

        //finalizing stuff
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
