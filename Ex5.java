import java.awt.FlowLayout;
import javax.swing.*;

public class Ex5 {
  public static void main(String[] args) {
    var frame = new JFrame("初めてのGUI");
    var label = new JLabel("Hello World!!");
    var button = new JButton("押してね");
    frame.getContentPane().setLayout(new FlowLayout());
    frame.getContentPane().add(label);
    frame.getContentPane().add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}