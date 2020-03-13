import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("First Task");
        GenericItem FirstItem = new GenericItem(123,"iPhone XS",55000, Category.GENERAL);
        FirstItem.printAll();

        GenericItem SecondItem = new GenericItem(132,"Snickers", 100, Category.FOOD);
        SecondItem.printAll();

        GenericItem ThirdItem = new GenericItem(321, "Off-White Hoodie", 50000, Category.DRESS);
        ThirdItem.printAll();
        ThirdItem.analog = SecondItem;
        System.out.println("Analog : " + ThirdItem.analog);
        System.out.println("END Of First Task");

        System.out.println("Second Task");
        Date date = new Date();
        TechnicalItem ItemTechniq1 = new TechnicalItem(111, "Iphone", 120000, Category.GENERAL, (short) 1);
        TechnicalItem ItemTechniq2 = new TechnicalItem(222, "Xiaomi", 70000, Category.GENERAL, (short) 1);

        FoodItem ItemFood1 = new FoodItem(144, "Milk", 70, Category.FOOD, date, (short) 2);
        FoodItem ItemFood2 = new FoodItem(121, "Cheese", 150, Category.FOOD, date, (short) 10);
        GenericItem items[] = {ItemFood1, ItemTechniq1, ItemFood2, ItemTechniq2};

        for(GenericItem genericItem : items){
            genericItem.printAll();
        }
        System.out.println("END Of Second Task");

        System.out.println("Second.Part 2 Task");

        FoodItem ItemFoodEqual_1 = new FoodItem(122, "Chocolate", 100, Category.FOOD, date, (short)5);
        FoodItem ItemFoodEqual_2 = new FoodItem(122, "Chocolate", 100, Category.FOOD, date, (short)5);
        System.out.println("First is equal to Second : " + ItemFoodEqual_1.equals(ItemFoodEqual_2));
        FoodItem ItemFoodEqual_3 = new FoodItem(783, "Apple", 20, Category.FOOD, date, (short) 10);
        System.out.println("First is equal to Third : " + ItemFoodEqual_1.equals(ItemFoodEqual_3));

        System.out.println("\n");

        FoodItem ItemFood_1_clone = ItemFoodEqual_1.clone();
        System.out.println("It is a clone of original : " + ItemFood_1_clone);
        System.out.println("Original is equal to the clone : " + ItemFoodEqual_1.equals(ItemFood_1_clone));

        System.out.println("\n");

        GenericItem seconditem_2 = SecondItem.clone();
        seconditem_2.analog = ThirdItem;
        System.out.println("Clone Of Analog : " + seconditem_2.analog);
    }
}
