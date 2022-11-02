import javax.swing.*;
import java.awt.*;
// import java.awt.event.MouseListener;

import java.awt.event.*;
public class swinglambda extends JFrame  {

    swinglambda() {

        // using lambda expression in desktop appliation

        setTitle("My window");
        setBounds(480, 200, 500, 300);
        setLayout(new FlowLayout());

        JButton b1 = new JButton("Click me");
        // b1.setBounds(200,100 ,100 ,30 );
        b1.addActionListener((e) -> {
            // also we can reduce type of e i.e ActionEvent type will infer automatically
            b1.setEnabled(false);
        });

        b1.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

       
    
        
        add(b1);

        // new ActionListener(){
        // // new ActionListener() this is an anonymous class and below is the implementation of the class.
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // b1.setEnabled(false);

        // }

        // });

        // the above code can be written in lambda as -:

        // ( e ) -> {
        // // also we can reduce type of e i.e ActionEvent type will infer automatically
        // b1.setEnabled(false);
        // });

        setVisible(true);
    }

    public static void main(String[] args) {
        new swinglambda();
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    // setVisible(false);

    // }
}
