/**
 * The Superhero sub-class that inherits methods & variables from the Character super-class.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing the Java API Packages :
import javax.swing.ImageIcon;

// Declaring The Superhero Class (Sub-Class) :
public class Superhero extends Character {
	
	// Declaring The Protected Class Variables :
	protected String superHeroName;
	protected Status superHeroType;
	protected int superHeroAction;
	protected int superHeroEnergy;
	protected ImageIcon superHeroImage;
	protected double superHeroHeight;
	protected int superHeroSpeed;
	protected int superHeroStrength;
	protected String superHeroAlignment;
	protected String superHeroGender;
	protected String superHeroOrigin;
	protected String superHeroFightingStyles;
	
// Declaring The Constructor :
public Superhero(String characterName, Status characterType, int characterAction, int characterEnergy, 
	   ImageIcon characterImage, double characterHeight, int characterSpeed, int characterStrength, 
	   String characterAlignment, String characterGender, String characterOrigin, String characterFightingStyles){
super(characterName, characterType, characterAction, characterEnergy, characterImage, characterHeight, 
	  characterSpeed, characterStrength, characterAlignment, characterGender, characterOrigin, characterFightingStyles);
	
	// Initialising The Private Class Variables :
	superHeroName = characterName;
	superHeroType = characterType;
	superHeroAction = characterAction;
	superHeroEnergy = characterEnergy;
	superHeroImage =	characterImage;
	superHeroHeight = characterHeight;
	superHeroSpeed = characterSpeed;
	superHeroStrength = characterStrength;
	this.superHeroAlignment = characterAlignment;
	superHeroGender = characterGender;
	superHeroOrigin = characterOrigin;
	superHeroFightingStyles = characterFightingStyles;
}

// Declaring The Getter methods :
@Override
public String getName(){
	return superHeroName;
}
@Override
public Status getType(){
	return superHeroType;
}
@Override
public int getAction(){
	return superHeroAction;
}
@Override
public int getEnergy(){
	return superHeroEnergy;
}
@Override
public ImageIcon getImage(){
	return superHeroImage;
}
@Override
public String getHeight(){
	String superHeroHeightString = String.valueOf(superHeroHeight);
	return superHeroHeightString;
}
@Override
public String getSpeed(){
	String superHeroSpeedString = String.valueOf(superHeroSpeed);
	return superHeroSpeedString;
}
@Override
public String getStrength(){
	String superHeroStrengthString = String.valueOf(superHeroStrength);
	return superHeroStrengthString;
}
public String getSuperHeroAlignment(){
	return superHeroAlignment;
}
public String getSuperHeroGender(){
	return superHeroGender;
}
public String getSuperHeroOrigin(){
	return superHeroOrigin;
}
public String getSuperHeroFightingStyles(){
	return superHeroFightingStyles;
}

// Declaring The Setter methods :
@Override
public void setName(String newName){
	superHeroName = newName;
}
@Override
public void setType(Status newType){
	superHeroType = newType;
}
@Override
public void setAction(int newAction){
	superHeroAction = newAction;
}
@Override
public void setEnergy(int newEnergy){
	superHeroEnergy = newEnergy;
}
@Override
public void setImage(ImageIcon newImage){
	superHeroImage = newImage;
}
@Override
public void setHeight(double newHeight){
	superHeroHeight = newHeight;
}
@Override
public void setSpeed(int newSpeed){
	superHeroSpeed = newSpeed;
}
@Override
public void setStrength(int newStrength){
	superHeroStrength = newStrength;
}
public void setSuperHeroAlignment(String newSuperHeroAlignment){
	superHeroAlignment = newSuperHeroAlignment;
}
public void setSuperHeroGender(String newSuperHeroGender){
	superHeroGender = newSuperHeroGender;
}
public void setSuperHeroOrigin(String newSuperHeroOrigin){
	superHeroOrigin = newSuperHeroOrigin;
}
public void setSuperHeroFightingStyles(String newSuperHeroFightingStyles){
	superHeroFightingStyles = newSuperHeroFightingStyles;
}
}