package exp11.content2.view;

import java.awt.*;
import javax.swing.*;

import exp11.content2.dao.*;
import exp11.content2.entity.*;

public class QueryFrame extends JFrame {
    private JLabel l_welcome, l_city;
    private JLabel l_bName, l_category;
    private JTextField t_bName;
    private JComboBox<String> c_category;
    private JButton b_query, b_buy;
    private JTable jTable;
    private JLabel l_cart;
    private JSeparator sep;

    public QueryFrame() {
        this.setTitle("商品查询页面");
        this.setSize(800, 500);
        this.setResizable(false);
        this.setLocation(800, 600);
        init();
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        // this.setLayout(new GridLayout(3, 1, 5, 5));
        this.setLayout(null);
        JPanel p1 = new JPanel(new GridLayout(1, 2));

        String[][] data = new String[4][5];

        BookDao bd = new BookDaoImpl();
        Book[] books = bd.queryBooks();

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                data[i][0] = books[i].getBid();
                data[i][1] = books[i].getName();
                data[i][2] = books[i].getAuthor();
                data[i][3] = books[i].getNumber() + "";
                data[i][4] = books[i].getCategory().toString();
            }
        }

        String[] columnNames = { "书籍编号", "书籍名称", "书籍作者", "库存", "书籍分类" };
        l_welcome = new JLabel("您好,", JLabel.LEFT);
        l_city = new JLabel("来自于：    ", JLabel.RIGHT);
        l_bName = new JLabel("书籍名：");
        t_bName = new JTextField();
        l_category = new JLabel("分类：");
        c_category = new JComboBox<>();
        c_category.addItem("-请选择-");
        c_category.addItem("工具类 > 软件编程");
        c_category.addItem("小说类 > 历史");
        b_query = new JButton("查询");
        jTable = new JTable(data, columnNames);

        l_cart = new JLabel("购物车商品数：0件");
        b_buy = new JButton("购买");

        sep = new JSeparator();

        p1.add(l_welcome);
        p1.add(l_city);
        this.add(p1);
        p1.setBounds(10, 10, 650, 30);
        this.add(sep);
        sep.setBounds(10, 40, 750, 10);
        this.add(l_bName);
        l_bName.setBounds(10, 60, 50, 30);
        this.add(t_bName);
        t_bName.setBounds(60, 60, 200, 30);
        this.add(l_category);
        l_category.setBounds(300, 60, 50, 30);
        this.add(c_category);
        c_category.setBounds(350, 60, 200, 30);
        this.add(b_query);
        b_query.setBounds(600, 60, 100, 30);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        this.add(jScrollPane);
        jScrollPane.setBounds(10, 110, 750, 250);
        this.add(l_cart);
        l_cart.setBounds(10, 400, 750, 30);
        this.add(b_buy);
        b_buy.setBounds(600, 400, 100, 30);
    }
}
