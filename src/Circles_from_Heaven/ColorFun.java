package Circles_from_Heaven;import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by FZL on 7/17/2016.
 */
public class ColorFun extends Application{


    public  static int computedX ( int radius , float angleInDegrees , int XofCenter , int YofCenter ){
        return  (int) ( radius * Math.cos(angleInDegrees * Math.PI / 180F)) + XofCenter;
    }

    public  static int computedY ( int radius , float angleInDegrees , int XofCenter , int YofCenter ){
        return  (int) ( radius * Math.sin(angleInDegrees * Math.PI / 180F)) + YofCenter;
    }

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();

        Circle C1 = new Circle(500 , 500 , 350);
        C1.setFill(null);
        C1.setStroke(Color.RED);
        root.getChildren().add(C1);




        for (int i = 0; i < 100; i++) {

            Circle C2 = new Circle(computedX(100, 5 * i + 40, 500, 500), computedY(100, 5 * i + 40, 500, 500), 50);
            //test the output
            System.out.println(C2.getCenterX() + " " + C2.getCenterY());
            C2.setFill(null);
            C2.setStroke(Color.RED);


            //********   Preparing Stuff ********//
//      getting the generated stuff ready and splash it to the canvas
//            root.getChildren().add(C2);

        }


        System.out.println("it's done");

        for (int j = 0; j < 100; j++) {

            Circle C3 = new Circle(computedX(250, 5 * j + 40, 500, 500), computedY(250, 5 * j + 40, 500, 500), 100);
            //test the output
            System.out.println(C3.getCenterX() + " " + C3.getCenterY());
            C3.setFill(null);
            C3.setStroke(Color.VIOLET);


            //********   Preparing Stuff ********//
//      getting the generated stuff ready and splash it to the canvas
            root.getChildren().add(C3);

        }


//      preparing the scene
        Scene SCENE = new Scene(root, 1000, 1000, Color.ANTIQUEWHITE);

//      other initialization stuff
        primaryStage.setTitle("Color Fun");
        primaryStage.setScene(SCENE);
        primaryStage.show();
    }










    /**
     * @param args the command line arguments
     */

    public static void main(String[] args){
        launch(args);
    }

}
