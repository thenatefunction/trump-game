/**
 * The Shop abstract/super-class that shares it's methods & variables with the other sub-classes
 * that inherit from it.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing The Java API Packages :
import javax.swing.ImageIcon;

// Declaring The Shop Class (Superclass) :
public abstract class Shop {
	
	// Declaring The Private Class Variables :
	private String shopTitle;
	private int	shopCurrency;
	private String shopItem;
	private Status shopStatus;
	private ImageIcon shopImage;
	private int shopPrice;
	
	// Declaring The Constructor :
	public Shop(String shopTitle, int shopCurrency, String shopItem, Status shopStatus, 
			    ImageIcon shopImage, int shopPrice){
		
		// Initialising The Private Class Variables :
		this.shopTitle = shopTitle;
		this.shopCurrency = shopCurrency;
		this.shopItem = shopItem;
		this.shopStatus = shopStatus;
		this.shopImage = shopImage;
		this.shopPrice = shopPrice;
		}
	
		// Declaring The Getter Methods :
		public String getShopTitle(){
			return shopTitle;
		}
		public int getShopCurrency(){
			return shopCurrency;
		}
		public String getShopItem(){
			return shopItem;
		}
		public Status getShopStatus(){
			return shopStatus;
		}
		public ImageIcon getShopImage(){
			return shopImage;
		}
		public int getShopPrice(){
			return shopPrice;
		}
		
		// Declaring The Setter Methods :
		public void setShopTitle(String newShopTitle){
			shopTitle = newShopTitle;
		}
		public void setShopCurrency(int newShopCurrency){
			shopCurrency = newShopCurrency;
		}
		public void setShopItem(String newShopItem){
			shopItem = newShopItem;
		}
		public void setShopStatus(Status newShopStatus){
			shopStatus = newShopStatus;
		}
		public void setShopImage(ImageIcon newShopImage){
			shopImage = newShopImage;
		}
		public void setShopPrice(int newShopPrice){
			shopPrice = newShopPrice;
		}		
}