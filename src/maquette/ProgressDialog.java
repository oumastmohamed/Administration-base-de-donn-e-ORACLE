import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 * Afficher une barre de progression dans un JFrame
 */
public class ProgressDialog extends JFrame {

    public JProgressBar progressbar;

    public ProgressDialog() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        progressbar = new JProgressBar(0, 100);
        progressbar.setValue(0);
        progressbar.setStringPainted(true);
        pane.add(progressbar);
        setContentPane(pane);
    }

  

    public void loop() {
        int position = 0;
        while (position < 105) {
            progressbar.setValue(position);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            position += 5;
        }
    }

    public static void main(String[] arguments) {
        ProgressDialog frame = new ProgressDialog();
        frame.pack();
        frame.setVisible(true);
        frame.loop();
    }
}