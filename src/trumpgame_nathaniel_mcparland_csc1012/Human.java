/**
 * The Human sub-class that inherits methods & variables from the Character super-class.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

//Declaring the package :
package trumpgame_nathaniel_mcparland_csc1012;

//Importing the Java API packages :
import javax.swing.ImageIcon;

//Declaring the Human class (Sub-Class) :
public class Human extends Character {
	
	// Declaring The Protected Class Variables :
	protected String humanName;
	protected Status humanType;
	protected int humanAction;
	protected int humanEnergy;
	protected ImageIcon humanImage;
	protected double humanHeight;
	protected int humanSpeed;
	protected int humanStrength;
	protected String humanAlignment;
	protected String humanGender;
	protected String humanOrigin;
	protected String humanFightingStyles;
	
//Declaring the constructor :
public Human(String characterName, Status characterType, int characterAction, int characterEnergy, ImageIcon characterImage, double characterHeight, int characterSpeed, int characterStrength, String characterAlignment, String characterGender, String characterOrigin, String characterFightingStyles){
super(characterName, characterType, characterAction, characterEnergy, characterImage, characterHeight, characterSpeed, characterStrength, characterAlignment, characterGender, characterOrigin, characterFightingStyles);
		// Initialising the private class variables :
		humanName = characterName;
		humanType = characterType;
		humanAction = characterAction;
		humanEnergy = characterEnergy;
		humanImage =	characterImage;
		humanHeight = characterHeight;
		humanSpeed = characterSpeed;
		humanStrength = characterStrength;
		this.humanAlignment = characterAlignment;
		humanGender = characterGender;
		humanOrigin = characterOrigin;
		humanFightingStyles = characterFightingStyles;
	}

//Declaring the Getter methods :
@Override
public String getName(){
	return humanName;
}
@Override
public Status getType(){
	return humanType;
}
@Override
public int getAction(){
	return humanAction;
}
@Override
public int getEnergy(){
	return humanEnergy;
}
@Override
public ImageIcon getImage(){
	return humanImage;
}
@Override
public String getHeight(){
	String humanHeightString = String.valueOf(humanHeight);
	return humanHeightString;
}
@Override
public String getSpeed(){
	String humanSpeedString = String.valueOf(humanSpeed);
	return humanSpeedString;
}
@Override
public String getStrength(){
	String humanStrengthString = String.valueOf(humanStrength);
	return humanStrengthString;
}
public String getHumanAlignment(){
	return humanAlignment;
}
public String getHumanGender(){
	return humanGender;
}
public String getHumanOrigin(){
	return humanOrigin;
}
public String getHumanFightingStyles(){
	return humanFightingStyles;
}
	
//Declaring the Setter methods :
@Override
public void setName(String newName){
	humanName = newName;
}
@Override
public void setType(Status newType){
	humanType = newType;
}
@Override
public void setAction(int newAction){
	humanAction = newAction;
}
@Override
public void setEnergy(int newEnergy){
	humanEnergy = newEnergy;
}
@Override
public void setImage(ImageIcon newImage){
	humanImage = newImage;
}
@Override
public void setHeight(double newHeight){
	humanHeight = newHeight;
}
@Override
public void setSpeed(int newSpeed){
	humanSpeed = newSpeed;
}
@Override
public void setStrength(int newStrength){
	humanStrength = newStrength;
}
public void setHumanAlignment(String newHumanAlignment){
	humanAlignment = newHumanAlignment;
}
public void setHumanGender(String newHumanGender){
	humanGender = newHumanGender;
}
public void setHumanOrigin(String newHumanOrigin){
	humanOrigin = newHumanOrigin;
}
public void setHumanFightingStyles(String newHumanFightingStyles){
	humanFightingStyles = newHumanFightingStyles;
}
}