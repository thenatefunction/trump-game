/**
 * The Character abstract/super-class that shares it's methods & variables with the other sub-classes
 * that inherit from it.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing The Java API Packages:
import javax.swing.ImageIcon;

// Declaring The Character Abstract Class (Superclass) :
public abstract class Character {
	
	// Declaring The Private Class Variables :
	private String name;
	private Status type;
	private int action;
	private int energy;
	private ImageIcon image;
	private double height;
	private int speed;
	private int strength;
	private String alignment;
	private String gender;
	private String origin;
	private String fightingStyles;
	
// Declaring The Constructor :
public Character(String characterName, Status characterType, int characterAction, int characterEnergy, 
	   ImageIcon characterImage, double characterHeight, int characterSpeed, int characterStrength, 
	   String characterAlignment, String characterGender, String characterOrigin, String characterFightingStyles){
	
	// Initialising The Private Class Variables :
	name = characterName;
	type = characterType;
	action = characterAction;
	energy = characterEnergy;
	image = characterImage;
	height = characterHeight;
	speed = characterSpeed;
	strength = characterStrength;
	alignment = characterAlignment;
	gender = characterGender;
	origin = characterOrigin;
	fightingStyles = characterFightingStyles;
}

// Declaring The Getter Methods :
public String getName(){
	return name;
}
public Status getType(){
	return type;
}
public int getAction(){
	return action;
}
public int getEnergy(){
	return energy;
}
public ImageIcon getImage(){
	return image;
}
public String getHeight(){
	String heightString = String.valueOf(height);
	return heightString;
}
public String getSpeed(){
	String speedString = String.valueOf(speed);
	return speedString;
}
public String getStrength(){
	String strengthString = String.valueOf(strength);
	return strengthString;
}
public String getAlignment(){
	return alignment;
}
public String getGender(){
	return gender;
}
public String getOrigin(){
	return origin;
}
public String getFightingStyles(){
	return fightingStyles;
}

// Declaring The Setter Methods :
public void setName(String newName){
	name = newName;
}
public void setType(Status newType){
	type = newType;
}
public void setAction(int newAction){
	action = newAction;
}
public void setEnergy(int newEnergy){
	energy = newEnergy;
}
public void setImage(ImageIcon newImage){
	image = newImage;
}
public void setHeight(double newHeight){
	height = newHeight;
}
public void setSpeed(int newSpeed){
	speed = newSpeed;
}
public void setStrength(int newStrength){
	strength = newStrength;
}
public void setAlignment(String newAlignment){
	alignment = newAlignment;
}
public void setGender(String newGender){
	gender = newGender;
}
public void setOrigin(String newOrigin){
	origin = newOrigin;
}
public void setFightingStyles(String newFightingStyles){
	fightingStyles = newFightingStyles;
}
}