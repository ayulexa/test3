package codelab;

public class Kucing extends Hewan implements IHerbivora{
    @Override
    public void getInfo() {
        System.out.println("Hewan   : Kucing");
        System.out.println("Jenis   : Karnivora");
        tampilMakanan();
        bersuara();

    }

    @Override
    public void tampilMakanan() {
        System.out.println("Makanan : Daging");

    }
    @Override
    public void setSuara(String suara){
        this.suara=suara;
    }
    @Override
    public String getSuara(){
        return this.suara;
    }
    @Override
    public void bersuara(){
        this.setSuara("Miaww");
        System.out.println("Suara   : "+this.getSuara());
    }
}
