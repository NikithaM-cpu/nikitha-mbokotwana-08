import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldGUI {

    public HelloWorldGUI() {
        // Create the main frame (window)
        JFrame frame = new JFrame("Hello World GUI");
        frame.setSize(500, 600);  // Window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(new FlowLayout());

        // Creating label that will display the text
        JLabel label = new JLabel("Click the button below to say Hello World");
        frame.add(label); 

        // Creating a button that will change the label's text
        JButton button = new JButton("Say Hello");
        frame.add(button);  

        // Set up button action listener 
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello World!");  
                button.setVisible(false);  

                frame.revalidate();
                frame.repaint();
            }
        });

        // Frame visibility
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HelloWorldGUI());
    }
}
