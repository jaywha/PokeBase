import java.util.ArrayList;
import java.util.List;

public class PokemonType {
    public PokemonTypeNames Name;
    public List<PokemonTypeNames> Weaknesses;
    public List<PokemonTypeNames> Strengths;

    public PokemonType() {}

    public PokemonType(String typeName) {
        try {
            this.Name = PokemonTypeNames.valueOf(typeName);
        } catch (IllegalArgumentException iae) {
            this.Name = PokemonTypeNames.Normal;
        }
        Weaknesses = new ArrayList<PokemonTypeNames>();
        Strengths = new ArrayList<PokemonTypeNames>();
    }

    public boolean addWeakness(String typeName) {
        return Weaknesses.add(PokemonTypeNames.valueOf(typeName));
    }

    public boolean addStrengths(String typeName) {
        return Strengths.add(PokemonTypeNames.valueOf(typeName));
    }

    public boolean removeWeakness(String typeName) {
        return Weaknesses.remove(PokemonTypeNames.valueOf(typeName));
    }

    public boolean removeStrengths(String typeName) {
        return Strengths.remove(PokemonTypeNames.valueOf(typeName));
    }

    public boolean isWeakAgainst(String typeName) {
        return Weaknesses.contains(PokemonTypeNames.valueOf(typeName));
    }

    public boolean isStrongAgainst(String typeName) {
        return Strengths.contains(PokemonTypeNames.valueOf(typeName));
    }

    public String toString() {
        return this.Name.toString();
    }

    public String generateReport() {
        return String.format("Type: %s\r\n=======================\r\nStrengths:\r\n\t- %s\r\n=================\r\nWeaknesses:\r\n\t- %s\r\n", 
        this.toString(), 
        ListUtils.join(Weaknesses, "\r\n\t- "), 
        ListUtils.join(Strengths, "\r\n\t- "));
    }
}