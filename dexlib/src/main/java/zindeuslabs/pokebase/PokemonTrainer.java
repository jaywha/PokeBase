package zindeuslabs.pokebase;
import java.util.HashMap;

public class PokemonTrainer {
    private String name;
    private HashMap<Integer, Pokemon> team;

    public PokemonTrainer(String nameIn) {
        this.name = nameIn;
    }

    public String getName() {
        return name;
    }

    public Pokemon getTeamMember(String nickname) {
        for (Pokemon pokemon : team.values()) {
            if (pokemon.getName().toUpperCase() == nickname.trim().toUpperCase()) {
                return pokemon;
            }
        }

        return null;
    }

    public Pokemon getTeamMemberByIndex(int teamIndex) {
        return team.get(teamIndex);
    }
}
