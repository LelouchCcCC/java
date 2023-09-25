package com.tencent.ui;
import java.util.Random;
import javax.swing.*;

public class GameJFrame extends JFrame {
    int[][] data = new int[4][4];
    public GameJFrame() {
        initJFrame();

        //initialize the menu
        initialize();
        initdata();
        initImage();


        this.setVisible(true);
    }

    private void initdata() {
        int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        Random rd = new Random();
        for (int i=0;i<arr.length;i++){
            int index = rd.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i=0;i<arr.length;i++){
            data[i/4][i%4] = arr[i];
        }
    }

    private void initImage() {
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                int number = data[i][j];
                JLabel label = new JLabel(new ImageIcon("D:\\java\\base\\puzzlegame\\image\\animal\\animal3\\"+number+".jpg"));
                label.setBounds(105*j,105*i,105,105);
                this.getContentPane().add(label);
                number++;
            }
        }



//        this.add(label);
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
        this.setSize(603, 680);
        this.setDefaultCloseOperation(3);
        this.setTitle("Game Main Window");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }
}
