package zindeuslabs.pokebase;
import java.util.HashMap;
import java.util.Map;

public class Pokemon {
    private String name;
    private String nickName;
    private PokemonTrainer owner;

    private int pokedexIndex;
    private int level;
    // TODO: Change from Object --> PokemonItem
    private Object heldItem;

    private PokemonType mainType;
    private PokemonType secondaryType;
    private HashMap<Integer, PokemonMove> moves;

    public Pokemon(PokemonType mainType) {
        this.mainType = mainType;
        Init();
    }

    public Pokemon(PokemonType mainType, PokemonType secondaryType) {
        this.mainType = mainType;
        this.secondaryType = secondaryType;
        Init();
    }

    private void Init() {
        // 1. Set Name
        name = "Pocket Monster";

        // 2. Set initial moves
        moves = new HashMap<Integer, PokemonMove>();

        // 3. Set type and level
        // type set in ctor
        level = 1;

        // 4. Set owner (a trainer or wilderness)
        owner = new PokemonTrainer("wilderness");

        // 5. Set held item
        heldItem = null;
    }

    public String getName() {
        return nickName == null || nickName.isEmpty() ? name : nickName;
    }

    public PokemonType getPrimaryType() {
        return this.mainType;
    }

    public PokemonType getSecondaryType() {
        return this.secondaryType;
    }

    public String getMoves() {
        StringBuilder moveList = new StringBuilder("\"moveList\": [");
        for (Map.Entry<Integer, PokemonMove> move : moves.entrySet()) {
            moveList.append("{");
            moveList.append(JSONStringUtils.asJSON(JSONTypes.Attribute, "Index", move.getKey().toString()));
            moveList.append(JSONStringUtils.asJSON(JSONTypes.Attribute, "Move Details", move.getValue().toString()));
            moveList.append("}");
        }
        moveList.append("{}"); // empty move for now
        moveList.append("]\r\n");
        return moveList.toString();
    }

    @Override
    public String toString() {
        return !nickName.isBlank() ? nickName+" ("+name+")" : name;
    }
}
