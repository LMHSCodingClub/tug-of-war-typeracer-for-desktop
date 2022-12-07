import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.EventListener;

public class main{


   public static void main(String[] args){
      
int startButtonWidth = 100;
int startButtonHeight = 50;

      JFrame frame = new JFrame();
      

      ImageIcon carImage = new ImageIcon("carImage.png");

      JLabel car = new JLabel();
      car.setIcon(carImage);
      car.setBounds(frame.getWidth() / 2, frame.getHeight() / 2 , 250, 250);
      

      JButton start = new JButton();
      start.setText("Start!");
      start.setBounds((frame.getWidth() / 2) - (startButtonWidth / 2) , (frame.getHeight() / 2) - (startButtonHeight / 2) , startButtonWidth, startButtonHeight);
      start.addActionListener(null);
      frame.add(start);

      @Override
      public void actionPerformed(ActionEvent e){
            if(e.getSource() == start){
               frame.add(car);
            }

      }

      



      
   




      
      
      
      
      
      
      
      
      
      
      
      /*
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

      */
      
      
   }


}