import javax.swing.*;
import java.awt.*;

public class main{

   public static void main(String [] args){
      
      JFrame frame = new JFrame();
      frame.setTitle("Typeracer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      frame.setVisible(true);
      frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
      frame.getContentPane().setBackground(Color.BLUE);
      
      ImageIcon advertisement = new ImageIcon("codingClubAdd.png");
      
      JLabel ad = new JLabel();
      ad.setIcon(advertisement);
      ad.setHorizontalAlignment(JLabel.CENTER);
      ad.setBounds(100 , 100 , 250 , 250);
      
      
      
      JLabel text = new JLabel();
      text.setText("some random paragraph");
      text.setBounds(300 , 500 , 200 , 200);
      text.setBackground(Color.BLUE);
      text.setOpaque(true);
      
      
      
      
      frame.add(ad);
      frame.add(text);
      
      
   }


}