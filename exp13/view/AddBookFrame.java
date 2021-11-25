package exp13.view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import exp13.dao.*;
import exp13.entity.*;

public class AddBookFrame extends JFrame {
    private JLabel l_id, l_name, l_author, l_number, l_category;
    private JTextField t_id, t_name, t_author, t_number, t_category_first, t_category_second;
    private JPanel category;
    private JButton b_add;

    public AddBookFrame() {
        this.setTitle("添加书籍");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setLocation(800, 400);
        init();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        this.setLayout(new GridLayout(6, 2, 5, 5));
        l_id = new JLabel("书籍编号：", JLabel.CENTER);
        l_name = new JLabel("书籍名：", JLabel.CENTER);
        l_author = new JLabel("作者：", JLabel.CENTER);
        l_number = new JLabel("数量：", JLabel.CENTER);
        l_category = new JLabel("分类：", JLabel.CENTER);
        t_id = new JTextField();
        t_name = new JTextField();
        t_author = new JTextField();
        t_number = new JTextField();
        category = new JPanel();
        t_category_first = new JTextField("一级类目", 7);
        t_category_first.setPreferredSize(new Dimension(0, 40));
        t_category_second = new JTextField("二级类目", 7);
        t_category_second.setPreferredSize(new Dimension(0, 40));
        b_add = new JButton("添加");

        this.add(l_id);
        this.add(t_id);
        this.add(l_name);
        this.add(t_name);
        this.add(l_author);
        this.add(t_author);
        this.add(l_number);
        this.add(t_number);
        this.add(l_category);
        category.add(t_category_first);
        category.add(new JLabel(">"));
        category.add(t_category_second);
        this.add(category);
        this.add(new JLabel());
        this.add(b_add);

        b_add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String bid = t_id.getText();
                String name = t_name.getText();
                String author = t_author.getText();
                int number = Integer.parseInt(t_number.getText());
                String firstLevel = t_category_first.getText();
                String secondLevel = t_category_second.getText();
                Category category = new Category(firstLevel, secondLevel);
                Book book = new Book(bid, name, author, number, category);
                BookDao bd = new BookDaoImpl();
                bd.addBook(book);
                // for (Book booki : bd.queryBooks()) {
                // System.out.println(booki);
                // }
                JOptionPane.showMessageDialog(b_add, "添加成功", "提示", JOptionPane.INFORMATION_MESSAGE);

            }

        });
    }

}
