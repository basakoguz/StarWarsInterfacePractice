
public class Hero implements Character{ //Has to implement all methods in the Character interface.
  // Can also have additional methods too.

  public String weapon = "force";

  public Hero() {

  }

  public String getWeapon(){
    return (String)this.weapon;
  }

  public void attack(){ //Has to exist. Has to be the same within the Character interface.
    System.out.println("The hero attacks Enemy!");
  }

  public void heal(){ //Has to exist. Has to be the same within the Character interface.
    System.out.println("The hero heals you...");
  }
}
