public class User {

    private String Namn;
    private String Persnr;
    private int Timlön;
    private int Timmar;


    public String getNamn() {
        return Namn;
    }

    public void setNamn(String N) {
        Namn = N;
    }
    public String getPersnr() {
        return Persnr;
    }
    public void setPersnr(String Pn) {
        Persnr = Pn;
    }
    public int getTimlön(){
        return Timlön;
    }
    public void setTimlön(int Tl){
        this.Timlön = Tl;
    }
    public int getTimmar(){
        return Timmar;
    }
    public void setTimmar(int T){
        this.Timmar = T;
    }

}