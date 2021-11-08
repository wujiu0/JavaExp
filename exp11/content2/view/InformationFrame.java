package exp11.content2.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class InformationFrame extends JFrame {
    private JTable jTable;

    public InformationFrame(String[][] data) {
        setSize(600, 400);
        setLocation(750, 300);
        setTitle("用户信息");
        init(data);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init(String[][] data) {
        String[] colunmName = { "用户名", "姓名", "密码", "性别", "城市" };
        jTable = new JTable(data, colunmName);
        this.add(new JScrollPane(jTable));
        // this.add(jTable);
    }

}
