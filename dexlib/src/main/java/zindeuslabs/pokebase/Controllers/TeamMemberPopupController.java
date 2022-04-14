package zindeuslabs.pokebase.Controllers;

import zindeuslabs.pokebase.App;
import zindeuslabs.pokebase.Pokemon;
import zindeuslabs.pokebase.PokemonTransfer;
import zindeuslabs.pokebase.PokemonType;
import zindeuslabs.pokebase.PokemonTypeNames;
import zindeuslabs.pokebase.Potion;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TeamMemberPopupController {
    @FXML
    public TextField txtDexNumber;
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtType;
    @FXML
    public TextField txtTrainer;
    @FXML
    public TextField txtIDNumber;
    @FXML
    public TextField txtHeldItem;

    @FXML
    public void submitPopup() throws IOException {
        Pokemon p = new Pokemon(new PokemonType(txtDexNumber.getText()));

        PokemonTransfer.pokemon = p;
        p.setName(txtName.getText(), false);
        PokemonTransfer.dexNumber = Integer.parseInt(txtDexNumber.getText());
        PokemonTransfer.name = txtName.getText();
        PokemonTransfer.type = PokemonTypeNames.valueOf(txtDexNumber.getText());
        PokemonTransfer.trainer = txtTrainer.getText();
        PokemonTransfer.heldItem = new Potion(p);
        PokemonTransfer.idNumber = Integer.parseInt(txtIDNumber.getText());

        TeamController.state = "ADD_POKEMON";
        App.setRoot("team");
    }
}
