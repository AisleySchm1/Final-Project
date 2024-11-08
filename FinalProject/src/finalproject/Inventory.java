package finalproject;

import java.util.ArrayList;
import java.util.Collections;

public class Inventory 
{
	static ArrayList<Weapon> inventory = new ArrayList<Weapon>();


	  public static void fillInventory()
	    {
	      inventory.add(new Weapon("1. Spear", " Turn your enemies into a kebab. ", -60));
	      inventory.add(new Weapon("2. Sword", " An extra long knife to cut down your enemies! ", -70));
	      inventory.add(new Weapon("3. Dagger", " A smaller knife that is very good at stabbing ", -90));
	      inventory.add(new Weapon("4. Bow and Arrows", " Take down your enemies while looking stunning! ", -60));
	    }
}
