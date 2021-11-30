package exp14.nuc.ss.entity;

/**
 * @author sdz
 * 
 * @description 卖票程序中描述票的类
 * 
 */
public class Ticket {
    private static int num = 30;
    
    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Ticket.num = num;
    }

    // 卖票
    public void sale() {
        num--;
    }

}
