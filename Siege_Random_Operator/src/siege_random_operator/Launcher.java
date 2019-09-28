// Author: Matthew Abney
// Date: 1/14/18
// Purpose: Select a random attacker or defender when I dont know
package siege_random_operator;

import java.io.File;
import java.util.Scanner;
import static siege_random_operator.Randomizer.AttackersOwned;
import static siege_random_operator.Randomizer.DefendersOwned;

/*
import java.util.Scanner;
import java.util.Random;
*/

public class Launcher {
    /*
    // Make the operator lists global
    public static String[] Attackers = { "Recruit","Ash","Blackbeard","Blitz","Buck","Capitão","Dokkaebi","Fuze","Glaz","Hibana","IQ","Jackal","Montagne","Sledge","Thatcher","Thermite","Twitch","Ying","Zofia" };
    public static String[] Defenders = { "Recruit","Bandit","Castle","Caveira","Doc","Echo","Ela","Frost","Jäger","Kapkan","Lesion","Mira","Mute","Pulse","Rook","Smoke","Tachanka","Valkyrie","Vigil" };
    public static String[] ownedAttackers = new String[19];
    public static String[] ownedDefenders = new String[19];
    */        
    
    public static void main(String[] args) {
        
        try{
            File Info = new File("C:\\R6Randomizer\\R6RandomInfo.txt");
            if ( Info.exists() ){
                Scanner input = new Scanner( Info );
                for (int i = 0; i < AttackersOwned.length; i++) {
                    AttackersOwned[i] = input.nextBoolean();
                }
                for (int i = 0; i < DefendersOwned.length; i++) {
                    DefendersOwned[ i ] = input.nextBoolean();
                }   
            }
        } catch ( Exception e ){
            System.exit(1);
        }
        
        Randomizer Ops = new Randomizer();
        Ops.setVisible(true);
        
        
      /*  
        // Begin variables
        Scanner in = new Scanner( System.in );
        Random rng = new Random();
        boolean keepGoing = true;
        
        // Gets what operators they have
        System.out.println( "Welcome!" );
        AskIfHave(in);
        while ( keepGoing ){
            
            System.out.println( "1: Random Attacking Operator" );
            System.out.println( "2: Random Defending Operator" );
            System.out.println( "3: Redo owned list" );
            System.out.println( "4: Exit" );
            System.out.print("Select: ");
            int input = in.nextInt();
            
            switch ( input ) {
                case 1:
                    System.out.println("Your randomly picked attacker is " + ownedAttackers[rng.nextInt(ownedAttackers.length)] );
                    break;
                case 2:
                    System.out.println("Your randomly picked defender is " + ownedDefenders[rng.nextInt(ownedAttackers.length)] );
                    break;
                case 3:
                    AskIfHave(in);
                    break;
                case 4:
                    System.exit(0);
            }
            System.out.println();
        }
    }
    
    
    // Asks if they have operators
    public static void AskIfHave( Scanner in ){
        System.out.println("If you want to get someone out of the random picker just say no.");
        System.out.println("There are " + Attackers.length + " attackers and " + Defenders.length + " defenders with recruit being counted.");
        System.out.println();
        
        // Checks if they have all the attackers
        System.out.print("Do you have all the attackers?(Yes/No) ");
        String userInput = in.nextLine();
        if ( userInput.equalsIgnoreCase("Yes") ){
            ownedAttackers = Attackers;
        } else {
            
            // Checks which operators they own
            int count = 0;
            for (String Attacker : Attackers) {
                System.out.println();
                System.out.print("Do you own " + Attacker + "?(Yes/No) ");
                userInput = in.nextLine();
                while ( userInput.equalsIgnoreCase( "Yes" ) == false && userInput.equalsIgnoreCase( "No" ) == false ){
                    System.out.print("Enter yes or no only please:");
                    userInput = in.nextLine();
                }
                if (userInput.equalsIgnoreCase("Yes")) {
                    ownedAttackers[count] = Attacker;
                    count++;
                }
            }
        }
        System.out.println();
        
        // Checks if they have all the defenders
        System.out.print("Do you have all the defenders?(Yes/No) ");
        userInput = in.nextLine();
        if ( userInput.equalsIgnoreCase("Yes") ){
            ownedDefenders = Defenders;
        } else {
            
            // Checks which operators they own
            int count = 0;
            for (String Defender : Defenders) {
                System.out.println();
                System.out.print("Do you own " + Defender + "?(Yes/No) ");
                userInput = in.nextLine();
                while ( userInput.equalsIgnoreCase( "Yes" ) == false && userInput.equalsIgnoreCase( "No" ) == false ){
                    System.out.print("Enter yes or no only please:");
                    userInput = in.nextLine();
                }
                if (userInput.equalsIgnoreCase("Yes")) {
                    ownedDefenders[count] = Defender;
                    count++;
                }
            }
        }
              */
    }
}