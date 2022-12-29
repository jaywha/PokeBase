package zindeuslabs.pokebase.Controllers;

import zindeuslabs.pokebase.App;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PokedexController {

    @FXML
    public Button switchToTeamButton;

    @FXML
    public Button databaseConfigButton;

    @FXML
    private void switchToTeam() throws IOException {
        App.setRoot("team");
    }

    @FXML
    private void databaseConfig() throws IOException {
        App.setRoot("database");
    }
}