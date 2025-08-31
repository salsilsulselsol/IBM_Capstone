import javax.swing.SwingUtilities;
import view.MenuScreen;
import viewmodel.SoundManager;

// Main class untuk menjalankan aplikasi game Monster Fish Hunt
public class Main {

    public static void main(String[] args) {
        // Menjalankan aplikasi pada thread event-dispatcher Swing
        SwingUtilities.invokeLater(() -> {
            // Inisialisasi sound manager
            SoundManager.init();
            // Membuat dan menampilkan menu utama
            MenuScreen menu = new MenuScreen();
            menu.setVisible(true);
        });
    }
}