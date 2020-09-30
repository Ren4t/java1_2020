package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {
    private static final int SIZE = 3;

    static class Form1 extends JFrame {

        public Form1(){
            setTitle("Test Window");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(300,300,105*SIZE,115*SIZE);

            Button[] buttons = new Button[SIZE * SIZE];
            for(int i = 0; i < SIZE; i++ ){
                for (int j = 0; j < SIZE; j ++) {
                    buttons[SIZE*i+j] = new Button("*");
                    buttons[SIZE*i+j].setBounds(100*i,100*j,100,100);
                }
            }
            setLayout(null);
            for (Button button : buttons) {
                add(button);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("x");
                        button.setLabel("X");
                    }
                });
            }
            setVisible(true);
        }

    }

    public static void main(String[] args) {
        //new Form1();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Form1();
            }
        });
    }
}
