package zindeuslabs.pokebase.Controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import zindeuslabs.pokebase.App;

public class DatabaseController {
    
    @FXML
    public Button switchToPokedexButton;

    @FXML
    private void switchToPokedex() throws IOException {
        App.setRoot("pokedex");
    }
}
