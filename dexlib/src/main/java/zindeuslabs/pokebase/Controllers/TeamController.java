package zindeuslabs.pokebase.Controllers;

import zindeuslabs.pokebase.App;
import zindeuslabs.pokebase.PokemonTransfer;

import java.io.IOException;
import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.stage.Popup;

public class TeamController {
    public static String state = "NORMAL";

    @FXML
    private ListView lstView;

    @FXML
    public void initialize() {
        if (state == "ADD_POKEMON") {
            lstView.getItems().add(PokemonTransfer.pokemon);
            state = "NORMAL";
        }
    }

    @FXML
    private void switchToPokedex() throws IOException {
        App.setRoot("pokedex");
    }

    @FXML
    private void addPokemon() throws IOException {
        App.setRoot("teammemberpopup");
    }
}
