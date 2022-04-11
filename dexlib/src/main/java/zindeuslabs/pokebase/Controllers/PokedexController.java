package zindeuslabs.pokebase.Controllers;

import zindeuslabs.pokebase.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class PokedexController {

    @FXML
    private void switchToTeam() throws IOException {
        App.setRoot("team");
    }
}