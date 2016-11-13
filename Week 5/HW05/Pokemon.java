import java.util.Scanner;

public class Pokemon {

    // Contains the number of Pokemon Objects created so far. Used as the ID of a newly created Pokemon
    private static int NUM_POKEMONS = 0;

    private String name; // Contains the name of the Pokemon
    private int Id; // Represents the ID of the Pokemon
    private String type; // Represents the Pokemon type which would be either Fire, Water, Electric, or Grass
    private int healthPower; // Represents the health power of the Pokemon
    private double baseAttackPower; // Represents the value by which the Pokemon can reduce another Pokemon's health in 1 hit

    static MyUtils utils = new MyUtils(); // Created MyUtils object to use its methods

    /**
     * */
    public Pokemon(String name, String type, int healthPower, double baseAttackPower) {

        this.name = name;

        if (!((type.equalsIgnoreCase("Fire") || type.equalsIgnoreCase("Water") || type.equalsIgnoreCase("Grass") || type.equalsIgnoreCase("Electric")))) {
            this.type = "Fire";
        } else {
            this.type = utils.formatStr(type);
        }

        if (!(healthPower >= 0)) {
            this.healthPower = 0;
        } else {
            this.healthPower = healthPower;
        }

        if (!(baseAttackPower > 0.0)) {
            this.baseAttackPower = 1.0;
        } else {
            this.baseAttackPower = baseAttackPower;
        }

        this.Id = NUM_POKEMONS;
        NUM_POKEMONS++;
    }

    // Accessors
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.Id;
    }

    public String getType() {
        return this.type;
    }

    public int getHealthPower() {
        return this.healthPower;
    }

    public double getBaseAttackPower() {
        return this.baseAttackPower;
    }

    // Mutators
    public boolean setType(String type) {

        if (type.equals("Fire") || type.equals("Water") || type.equals("Grass") || type.equals("Electric")) {
            this.type = type;
            return true;
        }

        return false;
    }

    public boolean setHealthPower(int healthPower) {

        if (healthPower >= 0) {
            this.healthPower = healthPower;
            return true;
        }

        return false;
    }

    public boolean setBaseAttackPower(double baseAttackPower) {

        if (baseAttackPower > 0.0) {
            this.baseAttackPower = baseAttackPower;
            return true;
        }

        return false;
    }

    public String toString() {

        String result = "Name: " + this.getName() + "\n" +
                "ID: " + this.getId() + "\n" +
                "Type: " + this.getType() + "\n" +
                "Health power: " + this.getHealthPower() + "\n" +
                "Base attack power: " + this.getBaseAttackPower() + "\n";

        return result;
    }

    public boolean isDead() {

        if (this.healthPower == 0) {
            return true;
        }

        return false;
    }

    public void boostHealthPower(int healthPower) {
        this.healthPower += healthPower;
    }

    public void reduceHealthPower(int healthPower) {

        if (healthPower > this.healthPower) {
            this.healthPower = 0;
        } else {
            this.healthPower -= healthPower;
        }

    }

    public static int battle(Pokemon p1, Pokemon p2) {

        while (!(p1.isDead() && p2.isDead())) {

            double multiplier = getAttackMultiplier(p1,p2);

            // p1 attacks first, so p2's health is reduced
            p2.reduceHealthPower((int)p1.getBaseAttackPower() * (int)multiplier);

            // p2 attacks, p1's health is reduced
            p1.reduceHealthPower((int)p2.getBaseAttackPower() * (int)multiplier);

            if (p1.isDead() || p2.isDead()) {
                break;
            }
        }

        if (p1.isDead()) {
            return 2;
        } else if (p2.isDead()) {
            return 1;
        }

        return 0;
    }

    public static double getAttackMultiplier(Pokemon attacker, Pokemon defender) {

        String attackerType = attacker.getType();
        String defenderType = defender.getType();
        double factor;

        if (attackerType.equals(defenderType)) {
            factor = 0.5;
        } else if (attackerType.equals("Grass") && defenderType.equals("Electric") ||
                   attackerType.equals("Electric") && defenderType.equals("Fire") ||
                   attackerType.equals("Water") && defenderType.equals("Electric") ||
                   attackerType.equals("Fire") && defenderType.equals("Electric")) {
            factor = 1.0;

        } else if (attackerType.equals("Grass") && defenderType.equals("Water") ||
                   attackerType.equals("Electric") && defenderType.equals("Water") ||
                   attackerType.equals("Water") && defenderType.equals("Fire") ||
                   attackerType.equals("Fire") && defenderType.equals("Grass")) {
            factor = 2.0;
        } else {
            factor = 0.5;
        }

        return factor;
    }

    public static int battleOracle(Pokemon p1, Pokemon p2) {
        Pokemon winner = p2;

        if (p1.equals(winner)) {
            return 2;
        } else {
            if (p2.equals(winner)) {
                return 1;
            }
        }


        return 0;
    }

    /**
     * Program's main entry point
     *
     * @param args command-line arguments
     * */
    public static void main(String[] args) {
    }

}
