package tugas;
import java.util.Date;

public class Voucher {
    private String code;
    private double discountRate;
    private Date validityPeriod;

    public Voucher(String code, double discountRate, Date validityPeriod){
        this.code = code;
        this.discountRate = discountRate;
        this.validityPeriod = validityPeriod;
    }

    public String getCode(){
        return code;
    }
    public double getDiscountRate(){
        return discountRate;
    }
    public boolean isValid(){
        Date currentDate = new Date();
        return currentDate.compareTo(validityPeriod) <= 0;
    }
}
