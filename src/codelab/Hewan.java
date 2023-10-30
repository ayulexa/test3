package codelab;

public abstract class Hewan {
    public String suara;

    public void setSuara(String suara){
        this.suara=suara;}

    public String getSuara() {
        return suara;
    }
    public void bersuara (){}
    public abstract void getInfo();
}
