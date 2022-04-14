package zindeuslabs.pokebase;

public class Potion extends PokemonItem {
    public Potion(Pokemon ownerIn) {
        this.owner = ownerIn;
    }

    @Override
    public void Use() {
        this.owner.adjustHP(20); // Add 20 HP
    }
}
