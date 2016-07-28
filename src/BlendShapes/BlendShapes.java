package BlendShapes;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author FZL
 */
public class BlendShapes extends Application {

    @Override
    public void start(Stage primaryStage) {

//      declaring the type of  root node as a stackPane
        StackPane root = new StackPane();
//      adding the designed objects to the root node as a child
        root.getChildren().add(blendModeObjects());
//      create and initializing the scene
        Scene scene = new Scene(root, 300, 300);
//      setting the title
        primaryStage.setTitle("Blended Shapes");
//      setting the primary stage
        primaryStage.setScene(scene);
//      showing the result
        primaryStage.show();
    }

    static Node blendModeObjects() {
        Group g =new Group();

        Circle c = new Circle(50,50,25);
        c.setFill(Color.DARKGRAY);
        c.setBlendMode(BlendMode.MULTIPLY);

        Rectangle r = new Rectangle(50,50,50,50);
        r.setFill(Color.BLUEVIOLET);

        Rectangle r2 = new Rectangle(170,50,50,50);
        r2.setFill(Color.TEAL);

        Circle c2 = new Circle(170,50,25);
        c2.setFill(Color.CORAL);

        //use rectangle to remove a piece from the circle

        //add circle first, then rectangle on top

        Rectangle r3 = new Rectangle(50,150,50,50);
        r3.setFill(Color.WHITE);

        Circle c3 = new Circle(50,150,25);
        c3.setFill(Color.NAVY);

        g.setBlendMode(BlendMode.SRC_ATOP);
        g.getChildren().addAll(r,c, c2, r2, c3, r3);
        return g;
    }




    /**
     * @param args the command line arguments
     */
//  launching the rocket!
    public static void main(String[] args) {
        launch(args);
    }

}
