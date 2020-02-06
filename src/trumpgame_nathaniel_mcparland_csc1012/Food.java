/**
 * The Food sub-class that inherits methods & variables from the Character super-class.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing The Java API Packages :
import javax.swing.ImageIcon;

// Declaring The Shop Class (Sub-Class) :
public class Food extends Shop {
	
	// Declaring The Protected Class Variables :
	protected String foodTitle;
	protected int foodCurrency;
	protected int foodEnergy;
	protected String foodItem;
	protected Status foodStatus;
	protected ImageIcon foodImage;
	protected int foodPrice;

	// Declaring The Constructor :
	public Food(String shopTitle, int shopCurrency, String shopItem,
			Status shopStatus, ImageIcon shopImage, int shopPrice, int foodEnergy) {
		super(shopTitle, shopCurrency, shopItem, shopStatus, shopImage, shopPrice);
		
	// Initialising The Protected Class Variables :
	foodTitle = shopTitle;
	foodCurrency = shopCurrency;
	this.foodEnergy = foodEnergy;
	foodItem = shopItem;
	foodStatus = shopStatus;
	foodImage = shopImage;
	foodPrice = shopPrice;
	}
	
	// Declaring The Getter Methods :
	public String getFoodTitle(){
		return foodTitle;
	}
	public int getFoodCurrency(){
		return foodCurrency;
	}
	public int getFoodEnergy(){
		return foodEnergy;
	}
	public String getFoodItem(){
		return foodItem;
	}
	public Status getFoodStatus(){
		return foodStatus;
	}
	public ImageIcon getFoodImage(){
		return foodImage;
	}
	public int getFoodPrice(){
		return foodPrice;
	}
	
	// Declaring The Setter Methods :
	public void setFoodTitle(String newFoodTitle){
		foodTitle = newFoodTitle;
	}
	public void setFoodCurrency(int newFoodCurrency){
		foodCurrency = newFoodCurrency;
	}
	public void setFoodEnergy(int newFoodEnergy){
		foodEnergy = newFoodEnergy;
	}
	public void setFoodItem(String newFoodItem){
		foodItem = newFoodItem;
	}
	public void setFoodStatus(Status newFoodStatus){
		foodStatus = newFoodStatus;
	}
	public void setFoodImage(ImageIcon newFoodImage){
		foodImage = newFoodImage;
	}
	public void setFoodPrice(int newFoodPrice){
		foodPrice = newFoodPrice;
	}
}