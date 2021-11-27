public class Driver {
  public static void main(String[] args) {
		  PokemonType fire = new PokemonType("Fire");
        fire.addStrengths("Grass");
        fire.addStrengths("Bug");

        fire.addWeakness("Water");
        fire.addWeakness("Ground");

        System.out.println(fire.generateReport());
  }
}