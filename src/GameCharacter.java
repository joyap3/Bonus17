/**
 * Created by joyapuryear on 7/17/17.
 */
public abstract class GameCharacter {
    private String name = null;
    private int strength = 0;
    private int intellegence = 0;


    public GameCharacter(String name, int strength, int intellegence) {
        this.name = name;
        this.strength = strength;
        this.intellegence = intellegence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntellegence() {
        return intellegence;
    }

    public void setIntellegence(int intellegence) {
        this.intellegence = intellegence;
    }

    public void play() {
        System.out.println("Charater name: " + name);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intellegence);

    }


}

