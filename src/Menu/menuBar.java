package Menu; /**
 * Created by FZL on 7/23/2016.
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class menuBar extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 400, Color.BEIGE);

        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);

        // name of the menu : File menu // submenues : new, save, print, and exit
        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem printMenuItem = new MenuItem("Print");
        MenuItem exitMenuItem = new MenuItem("Exit");

        //add the new menuitems to the fileMenu with an seperator line
        fileMenu.getItems().addAll(newMenuItem, saveMenuItem,printMenuItem,
                new SeparatorMenuItem(), exitMenuItem);


        // name of the menu : languageMenu // submenues : java , python , HTML , javaFX
        // the menu items are checkable
        Menu languageMenu = new Menu("Language");
        CheckMenuItem javaMenuItem = new CheckMenuItem("Java");
        CheckMenuItem pythonMenuItem = new CheckMenuItem("Python");
        CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
        //add these three to the menu
        languageMenu.getItems().addAll(javaMenuItem, pythonMenuItem, htmlMenuItem);

        CheckMenuItem FXMenuItem = new CheckMenuItem("JavaFX");
        //set the all items checked for the defualt
        FXMenuItem.setSelected(true);
        //adding the rest
        languageMenu.getItems().addAll(new SeparatorMenuItem(),FXMenuItem);

        //creating a submenu for the Language Menu easy as a PI
        Menu tutorialMenu = new Menu("Tutorial");
        tutorialMenu.getItems().addAll(
                new MenuItem("Buttons"),
                new MenuItem("Menus"),
                new MenuItem("Images"));

        languageMenu.getItems().add(tutorialMenu);
        //set exiting action to the exit button
        exitMenuItem.setOnAction(actionEvent->Platform.exit());
        //drawing the declerified Menues
        menuBar.getMenus().addAll(fileMenu, languageMenu);
        //and fire!
        primaryStage.setTitle("Adding Menus");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
