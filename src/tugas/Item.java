package tugas;

public abstract class Item {
    private String name;
    private double price;
    private boolean onSale;

    public Item(String name, double price, boolean onSale){
        this.name = name;
        this.price = price;
        this.onSale = onSale;
    }

    public String getName(){
        return name;
    }
    public double getPrice() {
        double discountedPrice = price;
        if (onSale){
            discountedPrice *= getDiscount();
        }
        return discountedPrice;
    }
    public boolean isOnSale() {
        return onSale;
    }
    public abstract double getDiscount();
}
