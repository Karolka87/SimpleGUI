import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        SimpleGUI apGUI = new SimpleGUI();
        apGUI.letsGo();

    }
    public void letsGo() {
        JFrame frame = new JFrame();
        button = new JButton("Click here");
        button.addActionListener(this);
        //button.setSize(5,4);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);

        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked on'");
    }
}
