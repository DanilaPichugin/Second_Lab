import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem {
    Date dateOfIncome;
    short expires;

    FoodItem(int ID, String name, float price, Category category, Date dateOfIncome, short expires){
        super(ID,name,price,category);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    FoodItem(String name, float price, FoodItem analog, Date date, short expires){
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.dateOfIncome = date;
        this.expires = expires;
    }

    FoodItem(String name, float price, short expires){
        this(name, price, null, null, expires);
    }

    FoodItem(String name){
        this(name, 0f, null, null, (short) 2);
    }

    @Override
    void printAll(){
        System.out.printf("ID: %-10d Name: %-10s Category: %-10s price:%-10.2f Expires: %-10d Date Of Income:%s \n", ID,
                name, category, price, expires, dateOfIncome);
    }

    @Override
    public String toString() {
        return this.name + "|" + ID + "|" + category + "|" + price + "|" + expires + "|" + dateOfIncome;
    }

    public boolean equals(FoodItem item){
        if (this == item){
            return true;
        }
        if (item == null || getClass() != item.getClass()){
            return false;
        }
        if(this.ID == item.ID && this.name == item.name && this.price == item.price && this.category == item.category
                && this.dateOfIncome == item.dateOfIncome && this.expires == item.expires){
            return true;
        }
        return false;
    }

    @Override
    public int hashcode(){
        return Objects.hash(ID, name, price, category, dateOfIncome, expires);
    }

    @Override
    public FoodItem clone() throws CloneNotSupportedException{
        return (FoodItem) super.clone();
    }
}
