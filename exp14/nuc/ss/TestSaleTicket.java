package exp14.nuc.ss;

import exp14.nuc.ss.entity.Ticket;
import exp14.nuc.ss.view.SaleTicketWindow;
import exp14.nuc.ss.view.SaleTicketWindow1;

/*
    模拟多窗口卖票
*/
public class TestSaleTicket {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        SaleTicketWindow stw1 = new SaleTicketWindow(t, "中北窗口");
        stw1.start();
        SaleTicketWindow stw2 = new SaleTicketWindow(t, "北大窗口");
        stw2.start();
        SaleTicketWindow stw3 = new SaleTicketWindow(t, "车站窗口");
        stw3.start();

        Thread w4 = new Thread(new SaleTicketWindow1(t));

        w4.setName("Runnable窗口");
        // w4.start();

    }
}
