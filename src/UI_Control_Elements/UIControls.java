package UI_Control_Elements;import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by FZL on 7/19/2016.
 */
public class UIControls extends Application {

    @Override
    public void start (Stage primaryStage){
        Button btn = new Button();
        btn.setText("I'm a Button");

        Label lbl = new Label("I'm a Label!");

        TextField tf = new TextField("enter the text here!");

        Hyperlink hl = new Hyperlink("I'm a hyperlink");

        RadioButton rb = new RadioButton("radio Button");
        rb.setStyle(" -fx-base : #61a2b2");

        CheckBox cb = new CheckBox("check Box");

        ProgressBar pb = new ProgressBar();
        pb.setStyle("-fx-border-style: groove; ");

        ScrollBar sb = new ScrollBar();

        Image imageHome = new Image("home.png");
        Button btn_2 = new Button("search" , new ImageView(imageHome));

        PasswordField pf = new PasswordField();

//      use a grid layout to place controls in the window
        GridPane grid = new GridPane();

        //set grid attributes
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(50);
        grid.setPadding(new Insets(25,25,25,25));

//      add controls to the grid using col and row numbers
//      GridPaneInstance.add( Item , # of column , # of rows);
        grid.add(btn ,0,0);
        grid.add(lbl ,1,0);
        grid.add(tf ,2,0);
        grid.add(rb ,0,1);
        grid.add(cb ,1,1);
        grid.add(hl ,2,1);
        grid.add(pb ,0,2);
        grid.add(sb ,1,2);
        grid.add(btn_2 ,2,2);
        grid.add(pf ,0,3,3,1);


        Scene SCENE = new Scene(grid , 500,500);
        primaryStage.setTitle("UI controls");
        primaryStage.setScene(SCENE);
        primaryStage.show();

    }






    //launching the rocket
    public static void main (String[] args){
        launch(args);
    }

}
