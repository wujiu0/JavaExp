package exp09.content1;

public class TestInHouseCoupons {
    public static void main(String[] args) {
        MobilePhoneShop mobileShop = new MobilePhoneShop(100, 3500);
        System.out.println("现在手机专卖店有" + mobileShop.getMobilePhoneAmount() + "部手机，每部手机市场价为"
                + mobileShop.getMobilePhonePrice() + "元。");

        MobilePhoneShop.InHouseConpons ihc1 = mobileShop.getIhc1();
        MobilePhoneShop.InHouseConpons ihc2 = mobileShop.getIhc2();

        ihc1.buyMobilePhone();
        System.out.println("现在手机专卖店还有" + mobileShop.getMobilePhoneAmount() + "部手机");
        ihc2.buyMobilePhone();
        System.out.println("现在手机专卖店还有" + mobileShop.getMobilePhoneAmount() + "部手机");

    }
}
