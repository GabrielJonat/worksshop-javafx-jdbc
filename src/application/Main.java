package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage stage) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("Sample JavaFX App");
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Scene getMainScene() {
		
		return scene;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
