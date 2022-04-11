package zindeuslabs.pokebase.Controllers;

import zindeuslabs.pokebase.App;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class TeamController {
    @FXML
    private ListView lstView;

    @FXML
    private void switchToPokedex() throws IOException {
        App.setRoot("pokedex");
    }

    @FXML
    private void addPokemon() {
        lstView.getItems().add("Test "+new Random().nextInt(100));
    }
}
