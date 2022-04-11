package zindeuslabs.pokebase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    public static Scene scene;
    private static Boolean isInit = false;

    private static final String INIT_SCREEN = "team";
    private static final int INIT_X = 640;
    private static final int INIT_Y = 480;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML(INIT_SCREEN), INIT_X, INIT_Y);
        isInit = true;
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}