package tugas;

public class Gitar extends Item implements alatElektronik{
public class Gitar extends Item implements alatElektronik{
    private double discountRate;

    public Gitar(String name, double price, boolean onSale, double discoountRate){
        super(name, price, onSale);
        this.discountRate = discoountRate;
    }

    public double getDiscount(){
        return Math.min(discountRate, MAX_DISCOUNT);
    }
}
