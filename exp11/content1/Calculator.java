package exp11.content1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author sdz
 * @description 完成一个可以完成加减乘除的简易计算器（图形用户界面）
 */
public class Calculator extends JFrame {
    JTextField t_num1, t_op, t_num2, t_result;
    JLabel l_num1, l_op, l_num2, l_result;
    JButton b_cal, b_reset;

    public Calculator() {
        setSize(500, 450);
        setLocation(700, 400);
        setTitle("简易计算器");
        setResizable(false);// 设置窗口大小不可变
        init();
        /**
         * 设置可见如果放在创建组件之前，会导致组件不可见 但是改变窗体大小会自动刷新窗体，所以使得组件可见
         */
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 设置用户在此窗体上发起 "close" 时默认执行的操作
    }

    public void init() {
        setLayout(new GridLayout(5, 2, 5, 5));

        l_num1 = new JLabel("操作数1：", JLabel.CENTER);
        l_op = new JLabel("操作符：", JLabel.CENTER);
        l_num2 = new JLabel("操作数2：", JLabel.CENTER);
        l_result = new JLabel("运算结果：", JLabel.CENTER);
        t_num1 = new JTextField();
        t_op = new JTextField();
        t_num2 = new JTextField();
        t_result = new JTextField();
        b_cal = new JButton("计算");
        b_reset = new JButton("重置");
        add(l_num1);
        add(t_num1);
        add(l_op);
        add(t_op);
        add(l_num2);
        add(t_num2);
        add(l_result);
        add(t_result);
        add(b_cal);
        add(b_reset);
        b_cal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnClick();// 处理运算方法
            }
        });
        b_reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnReset();// 清空
            }
        });

    }

    public void btnReset() {
        t_num1.setText("");
        t_op.setText("");
        t_num2.setText("");
        t_result.setText("");
    }

    public void btnClick() {
        double num1 = Double.parseDouble(t_num1.getText());
        char operator = (t_op.getText().charAt(0));
        double num2 = Double.parseDouble(t_num2.getText().trim());
        switch (operator) {
        case '+':
            t_result.setText("" + (num1 + num2));
            break;
        case '-':
            t_result.setText("" + (num1 - num2));
            break;
        case '*':
            t_result.setText("" + (num1 * num2));
            break;
        case '/':
            t_result.setText("" + (num1 / num2));
            break;
        default:
            JOptionPane.showMessageDialog(t_result, "您输入了非法的运算符", "错误提示", JOptionPane.WARNING_MESSAGE);
            t_op.setText("");
        }

    }
}
