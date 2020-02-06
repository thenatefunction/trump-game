/**
 * The Supervillain sub-class that inherits methods & variables from the Character super-class.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing The Java API Packages :
import javax.swing.ImageIcon;

// Declaring The Supervillain Class (Sub-Class) :
public class Supervillain extends Character {
	
	// Declaring The Protected Class Variables :
	protected String superVillainName;
	protected Status superVillainType;
	protected int superVillainAction;
	protected int superVillainEnergy;
	protected ImageIcon superVillainImage;
	protected double superVillainHeight;
	protected int superVillainSpeed;
	protected int superVillainStrength;
	protected String superVillainAlignment;
	protected String superVillainGender;
	protected String superVillainOrigin;
	protected String superVillainFightingStyles;
	
// Declaring The Constructor :
public Supervillain(String characterName, Status characterType, int characterAction, int characterEnergy, 
	   ImageIcon characterImage, double characterHeight, int characterSpeed, int characterStrength, 
	   String characterAlignment, String characterGender, String characterOrigin, String characterFightingStyles){
super(characterName, characterType, characterAction, characterEnergy, characterImage, characterHeight, 
	  characterSpeed, characterStrength, characterAlignment, characterGender, characterOrigin, characterFightingStyles);
	
	// Initialising the private class variables :
	superVillainName = characterName;
	superVillainType = characterType;
	superVillainAction = characterAction;
	superVillainEnergy = characterEnergy;
	superVillainImage =	characterImage;
	superVillainHeight = characterHeight;
	superVillainSpeed = characterSpeed;
	superVillainStrength = characterStrength;
	this.superVillainAlignment = characterAlignment;
	superVillainGender = characterGender;
	superVillainOrigin = characterOrigin;
	superVillainFightingStyles = characterFightingStyles;
}

// Declaring The Getter Methods :
@Override
public String getName(){
	return superVillainName;
}
@Override
public Status getType(){
	return superVillainType;
}
@Override
public int getAction(){
	return superVillainAction;
}
@Override
public int getEnergy(){
	return superVillainEnergy;
}
@Override
public ImageIcon getImage(){
	return superVillainImage;
}
@Override
public String getHeight(){
	String superVillainHeightString = String.valueOf(superVillainHeight);
	return superVillainHeightString;
}
@Override
public String getSpeed(){
	String superVillainSpeedString = String.valueOf(superVillainSpeed);
	return superVillainSpeedString;
}
@Override
public String getStrength(){
	String superVillainStrengthString = String.valueOf(superVillainStrength);
	return superVillainStrengthString;
}
public String getSuperVillainGender(){
	return superVillainGender;
}
public String getSuperVillainOrigin(){
	return superVillainOrigin;
}
public String getSuperVillainFightingStyles(){
	return superVillainFightingStyles;
}
public String getSuperVillainAlignment(){
	return superVillainAlignment;
}

// Declaring The Setter Methods :
@Override
public void setName(String newName){
	superVillainName = newName;
}
@Override
public void setType(Status newType){
	superVillainType = newType;
}
@Override
public void setAction(int newAction){
	superVillainAction = newAction;
}
@Override
public void setEnergy(int newEnergy){
	superVillainEnergy = newEnergy;
}
@Override
public void setImage(ImageIcon newImage){
	superVillainImage = newImage;
}
@Override
public void setHeight(double newHeight){
	superVillainHeight = newHeight;
}
@Override
public void setSpeed(int newSpeed){
	superVillainSpeed = newSpeed;
}
@Override
public void setStrength(int newStrength){
	superVillainStrength = newStrength;
}
public void setSuperVillainAlignment(String newSuperVillainAlignment){
	superVillainAlignment = newSuperVillainAlignment;
}
public void setSuperVillainGender(String newSuperVillainGender){
	superVillainGender = newSuperVillainGender;
}
public void setSuperVillainOrigin(String newSuperVillainOrigin){
	superVillainOrigin = newSuperVillainOrigin;
}
public void setSuperVillainFightingStyles(String newSuperVillainFightingStyles){
	superVillainFightingStyles = newSuperVillainFightingStyles;
}
}