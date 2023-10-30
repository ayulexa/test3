package tugas;

public class Radio extends Item implements alatElektronik{
    private double discountRate;

    public Radio(String name, double price, boolean onSale, double discountRate){
        super(name, price, onSale);
        this.discountRate = discountRate;
    }

    public double getDiscount(){
        return Math.min(discountRate, MAX_DISCOUNT);
    }
}
