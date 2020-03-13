//import java.util.Objects;
public class GenericItem implements Cloneable{
    public int ID;
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

    @Override
    public GenericItem clone() throws CloneNotSupportedException{
        if(this.analog != null){
            return (GenericItem) this.analog.clone();
        }
        return (GenericItem) super.clone();
    }
}

