/**
 * The Villain sub-class that inherits methods & variables from the Character super-class.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing the Java API Packages :
import javax.swing.ImageIcon;

// Declaring The Villain Class (Sub-Class) :
public class Villain extends Character {
	
	// Declaring The Protected Class Variables :
	protected String villainName;
	protected Status villainType;
	protected int villainAction;
	protected int villainEnergy;
	protected ImageIcon villainImage;
	protected double villainHeight;
	protected int villainSpeed;
	protected int villainStrength;
	protected String villainAlignment;
	protected String villainGender;
	protected String villainOrigin;
	protected String villainFightingStyles;
	
// Declaring The Constructor :
public Villain(String characterName, Status characterType, int characterAction, int characterEnergy,
	   ImageIcon characterImage, double characterHeight, int characterSpeed, int characterStrength, 
	   String characterAlignment, String characterGender, String characterOrigin, String characterFightingStyles){
super(characterName, characterType, characterAction, characterEnergy, characterImage, characterHeight, 
	  characterSpeed, characterStrength, characterAlignment, characterGender, characterOrigin, characterFightingStyles);
	
	// Initialising The Private Class Variables :
	villainName = characterName;
	villainType = characterType;
	villainAction = characterAction;
	villainEnergy = characterEnergy;
	villainImage = characterImage;
	villainHeight = characterHeight;
	villainSpeed = characterSpeed;
	villainStrength = characterStrength;
	this.villainAlignment = characterAlignment;
	villainGender = characterGender;
	villainOrigin = characterOrigin;
	villainFightingStyles = characterFightingStyles;
}

// Declaring The Getter Methods :
@Override
public String getName(){
	return villainName;
}
@Override
public Status getType(){
	return villainType;
}
@Override
public int getAction(){
	return villainAction;
}
@Override
public int getEnergy(){
	return villainEnergy;
}
@Override
public ImageIcon getImage(){
	return villainImage;
}
@Override
public String getHeight(){
	String villainHeightString = String.valueOf(villainHeight);
	return villainHeightString;
}
@Override
public String getSpeed(){
	String villainSpeedString = String.valueOf(villainSpeed);
	return villainSpeedString;
}
@Override
public String getStrength(){
	String villainStrengthString = String.valueOf(villainStrength);
	return villainStrengthString;
}
public String getVillainAlignment(){
	return villainAlignment;
}
public String getVillainGender(){
	return villainGender;
}
public String getVillainOrigin(){
	return villainOrigin;
}
public String getVillainFightingStyles(){
	return villainFightingStyles;
}
	
// Declaring The Setter Methods :
@Override
public void setName(String newName){
	villainName = newName;
}
@Override
public void setType(Status newType){
	villainType = newType;
}
@Override
public void setAction(int newAction){
	villainAction = newAction;
}
@Override
public void setEnergy(int newEnergy){
	villainEnergy = newEnergy;
}
@Override
public void setImage(ImageIcon newImage){
	villainImage = newImage;
}
@Override
public void setHeight(double newHeight){
	villainHeight = newHeight;
}
@Override
public void setSpeed(int newSpeed){
	villainSpeed = newSpeed;
}
@Override
public void setStrength(int newStrength){
	villainStrength = newStrength;
}
public void setVillainAlignment(String newVillainAlignment){
	villainAlignment = newVillainAlignment;
}
public void setVillainGender(String newVillainGender){
	villainGender = newVillainGender;
}
public void setVillainOrigin(String newVillainOrigin){
	villainOrigin = newVillainOrigin;
}
public void setVillainFightingStyles(String newVillainFightingStyles){
	villainFightingStyles = newVillainFightingStyles;
}
}