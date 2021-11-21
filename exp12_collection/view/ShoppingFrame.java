package exp12_collection.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

import exp12_collection.dao.*;
import exp12_collection.entity.*;

public class ShoppingFrame extends JFrame {
    private JLabel l_id, l_num;
    private JTextField t_id, t_num;
    private JButton b_add;
    private ShoppingCart shoppingCart;
    private BookDao bd = new BookDaoImpl();

    public ShoppingFrame(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
        this.setTitle("添加到购物车");
        this.setSize(300, 200);
        this.setResizable(false);
        this.setLocation(800, 400);
        init();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    private void init() {
        this.setLayout(new GridLayout(3, 2, 5, 5));
        l_id = new JLabel("书籍编号：", JLabel.CENTER);
        l_num = new JLabel("数量：", JLabel.CENTER);
        t_id = new JTextField();
        t_num = new JTextField();
        b_add = new JButton("添加");

        this.add(l_id);
        this.add(t_id);
        this.add(l_num);
        this.add(t_num);
        this.add(new JLabel());
        this.add(b_add);

        b_add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String id = t_id.getText();
                List<Book> books = bd.queryBooks();
                for (Book book : books) {
                    if (book.getBid().equals(id)) {

                        String numsString = t_num.getText();
                        int num = 0;
                        try {
                            num = Integer.parseInt(numsString);
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(b_add, "数量必须为数字", "错误提示", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // 判断map中是否已经存在这本书
                        if (shoppingCart.containsKey(id)) {
                            // key存在
                            Integer value = shoppingCart.get(id);
                            shoppingCart.put(id, value + num);
                        } else {
                            // key不存在
                            shoppingCart.put(id, num);
                        }
                        JOptionPane.showMessageDialog(b_add, "添加成功", "提示", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
                JOptionPane.showMessageDialog(b_add, "书籍不存在", "错误提示", JOptionPane.ERROR_MESSAGE);

            }

        });
    }

}
