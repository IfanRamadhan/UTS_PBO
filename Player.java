package Main;

public class Player {
    
    
    // Attribut Player
    private String nama;
    private int skor;
    private int nyawa;
    
    // Konstruktor Player
    public Player() {
        nama = "Anonim";
        skor = 0;
        nyawa = 3;
    }
    
    // Method Setter dan Getter.
    public void setNama(String inputNama){
        nama = inputNama;
    }
    
    public String getNama(){
        return nama;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getNyawa() {
        return nyawa;
    }

    public void setNyawa(int nyawa) {
        this.nyawa = nyawa;
    }
}
