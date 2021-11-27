import java.util.ArrayList;
import java.util.List;

public class PokemonType {
    public PokemonTypeName Name;
    public List<PokemonTypeName> Weaknesses;
    public List<PokemonTypeName> Strengths;

    public PokemonType() {}

    public PokemonType(String typeName) {
        try {
            this.Name = PokemonTypeName.valueOf(typeName);
        } catch (IllegalArgumentException iae) {
            this.Name = PokemonTypeName.Normal;
        }
        Weaknesses = new ArrayList<PokemonTypeName>();
        Strengths = new ArrayList<PokemonTypeName>();
    }

    public boolean addWeakness(String typeName) {
        return Weaknesses.add(PokemonTypeName.valueOf(typeName));
    }

    public boolean addStrengths(String typeName) {
        return Strengths.add(PokemonTypeName.valueOf(typeName));
    }

    public boolean removeWeakness(String typeName) {
        return Weaknesses.remove(PokemonTypeName.valueOf(typeName));
    }

    public boolean removeStrengths(String typeName) {
        return Strengths.remove(PokemonTypeName.valueOf(typeName));
    }

    public boolean isWeakAgainst(String typeName) {
        return Weaknesses.contains(PokemonTypeName.valueOf(typeName));
    }

    public boolean isStrongAgainst(String typeName) {
        return Strengths.contains(PokemonTypeName.valueOf(typeName));
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