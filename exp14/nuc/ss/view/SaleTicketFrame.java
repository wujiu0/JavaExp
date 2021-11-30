package exp14.nuc.ss.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.Timer;

import exp14.nuc.ss.entity.Ticket;

public class SaleTicketFrame extends JFrame {
    private static Ticket t = new Ticket();
    private JLabel l_img, l1, l2, l3;
    private JButton b_buy;
    private String infoString = "";

    public SaleTicketFrame() {
        this.setTitle("售票界面");
        this.setSize(800, 500);
        this.setResizable(true);
        this.setLocation(1100, 400);
        init();
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // 这种方法会过多的占用系统资源，改用javax.swing.Timer
        // while (true) {
        // l2.setText("目前还剩票数：" + Ticket.getNum() + "张 ");
        // }
    }

    private void init() {
        this.setLayout(new GridLayout(3, 1, 5, 5));
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        ImageIcon img = new ImageIcon("src\\exp14\\img2.png");
        l_img = new JLabel(img);
        l1 = new JLabel("您好，请问您要买票吗");
        JSeparator separator = new JSeparator();
        l2 = new JLabel("目前还剩票数：" + Ticket.getNum() + "张              ");
        b_buy = new JButton("购票，请点击");
        l3 = new JLabel();

        p1.add(l_img);
        l_img.setBounds(200, 10, 80, 80);
        p1.add(l1);
        l1.setBounds(350, 25, 750, 30);
        p1.add(separator);
        separator.setBounds(10, 100, 750, 10);
        p2.add(l2);
        p2.add(b_buy);
        Random random = new Random();
        int r, g, b;
        r = random.nextInt(255);
        g = random.nextInt(255);
        b = random.nextInt(255);
        p3.setBackground(new Color(r, g, b));
        p3.add(l3);
        this.add(p1);
        this.add(p2);
        this.add(p3);

        // 添加一个计时器，开启后，每1秒执行一遍实现的actionPerformed()
        new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l2.setText("目前还剩票数：" + Ticket.getNum() + "张              ");
            }
        }).start();

        b_buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buy();
                l3.setText(infoString);
            }
        });
    }

    private void buy() {
        synchronized (t) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (Ticket.getNum() > 0) {
                infoString = "购票成功，座位号是：" + Ticket.getNum();
                t.sale();
            } else {
                infoString = "抱歉，票已卖完";
            }
        }
    }


}
