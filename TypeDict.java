import java.util.HashMap;

public class TypeDict {
    public HashMap<PokemonType, PokemonType> Map;

    public TypeDict() {
        Initialize();
    }

    public void Initialize() {
        // Declare All Types
        PokemonType fire = new PokemonType("Fire");
        PokemonType water = new PokemonType("Water");
        PokemonType grass = new PokemonType("Grass");
        PokemonType bug = new PokemonType("Bug");
        PokemonType ground = new PokemonType("Ground");

        // Add Strengths
        water.addStrengths(fire);
        fire.addStrengths(grass);
        fire.addStrengths(bug);

        // Add Weaknesses
        fire.addWeakness(water);
        fire.addWeakness(ground);

        System.out.println(fire.generateReport());
    }
}
