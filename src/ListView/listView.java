package ListView; /**
 * Created by FZL on 7/26/2016.
 */

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class listView extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label response = new Label("Select a college or university:");
        // creating a list view of colleges in the format of String
        ListView<String> listViewOfColleges;

        Text title = new Text("Tehran Colleges and Universities");
        title.setFill(Paint.valueOf("#66A164"));
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        // creating a flowPane for the List View thing
        FlowPane root = new FlowPane(10,10);
        root.setAlignment(Pos.CENTER);
        // it's the ingredients of list view
        //if the ingredients are more than the capacity of the preferences size , it aromatically add a scrolling bar
        ObservableList<String> colleges =
                FXCollections.observableArrayList("Tehran university" , "Sharif university of technology"
                    ,"AmirKabir University" , "Beheshti University" , "Elm & Sanaat University");

        //adding the ingredients (colleges) to the "listViewOfColleges" ListView
        listViewOfColleges = new ListView<String>(colleges);
        //setting the preferences of the list view box
        listViewOfColleges.setPrefSize(300,150);

        /* adding the magic that when you click on one of the universities the program say that you clicked on one of them!
        by using the MultipleSelectionModel*/

            MultipleSelectionModel<String> lvSelModel =
                listViewOfColleges.getSelectionModel();
        lvSelModel.selectedItemProperty().
                addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> changed,
                                        String oldVal, String newVal)
                    {
                        response.setText("You selected " + newVal);
                    }

                });


        root.getChildren().add(title);
        root.getChildren().add(listViewOfColleges);
        root.getChildren().add(response);

        Scene scene = new Scene(root, 350, 300);

        primaryStage.setTitle("ListView");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
