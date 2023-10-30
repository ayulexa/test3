package tugas;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di Toko Alat Musik dan Elektronik kami ... ");
        System.out.println("Pilih alat yang ingin anda  beli : ");
        System.out.println("1. Alat Musik");
        System.out.println("2. Alat Elektronik");
        System.out.println("Pilih item : "); int menu = input.nextInt();
        if (menu == 1){
            System.out.println("------- Alat Musik -------");
            Gitar ob = new Gitar("Gitar", 500000, true, 10);
            Member ob1 = new Member(true, "Premium");
            Employee ob2 = new Employee(false);
            Voucher ob3 = new Voucher("MY20", 0.20, new Date(2023 - 2003, 05, 12));
            Chasier ob4 = new Chasier();
            ob4.setPrice(ob.getPrice());
            ob4.setDiscount(ob1.getDiscount());
            ob4.setDiscount(ob2.getDiscount());
            ob4.setVoucher(ob3);
            System.out.println("Total = " + ob4.getTotal());
        }
        else {
            System.out.println("------- Alat Elektronik -------");
            Radio ob = new Radio("Radio",200000, true, 15);
            Member ob1 = new Member(false, "Gold");
            Employee ob2 = new Employee(true);
            Voucher ob3 = new Voucher("MY20", 0.15, new Date(2023 - 2003,05,12));
            Chasier ob4 = new Chasier();
            ob4.setPrice(ob.getPrice());
            ob4.setDiscount(ob1.getDiscount());
            ob4.setDiscount(ob2.getDiscount());
            ob4.setVoucher(ob3);
            System.out.println("Total = " + ob4.getTotal());
        }
    }
}
