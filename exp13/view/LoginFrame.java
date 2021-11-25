package exp13.view;

import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import java.util.Set;

import javax.swing.*;

import exp13.db.*;
import exp13.entity.User;

public class LoginFrame extends JFrame {
    private JPanel p1, p2;
    private JLabel l_userName, l_userType, l_password;
    private JTextField t_userName;
    private JPasswordField t_password;
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
        t_password = new JPasswordField();
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
                String userName = t_userName.getText();
                String password =new String(t_password.getPassword());
                String userType = c_userType.getSelectedItem().toString();
                login(userName, password, userType);
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

    public void login(String username, String password, String userType) {
        if (username.equals("")) {
            JOptionPane.showMessageDialog(t_userName, "用户名不能为空", "错误提示", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (password.equals("")) {
            JOptionPane.showMessageDialog(t_password, "密码不能为空", "错误提示", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Set<User> users = UserDataSet.getUsers();
        Iterator<User> it = users.iterator();
        while (it.hasNext()) {
            User user = it.next();

            if (!(user.getId().equals(username) && user.getPassword().equals(password))) {
                continue;
            }
            
            if (!(userType.equals(user.getUserType()))) {
                JOptionPane.showMessageDialog(c_userType, "身份选择错误", "错误提示", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if (userType.equals("管理员")) {
                new QueryFrame(user);
                return;
            } else {
                new QueryFrame(user);
                return;
            }
        }
        t_userName.setText("");
        t_password.setText("");
        JOptionPane.showMessageDialog(t_userName, "用户名或密码错误", "错误提示", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
