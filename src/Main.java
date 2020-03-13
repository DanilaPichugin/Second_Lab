import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("First Task");
        GenericItem FirstItem = new GenericItem(123,"iPhone XS",55000, Category.GENERAL);
        FirstItem.printAll();

        GenericItem SecondItem = new GenericItem(123,"iPhone XS", 55000, Category.GENERAL);
        SecondItem.printAll();

        GenericItem ThirdItem = new GenericItem(321, "Off-White Hoodie", 50000, Category.DRESS);
        ThirdItem.printAll();
        //ThirdItem.analog = SecondItem;
        System.out.println("1" + ThirdItem.analog);
        System.out.println("END Of First Task");

        System.out.println("Second Task");
        Date date = new Date();
        TechnicalItem ItemTechniq1 = new TechnicalItem(111, "Iphone", 120000, Category.GENERAL, (short) 1);
        TechnicalItem ItemTechniq2 = new TechnicalItem(222, "Xiaomi", 70000, Category.GENERAL, (short) 1);

        FoodItem ItemFood1 = new FoodItem(144, "Milk", 70, Category.FOOD, date, (short) 2);
        FoodItem ItemFood2 = new FoodItem(144, "Milk", 70, Category.FOOD, date, (short) 2);
        GenericItem items[] = {ItemFood1, ItemTechniq1, ItemFood2, ItemTechniq2};

        for(GenericItem genericItem : items){
            genericItem.printAll();
        }
        System.out.println("END Of Second Task");

        System.out.println("1 = 2 - " + ItemFood1.equals(ItemFood2));
        System.out.println("1 = 2 - " + ItemTechniq1.equals(ItemTechniq2));
        System.out.println("1 = 2 - " + FirstItem.equals(SecondItem));
        System.out.println("1 = 2 - " + ItemFood1.equals(ItemFood1));

        System.out.println("____________");

        GenericItem firstitemclone = FirstItem.clone();
        System.out.println("1=2 - " + firstitemclone);

        System.out.println("1=2 - " + FirstItem.equals(firstitemclone));

        TechnicalItem technicalItemclone = ItemTechniq1.clone();
        System.out.println("1-2 - " + technicalItemclone);
        System.out.println("1=2 - " + ItemTechniq1.equals(technicalItemclone));

        GenericItem seconditem_2 = SecondItem.clone();
        seconditem_2.analog = ThirdItem;
        System.out.println("1=2 - " + seconditem_2.analog);
    }
}
