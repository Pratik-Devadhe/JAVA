import javax.swing.*;
import java.awt.*;

class swing1 {
    public static void main(String agrs[]) {

        JFrame jf = new JFrame("Swing Example");
        Container c = jf.getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER ,10 , 80)); // Use FlowLayout for better control


        // Create a custom font =>  Font name, style, size

        Font labelFont = new Font("Arial", Font.BOLD, 16); 
        Font textFieldFont = new Font("Courier New", Font.ITALIC, 14);
        Font buttonFont = new Font("Verdana", Font.ITALIC, 16);


        // USERNAME 
        JLabel l1 = new JLabel("Username:");
        l1.setFont(labelFont); 
        JTextField t1 = new JTextField(15); // Set columns for size
        t1.setFont(textFieldFont); 
        t1.setBackground(Color.yellow); // Set background color
        t1.setForeground(Color.black);
        l1.setFont(textFieldFont);

        // password 
        JLabel l2 = new JLabel("Password:");
        JTextField t2 = new JTextField(15);

        t2.setBackground(Color.yellow); // Set background color
        t2.setForeground(Color.black);
        t2.setFont(textFieldFont); 
        l2.setFont(textFieldFont); 


        // submit button 
        JButton b1 = new JButton("Submit");
        b1.setFont(buttonFont); 
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);

        // second button
        JButton b2 = new JButton("Clear");
        b2.setFont(buttonFont); 
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);

        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(b1);
        c.add(b2);

        jf.setSize(500, 500); // Set frame size
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
