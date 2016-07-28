package Chart;/**
 * Created by FZL on 7/26/2016.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class monthlyChart extends Application {

    @Override
    public void start(Stage primaryStage) {
        ObservableList<PieChart.Data> piData =
                FXCollections.observableArrayList(
                        new PieChart.Data("برق" ,125),
                        new PieChart.Data("خوردنی جات" ,235),
                        new PieChart.Data("تفریح", 200),
                        new PieChart.Data("تلفن" , 80)
                );
        PieChart budget = new PieChart(piData);
        budget.setTitle("هزینه ماهانه");
        FlowPane root = new FlowPane();
        root.getChildren().add(budget);
        Scene scene = new Scene(root , 500 ,500);

        primaryStage.setTitle("monthlyBudget");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
