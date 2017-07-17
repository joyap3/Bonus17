/**
 * Created by joyapuryear on 7/17/17.
 */
public class Wizard extends MagicUsingCharacter {
    private int spellNumber = 0;

    public Wizard(String name, int strength, int intellegence, int magicalEnergy, int spellNumber) {
        super(name, strength, intellegence, magicalEnergy);
        this.spellNumber = spellNumber;

    }

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;


    }

    @Override
    public void play() {
        super.play();
        System.out.println("Spell Number: " + spellNumber + "\n");
    }
}
