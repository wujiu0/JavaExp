package exp13.view;

import java.util.Set;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import exp13.db.UserDataSet;
import exp13.entity.User;

public class RegisterFrame extends JFrame {
    private JLabel l_id, l_name, l_password, l_repassword, l_sex, l_city;
    private JTextField t_id, t_name;
    private JPasswordField t_password, t_repassword;
    private JRadioButton r_sex1, r_sex2;
    private JComboBox<String> c_city;
    private JButton b_register, b_reset;

    public RegisterFrame() {
        setSize(400, 500);
        setLocation(750, 300);
        setTitle("注册页面");
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    private void init() {
        setLayout(new GridLayout(7, 2, 5, 5));

        l_id = new JLabel("账号", JLabel.CENTER);
        l_name = new JLabel("姓名", JLabel.CENTER);
        l_password = new JLabel("密码", JLabel.CENTER);
        l_repassword = new JLabel("确认密码", JLabel.CENTER);
        l_sex = new JLabel("性别", JLabel.CENTER);
        l_city = new JLabel("城市", JLabel.CENTER);

        t_id = new JTextField();
        t_name = new JTextField();
        t_password = new JPasswordField();
        t_repassword = new JPasswordField();

        r_sex1 = new JRadioButton("男", true);
        r_sex2 = new JRadioButton("女");
        ButtonGroup bg_sex = new ButtonGroup();
        bg_sex.add(r_sex1);
        bg_sex.add(r_sex2);
        c_city = new JComboBox<>();
        c_city.addItem("山西");
        c_city.addItem("北京");
        c_city.addItem("上海");
        c_city.addItem("天津");
        c_city.addItem("重庆");
        b_register = new JButton("注册");
        b_reset = new JButton("重置");

        add(l_id);
        add(t_id);
        add(l_name);
        add(t_name);
        add(l_password);
        add(t_password);
        add(l_repassword);
        add(t_repassword);
        add(l_sex);
        add(new JPanel() {
            {
                setLayout(new GridLayout(1, 2, 5, 5));
                add(r_sex1);
                add(r_sex2);
            }

        });
        add(l_city);
        add(c_city);
        add(b_register);
        add(b_reset);
        b_register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = t_id.getText();
                String name = t_name.getText();
                String password = new String(t_password.getPassword());
                String rePassword = new String(t_repassword.getPassword());
                String sex = "";
                if (r_sex1.isSelected()) {
                    sex = "男";
                } else if (r_sex2.isSelected()) {
                    sex = "女";
                }
                String city = (String) c_city.getSelectedItem();

                // 判断输入是否为空
                if (isEmpty(id, name, password, rePassword)) {
                    return;
                }

                register(id, name, password, rePassword, sex, city);
            }
        });
        b_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t_id.setText("");
                t_name.setText("");
                t_password.setText("");
                t_repassword.setText("");
            }
        });
    }

    private boolean isEmpty(String id, String name, String password, String rePassword) {
        if (id.equals("")) {
            JOptionPane.showMessageDialog(t_id, "账号不能为空", "错误提示", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        if (name.equals("")) {
            JOptionPane.showMessageDialog(t_id, "姓名不能为空", "错误提示", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        if (password.equals("") || rePassword.equals("")) {
            JOptionPane.showMessageDialog(t_password, "密码不能为空", "错误提示", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    private void register(String id, String name, String password, String rePassword, String sex, String city) {

        // 获取数据库中已存在的用户
        Set<User> users = UserDataSet.getUsers();

        // 判断用户是否已经存在
        for (User user : users) {
            if (user.getId().equals(id)) {
                JOptionPane.showMessageDialog(t_id, "该用户已存在", "错误提示", JOptionPane.WARNING_MESSAGE);
                t_id.setText("");
                return;
            }
        }

        // 两次密码不一致的处理
        if (!password.equals(rePassword)) {
            JOptionPane.showMessageDialog(t_repassword, "两次密码不一致", "错误提示", JOptionPane.WARNING_MESSAGE);
            t_password.setText("");
            t_repassword.setText("");
            return;
        }
        User user = new User(id, name, password, sex, city, "普通用户");
        UserDataSet.addUser(user);
        JOptionPane.showMessageDialog(null, "注册成功", "提示", JOptionPane.INFORMATION_MESSAGE);
    }
}
