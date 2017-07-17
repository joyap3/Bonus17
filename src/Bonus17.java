import java.util.ArrayList;

/**
 * Created by joyapuryear on 7/17/17.
 */
public class Bonus17 {
    public static void main(String[] args) {

        

        ArrayList <GameCharacter> gameCharacters = new ArrayList<>();
        gameCharacters.add( new Warrior("Bob",10, 25, "Axe"));
        gameCharacters.add( new Warrior("Jessica",20, 30, "Sword"));
        gameCharacters.add( new Wizard("John",30, 60,75, 77 ));
        gameCharacters.add( new Wizard("Jim",40, 98, 90, 80));
        gameCharacters.add( new Wizard("Lisa",50, 75, 100, 90));

        for (GameCharacter list : gameCharacters) {
            list.play();
            
        }
    }
    
}
