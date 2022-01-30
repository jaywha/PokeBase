import java.util.ArrayList;
import java.util.List;

public class PokemonType {
    public PokemonTypeNames Name;
    public List<PokemonType> Weaknesses;
    public List<PokemonType> Strengths;

    public PokemonType() {}

    public PokemonType(String typeName) {
        try {
            this.Name = PokemonTypeNames.valueOf(typeName);
        } catch (IllegalArgumentException iae) {
            this.Name = PokemonTypeNames.Normal;
        }
        Weaknesses = new ArrayList<PokemonType>();
        Strengths = new ArrayList<PokemonType>();
    }

    /**
     * Attack of this type will be weak against a Pokemon of the given typeName
     * @param typeName - The defender's type
     * @return true - if typeName was added
     */
    public boolean addWeakness(PokemonType typeName) {
        return Weaknesses.add(typeName);
    }

    /**
     * Attack of this type will be strong against a Pokemon of the given typeName
     * @param typeName - The defender's type
     * @return success - if typeName was added
     */
    public boolean addStrengths(PokemonType typeName) {
        return Strengths.add(typeName);
    }

    /**
     * Attack of this type will be weak against a Pokemon of the given typeName
     * @param typeName - The defender's type
     * @return true - if typeName was removed
     */
    public boolean removeWeakness(PokemonType typeName) {
        return Weaknesses.remove(typeName);
    }

    /**
     * Attack of this type will be strong against a Pokemon of the given typeName
     * @param typeName - The defender's type
     * @return true - if typeName was removed
     */
    public boolean removeStrengths(PokemonType typeName) {
        return Strengths.remove(typeName);
    }

    /**
     * Attack of this type will be weak against a Pokemon of the given typeName
     * @param typeName - The defender's type
     * @return true - if typeName is in Weakness list
     */
    public boolean isWeakAgainst(PokemonType typeName) {
        return Weaknesses.contains(typeName);
    }

    /**
     * Attack of this type will be weak against a Pokemon of the given typeName
     * @param typeName - The defender's type
     * @return true - if typeName is in Strengths list
     */
    public boolean isStrongAgainst(PokemonType typeName) {
        return Strengths.contains(typeName);
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