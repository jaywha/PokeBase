import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class Pokemon {
    private PokemonTrainer owner;
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
        // 1. Set initial moves
        moves = new HashMap<Integer, PokemonMove>();

        // 2. Set type and level
        // type set in ctor
        level = 1;

        // 3. Set owner (a trainer or wilderness)
        owner = new PokemonTrainer("wilderness");

        // 4. Set held item
        heldItem = null;
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
}
