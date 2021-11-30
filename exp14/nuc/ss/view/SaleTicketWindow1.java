package exp14.nuc.ss.view;

import exp14.nuc.ss.entity.Ticket;

public class SaleTicketWindow1 implements Runnable {
    private Ticket t;

    public SaleTicketWindow1(Ticket t) {
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
            synchronized (t) {
                if (Ticket.getNum() > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + Ticket.getNum() + "票");
                    // System.out.println(Thread.currentThread().getName() + "正在卖第" +
                    // Ticket.getNum() + "票");
                    t.sale();
                } else {
                    System.out.println("票已卖完");
                    break;
                }
            }

        }
    }

}
