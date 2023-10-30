package tugas;

public class Chasier {
    private double price;
    private double discount;
    private Voucher voucher;

    public Chasier(){
        price = 0.0;
        discount = 0.0;
        voucher = null;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public void setDiscount(double discount){
        this.discount += discount;
    }
    public void setVoucher(Voucher voucher){
        this.voucher = voucher;
    }
    public double getTotal(){
        double total = price;
        if (voucher != null && voucher.isValid()) {
            total *= (1 - voucher.getDiscountRate());
        }
        total *= (1 - discount);
        return total;
    }
}
