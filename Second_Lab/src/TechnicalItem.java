public class TechnicalItem extends GenericItem {
    short warrantyTime;

    TechnicalItem(int ID, String name, float price, Category category,  short warrantyTime){
        super(ID, name, price, category);
        this.warrantyTime = warrantyTime;
    }

    @Override
    void printAll(){
        System.out.printf("ID: %-10d Name: %-10s Category: %-10s price:%-10.2f Warranty: %d\n", ID, name, category, price, warrantyTime);
    }
    @Override
    public String toString(){
        return this.name;
    }

    public boolean equals(TechnicalItem item){
        if (this == item){
            return true;
        }
        if (item == null || getClass() != item.getClass()){
            return false;
        }
        if(this.ID == item.ID && this.name == item.name && this.price == item.price && this.category == item.category
                && this.warrantyTime == item.warrantyTime){
            return true;
        }
        return false;
    }

    @Override
    public TechnicalItem clone() throws CloneNotSupportedException{
        return (TechnicalItem) super.clone();
    }
}
