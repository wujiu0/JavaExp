package exp13.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

import exp13.dao.*;
import exp13.db.UserDataSet;
import exp13.entity.*;

public class ShoppingFrame extends JFrame {
    private JLabel l_id, l_num;
    private JTextField t_id, t_num;
    private JButton b_add, b_remove;
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
        b_remove = new JButton("移除");

        this.add(l_id);
        this.add(t_id);
        this.add(l_num);
        this.add(t_num);
        this.add(b_add);
        this.add(b_remove);

        b_add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String id = t_id.getText();
                List<Book> books = bd.getBooks();
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

                        if (num > book.getNumber()) {
                            JOptionPane.showMessageDialog(b_add, "库存不足", "提示", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        // 库存充足，减去添加到购物车的数量
                        book.setNumber(book.getNumber() - num);

                        // 判断购物车中是否已经存在这本书
                        if (shoppingCart.containsKey(id)) {
                            // 若key存在，num加上已有的数量作为新的购物车内商品数量
                            Integer value = shoppingCart.get(id);
                            num += value;
                        }
                        shoppingCart.put(id, num);
                        JOptionPane.showMessageDialog(b_add, "添加成功", "提示", JOptionPane.INFORMATION_MESSAGE);
                        UserDataSet.saveData();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(b_add, "书籍不存在", "错误提示", JOptionPane.ERROR_MESSAGE);

            }

        });
        b_remove.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String id = t_id.getText();
                Book book = bd.queryById(id);
                String numsString = t_num.getText();
                int num = 0;
                try {
                    num = Integer.parseInt(numsString);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(b_remove, "数量必须为数字", "错误提示", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Integer value = shoppingCart.get(id);
                if (num > value) {
                    JOptionPane.showMessageDialog(b_remove, "超出购物车商品数量", "提示", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                shoppingCart.put(id, value - num);
                book.setNumber(book.getNumber() + num);

                if (shoppingCart.get(id) == 0) {
                    shoppingCart.remove(id);
                }
                JOptionPane.showMessageDialog(b_remove, "移除成功", "提示", JOptionPane.INFORMATION_MESSAGE);
                UserDataSet.saveData();
                return;
            }

        });

    }

}
