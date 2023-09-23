package com.tencent.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        initJFrame();

        //initialize the menu
        initialize();


        this.setVisible(true);
    }

    private void initialize() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("function");
        JMenu aboutJMenu = new JMenu("about");

        JMenuItem replayItem = new JMenuItem("reload");
        JMenuItem reLoginItem = new JMenuItem("relogin");
        JMenuItem closeItem = new JMenuItem("close");
        JMenuItem accountItem = new JMenuItem("account");

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }


    private void initJFrame() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(3);
        this.setTitle("Game Main Window");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
    }
}
