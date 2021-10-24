package week6.exp9.content1;

public class MobilePhoneShop {
    private int mobilePhoneAmount;// 手机库存量
    private double mobilePhonePrice;// 手机市场价
    private InHouseConpons ihc1;// 购物券1
    private InHouseConpons ihc2;// 购物券2

    
    public MobilePhoneShop() {
    }

    public int getMobilePhoneAmount() {
        return mobilePhoneAmount;
    }

    public void setMobilePhoneAmount(int mobilePhoneAmount) {
        this.mobilePhoneAmount = mobilePhoneAmount;
    }

    public double getMobilePhonePrice() {
        return mobilePhonePrice;
    }

    public void setMobilePhonePrice(double mobilePhonePrice) {
        this.mobilePhonePrice = mobilePhonePrice;
    }

    public InHouseConpons getIhc1() {
        return ihc1;
    }

    public InHouseConpons getIhc2() {
        return ihc2;
    }

    public MobilePhoneShop(int mobilePhoneAmount, double mobilePhonePrice) {
        this.mobilePhoneAmount = mobilePhoneAmount;
        this.mobilePhonePrice = mobilePhonePrice;

        // IdGenerator idGenerator = new IdGenerator();
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(idGenerator.getNextId());
        // }

        ihc1 = new InHouseConpons(new IdGenerator().getNextId(), 10000);
        ihc2 = new InHouseConpons(new IdGenerator().getNextId(), 20000);
        // System.out.println(ihc1);
        // System.out.println(ihc2);
    }

    class InHouseConpons {
        private int id;// 购物券编号
        private double moneyValue;// 购物券价值

        public InHouseConpons(int id, double moneyValue) {
            this.id = id;
            this.moneyValue = moneyValue;
        }

        public void buyMobilePhone() {
            /*
             * 根据内部购物券的价值和手机市场价计算可以购买的手机数量，根据计算结果，输出有关信息,当内部购物券的价值足够时，输出如下格式的信息： 恭喜！您用价值为
             * xxx的内部购物券(编号：xxx )购买了xxx部手机！ 当内部购物券的价值不足时，输出如下格式的信息： 对不起！您的购物券(编号：xxx)价值不足！
             */

            int num = (int) (this.moneyValue / MobilePhoneShop.this.mobilePhonePrice);
            if (num > 0) {
                mobilePhoneAmount -= num;
                System.out.println("恭喜！您用" + this.toString() + "购买了" + num + "部手机！");
            } else {
                System.out.println("对不起！您的购物券（编号：" + id + "）价值不足");
            }
        }

        @Override
        public String toString() {
            return "价值为" + moneyValue + "的内部购物券（编号：" + id + "）";
        }

    }
}
