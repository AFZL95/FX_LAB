package TableView;/**
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class DisplaycontactList extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label response = new Label("");
        Label title = new Label("contact List information Using a TableView\n");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        title.setTextFill(Color.CADETBLUE);

        //using a flowPane for giving space for the Table view stuff
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        //making a scene for the crime!
        Scene scene = new Scene(root, 450, 450);
        //using FXCollections of ObservableList in the data type of contact 
        ObservableList<contact> contactList = FXCollections.observableArrayList(
                new contact("Peggy", "Fisher", "717-555-1212"),
                new contact("Jim", "Freed", "441-456-1345"),
                new contact("Pat", "Keegan", "717-363-1432"),
                new contact("Jane", "Slattery", "441-478-4488"),
                new contact("Cy", "Young", "970-554-1265"),
                new contact("Rob", "Jones", "570-655-1587"),
                new contact("Carol", "King", "215-547-5958"),
                new contact("Bob", "Kauffman", "215-456-6345"),
                new contact("Gloria", "Shilling", "717-785-6092"),
                new contact("Bill", "Sigler", "441-444-1345")
        );
        //declaring that the contactList data are for a TableView data structure called "tvcontacts"
        TableView<contact> tvcontacts;
        tvcontacts = new TableView<contact>(contactList);

        //specify the first column of tvcontacts TableView is First Name
        //by using the firstName SimpleStringProperty in our "contact.java" data model
        TableColumn<contact, String> fName = new TableColumn<>("First Name");
        fName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        //adding the supposed column to the tvcontacts
        tvcontacts.getColumns().add(fName);

        //specify the second column of tvcontacts TableView is Last Name
        //by using the lastName SimpleStringProperty in our "contact.java" data model
        TableColumn<contact, String> lName = new TableColumn<>("Last Name");
        lName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        //adding the supposed column to the tvcontacts
        tvcontacts.getColumns().add(lName);

        //specify the third column of tvcontacts TableView is Cell Phone Number
        //by using the cellPhone SimpleStringProperty in our "contact.java" data model
        TableColumn<contact, String> cell = new TableColumn<>("Cell Phone Number");
        cell.setCellValueFactory(new PropertyValueFactory<>("cellPhone"));
        //adding the supposed column to the tvcontacts
        tvcontacts.getColumns().add(cell);

        //set the preferences
        tvcontacts.setPrefWidth(300);
        tvcontacts.setPrefHeight(300);

        //make the TableView Selective and nice! 
        TableView.TableViewSelectionModel<contact> tvSelcontact =
                tvcontacts.getSelectionModel();

        tvSelcontact.selectedIndexProperty().addListener(new ChangeListener<Number>()
        {
        	//and adding the action
            public void changed(ObservableValue<? extends Number> changed,
                                Number oldVal, Number newVal) {
                int index = (int)newVal;
                response.setText("The cell number for the contact selected is "
                        +contactList.get(index).getCellPhone());
            }
        });

        //and launching the rocket!
        response.setFont(Font.font("Arial", 14));
        root.getChildren().addAll(title,tvcontacts, response);
        primaryStage.setTitle("contact List");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
