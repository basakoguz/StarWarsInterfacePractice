import java.util.Random;
import java.util.concurrent.TimeUnit;


public class StarWarsInterfacePractice{

  public static Character summonCharacter() { //Will return a character.
    System.out.println("A new character has been summoned...");
    Random rand = new Random(); //Randomly create an Enemy or Hero.
    if (Math.abs(rand.nextInt()) %2 == 0){
      return new Enemy();
    } else {
      return new Hero();
    }
  }

  public static void main(String[] args) throws InterruptedException{
    Enemy DarthVader = new Enemy();
    Hero ObiWanKenobi = new Hero();
    System.out.println("Enemy draws weapon: " + DarthVader.getWeapon());
    TimeUnit.SECONDS.sleep(2);
    System.out.println("Hero draws weapon: " + ObiWanKenobi.getWeapon());
    TimeUnit.SECONDS.sleep(2);
    DarthVader.attack();
    TimeUnit.SECONDS.sleep(1);
    ObiWanKenobi.attack();
    TimeUnit.SECONDS.sleep(1);
    DarthVader.heal();
    TimeUnit.SECONDS.sleep(1);
    ObiWanKenobi.heal();
    TimeUnit.SECONDS.sleep(1);
    Character spy = summonCharacter(); //We don't know if the spy will be Enemy or Hero.
    TimeUnit.SECONDS.sleep(2);
    if (spy instanceof Hero){
      System.out.println("A new HERO arrived to help you!");
    } else{
      System.out.println("A new ENEMY arrived to destroy you...");
    }
    TimeUnit.SECONDS.sleep(2);
    spy.attack(); //Now we know if spy is an Enemy or Hero.
    TimeUnit.SECONDS.sleep(1);
    spy.heal();
    if (spy instanceof Hero){
      System.out.println("You won!");
    } else{
      System.out.println("You lost...");
    }
  }
}
