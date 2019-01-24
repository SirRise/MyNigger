import java.util.Scanner;
import javax.script.ScriptException;
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
	private static Label label;
	private static LineChart<Number,Number> lineChart;
	private static final NumberAxis xAxis = new NumberAxis();
	private static final NumberAxis yAxis = new NumberAxis();
	private static Scene scene;
	private static XYChart.Series<Number, Number> series = new XYChart.Series<>();
	private static Scanner sc = new Scanner(System.in);

	@Override
	public void init() {
		label = new Label("Nigger");
	}
	
	@Override public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");
        lineChart = new LineChart<Number,Number>(xAxis,yAxis);
        scene  = new Scene(lineChart,800,600);
        
        try {
			series = FunctionParser.parse("x^4-3x^3-24x^2-5x");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
        lineChart.getData().add(series);
        stage.setScene(scene);
        stage.show();
    }
	
	public static void main(String[] args) {
		launch();
	}
}
