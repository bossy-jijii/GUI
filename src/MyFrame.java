import javax.swing.*;
import java.awt.*;
//method 2 using a constructor
public class MyFrame extends JFrame {
    MyFrame() {
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);//prevent the window from being resized


        ImageIcon myimage = new ImageIcon("Dark Blue and Brown Illustrative Fitness Gym Logo.png");//set a new image icon
        this.setIconImage(myimage.getImage());//change icon of this
        //this.getContentPane().setBackground(Color.pink);
        //OR
        this.getContentPane().setBackground(new Color(123,50,250));



    }
}