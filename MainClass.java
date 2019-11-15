
import Main.Player;
import menu.Interface;
import java.util.Scanner;

public class MainClass {

    // Main class.
    public static void main(String[] args) {

        // Membuat objek baru dan instansiasi nilai awal.
        Player player = new Player();
        

        // Menu utama untuk penginputan nama.
        
        Interface.tampilanUtama(player);


        // Masuk ke menu Utama.
        // Masuk ke tampilan Menu.
        Interface.tampilanMenu(player);
       


   }

}

    
