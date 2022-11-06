package Instrument.Midi;

import javax.swing.*;
import java.awt.event.*;

public class Display implements ActionListener {
    private JButton button;

    public static void main(String[] args ) {
        Display display = new Display();
        display.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        button.setText("I've been clicked");
    }
}
