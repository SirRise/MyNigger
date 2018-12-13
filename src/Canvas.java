import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class Canvas extends Application {

	private static final String name = "Canvas";
	private Label label;

	@Override
	public void init() {
		label = new Label("Nigger");
	}
	
	@Override
	public void start(Stage stage) {
		StackPane pane = new StackPane();
		pane.getChildren().add(label);
		Scene scene = new Scene(pane, 200, 200);
		stage.setTitle(name);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	

}
