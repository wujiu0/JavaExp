package exp14.nuc.ss.view;

import exp14.nuc.ss.entity.Ticket;

public class SaleTicketWindow extends Thread {
    private Ticket t;

    public SaleTicketWindow() {
    }

    public SaleTicketWindow(Ticket t, String name) {
        super(name);
        this.t = t;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(t){
                if (Ticket.getNum() > 0) {
                    System.out.println(this.getName() + "正在卖第" + Ticket.getNum() + "票");
                    // System.out.println(Thread.currentThread().getName() + "正在卖第" + Ticket.getNum() + "票");
                    t.sale();
                } else {
                    System.out.println("票已卖完");
                    break;
                }
            }

        }
    }
}
