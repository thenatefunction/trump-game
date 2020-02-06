/**
 * The Hero sub-class that inherits methods & variables from the Character super-class.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing The Java API Packages :
import javax.swing.ImageIcon;

// Declaring The Hero Class (Sub-Class) :
public class Hero extends Character {
	
	// Declaring The Protected Class Variables :
	protected String heroName;
	protected Status heroType;
	protected int heroAction;
	protected int heroEnergy;
	protected ImageIcon heroImage;
	protected double heroHeight;
	protected int heroSpeed;
	protected int heroStrength;
	protected String heroAlignment;
	protected String heroGender;
	protected String heroOrigin;
	protected String heroFightingStyles;
	
// Declaring The Constructor :
public Hero(String characterName, Status characterType, int characterAction, int characterEnergy,
	   ImageIcon characterImage, double characterHeight, int characterSpeed, int characterStrength,
	   String characterAlignment, String characterGender, String characterOrigin, String characterFightingStyles){
	
super(characterName, characterType, characterAction, characterEnergy, characterImage, characterHeight,
	  characterSpeed, characterStrength, characterAlignment, characterGender, characterOrigin, characterFightingStyles);
	
	// Initialising The Protected Class Variables :
	heroName = characterName;
	heroType = characterType;
	heroAction = characterAction;
	heroEnergy = characterEnergy;
	heroImage =	characterImage;
	heroHeight = characterHeight;
	heroSpeed = characterSpeed;
	heroStrength = characterStrength;
	this.heroAlignment = characterAlignment;
	heroGender = characterGender;
	heroOrigin = characterOrigin;
	heroFightingStyles = characterFightingStyles;
}

// Declaring The Getter Methods :
@Override
public String getName(){
	return heroName;
}
@Override
public Status getType(){
	return heroType;
}
@Override
public int getAction(){
	return heroAction;
}
@Override
public int getEnergy(){
	return heroEnergy;
}
@Override
public ImageIcon getImage(){
	return heroImage;
}
@Override
public String getHeight(){
	String heroHeightString = String.valueOf(heroHeight);
	return heroHeightString;
}
@Override
public String getSpeed(){
	String heroSpeedString = String.valueOf(heroSpeed);
	return heroSpeedString;
}
@Override
public String getStrength(){
	String heroStrengthString = String.valueOf(heroStrength);
	return heroStrengthString;
}
public String getHeroAlignment(){
	return heroAlignment;
}
public String getHeroGender(){
	return heroGender;
}
public String getHeroOrigin(){
	return heroOrigin;
}
public String getHeroFightingStyles(){
	return heroFightingStyles;
}
	
// Declaring The Setter Methods :
@Override
public void setName(String newName){
	heroName = newName;
}
@Override
public void setType(Status newType){
	heroType = newType;
}
@Override
public void setAction(int newAction){
	heroAction = newAction;
}
@Override
public void setEnergy(int newEnergy){
	heroEnergy = newEnergy;
}
@Override
public void setImage(ImageIcon newImage){
	heroImage = newImage;
}
@Override
public void setHeight(double newHeight){
	heroHeight = newHeight;
}
@Override
public void setSpeed(int newSpeed){
	heroSpeed = newSpeed;
}
@Override
public void setStrength(int newStrength){
	heroStrength = newStrength;
}
public void setHeroAlignment(String newHeroAlignment){
	heroAlignment = newHeroAlignment;
}
public void setHeroGender(String newHeroGender){
	heroGender = newHeroGender;
}
public void setHeroOrigin(String newHeroOrigin){
	heroOrigin = newHeroOrigin;
}
public void setHeroFightingStyles(String newHeroFightingStyles){
	heroFightingStyles = newHeroFightingStyles;
}
}