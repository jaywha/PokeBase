module zindeuslabs.pokebase {
    requires javafx.controls;
    requires javafx.fxml;

    opens zindeuslabs.pokebase to javafx.fxml;
    exports zindeuslabs.pokebase;

    opens zindeuslabs.pokebase.Controllers to javafx.fxml;
    exports zindeuslabs.pokebase.Controllers;
}
