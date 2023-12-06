package labels;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class Main {
    public static void main(String[] args) {

        //JLabel= a GUI display area for a string of text , an image or both

        JLabel label= new JLabel(); //creates a label
        label.setText("Bro, do you even code? ");//set text of a label

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
    }
}
