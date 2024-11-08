package finalproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static String parent = "zero";
	  static String weapon = "zero";
	  static int choice = 0;
	  

	    
	  public static void main(String[] args)
	   {
	  Inventory.fillInventory();
	  introduction();
	  quiz();
	  weaponPicker();
	  tourCamp();
	  }

	    public static void introduction()
	    {
	      Scanner userIntInput = new Scanner(System.in);
	      System.out.println("Welcome to the Percy Jackson roleplay game! First off, have you ever read Percy Jackson?");
	      System.out.println("1. No");
	      System.out.println("2. Yes");
	      
	      int choice=userIntInput.nextInt();

	      if (choice == 1)
	       {
	        
	        System.out.println("Percy Jackson is a book about kids who have a human parent and parent that is a Greek god. They go to a place called Camp HalfBlood where they learn about their god parent and are sent on quests to make sure the earth stays safe.\n\nWhen ready, press enter to continue.");

	        //String go = userStringInput.nextLine();
	        startGame();
	        
	       }
	       else if (choice == 2)
	       {
	         startGame();
	       }
	      else 
	       {
	        System.out.println("Hey! Pick the right number next time! Now you gotta restart!");
	       }
	       }

	    public static void startGame()
	    {
	        Scanner userStringInput = new Scanner(System.in);
	        System.out.println("\nHello! Welcome to Camp Halfblood. What is your name?");
	        String name = userStringInput.nextLine();
	        System.out.println("\nHello, "+name+"! You will now take a quiz to see who your godly parent is.");
	       }

	    public static void quiz()
	    {
	    Scanner userStringInput = new Scanner(System.in);
	      
	    System.out.println("\n1. What is your favorite color?");
	    String answer = userStringInput.nextLine();

	    System.out.println("\n2. What is your favorite food?");
	    String answer2 = userStringInput.nextLine();

	    System.out.println("\n3. What's your favorite season?");
	    String answer3 = userStringInput.nextLine();

	    System.out.println("\n4. What is your favorite type of weather?");
	    String answer4 = userStringInput.nextLine();

	    System.out.println("\n5. What is your favorite class in school?");
	    String answer5 = userStringInput.nextLine();

	    System.out.println("\n6. What is your favorite drink?");
	    String answer6 = userStringInput.nextLine();

	    System.out.println("\n7. What is your favorite animal?");
	    String answer7 = userStringInput.nextLine();

	    System.out.println("\n8. What is your favorite non-sport activity?");
	    String answer8 = userStringInput.nextLine();

	    System.out.println("\n9. What is your favorite sport?");
	    String answer9 = userStringInput.nextLine();

	    System.out.println("\n10. What is your favorite song?");
	    String answer10 = userStringInput.nextLine();


	      String [] parents = {"Aphrodite", "Athena", "Artemis", "Ares", "Apollo", "Demeter", "Dionysus", "Hades", "Hera", "Hermes", "Poseidon", "Zeus"};

	      int parentNumber = (int)(Math.random()*12);
	      parent = parents[parentNumber];
	      System.out.println("\nAfter taking this quiz, your godly parent is " + parent + "! Congratulations!");
	       }

	    public static void weaponPicker()
	    {
	      System.out.println("\nNow it is time for you to pick a weapon! Each Weapon has the name, descripition, and maximum damage. \n\nYou can choose from:\n\n");

	      for (int i = 0; i < Inventory.inventory.size(); i++)
	       {
	         
	          System.out.println(Inventory.inventory.get(i).getName() + Inventory.inventory.get(i).getExplanation() + Inventory.inventory.get(i).getDamage());
	       }
	         
	       Scanner userIntInput=new Scanner(System.in);
	         
	      System.out.println("\nPlease press the number of the weapon you want.");
	         
	         int choice = userIntInput.nextInt();

	         if (choice == 1)
	         {
	           Scanner userStringInput=new Scanner(System.in);

	           weapon = Inventory.inventory.get(0).getName();
	           System.out.println("You chose " +Inventory.inventory.get(0).getName() + "." );
	           System.out.println("Press enter to continue!");
	           String go = userStringInput.nextLine(); 
	           
	         }

	        else if (choice == 2)
	          {
	            Scanner userStringInput=new Scanner(System.in);

	            weapon = Inventory.inventory.get(1).getName();
	            System.out.println("You chose " +Inventory.inventory.get(1).getName() + ".\n" );
	            System.out.println("Press enter to continue!");
	             String go = userStringInput.nextLine(); 
	            
	            
	          }

	         else if (choice == 3)
	          {
	           Scanner userStringInput=new Scanner(System.in);

	            weapon = Inventory.inventory.get(2).getName();
	            System.out.println("You chose " +Inventory.inventory.get(2).getName() + "." );
	            System.out.println("Press enter to continue!");
	             String go = userStringInput.nextLine(); 
	            
	          }

	         else if (choice == 4)
	          {
	           Scanner userStringInput=new Scanner(System.in);

	            weapon = Inventory.inventory.get(3).getName();
	            System.out.println("You chose " +Inventory.inventory.get(3).getName() + "." );
	            System.out.println("Press enter to continue!");
	             String go = userStringInput.nextLine(); 
	            
	          }
	       }

	    public static void tourCamp()
	    {
	         Scanner userIntInput = new Scanner(System.in);
	           System.out.println("Hello! Welcome to Camp! My name is Chiron and I am the head of this camp. Would you like me to take you on a tour?");
	           System.out.println("1. Yes");
	           System.out.println("2. No, I want to explore on my own.");
	            choice = userIntInput.nextInt();

	           if (choice == 1)
	            {
	             System.out.println("\nGood choice!\n\nCamp Halfblood consists 6 main areas: the Cabins, the Mess Hall, the Labyrinth, the Strawberry Fields, the North Forest, and the Climbing Wall.\nYou should stay away from the Labyrinth because it is full of dangerous traps and we have yet to explore it. I would also suggest you stay away from the Strawberry Fields, the Climbing Wall, and the North Forest. These areas are very dangerous, especially for new campers.\n\nOut of the other two places I memtioned, would you like to explore those more?\n");
	             System.out.println("1. I want to visit the Cabins!");
	             System.out.println("2. I want to visit the Mess Hall!");
	             System.out.println("3. Nah, I'm ready to explore by myself now.");
	               choice = userIntInput.nextInt();
	            }
	             
	         if (choice == 1)
	               {
	                 cabins();
	               }
	          
	           else if (choice == 2)
	             {
	                 messHall(); 
	             }

	             else if (choice == 3)
	             {
	              System.out.println("Very well. Just stay away from those dangerous areas and you will be fine. Good luck and see you at dinner!\n\nAs Chiron walks away, you begin to ponder what you will do next. Do you want to:\n");
	              System.out.println("1. Ignore what Chiron said and visit the Strawberry fields");
	              System.out.println("2. Ignore what Chiron said and visit the Climbing Wall");
	              System.out.println("3. Ignore what Chiron said and visit the North forest");
	             choice = userIntInput.nextInt();
	             }

	               if (choice == 1)
	               {
	                strawberryFields();
	               }

	               else if (choice == 2)
	               {
	                climbingWall();
	               }

	               else if (choice == 3)
	               {
	                 forest();
	               } 
	                 
	           else if (choice == 2)
	            {
	             System.out.println("Very well. Good luck on your own.\n\nChiron walks away and now you have no idea where you are. You see many things around you, such as a strawberry field, a giant forest, a climbing wall with lava oozing out of it, and so many cabins. Where do you decide to go? ");
	             System.out.println("1. Strawberry field");
	             System.out.println("2. Giant forest");
	             System.out.println("3. Climbing wall with oozing lava");
	                choice = userIntInput.nextInt();
	            }

	             if (choice == 1)
	            {
	             strawberryFields(); 
	            }

	           else if (choice == 2)
	            {
	             forest();
	            }

	           else if (choice == 3)
	            {
	             climbingWall();
	            }
	             
	         
	       }

	    public static void messHall()
	    {
	      Scanner userIntInput = new Scanner(System.in);
	      System.out.println("You and Chiron walk to the Mess Hall and you find it amazing! The beautiful marble structure looks like something out of a fairytale with its tall pillars and intricate designs on the marble are amazing!\n\nChiron tells you this is where you eat all your meals and tells you that you have time to visit once more place before dinner. What do you want to do?\n");
	       System.out.println("1. Visit the Cabins");
	       System.out.println("2. Stay till dinner");
	         int choice = userIntInput.nextInt();

	      if (choice == 1)
	      {
	       cabins();
	      }

	      else if (choice == 2)
	      {
	        System.out.println("You decide to stay in the Mess Hall and wait for dinner to be served. Chiron had to leave to take care of camp buisness so you sit alone by yourself.\n\nAfter some time has passed, you meet the head of your cabin, Jess. You and her seem to really get along and when she asks you if you will play capture the flag, you say yes!\n\nAfter dinner, you go and get ready for capture the flag. Jess asks if you want to borrow her armor or not. What do you say?");
	        System.out.println("1. Yes");
	        System.out.println("2. No");
	         choice = userIntInput.nextInt();
	        
	      }

	      if (choice == 1)
	           {
	           System.out.println("You take Jess' advice and wear the nicest armor you can find!\n\nNow that you both are ready, you and the rest of your cabin head out and get ready for capture the flag in the forest. The goal of the game is to get the other teams flag without dying, being stabbed, geting hurt, etc. Jess asks you if you want to defend the flag or try to steal the other teams flag. Which do you pick? ");
	                System.out.println("1. Defend our flag");
	                System.out.println("2. Try and steal the other teams flag");
	             choice = userIntInput.nextInt();
	      }

	        if (choice == 1)
	        {
	          captureTheFlagDefenseArmor();
	        }

	        else if (choice == 2)
	        {
	          captureTheFlagOffenseArmor();
	        }


	      else if (choice == 2)
	      {
	        System.out.println("You decide that armor is for the weak and that you don't need any to protect yourself.\n\nSince you are ready, you and the rest of your cabin head out and get ready for capture the flag in the forest. The goal of the game is to get the other teams flag without dying, being stabbed, geting hurt, etc. Jess asks you if you want to defend the flag or try to steal the other teams flag. Which do you pick? ");
	         System.out.println("1. Defend our flag");
	         System.out.println("2. Try and steal the other teams flag");
	          choice = userIntInput.nextInt();
	      }

	      if (choice == 1)
	      {
	        captureTheFlagDefenseNoArmor();
	      }

	      else if (choice == 2)
	      {
	         captureTheFlagOffenseNoArmor();
	      }

	      
	    }

	    public static void cabins()
	    {
	      Scanner userIntInput = new Scanner(System.in);
	      System.out.println("You and Chiron walk to the cabins and you arrive at the cabin of " + parent + ", which is where you will be staying. Chiron introduces you to the head of your cabin, Jess. Jess really seems to like you sand when the dinner bell goes off you sit with her at dinner.\n\nAfter dinner, you go and get ready for capture the flag. Jess asks if you want to borrow her armor or not. What do you say?");
	      System.out.println("1. Yes");
	      System.out.println("2. No");
	      int choice = userIntInput.nextInt();

	      if (choice == 1)
	         {
	         System.out.println("You take Jess' advice and wear the nicest armor you can find!\n\nNow that you both are ready, you and the rest of your cabin head out and get ready for capture the flag in the forest. The goal of the game is to get the other teams flag without dying, being stabbed, geting hurt, etc. Jess asks you if you want to defend the flag or try to steal the other teams flag. Which do you pick? ");
	              System.out.println("1. Defend our flag");
	              System.out.println("2. Try and steal the other teams flag");
	             choice = userIntInput.nextInt();
	    }

	        if (choice == 1)
	        {
	          captureTheFlagDefenseArmor();
	        }

	        else if (choice == 2)
	        {
	          captureTheFlagOffenseArmor();
	        }

	      else if (choice == 2)
	       {
	        System.out.println("You decide that armor is for the weak and that you don't need any to protect yourself.\n\nSince you are ready, you and the rest of your cabin head out and get ready for capture the flag in the forest. The goal of the game is to get the other teams flag without dying, being stabbed, geting hurt, etc. Jess asks you if you want to defend the flag or try to steal the other teams flag. Which do you pick? ");
	             System.out.println("1. Defend our flag");
	             System.out.println("2. Try and steal the other teams flag");
	              choice = userIntInput.nextInt();
	       }

	      if (choice == 1)
	      {
	        captureTheFlagDefenseArmor();
	      }

	      else if (choice == 2)
	      {
	        captureTheFlagOffenseArmor();
	      }
	    }

	    public static void strawberryFields()
	    {
	      Scanner userIntInput = new Scanner(System.in);
	      System.out.println("You decide to go to the Strawberry Fields. When you get there, it seems all happy and normal there. You go to pick a strawberry, but as you do, the vines come and grab you and start to choke you. Do you use your " + weapon + " to escape?");
	        System.out.println("1. Yes! I am about to die!");
	        System.out.println("2. Nah, I can tough it out.");
	       int choice = userIntInput.nextInt();

	      if (choice == 1)
	        {
	          System.out.println("You use " + weapon + " to escape the vines and set yourself free. Sadly, you do get hurt and lose some health. You hear the dinner bell go off and you think it os for the best to go to dinner.\n\nWhen you get to dinner, you meet the head of your cabin, Jess. You and her seem to really get along and when she asks you if you will play capture the flag, you say yes!\n\nAfter dinner, you go and get ready for capture the flag. Jess asks if you want to borrow her armor or not. What do you say?");
	              System.out.println("1. Yes");
	              System.out.println("2. No");
	              int choice2 = userIntInput.nextInt();
	        }

	      else if (choice == 2)
	      {
	        System.out.println("You try to tough it out but the vine strangles you and you pass out. Sadly, you are to hurt to do anything and and need to get healed.\n\nGame Over.");
	         System.exit(0);
	      }

	      if (choice == 1)
	           {
	           System.out.println("You take Jess' advice and wear the nicest armor you can find!\n\nNow that you both are ready, you and the rest of your cabin head out and get ready for capture the flag in the forest. The goal of the game is to get the other teams flag without dying, being stabbed, geting hurt, etc. Jess asks you if you want to defend the flag or try to steal the other teams flag. Which do you pick? ");
	                System.out.println("1. Defend our flag");
	                System.out.println("2. Try and steal the other teams flag");
	           choice = userIntInput.nextInt();

	             if (choice == 1)
	             {
	               captureTheFlagDefenseArmor();
	             }

	             else if (choice == 2)
	             {
	               captureTheFlagOffenseArmor();
	             }
	      }

	      else if(choice == 2)
	      {
	        System.out.println("You decide that armor is for the weak and that you don't need any to protect yourself.\n\nSince you are ready, you and the rest of your cabin head out and get ready for capture the flag in the forest. The goal of the game is to get the other teams flag without dying, being stabbed, geting hurt, etc. Jess asks you if you want to defend the flag or try to steal the other teams flag. Which do you pick? ");
	         System.out.println("1. Defend our flag");
	         System.out.println("2. Try and steal the other teams flag");
	         choice = userIntInput.nextInt();
	      }

	      if (choice == 1)
	      {
	        captureTheFlagDefenseNoArmor();
	      }

	      else if (choice == 2)
	      {
	        captureTheFlagOffenseNoArmor();
	      }
	    }

	    public static void forest()
	    {
	      Scanner userIntInput = new Scanner(System.in);
	      System.out.println("You decide to head towards the giant forest. When you reach the edge of it, you hear little voices in your head urging you to go into the forest. Do you:");
	        System.out.println("1. Listen to the voices and go into the forest");
	        System.out.println("2. Turn around and head towards the cabins");
	       int choice = userIntInput.nextInt();

	      if (choice == 1)
	      {
	        System.out.println("You listen to the little voices in your head and head into the forest. The deeper you go, the louder the voices get and you can't make them go away.\n\nThe sun is starting to set when you find that you are lost. You try to head back the way you came but it all looks the same. With no resources and no map to escape, you are stuck.");
	        System.out.println("\nGame Over.");
	        System.exit(0);
	      }

	      else if (choice == 2)
	        {
	          System.out.println("You think it is safer to not trust the voices and head back to the cabins. When you reach the cabins, you hear the dinner bell go off and see campers start to head to the Mess Hall. You follow them and when you get to the Mess Hall you are introduced to the head of your cabin, Jess. You and her seem to really get along and when she asks you if you will play capture the flag, you say yes!\n\nAfter dinner, you go and get ready for capture the flag. Jess asks if you want to borrow her armor or not. What do you say?");
	          System.out.println("1. Yes");
	          System.out.println("2. No");
	          choice = userIntInput.nextInt();
	        }  
	    }

	    public static void climbingWall()
	    {
	      Scanner userIntInput = new Scanner(System.in);
	      System.out.println("You decide to head towards the climbing wall with lots of lava coming out of it. As you get closer, some lava gets on you and you get hurt, but that doesn't discourage your spirit.");

	       System.out.println("Do you want to try and climb the lava wall?");
	       System.out.println("1. Yes! I totally got this!");
	       System.out.println("2. No, I'm going to go back to where I was.");
	       int choice = userIntInput.nextInt();

	      if (choice == 1)
	      {
	        System.out.println("You start to climb the wall and you're doing pretty well, till you slip and a whole ton of lava comes raining down on you. You pass out from the pain and you are too hurt to do anything.\n\nGame Over.");
	        System.exit(0);
	       }

	      else if (choice == 2)
	      {
	        System.out.println("You start to head back to where you were when all of a sudden, the ground beneath you disappears and you fall into a deep pit. When you hit the ground, you twist your ankle. You land in what appears to be an underground tunnel and soon realize you must be in the Labrynth Chiron warned you about. You try to escape but there is no way out.");
	        System.out.println("\n\nGame Over.");
	        System.exit(0);
	     }
	    }

	    public static void captureTheFlagOffenseArmor()
	    {
	      Scanner userIntInput = new Scanner(System.in);
	      System.out.println("You decide to play offense and try and steal the other teams flag\n\nYou hear a horn go off and that means the game has begun. You follow Jess' lead and sneakily make it to the other teams flag. One of you needs to make a distraction and the other needs to grab the flag. Do you:");
	      System.out.println("1. Make a distraction.");
	      System.out.println("2. Try and get the flag.");

	      int choice = userIntInput.nextInt();

	      if (choice == 1)
	      {
	        System.out.println("You take out your " + weapon + " and make a big distraction. You scream at the top of your lungs and start fighting all the people guarding the flag. They attack you back, but your armor protects you. Jess is able to grab the flag and your team is the winner! Congrats on winning capture the flag and surviving your first day at camp! \n\nGame Over.");
	          System.exit(0);
	      }

	      else if (choice == 2)
	      {
	        System.out.println("Jess creates a big distraction and you book it towards the flag. You have to fight off some people and use your " + weapon + " but you get the flag! You win the game and celebrate all night long! Congrats on winning capture the flag and surviving your first day at camp! \n\nGame Over.");
	        System.exit(0);
	      }
	    }

	    public static void captureTheFlagDefenseArmor()
	    {
	    Scanner userIntInput = new Scanner(System.in);
	    System.out.println("You decide to play defense and protect the flag.\n\nFor awhile, it is pretty uneventful, but then people start attacking you from everywhere. You use your " + weapon + " to fend them off while your armor protects you. You keep fighting till your team comes back with the other teams flag and win the game! You celebrate all night and have a big party. Congrats on winning the game and surviving your first day at camp!\n\ngame Over.");
	      System.exit(0);
	    }

	    public static void captureTheFlagOffenseNoArmor()
	    {
	      Scanner userIntInput = new Scanner(System.in);
	      System.out.println("You decide to play offense and try and steal the other teams flag\n\nYou hear a horn go off and that means the game has begun. You follow Jess' lead and sneakily make it to the other teams flag. One of you needs to make a distraction and the other needs to grab the flag. Do you:");
	      System.out.println("1. Make a distraction.");
	      System.out.println("2. Try and get the flag.");

	      int choice = userIntInput.nextInt();

	      if (choice == 1)
	      {
	        System.out.println("You take out your " + weapon + " and make a big distraction. You scream at the top of your lungs and start fighting all the people guarding the flag. They attack you back, and sadly you have no armor to protect you. You get injured very quickly and Jess is not able to get the flag. Your team loses and you are too hurt to be able to do anything.\n\nGame Over.");
	          System.exit(0);
	      }

	      else if (choice == 2)
	      {
	        System.out.println("Jess creates a big distraction and you book it towards the flag. You have to fight off some people and use your " + weapon + " but sadly that is not enough. You are not wearing armor and you get injured very quickly. You are not able to get the flag and your team loses. You are too hurt to be able to do anything. \n\nGame Over.");
	        System.exit(0);
	      }
	    }

	    public static void captureTheFlagDefenseNoArmor()
	    {
	      Scanner userIntInput = new Scanner(System.in);
	      System.out.println("You decide to play defense and protect the flag.\n\nFor awhile, it is pretty uneventful, but then people start attacking you from everywhere. You use your " + weapon + " to fend them off, but you have no armor so you get hurt very quickly. You fall to the ground, unable to do anything, and the other team wins the game. Until you get healed, you are unable to do anything.\n\ngame Over.");
	        System.exit(0);
	    }
}
