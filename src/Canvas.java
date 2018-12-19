

import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class Canvas extends Application {

	private static final String name = "Canvas";
	private Label label;

	@Override
	public void init() {
		label = new Label("Nigger");
	}
	
//	@Override
//	public void start(Stage stage) {
////		StackPane pane = new Graph();
////		Scene scene = new Scene(pane, 200, 200);
////		stage.setTitle(name);
////		stage.setScene(scene);
////		stage.show();
//		
////		Group root = new Group();
////		Scene scene = new Scene(root, 500, 500, Color.BLACK);
////		stage.setTitle("Ultrakek");
////		stage.setScene(scene);
////		stage.show();
//		
//		
//		
//	}
	
	@Override public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Month");
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
                
        lineChart.setTitle("Stock Monitoring, 2010");
        //defining a series
        XYChart.Series<Number, Number> series = new XYChart.Series();
        series.setName("My portfolio");
        //populating the series with data
        series.getData().add(new XYChart.Data<Number, Number>(1, 23));
        series.getData().add(new XYChart.Data<Number, Number>(2, 14));
        series.getData().add(new XYChart.Data<Number, Number>(3, 15));
        series.getData().add(new XYChart.Data<Number, Number>(4, 24));
        series.getData().add(new XYChart.Data<Number, Number>(5, 34));
        series.getData().add(new XYChart.Data<Number, Number>(6, 36));
        series.getData().add(new XYChart.Data<Number, Number>(7, 22));
        series.getData().add(new XYChart.Data<Number, Number>(8, 45));
        series.getData().add(new XYChart.Data<Number, Number>(9, 43));
        series.getData().add(new XYChart.Data<Number, Number>(10, 17));
        series.getData().add(new XYChart.Data<Number, Number>(11, 29));
        series.getData().add(new XYChart.Data<Number, Number>(12, 25));
        
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);
       
        stage.setScene(scene);
        stage.show();
    }
	
	public static void main(String[] args) {
		launch();
	}
	

}
