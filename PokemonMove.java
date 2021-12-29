public class PokemonMove {
    private PokemonType moveType;
    private int pokePowerMax;
    private int pokePowerCurrent;
    private double power;
    private Pokemon user;

    public PokemonMove(Pokemon userIn, PokemonType moveType, int startingPokePower, double attackPower) {
        this.user = userIn;
        this.moveType = moveType;
        this.pokePowerMax = startingPokePower;
        this.pokePowerCurrent = startingPokePower;
        this.power = attackPower;
    }

    public int getCurrentPokePower() {
        return this.pokePowerCurrent;
    }

    public double getAttackModifier(Pokemon target) {
        double mod = 1.0;
        if(moveType.isStrongAgainst(target.getPrimaryType().toString())) {
            mod *= 2.0;
        } else if(moveType.isWeakAgainst(target.getPrimaryType().toString())) {
            mod /= 2.0;
        }

        if(moveType.isStrongAgainst(target.getSecondaryType().toString())) {
            mod *= 2.0;
        } else if(moveType.isWeakAgainst(target.getSecondaryType().toString())) {
            mod /= 2.0;
        }

        if(user.getPrimaryType() == moveType || user.getSecondaryType() == moveType) {
            mod *= 2.0;
        }

        return mod;
    }

    public double attack(Pokemon target) {
        return power * getAttackModifier(target);
    }
}
