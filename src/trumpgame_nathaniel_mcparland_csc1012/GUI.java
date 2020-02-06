/**
 * The GUI sub-class that inherits methods & variables from the Character super-class.
 * The GUI sub-class also contains various code elements which implement the graphical 
 * user interface of the Trump Game.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing The Java API Packages:
import javax.swing.ImageIcon;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.plaf.ColorUIResource;
import javax.swing.UIManager;


// Declaring The GUI Class (Sub-Class) :
public class GUI extends Character {
	
	// Declaring The Protected Class Variables :
	protected JFrame charSelection;
	protected JFrame gameWindow;
	protected JFrame shopWindow;
	
	protected JPanel charSelectionPanel;
	protected JPanel shopPanel;
	protected JPanel charPanelA;
	protected JPanel charPanelB;
	protected JPanel charPanelC;
	protected JPanel charPanelD;
	protected JPanel charPanelE;
	protected JPanel gamePanelA;
	protected JPanel gamePanelB;
	protected JPanel gamePanelC;
	protected JPanel gamePanelD;
	protected JPanel gamePanelE;
	protected JPanel shopPanelA;
	protected JPanel shopPanelB;
	protected JPanel shopPanelC;
	protected JPanel gameWindowPanel;
	
	protected JLabel charSelectionTitle;
	protected JLabel heroLabel;
	protected JLabel villainLabel;
	
	protected JButton heroButton1;
	protected JButton heroButton2;
	protected JButton heroButton3;
	protected JButton villainButton1;
	protected JButton villainButton2;
	protected JButton villainButton3;
	
	protected JTextField nameInput;
	
	protected JButton startButton;
	protected JButton exitButton;
	
	protected JLabel gameTitle;
	
	protected ImageIcon humanImage;
	protected ImageIcon hero1Image;
	protected ImageIcon hero2Image;
	protected ImageIcon hero3Image;
	protected ImageIcon superHeroImage;
	
	protected ImageIcon villain1Image;
	protected ImageIcon villain2Image;
	protected ImageIcon villain3Image;
	protected ImageIcon superVillainImage;
	
	protected JButton hero1Button;
	protected JButton hero2Button;
	protected JButton hero3Button;
	
	protected JButton villain1Button;
	protected JButton villain2Button;
	protected JButton villain3Button;
	
	protected JLabel humanImageLabel;
	protected JLabel heroImageLabel1;
	protected JLabel heroImageLabel2;
	protected JLabel heroImageLabel3;
	protected JLabel superHeroImageLabel;
	
	protected JLabel villainImageLabel1;
	protected JLabel villainImageLabel2;
	protected JLabel villainImageLabel3;
	protected JLabel superVillainImageLabel;
	
	public static JProgressBar energyBar;
	public static JProgressBar actionBar;
	protected JLabel energyBarLabel;
	protected JLabel actionBarLabel;
	
	protected JLabel crimeText;
	
	protected JButton fightButton;
	protected ImageIcon fightButtonImage;
	
	protected JButton commitCrimeButton;
	protected ImageIcon commitCrimeButtonImage;
	
	protected JButton sleepButton;
	protected ImageIcon sleepButtonImage;
	
	protected JButton ignoreButton;
	protected ImageIcon ignoreButtonImage;
	
	protected JButton shopButton;
	protected ImageIcon shopButtonImage;
	
	protected JLabel heroLabel1;
	protected JLabel heroLabel1info;
	protected JLabel heroLabel2;
	protected JLabel heroLabel2info;
	protected JLabel heroLabel3;
	protected JLabel heroLabel3info;
	
	protected JLabel villainLabel1;
	protected JLabel villainLabel1info;
	protected JLabel villainLabel2;
	protected JLabel villainLabel2info;
	protected JLabel villainLabel3;
	protected JLabel villainLabel3info;
	
	protected ImageIcon animatedHeroImage1;
	protected ImageIcon animatedHeroImage2;
	protected ImageIcon animatedHeroImage3;
	
	protected ImageIcon animatedVillainImage1;
	protected ImageIcon animatedVillainImage2;
	protected ImageIcon animatedVillainImage3;
	
	protected String charName;
	protected String charNameTwo;
	protected JLabel charNameLabel;
	protected String charStatus;
	protected String charHeight;
	protected JLabel charHeightLabel;
	protected String charSpeed;
	protected JLabel charSpeedLabel;
	protected String charStrength;
	protected JLabel charStrengthLabel;
	protected String charAlignment;
	protected JLabel charAlignmentLabel;
	protected String charGender;
	protected JLabel charGenderLabel;
	protected String charOrigin;
	protected JLabel charOriginLabel;
	protected String charFightingStyles;
	protected JLabel charFightingStylesLabel;
	protected JLabel characterLabel;
	protected JLabel spaceLabel;
	protected JLabel space1Label;
	
	protected ImageIcon gameLogo;
	protected JButton gameLogoButton;
	
	protected static Timer sleepTimer;
	protected static Timer fightCrimeTimer;
	protected static Timer commitCrimeTimer;
	protected static Timer ignoreTimer;
	protected static Timer medTimer;
	protected static Timer medTimer2;
	protected static Timer hardTimer;
	protected static Timer hardTimer2;
	
	protected JButton saveButton;
	protected ImageIcon saveButtonImage;

	protected ImageIcon kunaiImage;
	protected ImageIcon longswordImage;
	protected ImageIcon nunchakuImage;
	protected JButton kunaiButton;
	protected JButton longswordButton;
	protected JButton nunchakuButton;
	protected ImageIcon sushiImage;
	protected ImageIcon noodlesImage;
	protected ImageIcon riceImage;
	protected JButton sushiButton;
	protected JButton noodlesButton;
	protected JButton riceButton;
	protected ImageIcon techArmorImage;
	protected ImageIcon noShirtImage;
	protected ImageIcon ciaArmorImage;
	protected JButton techArmorButton;
	protected JButton noShirtButton;
	protected JButton ciaArmorButton;
	protected JLabel shopTitle;
	protected ImageIcon takedaImage;
	protected ImageIcon cassieImage;
	protected ImageIcon kotalkhanImage;
	protected int shopCurrency;
	protected JLabel shopCurrencyLabel;
	protected JLabel shopFoodLabel;
	protected JLabel shopClothesLabel;
	protected JLabel shopGadgetsLabel;

// Declaring The Constructor :	
public GUI(String characterName, Status characterType, int characterAction, int characterEnergy, 
	       ImageIcon characterImage, int characterHeight, int characterSpeed, int characterStrength, 
	       String characterAlignment, String characterGender, String characterOrigin, String characterFightingStyles){
super(characterName, characterType, characterAction, characterEnergy, characterImage, characterHeight, 
	  characterSpeed, characterStrength, characterAlignment, characterGender, characterOrigin, characterFightingStyles);

// Creating The Human, Hero, Villain, SuperVillain, SuperHero, Crime Objects :
Human johnnycage = new Human("Johnny Cage", Status.HUMAN, 0, 0, humanImage, 5.11, 100, 150, "Good", "Male", "Earthrealm (Venice, California)", "Jeet Kune Do, Karate, Shinto Ryu, Shorin Ryu");
Hero scorpion = new Hero("Scorpion", Status.HERO, 0, 60, hero1Image, 5.3, 15, 25, "Neutral", "Male", "Earthrealm, Japan (reborn in Netherrealm)", "Hapkido, Moi Fah, Pi Gua");
Hero raiden = new Hero("Raiden", Status.HERO, 0, 60, hero2Image, 5.0, 13, 30, "Neutral", "Male", "Heavens", "Nan Chuan, Jujutsu, Judo, Tae Kwon Do");
Hero liukang = new Hero("Liu Kang", Status.HERO, 0, 60, hero3Image, 6.0, 16, 31, "Neutral", "Male", "Earthrealm (Henan Province, China)", "Jun Fan, Pao Chui, Karate, Jeet Kune Do, Choy Lay Fut, Monkey, Dragon");
Villain subzero = new Villain("Sub-Zero", Status.VILLAIN, 0, 40, villain1Image, 5.4, 23, 41, "Good", "Male", "Earthrealm, China", "Shotokan, Dragon");
Villain mileena = new Villain("Mileena", Status.VILLAIN, 0, 40, villain2Image, 5.6, 22, 10, "Evil", "Female", "Shang Tsung's Flesh Pits/Outworld", "Ying Yeung, Mian Chuan");
Villain shangtsung = new Villain("Shang Tsung", Status.VILLAIN, 0, 40, villain3Image, 6.5, 30, 30, "Evil", "Male", "Earthrealm", "Snake, Crane, Mantis");
Supervillain noobsaibot = new Supervillain("Noob Saibot", Status.SUPERVILLAIN, 0, 20, superVillainImage, 6.0, 32, 31, "Evil", "Male", "Earthrealm (Reborn in the Netherrealm)", "Monkey");
Superhero kenshi = new Superhero("Kenshi", Status.SUPERHERO, 0, 80, superHeroImage, 5.2, 30, 10, "Good", "Male", "Earthrealm", "Tai Chi, San Shou, Judo");
Crime crime = new Crime(characterFightingStyles, characterType, characterStrength, characterStrength, characterImage, characterStrength, characterStrength, characterStrength, characterFightingStyles, characterFightingStyles, characterFightingStyles, characterFightingStyles);
Human sleep = new Human(characterFightingStyles, Status.ASLEEP, characterStrength, characterStrength, characterImage, characterHeight, characterStrength, characterStrength, characterFightingStyles, characterFightingStyles, characterFightingStyles, characterFightingStyles);

Gadgets kunai = new Gadgets("Kunai", characterStrength, characterFightingStyles, characterType, kunaiImage, 1, 5);
Gadgets longsword = new Gadgets("Longsword", characterStrength, characterFightingStyles, characterType, longswordImage, 1, 10);
Gadgets nunchaku = new Gadgets("Nunchaku", characterStrength, characterFightingStyles, characterType, nunchakuImage, 1, 15);

Food sushi = new Food("Sushi", characterStrength, characterFightingStyles, characterType, sushiImage, 1, 5);
Food noodles = new Food("Noodles", characterStrength, characterFightingStyles, characterType, noodlesImage, 1, 10);
Food rice = new Food("Rice", characterStrength, characterFightingStyles, characterType, riceImage, 1, 15);

Clothes ciaArmor = new Clothes("CIA Armor", characterStrength, characterFightingStyles, Status.HUMAN, ciaArmorImage, 2);
Clothes techArmor = new Clothes("Tech Armor", characterStrength, characterFightingStyles, Status.HERO, techArmorImage, 2);
Clothes noShirt = new Clothes("No Shirt", characterStrength, characterFightingStyles, Status.VILLAIN, noShirtImage, 2);

// Creating The Energy Bar :
energyBarLabel = new JLabel("                                                  Energy Bar: ");
energyBar = new JProgressBar(JProgressBar.HORIZONTAL,0, 100);
energyBar.setStringPainted(true);
energyBar.setValue(60);
energyBar.setMaximum(100);
energyBar.setMinimum(0);
energyBar.contains(1000, 300);

// Creating The Action Bar :
actionBarLabel = new JLabel("                                                  Action Bar: ");
actionBar = new JProgressBar(JProgressBar.HORIZONTAL,0, 100);
actionBar.setStringPainted(true);
actionBar.setValue(50);
actionBar.setMaximum(100);
actionBar.setMinimum(0);
actionBar.contains(1000, 300);

// Initialising The Protected Class Variables :
charName = new String();
charNameTwo = new String();
charNameLabel = new JLabel();
charStatus = new String();
charHeight = new String();
charHeightLabel = new JLabel();
charSpeed = new String();
charSpeedLabel = new JLabel();
charStrength = new String();
charStrengthLabel = new JLabel();
charAlignment = new String();
charAlignmentLabel = new JLabel();
charGender = new String();
charGenderLabel = new JLabel();
charOrigin = new String();
charOriginLabel = new JLabel();
charFightingStyles = new String();
charFightingStylesLabel = new JLabel();
spaceLabel = new JLabel();
space1Label = new JLabel();

charSelection = new JFrame("Trump Game");
gameWindow = new JFrame("Trump Game");

charSelectionPanel = new JPanel(new BorderLayout());
gameWindowPanel = new JPanel(new BorderLayout());

charSelectionTitle = new JLabel("Select Your Character:");
heroLabel = new JLabel("                     Hero");
villainLabel = new JLabel("                     Villain");
characterLabel = new JLabel(" Character Stats:");

heroButton1 = new JButton("Scorpion");
heroButton2 = new JButton("Raiden");
heroButton3 = new JButton("Liu Kang");
villainButton1 = new JButton("Sub-Zero");
villainButton2 = new JButton("Mileena");
villainButton3 = new JButton("Shang Tsung");

nameInput = new JTextField("Enter a name for your character...");

startButton = new JButton("Start Game");
exitButton = new JButton("Exit Game");

gameTitle = new JLabel();

hero1Image = new ImageIcon(getClass().getResource("/images/Scorpion.png"));
hero2Image = new ImageIcon(getClass().getResource("/images/Raiden.png"));
hero3Image = new ImageIcon(getClass().getResource("/images/Liu Kang.png"));
villain1Image = new ImageIcon(getClass().getResource("/images/Sub-Zero.png"));
villain2Image = new ImageIcon(getClass().getResource("/images/Mileena.png"));
villain3Image = new ImageIcon(getClass().getResource("/images/Shang Tsung.png"));
animatedHeroImage1 = new ImageIcon(getClass().getResource("/images/Scorpion.gif"));
animatedHeroImage2 = new ImageIcon(getClass().getResource("/images/Raiden.gif"));
animatedHeroImage3 = new ImageIcon(getClass().getResource("/images/Liu Kang.gif"));
animatedVillainImage1 = new ImageIcon(getClass().getResource("/images/Sub-Zero.gif"));
animatedVillainImage2 = new ImageIcon(getClass().getResource("/images/Mileena.gif"));
animatedVillainImage3 = new ImageIcon(getClass().getResource("/images/Shang Tsung.gif"));
humanImage = new ImageIcon(getClass().getResource("/images/Johnny Cage.png"));
superVillainImage = new ImageIcon(getClass().getResource("/images/Bi-Han.png"));
superHeroImage = new ImageIcon(getClass().getResource("/images/Kenshi.png"));
gameLogo = new ImageIcon(getClass().getResource("/images/gameBackground.png"));

kunaiImage = new ImageIcon(getClass().getResource("/images/kunai.png"));
longswordImage = new ImageIcon(getClass().getResource("/images/longsword.png"));
nunchakuImage = new ImageIcon(getClass().getResource("/images/nunchaku.png"));
sushiImage = new ImageIcon(getClass().getResource("/images/sushi.png"));
noodlesImage = new ImageIcon(getClass().getResource("/images/noodles.png"));
riceImage = new ImageIcon(getClass().getResource("/images/rice.png"));
techArmorImage = new ImageIcon(getClass().getResource("/images/techArmor.png"));
noShirtImage = new ImageIcon(getClass().getResource("/images/noShirt.png"));
ciaArmorImage = new ImageIcon(getClass().getResource("/images/ciaArmor.png"));
takedaImage = new ImageIcon(getClass().getResource("/images/Takeda.png"));
cassieImage = new ImageIcon(getClass().getResource("/images/Cassie.png"));
kotalkhanImage = new ImageIcon(getClass().getResource("/images/Kotal Khan.png"));

kunaiButton = new JButton();
kunaiButton.setIcon(kunaiImage);
longswordButton = new JButton();
longswordButton.setIcon(longswordImage);
nunchakuButton = new JButton();
nunchakuButton.setIcon(nunchakuImage);
sushiButton = new JButton();
sushiButton.setIcon(sushiImage);
noodlesButton = new JButton();
noodlesButton.setIcon(noodlesImage);
riceButton = new JButton();
riceButton.setIcon(riceImage);
techArmorButton = new JButton();
techArmorButton.setIcon(techArmorImage);
noShirtButton = new JButton();
noShirtButton.setIcon(noShirtImage);
ciaArmorButton = new JButton();
ciaArmorButton.setIcon(ciaArmorImage);
shopTitle = new JLabel("MK Shop");

gameLogoButton = new JButton();
gameLogoButton.setIcon(gameLogo);
gameLogoButton.setBackground(Color.BLACK.darker().darker());

heroLabel1 = new JLabel();
heroLabel1info = new JLabel();
heroLabel1info.setText("<html><font color=GRAY><center> Scorpion is a hell-spawned spectre, inexorably seeking vengeance against those responsible for the destruction of his clan and the death of his own family. (Easy) </center></font></html>");
heroLabel2 = new JLabel();
heroLabel2info = new JLabel();
heroLabel2info.setText("<html><font color=GRAY><center> Raiden is the eternal God of Thunder, protector of Earthrealm, and arguably one of the most powerful characters. (Medium) </center></font></html>");
heroLabel3 = new JLabel();
heroLabel3info = new JLabel();
heroLabel3info.setText("<html><font color=GRAY><center> Liu Kang is one of Earthrealm's greatest warriors, having defeated many to prove his valor. (Hard) </center></font></html>");

villainLabel1 = new JLabel();
villainLabel1info = new JLabel();
villainLabel1info.setText("<html><font color=GRAY><center> Sub-Zero descended from Cryomancers, an Outworld race possessing the ability to generate and control the powers of ice. (Easy) </center></font></html>");
villainLabel2 = new JLabel();
villainLabel2info = new JLabel();
villainLabel2info.setText("<html><font color=GRAY><center> Mileena is a clone created by Shang Tsung's sorcery in his flesh pits for Shao Kahn, using Tarkatan physiology. (Medium) </center></font></html>");
villainLabel3 = new JLabel();
villainLabel3info = new JLabel();
villainLabel3info.setText("<html><font color=GRAY><center> Shang Tsung is a powerful, deadly sorcerer, primary villain and shapeshifter who needs to consume souls in order to sustain his health. (Hard) </center></font></html>");

heroLabel1.setIcon(animatedHeroImage1);
heroLabel2.setIcon(animatedHeroImage2);
heroLabel3.setIcon(animatedHeroImage3);
villainLabel1.setIcon(animatedVillainImage1);
villainLabel2.setIcon(animatedVillainImage2);
villainLabel3.setIcon(animatedVillainImage3);

humanImageLabel = new JLabel();
humanImageLabel.setIcon(humanImage);

heroImageLabel1 = new JLabel();
heroImageLabel1.setIcon(hero1Image);
heroImageLabel2 = new JLabel();
heroImageLabel2.setIcon(hero2Image);
heroImageLabel3 = new JLabel();
heroImageLabel3.setIcon(hero3Image);

superHeroImageLabel = new JLabel();
superHeroImageLabel.setIcon(superHeroImage);

villainImageLabel1 = new JLabel();
villainImageLabel1.setIcon(villain1Image);
villainImageLabel2 = new JLabel();
villainImageLabel2.setIcon(villain2Image);
villainImageLabel3 = new JLabel();
villainImageLabel3.setIcon(villain3Image);

superVillainImageLabel = new JLabel();
superVillainImageLabel.setIcon(superVillainImage);

heroButton1 = new JButton();
heroButton1.setIcon(hero1Image);
heroButton2 = new JButton();
heroButton2.setIcon(hero2Image);
heroButton3 = new JButton();
heroButton3.setIcon(hero3Image);

villainButton1 = new JButton();
villainButton1.setIcon(villain1Image);
villainButton2 = new JButton();
villainButton2.setIcon(villain2Image);
villainButton3 = new JButton();
villainButton3.setIcon(villain3Image);

heroButton1.setPreferredSize(new Dimension(150,180));
heroButton2.setPreferredSize(new Dimension(150,180));
heroButton3.setPreferredSize(new Dimension(150,180));

villainButton1.setPreferredSize(new Dimension(150,180));
villainButton2.setPreferredSize(new Dimension(150,180));
villainButton3.setPreferredSize(new Dimension(150,180));

heroLabel.setPreferredSize(new Dimension(150,180));
villainLabel.setPreferredSize(new Dimension(150,180));

startButton.setPreferredSize(new Dimension(150, 25));

exitButton.setPreferredSize(new Dimension(150, 25));

heroButton1.setBackground(Color.BLACK);
heroButton2.setBackground(Color.BLACK);
heroButton3.setBackground(Color.BLACK);

villainButton1.setBackground(Color.BLACK);
villainButton2.setBackground(Color.BLACK);
villainButton3.setBackground(Color.BLACK);

crimeText = new JLabel();

fightButton = new JButton();
fightButton.setEnabled(false);
fightButton.setBackground(Color.BLACK);
fightButtonImage = new ImageIcon(getClass().getResource("/images/fightButton.png"));
fightButton.setIcon(fightButtonImage);

commitCrimeButton = new JButton();
commitCrimeButton.setEnabled(false);
commitCrimeButton.setBackground(Color.BLACK);
commitCrimeButtonImage = new ImageIcon(getClass().getResource("/images/commitButton.png"));
commitCrimeButton.setIcon(commitCrimeButtonImage);

sleepButton = new JButton();
sleepButton.setEnabled(false);
sleepButton.setBackground(Color.BLACK);
sleepButtonImage = new ImageIcon(getClass().getResource("/images/sleepButton.png"));
sleepButton.setIcon(sleepButtonImage);

ignoreButton = new JButton();
ignoreButton.setEnabled(false);
ignoreButton.setBackground(Color.BLACK);
ignoreButtonImage = new ImageIcon(getClass().getResource("/images/ignoreButton.png"));
ignoreButton.setIcon(ignoreButtonImage);

shopButton = new JButton();
shopButton.setEnabled(false);
shopButton.setBackground(Color.BLACK);
shopButtonImage = new ImageIcon(getClass().getResource("/images/shopButton.png"));
shopButton.setIcon(shopButtonImage);

saveButton = new JButton();
saveButton.setEnabled(false);
saveButton.setBackground(Color.BLACK);
saveButtonImage = new ImageIcon(getClass().getResource("/images/saveButton.png"));
saveButton.setIcon(saveButtonImage);

charPanelA = new JPanel();
charPanelB = new JPanel();
charPanelC = new JPanel();
charPanelD = new JPanel();
charPanelE = new JPanel();

gamePanelA = new JPanel();
gamePanelB = new JPanel();
gamePanelC = new JPanel();
gamePanelD = new JPanel();
gamePanelE = new JPanel();

shopPanelA = new JPanel();
shopPanelB = new JPanel();
shopPanelC = new JPanel();
shopPanel = new JPanel();
shopWindow = new JFrame();
shopCurrencyLabel = new JLabel();
shopFoodLabel = new JLabel("Food");
shopClothesLabel = new JLabel("Clothes");
shopGadgetsLabel = new JLabel("Gadgets");
shopCurrency = 0;

// Creating Hero Button 1 (Scorpion) :
heroButton1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		heroButton1.setVisible(true);
		try {

		    AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;

		    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/Scorpion.wav"));
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		} catch (UnsupportedAudioFileException f) 
		{  f.printStackTrace(); 
		} catch (IOException f) 
		{  f.printStackTrace(); 
		} catch (LineUnavailableException f) 
		{  f.printStackTrace(); } 
		
		heroButton1.setEnabled(true);
		heroButton2.setEnabled(false);
		heroButton3.setEnabled(false);
		villainButton1.setEnabled(false);
		villainButton2.setEnabled(false);
		villainButton3.setEnabled(false);
		
		heroLabel1.setVisible(true);
    	heroLabel2.setVisible(false);
    	heroLabel3.setVisible(false);
    	villainLabel1.setVisible(false);
    	villainLabel2.setVisible(false);
    	villainLabel3.setVisible(false);
    	
    	heroLabel1info.setVisible(true);
    	heroLabel2info.setVisible(false);
    	heroLabel3info.setVisible(false);
    	villainLabel1info.setVisible(false);
    	villainLabel2info.setVisible(false);
    	villainLabel3info.setVisible(false);   
    	
    	// Creating The Super Hero Timer
    	Timer superHeroTimer = new Timer();
    	superHeroTimer.scheduleAtFixedRate(new TimerTask(){
    		public void run(){
    			if(energyBar.getValue()==0){
    				charNameTwo = johnnycage.getName().toString();
    				charStatus = johnnycage.getType().toString();
    				charHeight = johnnycage.getHeight().toString();
    				charSpeed = johnnycage.getSpeed().toString();
    				charStrength = johnnycage.getStrength().toString();
    				charAlignment = johnnycage.getAlignment().toString();
    				charGender = johnnycage.getGender().toString();
    				charOrigin = johnnycage.getOrigin().toString();
    				charFightingStyles = johnnycage.getFightingStyles().toString();
    				charGender = johnnycage.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				gameTitle.setForeground(Color.RED.darker());
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				humanImageLabel.setVisible(true);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superHeroImageLabel.setVisible(false);
    				superVillainImageLabel.setVisible(false);
    				crimeText.setText("YOU TURNED INTO A HUMAN, GAME OVER...");
    				energyBar.setVisible(false);
    				energyBarLabel.setVisible(false);
    				actionBar.setVisible(false);
    				actionBarLabel.setVisible(false);
    				fightButton.setVisible(false);
    				ignoreButton.setVisible(false);
    				sleepButton.setVisible(false);
    				shopButton.setVisible(false);
    				saveButton.setVisible(false);
    			}
    			if(actionBar.getValue()>=90)
    				if(actionBar.getValue()<=100){
    				if(charStatus.equals(scorpion.getType().toString())){
    					if(charStatus.equals(raiden.getType().toString())){
    						if(charStatus.equals(liukang.getType().toString())){
    				charNameTwo = kenshi.getName().toString();
    				charStatus = kenshi.getType().toString();
    				charHeight = kenshi.getHeight().toString();
    				charSpeed = kenshi.getSpeed().toString();
    				charStrength = kenshi.getStrength().toString();
    				charAlignment = kenshi.getAlignment().toString();
    				charGender = kenshi.getGender().toString();
    				charOrigin = kenshi.getOrigin().toString();
    				charFightingStyles = kenshi.getFightingStyles().toString();
    				charGender = kenshi.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				superHeroImageLabel.setVisible(true);
    				humanImageLabel.setVisible(false);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superVillainImageLabel.setVisible(false);
    				fightButton.setBackground(Color.RED.darker().darker());
    				commitCrimeButton.setBackground(Color.RED.darker().darker());
    				ignoreButton.setBackground(Color.RED.darker().darker());
    				sleepButton.setBackground(Color.RED.darker().darker());
    				shopButton.setBackground(Color.RED.darker().darker());
    				saveButton.setBackground(Color.RED.darker().darker());
    						}
    					}
    				}
    			}
    			gameTitle.setText(charStatus + " : " + charName);
    		}}, 100, 1000);
	}
});

// Creating Hero Button 2 (Raiden) :
heroButton2.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		heroButton2.setVisible(true);
		try {
		    
		    AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;

		    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/Raiden.wav"));
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		} catch (UnsupportedAudioFileException f) 
		{  f.printStackTrace(); 
		} catch (IOException f) 
		{  f.printStackTrace(); 
		} catch (LineUnavailableException f) 
		{  f.printStackTrace(); } 
		
		heroButton1.setEnabled(false);
		heroButton2.setEnabled(true);
		heroButton3.setEnabled(false);
		villainButton1.setEnabled(false);
		villainButton2.setEnabled(false);
		villainButton3.setEnabled(false);
		
		heroLabel1.setVisible(false);
    	heroLabel2.setVisible(true);
    	heroLabel3.setVisible(false);
    	villainLabel1.setVisible(false);
    	villainLabel2.setVisible(false);
    	villainLabel3.setVisible(false);
    	
    	heroLabel1info.setVisible(false);
    	heroLabel2info.setVisible(true);
    	heroLabel3info.setVisible(false);
    	villainLabel1info.setVisible(false);
    	villainLabel2info.setVisible(false);
    	villainLabel3info.setVisible(false);
    	
    	// Creating The Super Hero Timer
    	Timer superHeroTimer = new Timer();
    	superHeroTimer.scheduleAtFixedRate(new TimerTask(){
    		public void run(){
    			if(energyBar.getValue()==0){
    				charNameTwo = johnnycage.getName().toString();
    				charStatus = johnnycage.getType().toString();
    				charHeight = johnnycage.getHeight().toString();
    				charSpeed = johnnycage.getSpeed().toString();
    				charStrength = johnnycage.getStrength().toString();
    				charAlignment = johnnycage.getAlignment().toString();
    				charGender = johnnycage.getGender().toString();
    				charOrigin = johnnycage.getOrigin().toString();
    				charFightingStyles = johnnycage.getFightingStyles().toString();
    				charGender = johnnycage.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				gameTitle.setForeground(Color.RED.darker());
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				humanImageLabel.setVisible(true);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superHeroImageLabel.setVisible(false);
    				superVillainImageLabel.setVisible(false);
    				crimeText.setText("YOU TURNED INTO A HUMAN, GAME OVER...");
    				energyBar.setVisible(false);
    				energyBarLabel.setVisible(false);
    				actionBar.setVisible(false);
    				actionBarLabel.setVisible(false);
    				fightButton.setVisible(false);
    				ignoreButton.setVisible(false);
    				sleepButton.setVisible(false);
    				shopButton.setVisible(false);
    				saveButton.setVisible(false);
    			}
    			if(actionBar.getValue()>=90)
    				if(actionBar.getValue()<=100){
    				if(charStatus.equals(scorpion.getType().toString())){
    					if(charStatus.equals(raiden.getType().toString())){
    						if(charStatus.equals(liukang.getType().toString())){
    				charNameTwo = kenshi.getName().toString();
    				charStatus = kenshi.getType().toString();
    				charHeight = kenshi.getHeight().toString();
    				charSpeed = kenshi.getSpeed().toString();
    				charStrength = kenshi.getStrength().toString();
    				charAlignment = kenshi.getAlignment().toString();
    				charGender = kenshi.getGender().toString();
    				charOrigin = kenshi.getOrigin().toString();
    				charFightingStyles = kenshi.getFightingStyles().toString();
    				charGender = kenshi.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				superHeroImageLabel.setVisible(true);
    				humanImageLabel.setVisible(false);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superVillainImageLabel.setVisible(false);
    				fightButton.setBackground(Color.RED.darker().darker());
    				commitCrimeButton.setBackground(Color.RED.darker().darker());
    				ignoreButton.setBackground(Color.RED.darker().darker());
    				sleepButton.setBackground(Color.RED.darker().darker());
    				shopButton.setBackground(Color.RED.darker().darker());
    				saveButton.setBackground(Color.RED.darker().darker());
    						}
    					}
    				}
    			}
    			gameTitle.setText(charStatus + " : " + charName);
    		}}, 100, 1000);
    	
    	// Creating The Medium Difficulty Timer
    	medTimer = new Timer();
    	medTimer.scheduleAtFixedRate(new TimerTask(){
    		public void run(){
    			energyBar.setValue(energyBar.getValue()-1);
	    		energyBar.setValue(energyBar.getValue());
	    		energyBar.setString(energyBar.getValue() + "%");
    		}}, 100, 1000);
	}
});

// Creating Hero Button 3 (Liu Kang) :
heroButton3.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		heroButton3.setVisible(true);
		try {

		    AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;

		    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/LiuKang.wav"));
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		} catch (UnsupportedAudioFileException f) 
		{  f.printStackTrace(); 
		} catch (IOException f) 
		{  f.printStackTrace(); 
		} catch (LineUnavailableException f) 
		{  f.printStackTrace(); } 
		
		heroButton1.setEnabled(false);
		heroButton2.setEnabled(false);
		heroButton3.setEnabled(true);
		villainButton1.setEnabled(false);
		villainButton2.setEnabled(false);
		villainButton3.setEnabled(false);
		
		heroLabel1.setVisible(false);
    	heroLabel2.setVisible(false);
    	heroLabel3.setVisible(true);
    	villainLabel1.setVisible(false);
    	villainLabel2.setVisible(false);
    	villainLabel3.setVisible(false);
    	
    	heroLabel1info.setVisible(false);
    	heroLabel2info.setVisible(false);
    	heroLabel3info.setVisible(true);
    	villainLabel1info.setVisible(false);
    	villainLabel2info.setVisible(false);
    	villainLabel3info.setVisible(false);
    	
    	// Creating The Super Hero Timer
    	Timer superHeroTimer = new Timer();
    	superHeroTimer.scheduleAtFixedRate(new TimerTask(){
    		public void run(){
    			if(energyBar.getValue()==0){
    				charNameTwo = johnnycage.getName().toString();
    				charStatus = johnnycage.getType().toString();
    				charHeight = johnnycage.getHeight().toString();
    				charSpeed = johnnycage.getSpeed().toString();
    				charStrength = johnnycage.getStrength().toString();
    				charAlignment = johnnycage.getAlignment().toString();
    				charGender = johnnycage.getGender().toString();
    				charOrigin = johnnycage.getOrigin().toString();
    				charFightingStyles = johnnycage.getFightingStyles().toString();
    				charGender = johnnycage.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				gameTitle.setForeground(Color.RED.darker());
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				humanImageLabel.setVisible(true);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superHeroImageLabel.setVisible(false);
    				superVillainImageLabel.setVisible(false);
    				crimeText.setText("YOU TURNED INTO A HUMAN, GAME OVER...");
    				energyBar.setVisible(false);
    				energyBarLabel.setVisible(false);
    				actionBar.setVisible(false);
    				actionBarLabel.setVisible(false);
    				fightButton.setVisible(false);
    				ignoreButton.setVisible(false);
    				sleepButton.setVisible(false);
    				shopButton.setVisible(false);
    				saveButton.setVisible(false);
    			}
    			if(actionBar.getValue()>=90)
    				if(actionBar.getValue()<=100){
    				if(charStatus.equals(scorpion.getType().toString())){
    					if(charStatus.equals(raiden.getType().toString())){
    						if(charStatus.equals(liukang.getType().toString())){
    				charNameTwo = kenshi.getName().toString();
    				charStatus = kenshi.getType().toString();
    				charHeight = kenshi.getHeight().toString();
    				charSpeed = kenshi.getSpeed().toString();
    				charStrength = kenshi.getStrength().toString();
    				charAlignment = kenshi.getAlignment().toString();
    				charGender = kenshi.getGender().toString();
    				charOrigin = kenshi.getOrigin().toString();
    				charFightingStyles = kenshi.getFightingStyles().toString();
    				charGender = kenshi.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				superHeroImageLabel.setVisible(true);
    				humanImageLabel.setVisible(false);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superVillainImageLabel.setVisible(false);
    				fightButton.setBackground(Color.RED.darker().darker());
    				commitCrimeButton.setBackground(Color.RED.darker().darker());
    				ignoreButton.setBackground(Color.RED.darker().darker());
    				sleepButton.setBackground(Color.RED.darker().darker());
    				shopButton.setBackground(Color.RED.darker().darker());
    				saveButton.setBackground(Color.RED.darker().darker());
    						}
    					}
    				}
    			}
    			gameTitle.setText(charStatus + " : " + charName);
    		}}, 100, 1000);
    	
       	// Creating The Hard Difficulty Timer
    	hardTimer = new Timer();
    	hardTimer.scheduleAtFixedRate(new TimerTask(){
    		public void run(){
    			energyBar.setValue(energyBar.getValue()-1);
	    		energyBar.setValue(energyBar.getValue());
	    		energyBar.setString(energyBar.getValue() + "%");
 
    		}}, 100, 100);
	}
});

// Creating The Villain Button 1 (Sub-Zero) :
villainButton1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		villainButton1.setVisible(true);
		try {

		    AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;

		    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/SubZero.wav"));
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		} catch (UnsupportedAudioFileException f) 
		{  f.printStackTrace(); 
		} catch (IOException f) 
		{  f.printStackTrace(); 
		} catch (LineUnavailableException f) 
		{  f.printStackTrace(); } 
		
		heroButton1.setEnabled(false);
		heroButton2.setEnabled(false);
		heroButton3.setEnabled(false);
		villainButton1.setEnabled(true);
		villainButton2.setEnabled(false);
		villainButton3.setEnabled(false);
		
		heroLabel1.setVisible(false);
    	heroLabel2.setVisible(false);
    	heroLabel3.setVisible(false);
    	villainLabel1.setVisible(true);
    	villainLabel2.setVisible(false);
    	villainLabel3.setVisible(false);
    	
    	heroLabel1info.setVisible(false);
    	heroLabel2info.setVisible(false);
    	heroLabel3info.setVisible(false);
    	villainLabel1info.setVisible(true);
    	villainLabel2info.setVisible(false);
    	villainLabel3info.setVisible(false);
    	
    	// Creating The Super Villain Timer
    	Timer superVillainTimer = new Timer();
    	superVillainTimer.scheduleAtFixedRate(new TimerTask(){
    		public void run(){
    			if(energyBar.getValue()==0){
    			
    				if((fightCrimeTimer != null)){
    					fightCrimeTimer.cancel();
    				}
    				if((commitCrimeTimer != null)){
    					commitCrimeTimer.cancel();
    				}
    				charNameTwo = johnnycage.getName().toString();
    				charStatus = johnnycage.getType().toString();
    				charHeight = johnnycage.getHeight().toString();
    				charSpeed = johnnycage.getSpeed().toString();
    				charStrength = johnnycage.getStrength().toString();
    				charAlignment = johnnycage.getAlignment().toString();
    				charGender = johnnycage.getGender().toString();
    				charOrigin = johnnycage.getOrigin().toString();
    				charFightingStyles = johnnycage.getFightingStyles().toString();
    				charGender = johnnycage.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				gameTitle.setForeground(Color.GREEN.darker());
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				humanImageLabel.setVisible(true);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superHeroImageLabel.setVisible(false);
    				superVillainImageLabel.setVisible(false);
    				crimeText.setText("YOU TURNED INTO A HUMAN, GAME OVER...");
    				energyBar.setVisible(false);
    				energyBarLabel.setVisible(false);
    				actionBar.setVisible(false);
    				actionBarLabel.setVisible(false);
    				commitCrimeButton.setVisible(false);
    				ignoreButton.setVisible(false);
    				sleepButton.setVisible(false);
    				shopButton.setVisible(false);
    			}
    			if(actionBar.getValue()>=25)
    				if(actionBar.getValue()<=35){
    				if(charStatus.equals(subzero.getType().toString())){
    					if(charStatus.equals(mileena.getType().toString())){
    						if(charStatus.equals(shangtsung.getType().toString())){
    				charNameTwo = noobsaibot.getName().toString();
    				charStatus = noobsaibot.getType().toString();
    				charHeight = noobsaibot.getHeight().toString();
    				charSpeed = noobsaibot.getSpeed().toString();
    				charStrength = noobsaibot.getStrength().toString();
    				charAlignment = noobsaibot.getAlignment().toString();
    				charGender = noobsaibot.getGender().toString();
    				charOrigin = noobsaibot.getOrigin().toString();
    				charFightingStyles = noobsaibot.getFightingStyles().toString();
    				charGender = noobsaibot.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				gameTitle.setForeground(Color.GREEN.darker());
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				superVillainImageLabel.setVisible(true);
    				humanImageLabel.setVisible(false);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superHeroImageLabel.setVisible(false);
    				fightButton.setBackground(Color.BLACK.darker().darker());
    				commitCrimeButton.setBackground(Color.BLACK.darker().darker());
    				ignoreButton.setBackground(Color.BLACK.darker().darker());
    				sleepButton.setBackground(Color.BLACK.darker().darker());
    				shopButton.setBackground(Color.BLACK.darker().darker());
    				saveButton.setBackground(Color.BLACK.darker().darker());
    						}
    					}
    				}
    			}
    			gameTitle.setText(charStatus + " : " + charName);
    		}}, 100, 1000);
	}
});

// Creating Villain Button 2 (Mileena) :
villainButton2.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		villainButton2.setVisible(true);
		try {

		    AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;

		    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/Mileena.wav"));
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		} catch (UnsupportedAudioFileException f) 
		{  f.printStackTrace(); 
		} catch (IOException f) 
		{  f.printStackTrace(); 
		} catch (LineUnavailableException f) 
		{  f.printStackTrace(); } 
		
		heroButton1.setEnabled(false);
		heroButton2.setEnabled(false);
		heroButton3.setEnabled(false);
		villainButton1.setEnabled(false);
		villainButton2.setEnabled(true);
		villainButton3.setEnabled(false);
		
		heroLabel1.setVisible(false);
    	heroLabel2.setVisible(false);
    	heroLabel3.setVisible(false);
    	villainLabel1.setVisible(false);
    	villainLabel2.setVisible(true);
    	villainLabel3.setVisible(false);
    	
    	heroLabel1info.setVisible(false);
    	heroLabel2info.setVisible(false);
    	heroLabel3info.setVisible(false);
    	villainLabel1info.setVisible(false);
    	villainLabel2info.setVisible(true);
    	villainLabel3info.setVisible(false);
    	
    	// Creating The Super Villain Timer
    	Timer superVillainTimer = new Timer();
    	superVillainTimer.scheduleAtFixedRate(new TimerTask(){
    		public void run(){
    			if(energyBar.getValue()==0){
    			
    				if((fightCrimeTimer != null)){
    					fightCrimeTimer.cancel();
    				}
    				if((commitCrimeTimer != null)){
    					commitCrimeTimer.cancel();
    				}
    				charNameTwo = johnnycage.getName().toString();
    				charStatus = johnnycage.getType().toString();
    				charHeight = johnnycage.getHeight().toString();
    				charSpeed = johnnycage.getSpeed().toString();
    				charStrength = johnnycage.getStrength().toString();
    				charAlignment = johnnycage.getAlignment().toString();
    				charGender = johnnycage.getGender().toString();
    				charOrigin = johnnycage.getOrigin().toString();
    				charFightingStyles = johnnycage.getFightingStyles().toString();
    				charGender = johnnycage.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				gameTitle.setForeground(Color.GREEN.darker());
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				humanImageLabel.setVisible(true);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superHeroImageLabel.setVisible(false);
    				superVillainImageLabel.setVisible(false);
    				crimeText.setText("YOU TURNED INTO A HUMAN, GAME OVER...");
    				energyBar.setVisible(false);
    				energyBarLabel.setVisible(false);
    				actionBar.setVisible(false);
    				actionBarLabel.setVisible(false);
    				commitCrimeButton.setVisible(false);
    				ignoreButton.setVisible(false);
    				sleepButton.setVisible(false);
    				shopButton.setVisible(false);
    			}
    			if(actionBar.getValue()>=25)
    				if(actionBar.getValue()<=35){
    				if(charStatus.equals(subzero.getType().toString())){
    					if(charStatus.equals(mileena.getType().toString())){
    						if(charStatus.equals(shangtsung.getType().toString())){
    				charNameTwo = noobsaibot.getName().toString();
    				charStatus = noobsaibot.getType().toString();
    				charHeight = noobsaibot.getHeight().toString();
    				charSpeed = noobsaibot.getSpeed().toString();
    				charStrength = noobsaibot.getStrength().toString();
    				charAlignment = noobsaibot.getAlignment().toString();
    				charGender = noobsaibot.getGender().toString();
    				charOrigin = noobsaibot.getOrigin().toString();
    				charFightingStyles = noobsaibot.getFightingStyles().toString();
    				charGender = noobsaibot.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				gameTitle.setForeground(Color.GREEN.darker());
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				superVillainImageLabel.setVisible(true);
    				humanImageLabel.setVisible(false);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superHeroImageLabel.setVisible(false);
    				fightButton.setBackground(Color.BLACK.darker().darker());
    				commitCrimeButton.setBackground(Color.BLACK.darker().darker());
    				ignoreButton.setBackground(Color.BLACK.darker().darker());
    				sleepButton.setBackground(Color.BLACK.darker().darker());
    				shopButton.setBackground(Color.BLACK.darker().darker());
    				saveButton.setBackground(Color.BLACK.darker().darker());
    						}
    					}
    				}
    			}
    			gameTitle.setText(charStatus + " : " + charName);
    		}}, 100, 1000);
       	// Creating The Medium2 Difficulty Timer
    	medTimer2 = new Timer();
    	medTimer2.scheduleAtFixedRate(new TimerTask(){
    		public void run(){
    			energyBar.setValue(energyBar.getValue()-1);
	    		energyBar.setValue(energyBar.getValue());
	    		energyBar.setString(energyBar.getValue() + "%");
    		}}, 100, 1000);
	}
});

// Creating Villain Button 3 (Shang Tsung) :
villainButton3.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		villainButton3.setVisible(true);
		try {

		    AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;

		    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/ShangTsung.wav"));
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		} catch (UnsupportedAudioFileException f) 
		{  f.printStackTrace(); 
		} catch (IOException f) 
		{  f.printStackTrace(); 
		} catch (LineUnavailableException f) 
		{  f.printStackTrace(); } 
		
		heroButton1.setEnabled(false);
		heroButton2.setEnabled(false);
		heroButton3.setEnabled(false);
		villainButton1.setEnabled(false);
		villainButton2.setEnabled(false);
		villainButton3.setEnabled(true);
		
		heroLabel1.setVisible(false);
    	heroLabel2.setVisible(false);
    	heroLabel3.setVisible(false);
    	villainLabel1.setVisible(false);
    	villainLabel2.setVisible(false);
    	villainLabel3.setVisible(true);
    	
    	heroLabel1info.setVisible(false);
    	heroLabel2info.setVisible(false);
    	heroLabel3info.setVisible(false);
    	villainLabel1info.setVisible(false);
    	villainLabel2info.setVisible(false);
    	villainLabel3info.setVisible(true);
    	
    	// Creating The Super Villain Timer
    	Timer superVillainTimer = new Timer();
    	superVillainTimer.scheduleAtFixedRate(new TimerTask(){
    		public void run(){
    			if(energyBar.getValue()==0){
    			
    				if((fightCrimeTimer != null)){
    					fightCrimeTimer.cancel();
    				}
    				if((commitCrimeTimer != null)){
    					commitCrimeTimer.cancel();
    				}
    				charNameTwo = johnnycage.getName().toString();
    				charStatus = johnnycage.getType().toString();
    				charHeight = johnnycage.getHeight().toString();
    				charSpeed = johnnycage.getSpeed().toString();
    				charStrength = johnnycage.getStrength().toString();
    				charAlignment = johnnycage.getAlignment().toString();
    				charGender = johnnycage.getGender().toString();
    				charOrigin = johnnycage.getOrigin().toString();
    				charFightingStyles = johnnycage.getFightingStyles().toString();
    				charGender = johnnycage.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				gameTitle.setForeground(Color.GREEN.darker());
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				humanImageLabel.setVisible(true);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superHeroImageLabel.setVisible(false);
    				superVillainImageLabel.setVisible(false);
    				crimeText.setText("YOU TURNED INTO A HUMAN, GAME OVER...");
    				energyBar.setVisible(false);
    				energyBarLabel.setVisible(false);
    				actionBar.setVisible(false);
    				actionBarLabel.setVisible(false);
    				commitCrimeButton.setVisible(false);
    				ignoreButton.setVisible(false);
    				sleepButton.setVisible(false);
    				shopButton.setVisible(false);
    			}
    			if(actionBar.getValue()>=25)
    				if(actionBar.getValue()<=35){
    				if(charStatus.equals(subzero.getType().toString())){
    					if(charStatus.equals(mileena.getType().toString())){
    						if(charStatus.equals(shangtsung.getType().toString())){
    				charNameTwo = noobsaibot.getName().toString();
    				charStatus = noobsaibot.getType().toString();
    				charHeight = noobsaibot.getHeight().toString();
    				charSpeed = noobsaibot.getSpeed().toString();
    				charStrength = noobsaibot.getStrength().toString();
    				charAlignment = noobsaibot.getAlignment().toString();
    				charGender = noobsaibot.getGender().toString();
    				charOrigin = noobsaibot.getOrigin().toString();
    				charFightingStyles = noobsaibot.getFightingStyles().toString();
    				charGender = noobsaibot.getGender().toString();
    				charNameLabel.setText(" Real Name: " +  charNameTwo);
    				gameTitle.setForeground(Color.GREEN.darker());
    				charHeightLabel.setText(" Height: " +  charHeight);
    				charSpeedLabel.setText(" Speed: " +  charSpeed);
    				charStrengthLabel.setText(" Strength: " +  charStrength);
    				charAlignmentLabel.setText(" Alignment: " +  charAlignment);
    				charGenderLabel.setText(" Gender: " +  charGender);
    				charOriginLabel.setText(" Origin: " +  charOrigin);
    				charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
    				spaceLabel.setText("---------------------------------------------------------------------------");
    				space1Label.setText("---------------------------------------------------------------------------");
    				superVillainImageLabel.setVisible(true);
    				humanImageLabel.setVisible(false);
    				heroImageLabel1.setVisible(false);
    				heroImageLabel2.setVisible(false);
    				heroImageLabel3.setVisible(false);
    				villainImageLabel1.setVisible(false);
    				villainImageLabel2.setVisible(false);
    				villainImageLabel3.setVisible(false);
    				superHeroImageLabel.setVisible(false);
    				fightButton.setBackground(Color.BLACK.darker().darker());
    				commitCrimeButton.setBackground(Color.BLACK.darker().darker());
    				ignoreButton.setBackground(Color.BLACK.darker().darker());
    				sleepButton.setBackground(Color.BLACK.darker().darker());
    				shopButton.setBackground(Color.BLACK.darker().darker());
    				saveButton.setBackground(Color.BLACK.darker().darker());
    						}
    					}
    				}
    			}
    			gameTitle.setText(charStatus + " : " + charName);
    		}}, 100, 1000);
       	// Creating The Hard2 Difficulty Timer
    	hardTimer2 = new Timer();
    	hardTimer2.scheduleAtFixedRate(new TimerTask(){
    		public void run(){
    			energyBar.setValue(energyBar.getValue()-1);
	    		energyBar.setValue(energyBar.getValue());
	    		energyBar.setString(energyBar.getValue() + "%");
    		}}, 100, 100);
	}
});

// Creating Hero Button 1 Mouse Entered Listener (Scorpion) :
heroButton1.addMouseListener(new MouseAdapter()
{
    public void mouseEntered(MouseEvent evt)
    {
    	heroLabel1.setVisible(true);
    	heroLabel2.setVisible(false);
    	heroLabel3.setVisible(false);
    	villainLabel1.setVisible(false);
    	villainLabel2.setVisible(false);
    	villainLabel3.setVisible(false);
    	heroLabel1info.setVisible(true);
    	heroLabel2info.setVisible(false);
    	heroLabel3info.setVisible(false);
    	villainLabel1info.setVisible(false);
    	villainLabel2info.setVisible(false);
    	villainLabel3info.setVisible(false);
    }
});

// Creating Hero Button 2 Mouse Entered Listener (Raiden) :
heroButton2.addMouseListener(new MouseAdapter()
{
    public void mouseEntered(MouseEvent evt)
    {
    	heroLabel1.setVisible(false);
    	heroLabel2.setVisible(true);
    	heroLabel3.setVisible(false);
    	villainLabel1.setVisible(false);
    	villainLabel2.setVisible(false);
    	villainLabel3.setVisible(false);
    	heroLabel1info.setVisible(false);
    	heroLabel2info.setVisible(true);
    	heroLabel3info.setVisible(false);
    	villainLabel1info.setVisible(false);
    	villainLabel2info.setVisible(false);
    	villainLabel3info.setVisible(false);
    	
    }
});

// Creating Hero Button 3 Mouse Entered Listener (Liu Kang) :
heroButton3.addMouseListener(new MouseAdapter()
{
    public void mouseEntered(MouseEvent evt)
    {
    	heroLabel1.setVisible(false);
    	heroLabel2.setVisible(false);
    	heroLabel3.setVisible(true);
    	villainLabel1.setVisible(false);
    	villainLabel2.setVisible(false);
    	villainLabel3.setVisible(false);
    	heroLabel1info.setVisible(false);
    	heroLabel2info.setVisible(false);
    	heroLabel3info.setVisible(true);
    	villainLabel1info.setVisible(false);
    	villainLabel2info.setVisible(false);
    	villainLabel3info.setVisible(false);
    }
});

// Creating Villain Button 1 Mouse Entered Listener (Sub-Zero) :
villainButton1.addMouseListener(new MouseAdapter()
{
    public void mouseEntered(MouseEvent evt)
    {
    	heroLabel1.setVisible(false);
    	heroLabel2.setVisible(false);
    	heroLabel3.setVisible(false);
    	villainLabel1.setVisible(true);
    	villainLabel2.setVisible(false);
    	villainLabel3.setVisible(false);
    	heroLabel1info.setVisible(false);
    	heroLabel2info.setVisible(false);
    	heroLabel3info.setVisible(false);
    	villainLabel1info.setVisible(true);
    	villainLabel2info.setVisible(false);
    	villainLabel3info.setVisible(false);
    }
});

// Creating Villain Button 2 Mouse Entered Listener (Mileena) :
villainButton2.addMouseListener(new MouseAdapter()
{
    public void mouseEntered(MouseEvent evt)
    {
    	
    	heroLabel1.setVisible(false);
    	heroLabel2.setVisible(false);
    	heroLabel3.setVisible(false);
    	villainLabel1.setVisible(false);
    	villainLabel2.setVisible(true);
    	villainLabel3.setVisible(false);
    	heroLabel1info.setVisible(false);
    	heroLabel2info.setVisible(false);
    	heroLabel3info.setVisible(false);
    	villainLabel1info.setVisible(false);
    	villainLabel2info.setVisible(true);
    	villainLabel3info.setVisible(false);
    }
});

// Creating Villain Button 3 Mouse Entered Listener (Shang Tsung) :
villainButton3.addMouseListener(new MouseAdapter()
{
    public void mouseEntered(MouseEvent evt)
    {
    	heroLabel1.setVisible(false);
    	heroLabel2.setVisible(false);
    	heroLabel3.setVisible(false);
    	villainLabel1.setVisible(false);
    	villainLabel2.setVisible(false);
    	villainLabel3.setVisible(true);
    	heroLabel1info.setVisible(false);
    	heroLabel2info.setVisible(false);
    	heroLabel3info.setVisible(false);
    	villainLabel1info.setVisible(false);
    	villainLabel2info.setVisible(false);
    	villainLabel3info.setVisible(true);
    }
});

// Creating Start Button :
startButton.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		charSelection.setVisible(false);
		createGameWindow(gameWindow);
		charName = nameInput.getText().toString();

		try {

		    AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;

		    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/fight.wav"));
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		} catch (UnsupportedAudioFileException f) 
		{  f.printStackTrace(); 
		} catch (IOException f) 
		{  f.printStackTrace(); 
		} catch (LineUnavailableException f) 
		{  f.printStackTrace(); } 
		
		if(heroButton1.isEnabled() == true){
			charNameTwo = scorpion.getName().toString();
			charStatus = scorpion.getType().toString();
			charHeight = scorpion.getHeight().toString();
			charSpeed = scorpion.getSpeed().toString();
			charStrength = scorpion.getStrength().toString();
			charAlignment = scorpion.getAlignment().toString();
			charGender = scorpion.getGender().toString();
			charOrigin = scorpion.getOrigin().toString();
			charFightingStyles = scorpion.getFightingStyles().toString();
			charGender = scorpion.getGender().toString();
			charNameLabel.setText(" Real Name: " +  charNameTwo);
			gameTitle.setForeground(Color.RED.darker());
			charHeightLabel.setText(" Height: " +  charHeight);
			charSpeedLabel.setText(" Speed: " +  charSpeed);
			charStrengthLabel.setText(" Strength: " +  charStrength);
			charAlignmentLabel.setText(" Alignment: " +  charAlignment);
			charGenderLabel.setText(" Gender: " +  charGender);
			charOriginLabel.setText(" Origin: " +  charOrigin);
			charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
			spaceLabel.setText("---------------------------------------------------------------------------");
			space1Label.setText("---------------------------------------------------------------------------");
			gamePanelC.add(fightButton);
			gamePanelC.add(ignoreButton);
			gamePanelC.add(sleepButton);
			heroImageLabel1.setVisible(true);
			gamePanelB.add(shopButton);

			fightButton.setBackground(Color.ORANGE.darker().darker());
			ignoreButton.setBackground(Color.ORANGE.darker().darker());
			sleepButton.setBackground(Color.ORANGE.darker().darker());
			shopButton.setBackground(Color.ORANGE.darker().darker());
			saveButton.setBackground(Color.ORANGE.darker().darker());
			ColorUIResource colorResource = new ColorUIResource(Color.orange.darker().darker());
			UIManager.put("nimbusOrange",colorResource);
			
		}
		if(heroButton2.isEnabled() == true){
			charNameTwo = raiden.getName().toString();
			charStatus = raiden.getType().toString();
			charHeight = raiden.getHeight().toString();
			charSpeed = raiden.getSpeed().toString();
			charStrength = raiden.getStrength().toString();
			charAlignment = raiden.getAlignment().toString();
			charGender = raiden.getGender().toString();
			charOrigin = raiden.getOrigin().toString();
			charFightingStyles = raiden.getFightingStyles().toString();
			charGender = raiden.getGender().toString();
			charNameLabel.setText(" Real Name: " +  charNameTwo);
			gameTitle.setForeground(Color.RED.darker());
			charHeightLabel.setText(" Height: " +  charHeight);
			charSpeedLabel.setText(" Speed: " +  charSpeed);
			charStrengthLabel.setText(" Strength: " +  charStrength);
			charAlignmentLabel.setText(" Alignment: " +  charAlignment);
			charGenderLabel.setText(" Gender: " +  charGender);
			charOriginLabel.setText(" Origin: " +  charOrigin);
			charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
			spaceLabel.setText("---------------------------------------------------------------------------");
			space1Label.setText("---------------------------------------------------------------------------");
			gamePanelC.add(fightButton);
			gamePanelC.add(ignoreButton);
			gamePanelC.add(sleepButton);
			heroImageLabel2.setVisible(true);
			gamePanelB.add(shopButton);
			fightButton.setBackground(Color.WHITE.darker());
			ignoreButton.setBackground(Color.WHITE.darker());
			sleepButton.setBackground(Color.WHITE.darker());
			shopButton.setBackground(Color.WHITE.darker().darker());
			saveButton.setBackground(Color.WHITE.darker());
			ColorUIResource colorResource = new ColorUIResource(Color.white.darker());
			UIManager.put("nimbusOrange",colorResource);
		}
		if(heroButton3.isEnabled() == true){
			charNameTwo = liukang.getName().toString();
			charStatus = liukang.getType().toString();
			charHeight = liukang.getHeight().toString();
			charSpeed = liukang.getSpeed().toString();
			charStrength = liukang.getStrength().toString();
			charAlignment = liukang.getAlignment().toString();
			charGender = liukang.getGender().toString();
			charOrigin = liukang.getOrigin().toString();
			charFightingStyles = liukang.getFightingStyles().toString();
			charGender = liukang.getGender().toString();
			charNameLabel.setText(" Real Name: " +  charNameTwo);
			gameTitle.setForeground(Color.RED.darker());
			charHeightLabel.setText(" Height: " +  charHeight);
			charSpeedLabel.setText(" Speed: " +  charSpeed);
			charStrengthLabel.setText(" Strength: " +  charStrength);
			charAlignmentLabel.setText(" Alignment: " +  charAlignment);
			charGenderLabel.setText(" Gender: " +  charGender);
			charOriginLabel.setText(" Origin: " +  charOrigin);
			charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
			spaceLabel.setText("---------------------------------------------------------------------------");
			space1Label.setText("---------------------------------------------------------------------------");
			gamePanelC.add(fightButton);
			gamePanelC.add(ignoreButton);
			gamePanelC.add(sleepButton);
			heroImageLabel3.setVisible(true);
			gamePanelB.add(shopButton);
			fightButton.setBackground(Color.RED.darker().darker());
			ignoreButton.setBackground(Color.RED.darker().darker());
			sleepButton.setBackground(Color.RED.darker().darker());
			shopButton.setBackground(Color.RED.darker().darker());
			saveButton.setBackground(Color.RED.darker().darker());
			ColorUIResource colorResource = new ColorUIResource(Color.red.darker().darker());
			UIManager.put("nimbusOrange",colorResource);
		}
		if(villainButton1.isEnabled() == true){
			charNameTwo = subzero.getName().toString();
			charStatus = subzero.getType().toString();
			charHeight = subzero.getHeight().toString();
			charSpeed = subzero.getSpeed().toString();
			charStrength = subzero.getStrength().toString();
			charAlignment = subzero.getAlignment().toString();
			charGender = subzero.getGender().toString();
			charOrigin = subzero.getOrigin().toString();
			charFightingStyles = subzero.getFightingStyles().toString();
			charGender = subzero.getGender().toString();
			charNameLabel.setText(" Real Name: " +  charNameTwo);
			gameTitle.setForeground(Color.GREEN.darker());
			charHeightLabel.setText(" Height: " +  charHeight);
			charSpeedLabel.setText(" Speed: " +  charSpeed);
			charStrengthLabel.setText(" Strength: " +  charStrength);
			charAlignmentLabel.setText(" Alignment: " +  charAlignment);
			charGenderLabel.setText(" Gender: " +  charGender);
			charOriginLabel.setText(" Origin: " +  charOrigin);
			charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
			spaceLabel.setText("---------------------------------------------------------------------------");
			space1Label.setText("---------------------------------------------------------------------------");
			gamePanelC.add(commitCrimeButton);
			gamePanelC.add(ignoreButton);
			gamePanelC.add(sleepButton);
			villainImageLabel1.setVisible(true);
			gamePanelB.add(shopButton);
			commitCrimeButton.setBackground(Color.CYAN.darker().darker());
			ignoreButton.setBackground(Color.CYAN.darker().darker());
			sleepButton.setBackground(Color.CYAN.darker().darker());
			shopButton.setBackground(Color.CYAN.darker().darker());
			saveButton.setBackground(Color.CYAN.darker().darker());
			ColorUIResource colorResource = new ColorUIResource(Color.cyan.darker().darker());
			UIManager.put("nimbusOrange",colorResource);
		}
		if(villainButton2.isEnabled() == true){
			charNameTwo = mileena.getName().toString();
			charStatus = mileena.getType().toString();
			charHeight = mileena.getHeight().toString();
			charSpeed = mileena.getSpeed().toString();
			charStrength = mileena.getStrength().toString();
			charAlignment = mileena.getAlignment().toString();
			charGender = mileena.getGender().toString();
			charOrigin = mileena.getOrigin().toString();
			charFightingStyles = mileena.getFightingStyles().toString();
			charGender = mileena.getGender().toString();
			charNameLabel.setText(" Real Name: " +  charNameTwo);
			gameTitle.setForeground(Color.GREEN.darker());
			charHeightLabel.setText(" Height: " +  charHeight);
			charSpeedLabel.setText(" Speed: " +  charSpeed);
			charStrengthLabel.setText(" Strength: " +  charStrength);
			charAlignmentLabel.setText(" Alignment: " +  charAlignment);
			charGenderLabel.setText(" Gender: " +  charGender);
			charOriginLabel.setText(" Origin: " +  charOrigin);
			charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
			spaceLabel.setText("---------------------------------------------------------------------------");
			space1Label.setText("---------------------------------------------------------------------------");
			gamePanelC.add(commitCrimeButton);
			gamePanelC.add(ignoreButton);
			gamePanelC.add(sleepButton);
			villainImageLabel2.setVisible(true);
			gamePanelB.add(shopButton);
			commitCrimeButton.setBackground(Color.PINK.darker().darker());
			ignoreButton.setBackground(Color.PINK.darker().darker());
			sleepButton.setBackground(Color.PINK.darker().darker());
			shopButton.setBackground(Color.PINK.darker().darker());
			saveButton.setBackground(Color.PINK.darker().darker());
			ColorUIResource colorResource = new ColorUIResource(Color.pink.darker());
			UIManager.put("nimbusOrange",colorResource);
		}
		if(villainButton3.isEnabled() == true){
			charNameTwo = shangtsung.getName().toString();
			charStatus = shangtsung.getType().toString();
			charHeight = shangtsung.getHeight().toString();
			charSpeed = shangtsung.getSpeed().toString();
			charStrength = shangtsung.getStrength().toString();
			charAlignment = shangtsung.getAlignment().toString();
			charGender = shangtsung.getGender().toString();
			charOrigin = shangtsung.getOrigin().toString();
			charFightingStyles = shangtsung.getFightingStyles().toString();
			charGender = shangtsung.getGender().toString();
			charNameLabel.setText(" Real Name: " +  charNameTwo);
			gameTitle.setForeground(Color.GREEN.darker());
			charHeightLabel.setText(" Height: " +  charHeight);
			charSpeedLabel.setText(" Speed: " +  charSpeed);
			charStrengthLabel.setText(" Strength: " +  charStrength);
			charAlignmentLabel.setText(" Alignment: " +  charAlignment);
			charGenderLabel.setText(" Gender: " +  charGender);
			charOriginLabel.setText(" Origin: " +  charOrigin);
			charFightingStylesLabel.setText(" Fighting Styles: " +  charFightingStyles);
			spaceLabel.setText("---------------------------------------------------------------------------");
			space1Label.setText("---------------------------------------------------------------------------");
			gamePanelC.add(commitCrimeButton);
			gamePanelC.add(ignoreButton);
			gamePanelC.add(sleepButton);
			villainImageLabel3.setVisible(true);
			gamePanelB.add(shopButton);
			commitCrimeButton.setBackground(Color.ORANGE.darker());
			ignoreButton.setBackground(Color.ORANGE.darker());
			sleepButton.setBackground(Color.ORANGE.darker());
			shopButton.setBackground(Color.ORANGE.darker());
			saveButton.setBackground(Color.ORANGE.darker());
			ColorUIResource colorResource = new ColorUIResource(Color.orange);
			UIManager.put("nimbusOrange",colorResource);
		}
		gameTitle.setText(charStatus + " : " + charName);
	}
});

// Creating Exit Button :
exitButton.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		int selectedOption = JOptionPane.showConfirmDialog(null, 
                "Do you wish to exit?", 
                "Exit Game", 
                JOptionPane.YES_NO_OPTION); 
		 if (selectedOption == JOptionPane.YES_OPTION) {
			    System.exit(0);
			}
	}
});

// Creating Shop Button :
shopButton.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		createShopWindow(shopWindow);
		
	}
});

// Creating Game Logo Button :
gameLogoButton.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		sleepButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				charStatus = sleep.getType().toString();
				gameTitle.setText(charStatus + " : " + charName);
				
				try {

				    AudioInputStream stream;
				    AudioFormat format;
				    DataLine.Info info;
				    Clip clip;

				    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/sleep.wav"));
				    format = stream.getFormat();
				    info = new DataLine.Info(Clip.class, format);
				    clip = (Clip) AudioSystem.getLine(info);
				    clip.open(stream);
				    clip.start();
				} catch (UnsupportedAudioFileException f) 
				{  f.printStackTrace(); 
				} catch (IOException f) 
				{  f.printStackTrace(); 
				} catch (LineUnavailableException f) 
				{  f.printStackTrace(); } 
				
				TimerTask timerTask4 = new TimerTask(){
			    	@Override
					public void run(){
			    	if(energyBar.getValue() < 100){
			            energyBar.setValue(energyBar.getValue()+1);
			    		energyBar.setValue(energyBar.getValue());
			    		energyBar.setString(energyBar.getValue() + "%");
			    	}
			    	if(energyBar.getValue() < 20){
			    	fightButton.setEnabled(false);
			    	commitCrimeButton.setEnabled(false);
			    	ignoreButton.setEnabled(true);
			    	sleepButton.setEnabled(false);
			    	}
			    	if(medTimer != null){
			    		medTimer.cancel();
			    		medTimer = null;
			    	}
			    	if(medTimer2 != null){
			    		medTimer2.cancel();
			    		medTimer2 = null;
			    	}
			    	if(hardTimer != null){
			    		hardTimer.cancel();
			    		hardTimer = null;
			    	}
			    	if(hardTimer2 != null){
			    		hardTimer2.cancel();
			    		hardTimer2 = null;
			    	}
			    	}
		    	};
		    	sleepTimer = new Timer();
			    sleepTimer.scheduleAtFixedRate(timerTask4, 100, 1000);
		    	}
		});
		    	
					if(heroButton1.isEnabled() == true){
						fightButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						shopButton.setEnabled(true);
						saveButton.setEnabled(true);
					}
					if(heroButton2.isEnabled() == true){
						fightButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						shopButton.setEnabled(true);
						saveButton.setEnabled(true);
					}
					if(heroButton3.isEnabled() == true){
						fightButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						shopButton.setEnabled(true);
						saveButton.setEnabled(true);
					}
					if(villainButton1.isEnabled() == true){
						commitCrimeButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						shopButton.setEnabled(true);
						saveButton.setEnabled(true);
					}
					if(villainButton2.isEnabled() == true){
						commitCrimeButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						shopButton.setEnabled(true);
						saveButton.setEnabled(true);
					}
					if(villainButton3.isEnabled() == true){
						commitCrimeButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						shopButton.setEnabled(true);
						saveButton.setEnabled(true);

					}
		    	}
				});

// Creating Fight Button :
			fightButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				energyBar.setValue(energyBar.getValue()-10);
			    actionBar.setValue(actionBar.getValue()+10);
				if(actionBar.getValue() == 100){
					shopCurrency = shopCurrency + 1;
					shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
					actionBar.setValue(0);
					try {

					    AudioInputStream stream;
					    AudioFormat format;
					    DataLine.Info info;
					    Clip clip;

					    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/flawlessvictory.wav"));
					    format = stream.getFormat();
					    info = new DataLine.Info(Clip.class, format);
					    clip = (Clip) AudioSystem.getLine(info);
					    clip.open(stream);
					    clip.start();
					} catch (UnsupportedAudioFileException f) 
					{  f.printStackTrace(); 
					} catch (IOException f) 
					{  f.printStackTrace(); 
					} catch (LineUnavailableException f) 
					{  f.printStackTrace(); } 
				}	
			    try {

				    AudioInputStream stream;
				    AudioFormat format;
				    DataLine.Info info;
				    Clip clip;

				    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/hit.wav"));
				    format = stream.getFormat();
				    info = new DataLine.Info(Clip.class, format);
				    clip = (Clip) AudioSystem.getLine(info);
				    clip.open(stream);
				    clip.start();
				} catch (UnsupportedAudioFileException f) 
				{  f.printStackTrace(); 
				} catch (IOException f) 
				{  f.printStackTrace(); 
				} catch (LineUnavailableException f) 
				{  f.printStackTrace(); } 
			    TimerTask timerTask2 = new TimerTask(){
			    @Override
				public void run(){
					if(heroButton1.isEnabled() == true){
						fightButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
					if(heroButton2.isEnabled() == true){
						fightButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
					if(heroButton3.isEnabled() == true){
						fightButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
					if(villainButton1.isEnabled() == true){
						commitCrimeButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
					if(villainButton2.isEnabled() == true){
						commitCrimeButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
					if(villainButton3.isEnabled() == true){
						commitCrimeButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
			    }
		    	};
		    		if(heroButton1.isEnabled() == true){
		    			if(sleepTimer != null){
		    				charStatus = scorpion.getType().toString();
		    				gameTitle.setText(charStatus + " : " + charName);
		    				sleepTimer.cancel();
		    			}
		    		}
		    		if(heroButton2.isEnabled() == true){
			    	if(sleepTimer != null){
			    		charStatus = raiden.getType().toString();
			    		gameTitle.setText(charStatus + " : " + charName);
			    		sleepTimer.cancel();
			    		}
			    	}	
			    	if(heroButton3.isEnabled() == true){
				    if(sleepTimer != null){
				    	charStatus = liukang.getType().toString();
				    	gameTitle.setText(charStatus + " : " + charName);
				    	sleepTimer.cancel();
				    	}	
		    		}
			    	
			    	if(villainButton1.isEnabled() == true){
					    if(sleepTimer != null){
					    	charStatus = subzero.getType().toString();
					    	gameTitle.setText(charStatus + " : " + charName);
					    	sleepTimer.cancel();
					    	}	
			    		}
			    	if(villainButton2.isEnabled() == true){
					    if(sleepTimer != null){
					    	charStatus = mileena.getType().toString();
					    	gameTitle.setText(charStatus + " : " + charName);
					    	sleepTimer.cancel();
					    	}	
			    		}
			    	if(villainButton3.isEnabled() == true){
					    if(sleepTimer != null){
					    	charStatus = shangtsung.getType().toString();
					    	gameTitle.setText(charStatus + " : " + charName);
					    	sleepTimer.cancel();
					    	}	
			    		}
			    	if(superHeroImageLabel.isVisible()){
			    		if(sleepTimer != null){
					    	charStatus = kenshi.getType().toString();
					    	gameTitle.setText(charStatus + " : " + charName);
					    	sleepTimer.cancel();
					    	}	
			    	}

		    		if(fightCrimeTimer != null){
		    			fightCrimeTimer.cancel();
		    			fightCrimeTimer = new Timer();
					    fightCrimeTimer.scheduleAtFixedRate(timerTask2, 100, 10000);
		    		} 
		    		if(ignoreTimer != null){
		    			ignoreTimer.cancel();
		    		}
		    		if(fightCrimeTimer == null){
			   			fightCrimeTimer = new Timer();
					    fightCrimeTimer.scheduleAtFixedRate(timerTask2, 100, 10000);
			    		}
		    		if(medTimer == null && heroButton2.isEnabled()){
		    			// Creating The Medium Difficulty Timer
		    	    	medTimer = new Timer();
		    	    	medTimer.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 1000);
		    		}
		    		
		    		
		    		
		    		if(medTimer2 == null && heroButton3.isEnabled()){
		    			// Creating The Medium2 Difficulty Timer
		    	    	medTimer2 = new Timer();
		    	    	medTimer2.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 100);
		    		}
		    		
		    		if(hardTimer == null && villainButton2.isEnabled()){
		    			// Creating The HardTimer Difficulty Timer
		    	    	hardTimer = new Timer();
		    	    	hardTimer.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 1000);
		    		}
		    		
		    		if(hardTimer2 == null && villainButton3.isEnabled()){
		    			// Creating The HardTimer2 Difficulty Timer
		    	    	hardTimer2 = new Timer();
		    	    	hardTimer2.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 100);
		    		}
		    	}
			});		
			
// Creating Commit Crime Button :
		commitCrimeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				energyBar.setValue(energyBar.getValue()-10);
		        actionBar.setValue(actionBar.getValue()-10);
		        if(actionBar.getValue() == 0){
		        	shopCurrency = shopCurrency + 1;
					shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
					actionBar.setValue(100);
					try {

					    AudioInputStream stream;
					    AudioFormat format;
					    DataLine.Info info;
					    Clip clip;

					    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/flawlessvictory.wav"));
					    format = stream.getFormat();
					    info = new DataLine.Info(Clip.class, format);
					    clip = (Clip) AudioSystem.getLine(info);
					    clip.open(stream);
					    clip.start();
					} catch (UnsupportedAudioFileException f) 
					{  f.printStackTrace(); 
					} catch (IOException f) 
					{  f.printStackTrace(); 
					} catch (LineUnavailableException f) 
					{  f.printStackTrace(); } 
				}
		        try {
				   
				    AudioInputStream stream;
				    AudioFormat format;
				    DataLine.Info info;
				    Clip clip;

				    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/hit.wav"));
				    format = stream.getFormat();
				    info = new DataLine.Info(Clip.class, format);
				    clip = (Clip) AudioSystem.getLine(info);
				    clip.open(stream);
				    clip.start();
				} catch (UnsupportedAudioFileException f) 
				{  f.printStackTrace(); 
				} catch (IOException f) 
				{  f.printStackTrace(); 
				} catch (LineUnavailableException f) 
				{  f.printStackTrace(); } 
		        TimerTask timerTask3 = new TimerTask(){
				@Override
				public void run(){
					if(heroButton1.isEnabled() == true){
						fightButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
					if(heroButton2.isEnabled() == true){
						fightButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
					if(heroButton3.isEnabled() == true){
						fightButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
					if(villainButton1.isEnabled() == true){
						commitCrimeButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
					if(villainButton2.isEnabled() == true){
						commitCrimeButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
					if(villainButton3.isEnabled() == true){
						commitCrimeButton.setEnabled(true);
						ignoreButton.setEnabled(true);
						sleepButton.setEnabled(true);
						crimeText.setText(crime.getCrime().toString());
					}
				}
		    	};
		    	if(heroButton1.isEnabled() == true){
	    			if(sleepTimer != null){
	    				charStatus = scorpion.getType().toString();
	    				gameTitle.setText(charStatus + " : " + charName);
	    				sleepTimer.cancel();
	    			}
	    		}
	    		if(heroButton2.isEnabled() == true){
		    	if(sleepTimer != null){
		    		charStatus = raiden.getType().toString();
		    		gameTitle.setText(charStatus + " : " + charName);
		    		sleepTimer.cancel();
		    		}
		    	}	
		    	if(heroButton3.isEnabled() == true){
			    if(sleepTimer != null){
			    	charStatus = liukang.getType().toString();
			    	gameTitle.setText(charStatus + " : " + charName);
			    	sleepTimer.cancel();
			    	}	
	    		}
		    	if(villainButton1.isEnabled() == true){
				    if(sleepTimer != null){
				    	charStatus = subzero.getType().toString();
				    	gameTitle.setText(charStatus + " : " + charName);
				    	sleepTimer.cancel();
				    	}	
		    		}
		    	if(villainButton2.isEnabled() == true){
				    if(sleepTimer != null){
				    	charStatus = mileena.getType().toString();
				    	gameTitle.setText(charStatus + " : " + charName);
				    	sleepTimer.cancel();
				    	}	
		    		}
		    	if(villainButton3.isEnabled() == true){
				    if(sleepTimer != null){
				    	charStatus = shangtsung.getType().toString();
				    	gameTitle.setText(charStatus + " : " + charName);
				    	sleepTimer.cancel();
				    	}	
		    		}
		    	if(superVillainImageLabel.isVisible()){
		    		if(sleepTimer != null){
				    	charStatus = noobsaibot.getType().toString();
				    	gameTitle.setText(charStatus + " : " + charName);
				    	sleepTimer.cancel();
				    	}	
		    	}
		    	
		    		if(commitCrimeTimer != null){
		    			commitCrimeTimer.cancel();
		    			commitCrimeTimer = new Timer();
					    commitCrimeTimer.scheduleAtFixedRate(timerTask3, 100, 10000);
		    		} 
		    		if(ignoreTimer != null){
		    			ignoreTimer.cancel();
		    		} 
		    		if(commitCrimeTimer == null){
		   			commitCrimeTimer = new Timer();
				    commitCrimeTimer.scheduleAtFixedRate(timerTask3, 100, 10000);
		    		}
		    		if(medTimer == null && heroButton2.isEnabled()){
		    			// Creating The Medium Difficulty Timer
		    	    	medTimer = new Timer();
		    	    	medTimer.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 1000);
		    		}
		    		
		    		
		    		
		    		if(medTimer2 == null && heroButton3.isEnabled()){
		    			// Creating The Medium2 Difficulty Timer
		    	    	medTimer2 = new Timer();
		    	    	medTimer2.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 100);
		    		}
		    		
		    		if(hardTimer == null && villainButton2.isEnabled()){
		    			// Creating The HardTimer Difficulty Timer
		    	    	hardTimer = new Timer();
		    	    	hardTimer.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 1000);
		    		}
		    		
		    		if(hardTimer2 == null && villainButton3.isEnabled()){
		    			// Creating The HardTimer2 Difficulty Timer
		    	    	hardTimer2 = new Timer();
		    	    	hardTimer2.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 100);
		    		}
		    	}
});
		
// Creating Ignore Button :
		ignoreButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				actionBar.setValue(actionBar.getValue()-10);
				
				try {

				    AudioInputStream stream;
				    AudioFormat format;
				    DataLine.Info info;
				    Clip clip;

				    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/ignore.wav"));
				    format = stream.getFormat();
				    info = new DataLine.Info(Clip.class, format);
				    clip = (Clip) AudioSystem.getLine(info);
				    clip.open(stream);
				    clip.start();
				} catch (UnsupportedAudioFileException f) 
				{  f.printStackTrace(); 
				} catch (IOException f) 
				{  f.printStackTrace(); 
				} catch (LineUnavailableException f) 
				{  f.printStackTrace(); } 
				
				TimerTask timerTask5 = new TimerTask(){
			    	@Override
					public void run(){
						if(heroButton1.isEnabled() == true){
							fightButton.setEnabled(true);
							ignoreButton.setEnabled(true);
							sleepButton.setEnabled(true);
							crimeText.setText(crime.getCrime().toString());
						}
						if(heroButton2.isEnabled() == true){
							fightButton.setEnabled(true);
							ignoreButton.setEnabled(true);
							sleepButton.setEnabled(true);
							crimeText.setText(crime.getCrime().toString());
						}
						if(heroButton3.isEnabled() == true){
							fightButton.setEnabled(true);
							ignoreButton.setEnabled(true);
							sleepButton.setEnabled(true);
							crimeText.setText(crime.getCrime().toString());
						}
						if(villainButton1.isEnabled() == true){
							commitCrimeButton.setEnabled(true);
							ignoreButton.setEnabled(true);
							sleepButton.setEnabled(true);
							crimeText.setText(crime.getCrime().toString());
						}
						if(villainButton2.isEnabled() == true){
							commitCrimeButton.setEnabled(true);
							ignoreButton.setEnabled(true);
							sleepButton.setEnabled(true);
							crimeText.setText(crime.getCrime().toString());
						}
						if(villainButton3.isEnabled() == true){
							commitCrimeButton.setEnabled(true);
							ignoreButton.setEnabled(true);
							sleepButton.setEnabled(true);
							crimeText.setText(crime.getCrime().toString());
						}
			    	}
			    	};
			    	if(heroButton1.isEnabled() == true){
		    			if(sleepTimer != null){
		    				charStatus = scorpion.getType().toString();
		    				gameTitle.setText(charStatus + " : " + charName);
		    				sleepTimer.cancel();
		    			}
		    		}
		    		if(heroButton2.isEnabled() == true){
			    	if(sleepTimer != null){
			    		charStatus = raiden.getType().toString();
			    		gameTitle.setText(charStatus + " : " + charName);
			    		sleepTimer.cancel();
			    		}
			    	}	
			    	if(heroButton3.isEnabled() == true){
				    if(sleepTimer != null){
				    	charStatus = liukang.getType().toString();
				    	gameTitle.setText(charStatus + " : " + charName);
				    	sleepTimer.cancel();
				    	}	
		    		}
			    	if(villainButton1.isEnabled() == true){
					    if(sleepTimer != null){
					    	charStatus = subzero.getType().toString();
					    	gameTitle.setText(charStatus + " : " + charName);
					    	sleepTimer.cancel();
					    	}	
			    		}
			    	if(villainButton2.isEnabled() == true){
					    if(sleepTimer != null){
					    	charStatus = mileena.getType().toString();
					    	gameTitle.setText(charStatus + " : " + charName);
					    	sleepTimer.cancel();
					    	}	
			    		}
			    	if(villainButton3.isEnabled() == true){
					    if(sleepTimer != null){
					    	charStatus = shangtsung.getType().toString();
					    	gameTitle.setText(charStatus + " : " + charName);
					    	sleepTimer.cancel();
					    	}	
			    		}
			    	if(superHeroImageLabel.isVisible()){
			    		if(sleepTimer != null){
					    	charStatus = kenshi.getType().toString();
					    	gameTitle.setText(charStatus + " : " + charName);
					    	sleepTimer.cancel();
					    	}	
			    	}
			    	if(superVillainImageLabel.isVisible()){
			    		if(sleepTimer != null){
					    	charStatus = noobsaibot.getType().toString();
					    	gameTitle.setText(charStatus + " : " + charName);
					    	sleepTimer.cancel();
					    	}	
			    	}

			    	if(ignoreTimer != null){
		    			ignoreTimer.cancel();
		    			ignoreTimer = new Timer();
					    ignoreTimer.scheduleAtFixedRate(timerTask5, 100, 10000);
		    		} 
			    	if(fightCrimeTimer != null){
			    		fightCrimeTimer.cancel();
			    	}
			    	if(commitCrimeTimer != null){
			    		commitCrimeTimer.cancel();
			    	} 
			    	if(ignoreTimer == null){
		   			ignoreTimer = new Timer();
				    ignoreTimer.scheduleAtFixedRate(timerTask5, 100, 10000);
		    		}
			    	if(medTimer == null && heroButton2.isEnabled()){
		    			// Creating The Medium Difficulty Timer
		    	    	medTimer = new Timer();
		    	    	medTimer.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 1000);
		    		}
		    		
		    		
		    		
		    		if(medTimer2 == null && heroButton3.isEnabled()){
		    			// Creating The Medium2 Difficulty Timer
		    	    	medTimer2 = new Timer();
		    	    	medTimer2.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 100);
		    		}
		    		
		    		if(hardTimer == null && villainButton2.isEnabled()){
		    			// Creating The HardTimer Difficulty Timer
		    	    	hardTimer = new Timer();
		    	    	hardTimer.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 1000);
		    		}
		    		
		    		if(hardTimer2 == null && villainButton3.isEnabled()){
		    			// Creating The HardTimer2 Difficulty Timer
		    	    	hardTimer2 = new Timer();
		    	    	hardTimer2.scheduleAtFixedRate(new TimerTask(){
		    	    		public void run(){
		    	    			energyBar.setValue(energyBar.getValue()-1);
		    		    		energyBar.setValue(energyBar.getValue());
		    		    		energyBar.setString(energyBar.getValue() + "%");
		    	    		}}, 100, 100);
		    		}
			    	}
			});

		// Creating Save Button :
				saveButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) 
					{
						try {

						    AudioInputStream stream;
						    AudioFormat format;
						    DataLine.Info info;
						    Clip clip;

						    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/save.wav"));
						    format = stream.getFormat();
						    info = new DataLine.Info(Clip.class, format);
						    clip = (Clip) AudioSystem.getLine(info);
						    clip.open(stream);
						    clip.start();
						} catch (UnsupportedAudioFileException f) 
						{  f.printStackTrace(); 
						} catch (IOException f) 
						{  f.printStackTrace(); 
						} catch (LineUnavailableException f) 
						{  f.printStackTrace(); } 
						
						// Creating The Saved Objects To Save :
						
						int energyBarValue = energyBar.getValue();
						int actionBarValue = actionBar.getValue();
						String charNameValue = nameInput.getText().toString();
						
						
						// Hero 1
						ImageIcon heroImageValue1 = scorpion.getImage();
						String heroHeightValue1 = scorpion.getHeight();
						String heroSpeedValue1 = scorpion.getSpeed();
						String heroStrengthValue1 = scorpion.getStrength();
						String heroAlignmentValue1 = scorpion.getAlignment();
						String heroGenderValue1 = scorpion.getGender();
						String heroOriginValue1 = scorpion.getOrigin();
						String heroFightingStylesValue1 = scorpion.getFightingStyles();
						String heroCharStatus1 = scorpion.getType().toString();
						String heroCharName1 = scorpion.getName().toString();
						// Hero 2
						ImageIcon heroImageValue2 = raiden.getImage();
						String heroHeightValue2 = raiden.getHeight();
						String heroSpeedValue2 = raiden.getSpeed();
						String heroStrengthValue2 = raiden.getStrength();
						String heroAlignmentValue2 = raiden.getAlignment();
						String heroGenderValue2 = raiden.getGender();
						String heroOriginValue2 = raiden.getOrigin();
						String heroFightingStylesValue2 = raiden.getFightingStyles();
						String heroCharStatus2 = raiden.getType().toString();
						String heroCharName2 = raiden.getName().toString();
						// Hero 3
						ImageIcon heroImageValue3 = liukang.getImage();
						String heroHeightValue3 = liukang.getHeight();
						String heroSpeedValue3 = liukang.getSpeed();
						String heroStrengthValue3 = liukang.getStrength();
						String heroAlignmentValue3 = liukang.getAlignment();
						String heroGenderValue3 = liukang.getGender();
						String heroOriginValue3 = liukang.getOrigin();
						String heroFightingStylesValue3 = liukang.getFightingStyles();
						String heroCharStatus3 = liukang.getType().toString();
						String heroCharName3 = liukang.getName().toString();
						// Superhero
						ImageIcon superHeroImageValue = kenshi.getImage();
						String superHeroHeightValue = kenshi.getHeight();
						String superHeroSpeedValue = kenshi.getSpeed();
						String superHeroStrengthValue = kenshi.getStrength();
						String superHeroAlignmentValue = kenshi.getAlignment();
						String superHeroGenderValue = kenshi.getGender();
						String superHeroOriginValue = kenshi.getOrigin();
						String superHeroFightingStylesValue = kenshi.getFightingStyles();
						String superHeroCharStatus = kenshi.getType().toString();
						String superHeroCharName = kenshi.getName().toString();
						// Villain 1
						ImageIcon villainImageValue1 = subzero.getImage();
						String villainHeightValue1 = subzero.getHeight();
						String villainSpeedValue1 = subzero.getSpeed();
						String villainStrengthValue1 = subzero.getStrength();
						String villainAlignmentValue1 = subzero.getAlignment();
						String villainGenderValue1 = subzero.getGender();
						String villainOriginValue1 = subzero.getOrigin();
						String villainFightingStylesValue1 = subzero.getFightingStyles();
						String villainCharStatus1 = subzero.getType().toString();
						String villainCharName1 = subzero.getName().toString();
						// Villain 2
						ImageIcon villainImageValue2 = mileena.getImage();
						String villainHeightValue2 = mileena.getHeight();
						String villainSpeedValue2 = mileena.getSpeed();
						String villainStrengthValue2 = mileena.getStrength();
						String villainAlignmentValue2 = mileena.getAlignment();
						String villainGenderValue2 = mileena.getGender();
						String villainOriginValue2 = mileena.getOrigin();
						String villainFightingStylesValue2 = mileena.getFightingStyles();
						String villainCharStatus2 = mileena.getType().toString();
						String villainCharName2 = mileena.getName().toString();
						// Villain 3
						ImageIcon villainImageValue3 = shangtsung.getImage();
						String villainHeightValue3 = shangtsung.getHeight();
						String villainSpeedValue3 = shangtsung.getSpeed();
						String villainStrengthValue3 = shangtsung.getStrength();
						String villainAlignmentValue3 = shangtsung.getAlignment();
						String villainGenderValue3 = shangtsung.getGender();
						String villainOriginValue3 = shangtsung.getOrigin();
						String villainFightingStylesValue3 = shangtsung.getFightingStyles();
						String villainCharStatus3 = shangtsung.getType().toString();
						String villainCharName3 = shangtsung.getName().toString();
						// Supervillain
						ImageIcon superVillainImageValue = noobsaibot.getImage();
						String superVillainHeightValue = noobsaibot.getHeight();
						String superVillainSpeedValue = noobsaibot.getSpeed();
						String superVillainStrengthValue = noobsaibot.getStrength();
						String superVillainAlignmentValue = noobsaibot.getAlignment();
						String superVillainGenderValue = noobsaibot.getGender();
						String superVillainOriginValue = noobsaibot.getOrigin();
						String superVillainFightingStylesValue = noobsaibot.getFightingStyles();
						String superVillainCharStatus = noobsaibot.getType().toString();
						String superVillainCharName = noobsaibot.getName().toString();
			
						ArrayList<Serializable> savedObjects = new ArrayList<Serializable>();
						
						// Adding Objects To An ArrayList Of Saved Objects
						savedObjects.add(energyBarValue);
						savedObjects.add(actionBarValue);
						
						if(heroButton1.isEnabled()){
							savedObjects.add(heroImageValue1);
							savedObjects.add(charNameValue);
							savedObjects.add(heroCharStatus1);
							savedObjects.add(heroHeightValue1);
							savedObjects.add(heroSpeedValue1);
							savedObjects.add(heroStrengthValue1);
							savedObjects.add(heroAlignmentValue1);
							savedObjects.add(heroGenderValue1);
							savedObjects.add(heroOriginValue1);
							savedObjects.add(heroFightingStylesValue1);
							savedObjects.add(heroCharName1);
						}
						if(heroButton2.isEnabled()){
							savedObjects.add(heroImageValue2);
							savedObjects.add(charNameValue);
							savedObjects.add(heroCharStatus2);
							savedObjects.add(heroHeightValue2);
							savedObjects.add(heroSpeedValue2);
							savedObjects.add(heroStrengthValue2);
							savedObjects.add(heroAlignmentValue2);
							savedObjects.add(heroGenderValue2);
							savedObjects.add(heroOriginValue2);
							savedObjects.add(heroFightingStylesValue2);
							savedObjects.add(heroCharName2);
						}
						if(heroButton3.isEnabled()){
							savedObjects.add(heroImageValue3);
							savedObjects.add(charNameValue);
							savedObjects.add(heroCharStatus3);
							savedObjects.add(heroHeightValue3);
							savedObjects.add(heroSpeedValue3);
							savedObjects.add(heroStrengthValue3);
							savedObjects.add(heroAlignmentValue3);
							savedObjects.add(heroGenderValue3);
							savedObjects.add(heroOriginValue3);
							savedObjects.add(heroFightingStylesValue3);
							savedObjects.add(heroCharName3);
						}
						if(actionBar.getValue()>=90){
		    				if(actionBar.getValue()<=100){
							savedObjects.add(superHeroImageValue);
							savedObjects.add(charNameValue);
							savedObjects.add(superHeroCharStatus);
							savedObjects.add(superHeroHeightValue);
							savedObjects.add(superHeroSpeedValue);
							savedObjects.add(superHeroStrengthValue);
							savedObjects.add(superHeroAlignmentValue);
							savedObjects.add(superHeroGenderValue);
							savedObjects.add(superHeroOriginValue);
							savedObjects.add(superHeroFightingStylesValue);
							savedObjects.add(superHeroCharName);
		    				}
					}
						
						if(villainButton1.isEnabled()){
							savedObjects.add(villainImageValue1);
							savedObjects.add(charNameValue);
							savedObjects.add(villainCharStatus1);
							savedObjects.add(villainHeightValue1);
							savedObjects.add(villainSpeedValue1);
							savedObjects.add(villainStrengthValue1);
							savedObjects.add(villainAlignmentValue1);
							savedObjects.add(villainGenderValue1);
							savedObjects.add(villainOriginValue1);
							savedObjects.add(villainFightingStylesValue1);
							savedObjects.add(villainCharName1);
						}
						if(villainButton2.isEnabled()){
							savedObjects.add(villainImageValue2);
							savedObjects.add(charNameValue);
							savedObjects.add(villainCharStatus2);
							savedObjects.add(villainHeightValue2);
							savedObjects.add(villainSpeedValue2);
							savedObjects.add(villainStrengthValue2);
							savedObjects.add(villainAlignmentValue2);
							savedObjects.add(villainGenderValue2);
							savedObjects.add(villainOriginValue2);
							savedObjects.add(villainFightingStylesValue2);
							savedObjects.add(villainCharName2);
						}
						if(villainButton3.isEnabled()){
							savedObjects.add(villainImageValue3);
							savedObjects.add(charNameValue);
							savedObjects.add(villainCharStatus3);
							savedObjects.add(villainHeightValue3);
							savedObjects.add(villainSpeedValue3);
							savedObjects.add(villainStrengthValue3);
							savedObjects.add(villainAlignmentValue3);
							savedObjects.add(villainGenderValue3);
							savedObjects.add(villainOriginValue3);
							savedObjects.add(villainFightingStylesValue3);
							savedObjects.add(villainCharName3);
						}
						if(actionBar.getValue()>=25){
		    				if(actionBar.getValue()<=35){
						savedObjects.add(superVillainImageValue);
						savedObjects.add(charNameValue);
						savedObjects.add(superVillainCharStatus);
						savedObjects.add(superVillainHeightValue);
						savedObjects.add(superVillainSpeedValue);
						savedObjects.add(superVillainStrengthValue);
						savedObjects.add(superVillainAlignmentValue);
						savedObjects.add(superVillainGenderValue);
						savedObjects.add(superVillainOriginValue);
						savedObjects.add(superVillainFightingStylesValue);
						savedObjects.add(superVillainCharName);
		    				}
				}

						try{  // Catching Errors In I/O If Necessary.
							// Open A File To Write To, Named savefile.sav.
							FileOutputStream savefile=new FileOutputStream("savefile.sav");

							// Create An ObjectOutputStream To Put Objects Into A Save File.
							ObjectOutputStream save = new ObjectOutputStream(savefile);
							
							// Now We Do The Save.
							save.writeObject(energyBarValue);
							save.writeObject(actionBarValue);
							
							if(heroButton1.isEnabled()){
								save.writeObject(heroImageValue1);
								save.writeObject(charNameValue);
								save.writeObject(heroCharStatus1);
								save.writeObject(heroHeightValue1);
								save.writeObject(heroSpeedValue1);
								save.writeObject(heroStrengthValue1);
								save.writeObject(heroAlignmentValue1);
								save.writeObject(heroGenderValue1);
								save.writeObject(heroOriginValue1);
								save.writeObject(heroFightingStylesValue1);
								save.writeObject(heroCharName1);
							}
							if(heroButton2.isEnabled()){
								save.writeObject(heroImageValue2);
								save.writeObject(charNameValue);
								save.writeObject(heroCharStatus2);
								save.writeObject(heroHeightValue2);
								save.writeObject(heroSpeedValue2);
								save.writeObject(heroStrengthValue2);
								save.writeObject(heroAlignmentValue2);
								save.writeObject(heroGenderValue2);
								save.writeObject(heroOriginValue2);
								save.writeObject(heroFightingStylesValue2);
								save.writeObject(heroCharName2);
							}
							if(heroButton3.isEnabled()){
								save.writeObject(heroImageValue3);
								save.writeObject(charNameValue);
								save.writeObject(heroCharStatus3);
								save.writeObject(heroHeightValue3);
								save.writeObject(heroSpeedValue3);
								save.writeObject(heroStrengthValue3);
								save.writeObject(heroAlignmentValue3);
								save.writeObject(heroGenderValue3);
								save.writeObject(heroOriginValue3);
								save.writeObject(heroFightingStylesValue3);
								save.writeObject(heroCharName3);
							}
							if(actionBar.getValue()>=90){
			    				if(actionBar.getValue()<=100){
			    				save.writeObject(superHeroImageValue);
			    				save.writeObject(charNameValue);
			    				save.writeObject(superHeroCharStatus);
			    				save.writeObject(superHeroHeightValue);
			    				save.writeObject(superHeroSpeedValue);
			    				save.writeObject(superHeroStrengthValue);
			    				save.writeObject(superHeroAlignmentValue);
			    				save.writeObject(superHeroGenderValue);
			    				save.writeObject(superHeroOriginValue);
			    				save.writeObject(superHeroFightingStylesValue);
			    				save.writeObject(superHeroCharName);
			    				}
						}
							
							if(villainButton1.isEnabled()){
								save.writeObject(villainImageValue1);
								save.writeObject(charNameValue);
								save.writeObject(villainCharStatus1);
								save.writeObject(villainHeightValue1);
								save.writeObject(villainSpeedValue1);
								save.writeObject(villainStrengthValue1);
								save.writeObject(villainAlignmentValue1);
								save.writeObject(villainGenderValue1);
								save.writeObject(villainOriginValue1);
								save.writeObject(villainFightingStylesValue1);
								save.writeObject(villainCharName1);
							}
							if(villainButton2.isEnabled()){
								save.writeObject(villainImageValue2);
								save.writeObject(charNameValue);
								save.writeObject(villainCharStatus2);
								save.writeObject(villainHeightValue2);
								save.writeObject(villainSpeedValue2);
								save.writeObject(villainStrengthValue2);
								save.writeObject(villainAlignmentValue2);
								save.writeObject(villainGenderValue2);
								save.writeObject(villainOriginValue2);
								save.writeObject(villainFightingStylesValue2);
								save.writeObject(villainCharName2);
							}
							if(villainButton3.isEnabled()){
								save.writeObject(villainImageValue3);
								save.writeObject(charNameValue);
								save.writeObject(villainCharStatus3);
								save.writeObject(villainHeightValue3);
								save.writeObject(villainSpeedValue3);
								save.writeObject(villainStrengthValue3);
								save.writeObject(villainAlignmentValue3);
								save.writeObject(villainGenderValue3);
								save.writeObject(villainOriginValue3);
								save.writeObject(villainFightingStylesValue3);
								save.writeObject(villainCharName3);
							}
							if(actionBar.getValue()>=25){
			    				if(actionBar.getValue()<=35){
			    			save.writeObject(superVillainImageValue);
			    			save.writeObject(charNameValue);
			    			save.writeObject(superVillainCharStatus);
			    			save.writeObject(superVillainHeightValue);
			    			save.writeObject(superVillainSpeedValue);
			    			save.writeObject(superVillainStrengthValue);
			    			save.writeObject(superVillainAlignmentValue);
			    			save.writeObject(superVillainGenderValue);
			    			save.writeObject(superVillainOriginValue);
			    			save.writeObject(superVillainFightingStylesValue);
			    			save.writeObject(superVillainCharName);
			    				}
					}
							// Close The File.
							save.close(); // This Also Closes SaveFile.
							}
							catch(Exception exc){
							exc.printStackTrace(); // If There Was An Error, Print The Info.
							}
					}
				});

// Creating Kunai Button :
		kunaiButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				actionBar.setValue(actionBar.getValue()+ kunai.getGadgetsAction());
				actionBar.setValue(actionBar.getValue());
				actionBar.setString(actionBar.getValue() + "%");
				shopCurrency = shopCurrency - 1;
				shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
			}
		});
// Creating Long Sword Button :
		longswordButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				actionBar.setValue(actionBar.getValue()+ longsword.getGadgetsAction());
				actionBar.setValue(actionBar.getValue());
				actionBar.setString(actionBar.getValue() + "%");
				shopCurrency = shopCurrency - 1;
				shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
			}
		});
// Creating Nunchaku Button :
		nunchakuButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				actionBar.setValue(actionBar.getValue()+ nunchaku.getGadgetsAction());
				actionBar.setValue(actionBar.getValue());
				actionBar.setString(actionBar.getValue() + "%");
				shopCurrency = shopCurrency - 1;
				shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
			}
		});
// Creating Sushi Button :
		sushiButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				energyBar.setValue(energyBar.getValue()+ sushi.getFoodEnergy());
				energyBar.setValue(energyBar.getValue());
				energyBar.setString(energyBar.getValue() + "%");
				shopCurrency = shopCurrency - 2;
				shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
			}
		});
// Creating Noodles Button :
		noodlesButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				energyBar.setValue(energyBar.getValue()+ noodles.getFoodEnergy());
				energyBar.setValue(energyBar.getValue());
				energyBar.setString(energyBar.getValue() + "%");
				shopCurrency = shopCurrency - 2;
				shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
			}
		});
// Creating Rice Button :
		riceButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				energyBar.setValue(energyBar.getValue()+ rice.getFoodEnergy());
				energyBar.setValue(energyBar.getValue());
				energyBar.setString(energyBar.getValue() + "%");
				shopCurrency = shopCurrency - 2;
				shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
			}
		});
// Creating Tech Armor Button :		
		techArmorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				charStatus = techArmor.getClothesStatus().toString();
				humanImageLabel.setIcon(takedaImage);				
				heroImageLabel1.setIcon(takedaImage);
				heroImageLabel2.setIcon(takedaImage);
				heroImageLabel3.setIcon(takedaImage);
				superHeroImageLabel.setIcon(takedaImage);
				villainImageLabel1.setIcon(takedaImage);
				villainImageLabel2.setIcon(takedaImage);
				villainImageLabel3.setIcon(takedaImage);
				superVillainImageLabel.setIcon(takedaImage);
				shopCurrency = shopCurrency - 3;
				shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
			}
		});
// Creating No Shirt Button :
		noShirtButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				charStatus = noShirt.getClothesStatus().toString();
				humanImageLabel.setIcon(kotalkhanImage);
				heroImageLabel1.setIcon(kotalkhanImage);
				heroImageLabel2.setIcon(kotalkhanImage);
				heroImageLabel3.setIcon(kotalkhanImage);
				superHeroImageLabel.setIcon(kotalkhanImage);
				villainImageLabel1.setIcon(kotalkhanImage);
				villainImageLabel2.setIcon(kotalkhanImage);
				villainImageLabel3.setIcon(kotalkhanImage);
				superVillainImageLabel.setIcon(kotalkhanImage);
				shopCurrency = shopCurrency - 3;
				shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
			}
		});
// Creating CIA Armor Button :
		ciaArmorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				charStatus = ciaArmor.getClothesStatus().toString();
				humanImageLabel.setIcon(cassieImage);
				heroImageLabel1.setIcon(cassieImage);
				heroImageLabel2.setIcon(cassieImage);
				heroImageLabel3.setIcon(cassieImage);
				superHeroImageLabel.setIcon(cassieImage);
				villainImageLabel1.setIcon(cassieImage);
				villainImageLabel2.setIcon(cassieImage);
				villainImageLabel3.setIcon(cassieImage);
				superVillainImageLabel.setIcon(cassieImage);
				shopCurrency = shopCurrency - 3;
				shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
			}
		});
		
// Creating The Character Selection Window By Calling A Method
createCharSelectionWindow(charSelection);

// Initialising Dimension Variables
Dimension a = new Dimension(150,50);
Dimension c = new Dimension(350,25);

// Setting Up Character Panel A
charPanelA.setBackground(Color.BLACK);
charPanelA.setBorder(BorderFactory.createEtchedBorder());
charSelectionTitle.setPreferredSize(a);
charPanelA.add(charSelectionTitle);
charSelectionTitle.setForeground(Color.GRAY);
charSelectionPanel.add(charPanelA, BorderLayout.NORTH);

// Setting Up Character Panel B
charPanelB.setBackground(Color.BLACK);
charPanelB.setLayout(new BoxLayout(charPanelB, BoxLayout.Y_AXIS));
charPanelB.add(heroLabel);
heroLabel.setForeground(Color.GRAY);
charPanelB.add(heroButton1);
charPanelB.add(heroButton2);
charPanelB.add(heroButton3);
charSelectionPanel.add(charPanelB, BorderLayout.WEST);

// Setting Up Character Panel C
charPanelC.setBackground(Color.BLACK);
charPanelC.setLayout(new BoxLayout(charPanelC, BoxLayout.Y_AXIS));
charPanelC.add(villainLabel);
villainLabel.setForeground(Color.GRAY);
charPanelC.add(villainButton1);
charPanelC.add(villainButton2);
charPanelC.add(villainButton3);
charSelectionPanel.add(charPanelC, BorderLayout.EAST);

// Setting Up Character Panel D
charPanelD.setLayout(new GridBagLayout());
charSelectionPanel.add(charPanelD, BorderLayout.SOUTH);
charPanelD.add(startButton);
startButton.setBackground(Color.WHITE);
charPanelD.add(exitButton);
exitButton.setBackground(Color.WHITE);
charPanelD.setBackground(Color.BLACK);
nameInput.setPreferredSize(c);
charPanelD.add(nameInput);

// Setting Up Character Panel E
charPanelE.setBackground(Color.BLACK);
charPanelE.setBorder(BorderFactory.createEtchedBorder());
charPanelE.setLayout(new GridBagLayout());;
charSelectionPanel.add(charPanelE, BorderLayout.CENTER);
charPanelE.add(heroLabel1);
heroLabel1.setVisible(false);
charPanelE.add(heroLabel1info);
heroLabel1info.setVisible(false);
charPanelE.add(heroLabel2);
heroLabel2.setVisible(false);
charPanelE.add(heroLabel2info);
heroLabel2info.setVisible(false);
charPanelE.add(heroLabel3);
heroLabel3.setVisible(false);
charPanelE.add(heroLabel3info);
heroLabel3info.setVisible(false);
charPanelE.add(villainLabel1);
villainLabel1.setVisible(false);
charPanelE.add(villainLabel1info);
villainLabel1info.setVisible(false);
charPanelE.add(villainLabel2);
villainLabel2.setVisible(false);
charPanelE.add(villainLabel2info);
villainLabel2info.setVisible(false);
charPanelE.add(villainLabel3);
villainLabel3.setVisible(false);
charPanelE.add(villainLabel3info);
villainLabel3info.setVisible(false);

// Setting Up Game Panel A
gamePanelA.setBackground(Color.BLACK);
gamePanelA.setBorder(BorderFactory.createEtchedBorder());
gameTitle.setPreferredSize(a);
gamePanelA.add(gameTitle);
gameTitle.setForeground(Color.GRAY);
gameWindowPanel.add(gamePanelA, BorderLayout.NORTH);

// Setting Up Game Panel B
gamePanelB.setLayout(new GridBagLayout());
gamePanelB.setLayout(new BoxLayout(gamePanelB, BoxLayout.Y_AXIS));
gamePanelB.setBackground(Color.BLACK);
gamePanelB.add(space1Label);
space1Label.setForeground(Color.GRAY);
gamePanelB.add(characterLabel);
characterLabel.setForeground(Color.GRAY);
gamePanelB.add(charNameLabel);
charNameLabel.setForeground(Color.GRAY);
gamePanelB.add(charHeightLabel);
charHeightLabel.setForeground(Color.GRAY);
gamePanelB.add(charSpeedLabel);
charSpeedLabel.setForeground(Color.GRAY);
gamePanelB.add(charStrengthLabel);
charStrengthLabel.setForeground(Color.GRAY);
gamePanelB.add(charAlignmentLabel);
charAlignmentLabel.setForeground(Color.GRAY);
gamePanelB.add(charGenderLabel);
charGenderLabel.setForeground(Color.GRAY);
gamePanelB.add(charOriginLabel);
charOriginLabel.setForeground(Color.GRAY);
gamePanelB.add(charFightingStylesLabel);
charFightingStylesLabel.setForeground(Color.GRAY);
gamePanelB.add(spaceLabel);
spaceLabel.setForeground(Color.GRAY);
gamePanelB.add(saveButton);
gameWindowPanel.add(gamePanelB, BorderLayout.WEST);

// Setting Up Game Panel C
gamePanelC.setLayout(new GridBagLayout());;
gamePanelC.setLayout(new BoxLayout(gamePanelC, BoxLayout.Y_AXIS));
gamePanelC.setBackground(Color.BLACK);
gameWindowPanel.add(gamePanelC, BorderLayout.EAST);

// Setting Up Game Panel D
gamePanelD.setBackground(Color.BLACK);
gamePanelD.setLayout(new GridBagLayout());
gamePanelD.add(humanImageLabel);
gamePanelD.add(heroImageLabel1);
gamePanelD.add(heroImageLabel2);
gamePanelD.add(heroImageLabel3);
gamePanelD.add(villainImageLabel1);
gamePanelD.add(villainImageLabel2);
gamePanelD.add(villainImageLabel3);
gamePanelD.add(superHeroImageLabel);
gamePanelD.add(superVillainImageLabel);
gamePanelD.add(energyBarLabel);
gamePanelD.add(energyBar);
energyBarLabel.setForeground(Color.GRAY);
humanImageLabel.setVisible(false);
heroImageLabel1.setVisible(false);
heroImageLabel2.setVisible(false);
heroImageLabel3.setVisible(false);
villainImageLabel1.setVisible(false);
villainImageLabel2.setVisible(false);
villainImageLabel3.setVisible(false);
superHeroImageLabel.setVisible(false);
superVillainImageLabel.setVisible(false);
gamePanelD.add(actionBarLabel);
gamePanelD.add(actionBar);
actionBarLabel.setForeground(Color.GRAY);
gameWindowPanel.add(gamePanelD, BorderLayout.SOUTH);

// Setting Up Game Panel E
gamePanelE.setLayout(new GridBagLayout());;
gamePanelE.add(gameLogoButton);
gamePanelE.add(crimeText);
crimeText.setForeground(Color.GRAY);
gamePanelE.setBackground(Color.BLACK);
gameWindowPanel.add(gamePanelE, BorderLayout.CENTER);

shopPanel.setBackground(Color.BLACK);
shopPanelA.setBackground(Color.BLACK);
shopPanel.setLayout(new BorderLayout());
shopPanel.add(shopPanelA, BorderLayout.NORTH);
shopPanelA.add(shopTitle);


shopPanelB.setBackground(Color.BLACK);
shopTitle.setForeground(Color.GRAY);
shopPanel.add(shopPanelB, BorderLayout.CENTER);

shopPanelB.add(kunaiButton);
kunaiButton.setToolTipText("Cost's 1 Koin");
shopPanelB.add(longswordButton);
longswordButton.setToolTipText("Cost's 1 Koin");
shopPanelB.add(nunchakuButton);
nunchakuButton.setToolTipText("Cost's 1 Koin");
shopPanelB.add(shopGadgetsLabel);
shopGadgetsLabel.setForeground(Color.GRAY);

shopPanelB.add(sushiButton);
sushiButton.setToolTipText("Cost's 1 Koin");
shopPanelB.add(noodlesButton);
noodlesButton.setToolTipText("Cost's 1 Koin");
shopPanelB.add(riceButton);
riceButton.setToolTipText("Cost's 1 Koin");
shopPanelB.add(shopFoodLabel);
shopFoodLabel.setForeground(Color.GRAY);

shopPanelB.add(techArmorButton);
techArmorButton.setToolTipText("Cost's 2 Koin");
shopPanelB.add(noShirtButton);
noShirtButton.setToolTipText("Cost's 2 Koin");
shopPanelB.add(ciaArmorButton);
ciaArmorButton.setToolTipText("Cost's 2 Koin");
shopPanelB.add(shopClothesLabel);
shopClothesLabel.setForeground(Color.GRAY);

shopPanelC.setBackground(Color.BLACK);
shopPanel.add(shopPanelC, BorderLayout.SOUTH);
shopPanelC.setBackground(Color.BLACK);
shopCurrencyLabel.setText("Koins: " + Integer.toString(shopCurrency));
shopPanelC.add(shopCurrencyLabel);
shopCurrencyLabel.setForeground(Color.GRAY);
}

// Declaring Void Methods
// Creating The Create Character Selection Window Void Method :
private void createCharSelectionWindow(JFrame window)
{
	try {

	    AudioInputStream stream;
	    AudioFormat format;
	    DataLine.Info info;
	    Clip clip;

	    stream = AudioSystem.getAudioInputStream(getClass().getResource("/sounds/mortalkombattheme.wav"));
	    format = stream.getFormat();
	    info = new DataLine.Info(Clip.class, format);
	    clip = (Clip) AudioSystem.getLine(info);
	    clip.open(stream);
	    clip.start();
	} catch (UnsupportedAudioFileException f) 
	{  f.printStackTrace(); 
	} catch (IOException f) 
	{  f.printStackTrace(); 
	} catch (LineUnavailableException f) 
	{  f.printStackTrace(); } 
	
window.getContentPane().add(charSelectionPanel, BorderLayout.CENTER);
window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
window.setLocationRelativeTo(null);
window.setVisible(true);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
// Creating The Create Game Window Void Method :
private void createGameWindow(JFrame window)
{
window.getContentPane().add(gameWindowPanel, BorderLayout.CENTER);
window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
window.setLocationRelativeTo(null);
window.setVisible(true);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
// Creating The Create Shop Window Void Method :
private void createShopWindow(JFrame window)
{
window.getContentPane().add(shopPanel, BorderLayout.CENTER);
window.setSize(450, 450);
window.setLocationRelativeTo(null);
window.setVisible(true);
}
}