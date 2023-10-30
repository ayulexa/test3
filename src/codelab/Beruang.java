package codelab;

public class Beruang extends Hewan implements IKarnivora, IHerbivora  {
    @Override
    public void getInfo() {
        System.out.println("Nama    : Beruang");
        System.out.println("Jenis   : Karnivora + Herbivora");
        tampilMakanan();
        bersuara();

    }
    @Override
    public void setSuara(String suara){this.suara=suara;}
    @Override
    public String getSuara() {
        return this.suara;
    }
    @Override
    public void bersuara(){
        this.setSuara("Haumm");
        System.out.println("Suara   : "+this.getSuara());
    }

    @Override
    public void tampilMakanan() {
        System.out.println("Makanan : Daging + Tumbuhan");
    }
}
