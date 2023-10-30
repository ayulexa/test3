package codelab;

public class Kuda extends Hewan implements IHerbivora{
    @Override
    public void getInfo() {
        System.out.println("Nama    : Kuda");
        System.out.println("Jenis   : Herbivora");
        tampilMakanan();
        bersuara();
    }

    @Override
    public void tampilMakanan() {
        System.out.println("Makanan : Tumbuhan");
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
    public void bersuara (){
        this.setSuara("Nghikk");
        System.out.println("Suara   : "+this.getSuara());
    }
}
