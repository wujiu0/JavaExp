package exp11.content2.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginFrame extends JFrame {
    private JPanel p1, p2;
    private JLabel l_userName, l_userType, l_password;
    private JTextField t_userName, t_password;
    private JComboBox<String> c_userType;
    private JButton b_login, b_reset, b_register;

    public LoginFrame() {
        setSize(300, 200);
        setLocation(800, 400);
        setTitle("登录注册窗体");
        setResizable(false);// 设置窗口大小不可变
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 设置用户在此窗体上发起 "close" 时默认执行的操作

    }

    private void init() {
        // this.setLayout(new GridLayout(2, 1, 5, 5));
        this.setLayout(new FlowLayout());
        p1 = new JPanel();
        p2 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p2.setLayout(/* null */new GridLayout(1, 3, 5, 5));

        l_userName = new JLabel("用户名", JLabel.CENTER);
        l_userType = new JLabel("用户类型", JLabel.CENTER);
        l_password = new JLabel("密码", JLabel.CENTER);
        t_userName = new JTextField();
        t_password = new JTextField();
        c_userType = new JComboBox<String>();
        c_userType.addItem("管理员");
        c_userType.addItem("普通用户");
        b_login = new JButton("登录");
        b_login.setSize(100, 100);
        b_reset = new JButton("重置");
        b_register = new JButton("点我注册");

        p1.add(l_userName);
        p1.add(t_userName);
        p1.add(l_userType);
        p1.add(c_userType);
        p1.add(l_password);
        p1.add(t_password);

        p2.add(b_login);
        p2.add(b_reset);
        p2.add(b_register);
        b_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        b_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t_userName.setText("");
                t_password.setText("");
            }
        });
        b_register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegisterFrame();
            }
        });
        this.add(p1);
        this.add(p2);
        setVisible(true);
    }

    public void login() {
        new QueryFrame();
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
