/**
 * The Crime sub-class that inherits methods & variables from the Character super-class.
 * The Crime class also holds various crimes in a String ArrayList.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing Java API Packages :
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

// Declaring The Crime Class (Sub-Class) :
public class Crime extends Character {
	
	 // Declaring The Protected Class Variables :
	 private Random rand;
	 private ArrayList<String> crimeList;
  
// Declaring The Constructor :
public Crime(String characterName, Status characterType, int characterAction, int characterEnergy, 
	         ImageIcon characterImage, int characterHeight, int characterSpeed, int characterStrength, 
	         String characterAlignment, String characterGender, String characterOrigin, String characterFightingStyles){
super(characterName, characterType, characterAction, characterEnergy, characterImage, characterHeight, 
	  characterSpeed, characterStrength, characterAlignment, characterGender, characterOrigin, characterFightingStyles);

// Initialising The Protected Class Variables :
rand = new Random();
crimeList = new ArrayList<String>();
crimeList.add(" Lin Kuei warriors are beating up the civilians of Earthrealm!"
		+ " Fight: -10 E + 10 A / Commit: -10 E + 10 A / Ignore: -10 A");
crimeList.add(" Lin Kuei warriors are robbing a monastery in Earthrealm!"
		+ " Fight: -10 E + 10 A / Commit: -10 E + 10 A / Ignore: -10 A");
crimeList.add(" Lin Kuei warriors have taken Scorpion captive!"
		+ " Fight: -10 E + 10 A / Commit: -10 E + 10 A / Ignore: -10 A");
crimeList.add(" Lin Kuei warriors are attacking Raiden's temple!"
		+ " Fight: -10 E + 10 A / Commit: -10 E + 10 A / Ignore: -10 A");
crimeList.add(" Lin Kuei warriors are plotting Earthrealm's destruction with Quan Chi!"
		+ " Fight: -10 E + 10 A / Commit: -10 E + 10 A / Ignore: -10 A");
crimeList.add(" Lin Kuei warriors are attacking a farm in Earthrealm!"
		+ " Fight: -10 E + 10 A / Commit: -10 E + 10 A / Ignore: -10 A");
crimeList.add(" Lin Kuei warriors are torturing Johnny Cage with Quan Chi!"
		+ " Fight: -10 E + 10 A / Commit: -10 E + 10 A / Ignore: -10 A");
}

// Declaring The Getter Methods :
public String getCrime()
{
 int index = rand.nextInt(crimeList.size());
 String item = crimeList.get(index);
 return item;
}
}