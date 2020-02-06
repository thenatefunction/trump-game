/**
 * The Gadgets sub-class that inherits methods & variables from the Character super-class.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing The Java API Packages :
import javax.swing.ImageIcon;

// Declaring The Shop Class (Sub-Class) :
public class Gadgets extends Shop {
	
	// Declaring The Protected Class Variables :
	protected String gadgetsTitle;
	protected int	gadgetsCurrency;
	protected int gadgetsAction;
	protected String gadgetsItem;
	protected Status gadgetsStatus;
	protected ImageIcon gadgetsImage;
	protected int gadgetsPrice;

	// Declaring The Constructor :
	public Gadgets(String shopTitle, int shopCurrency, String shopItem,
			Status shopStatus, ImageIcon shopImage, int shopPrice, int gadgetsAction) {
		super(shopTitle, shopCurrency, shopItem, shopStatus, shopImage, shopPrice);
		
	// Initialising The Protected Class Variables :
	gadgetsTitle = shopTitle;
	gadgetsCurrency = shopCurrency;
	this.gadgetsAction = gadgetsAction;
	gadgetsItem = shopItem;
	gadgetsStatus = shopStatus;
	gadgetsImage = shopImage;
	gadgetsPrice = shopPrice;
	}


	// Declaring The Getter Methods :
	public String getGadgetsTitle(){
		return gadgetsTitle;
	}
	public int getGadgetsCurrency(){
		return gadgetsCurrency;
	}
	public int getGadgetsAction(){
		return gadgetsAction;
	}
	public String getGadgetsItem(){
		return gadgetsItem;
	}
	public Status getGadgetsStatus(){
		return gadgetsStatus;
	}
	public ImageIcon getGadgetsImage(){
		return gadgetsImage;
	}
	public int getGadgetsPrice(){
		return gadgetsPrice;
	}
		
	// Declaring The Setter Methods :
	public void setGadgetsTitle(String newGadgetsTitle){
		gadgetsTitle = newGadgetsTitle;
	}
	public void setGadgetsCurrency(int newGadgetsCurrency){
		gadgetsCurrency = newGadgetsCurrency;
	}
	public void setGadgetsAction(int newGadgetsAction){
		gadgetsAction = newGadgetsAction;
	}
	public void setGadgetsItem(String newGadgetsItem){
		gadgetsItem = newGadgetsItem;
	}
	public void setGadgetsStatus(Status newGadgetsStatus){
		gadgetsStatus = newGadgetsStatus;
	}
	public void setGadgetsImage(ImageIcon newGadgetsImage){
		gadgetsImage = newGadgetsImage;
	}
	public void setGadgetsPrice(int newGadgetsPrice){
		gadgetsPrice = newGadgetsPrice;
	}
}