package ShapeGames.Sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane root = new StackPane();


        // add a leaf node
        Circle cir = new Circle(-200,200,100);
        Circle cir_2 = new Circle(200,200,50);
        cir.setFill(Color.CORAL);
        root.getChildren().add(cir);
        cir_2.setFill(Color.WHITE);
        root.getChildren().add(cir_2);


        //*******************//  make it more Fun  //*******************//
    /*
        //making a random number
        Random RND = new Random();
        int High = 500;
        int[] numbers = new int[10];
        for( int i= 0 ; i<10 ; i++){
            numbers[i] = RND.nextInt((High+1));
            System.out.println(numbers[i]);

        }
    */
        //Preparing the scene
        Scene SCENE = new Scene(root , 1200 , 800);
        primaryStage.setTitle("Scene Graph Example" );
        primaryStage.setScene(SCENE);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
