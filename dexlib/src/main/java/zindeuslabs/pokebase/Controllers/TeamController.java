package zindeuslabs.pokebase.Controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import zindeuslabs.pokebase.App;
import zindeuslabs.pokebase.Pokemon;
import zindeuslabs.pokebase.PokemonTransfer;

public class TeamController {
    public static String state = "NORMAL";

    @FXML
    private ListView<Pokemon> lstView;

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
