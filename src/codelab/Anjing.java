package codelab;

public class Anjing extends Hewan implements IKarnivora{
    @Override
    public void getInfo() {
        System.out.println("Nama    : Anjing");
        System.out.println("Jenis   : Karnivora");
        tampilMakanan();
        bersuara();

    }

    @Override
    public void tampilMakanan() {
        System.out.println("Makanan : Daging");
    }
    @Override
    public void setSuara (String suara){
        this.suara=suara;
    }
    @Override
    public String getSuara (){
        return this.suara;
    }
    @Override
    public void bersuara(){
        this.setSuara("Gugg");
        System.out.println("Suara   : "+ this.getSuara());
    }
}
