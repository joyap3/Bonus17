/**
 * Created by joyapuryear on 7/17/17.
 */
public class MagicUsingCharacter extends GameCharacter {
    private int magicalEnergy = 0;

    public MagicUsingCharacter(String name, int strength, int intellegence, int magicalEnergy) {
        super(name, strength, intellegence);
        this.magicalEnergy = magicalEnergy;
    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Magical Energy: "+ magicalEnergy);
    }
}
