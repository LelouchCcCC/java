package com.tencent.uiDesign;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;

public class GameJFrame extends JFrame implements ActionListener {
    JLabel jl = new JLabel("shuaima?");
    JButton up = new JButton("shuai!");
    JButton mid = new JButton("yibanban");
    JButton down = new JButton("bu");
    public GameJFrame(){

        initJFrame();

        //element
        initialaize();
        this.setVisible(true);
    }

    private void initialaize() {
//        JMenuBar jb = new JMenuBar();


        jl.setBounds(100,100,200,100);
        up.setBounds(200,250,100,30);
        mid.setBounds(200,325,100,30);
        down.setBounds(200,400,100,30);


        up.addActionListener(this);
        mid.addActionListener(this);
        down.addActionListener(this);

        this.getContentPane().add(jl);
        this.getContentPane().add(up);
        this.getContentPane().add(mid);
        this.getContentPane().add(down);


    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setDefaultCloseOperation(3);
        this.setTitle("Game Main Window");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj==up){
//            showJDialog("")
        }
    }
}
