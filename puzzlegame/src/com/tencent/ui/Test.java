package com.tencent.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame implements ActionListener{
    static JButton jtb1 = new JButton("anj");
    static JButton jtb2 = new JButton("anj222");
    public Test() {
        JFrame jf = new JFrame();
        jf.setSize(603,680);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

        jtb1.setBounds(0,0,100,200);
        jtb2.setBounds(150,0,100,200);
        jtb1.addActionListener(this);
        jtb2.addActionListener(this);
        jf.getContentPane().add(jtb1);
        jf.getContentPane().add(jtb2);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (source==jtb1){
            jtb1.setBounds(100,100,100,200);
        }
        else if (source==jtb2){
            jtb2.setBounds(100,100,100,200);
        }
    }

}
