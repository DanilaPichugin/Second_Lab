import java.util.Objects;
public class GenericItem implements Cloneable{
    public int ID;
    public static int currentID = 0;
    public String name;
    public float price;
    public Category category = Category.GENERAL;
    public GenericItem analog;

    GenericItem(int ID, String name, float price, Category category){
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    GenericItem(String name, float price, Category category){
        ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    GenericItem(String name, float price, GenericItem analog){
        this(name, price, Category.GENERAL);
        ID = GenericItem.currentID++;
        this.analog = analog;
    }

    GenericItem(){
        this("Unnamed", 0f, Category.GENERAL);
        ID = GenericItem.currentID++;
    }

    void printAll() {
        System.out.printf("ID: %-10d Name: %-10s Category: %-10s price: %-10.2f\n", ID, name, category, price);
    }

    public String toString(){
        return this.name + "|" + ID + "|" + price + "|" + category;
    }


    public boolean equals(GenericItem item){
        if (this == item){
            return true;
        }
        if (item == null || getClass() != item.getClass()){
            return false;
        }
        if(this.ID == item.ID && this.name == item.name && this.price == item.price && this.category == item.category){
            return true;
        }
        return false;
    }

    public int hashcode(){
        return Objects.hash(ID, name, price, category);
    }


    @Override
    public GenericItem clone() throws CloneNotSupportedException {
        if (this.analog != null) {
            return (GenericItem) this.analog.clone();
        }
        return (GenericItem) super.clone();
    }

}

