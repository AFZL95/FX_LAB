package Chart;
/**
 * Created by FZL on 7/26/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class QuarterlySales extends Application {

    @Override
    public void start(Stage primaryStage) {
        CategoryAxis hAxis = new CategoryAxis();
        hAxis.setLabel("SalesPerson");

        NumberAxis vAxis = new NumberAxis();
        vAxis.setLabel("New Car Sales");

        BarChart<String, Number> bcSales = new BarChart<>(hAxis, vAxis);
        bcSales.setTitle("1st Quarter Sales Report");
        //specify my type of data in the chart
        XYChart.Series<String,Number> jan = new XYChart.Series<>();
        XYChart.Series<String,Number> feb = new XYChart.Series<>();
        XYChart.Series<String,Number> mar = new XYChart.Series<>();

        jan.setName("January");
        feb.setName("February");
        mar.setName("March");

        //adding the data
        jan.getData().add(new XYChart.Data<String, Number>("Mary",120000));
        jan.getData().add(new XYChart.Data<String, Number>("Tom",100000));

        feb.getData().add(new XYChart.Data<String, Number>("Mary",90000));
        feb.getData().add(new XYChart.Data<String, Number>("Tom",50000));

        mar.getData().add(new XYChart.Data<String, Number>("Mary",55000));
        mar.getData().add(new XYChart.Data<String, Number>("Tom",130000));

        bcSales.getData().add(jan);
        bcSales.getData().add(feb);
        bcSales.getData().add(mar);

        //and the most boring part ...
        FlowPane root = new FlowPane();
        root.getChildren().add(bcSales);

        Scene scene = new Scene(root, 600, 500);

        primaryStage.setTitle("Quarterly Sales");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
