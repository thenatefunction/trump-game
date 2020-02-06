/**
 * The Clothes sub-class that inherits methods & variables from the Character super-class.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing The Java API Packages :
import javax.swing.ImageIcon;

// Declaring The Shop Class (Sub-Class) :
public class Clothes extends Shop {
	
	// Declaring The Protected Class Variables :
	protected String clothesTitle;
	protected int	clothesCurrency;
	protected String clothesItem;
	protected Status clothesStatus;
	protected ImageIcon clothesImage;
	protected int clothesPrice;

	// Declaring The Constructor :
	public Clothes(String shopTitle, int shopCurrency, String shopItem,
			Status shopStatus, ImageIcon shopImage, int shopPrice) {
		super(shopTitle, shopCurrency, shopItem, shopStatus, shopImage, shopPrice);
		
	// Initialising The Protected Class Variables :
	clothesTitle = shopTitle;
	clothesCurrency = shopCurrency;
	clothesItem = shopItem;
	clothesStatus = shopStatus;
	clothesImage = shopImage;
	clothesPrice = shopPrice;
	}
	
	// Declaring The Getter Methods :
	public String getClothesTitle(){
		return clothesTitle;
	}
	public int getClothesCurrency(){
		return clothesCurrency;
	}
	public String getClothesItem(){
		return clothesItem;
	}
	public Status getClothesStatus(){
		return clothesStatus;
	}
	public ImageIcon getClothesImage(){
		return clothesImage;
	}
	public int getClothesPrice(){
		return clothesPrice;
	}
			
	// Declaring The Setter Methods :
	public void setClothesTitle(String newClothesTitle){
		clothesTitle = newClothesTitle;
	}
	public void setClothesCurrency(int newClothesCurrency){
		clothesCurrency = newClothesCurrency;
	}
	public void setClothesItem(String newClothesItem){
		clothesItem = newClothesItem;
	}
	public void setClothesStatus(Status newClothesStatus){
		clothesStatus = newClothesStatus;
	}
	public void setClothesImage(ImageIcon newClothesImage){
		clothesImage = newClothesImage;
	}
	public void setClothesPrice(int newClothesPrice){
		clothesPrice = newClothesPrice;
	}
}