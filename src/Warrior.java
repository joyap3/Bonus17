/**
 * Created by joyapuryear on 7/17/17.
 */
public class Warrior extends GameCharacter {
    protected String weaponType =null;

    public Warrior(String name, int strength, int intellegence, String weaponType) {
        super(name, strength, intellegence);
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Weapon Type: " + weaponType + "\n");

    }
}
