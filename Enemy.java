

public class Enemy implements Character{ //Has to implement all methods in the Character interface.
  // Can also have additional methods too.

  public String weapon = "lightsaber";

  public Enemy() {

  }

  public String getWeapon(){
    return (String)this.weapon;
  }

  public void attack(){ //Has to exist. Has to be the same within the Character interface.
    System.out.println("The enemy attacks you!");
  }

  public void heal(){ //Has to exist. Has to be the same within the Character interface.
    System.out.println("The enemy heals himself.");
  }

  public void weaponDraw(){
    System.out.println("Draw out weapon...");
  }

}
