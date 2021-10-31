package exp10.content2;

import java.time.LocalDate;

public class TestIdentityCard {
    public static void main(String[] args) {

        System.out.println("第一次办理身份证：");
        IdentityCard iCard1 = new IdentityCard("王小源", "男", "汉", LocalDate.of(2000, 5, 21), "山西省太原市尖草坪区学院路三号9号宿舍楼808");
        System.out.println(iCard1);
        
        System.out.println("===========");
        System.out.println("补办身份证");
        IdentityCard iCard2 = new IdentityCard("王小源", "男", "汉", LocalDate.of(1999, 12, 18), "山西省太原市尖草坪区学院路三号9号宿舍楼808");
        System.out.println(iCard2);

    }
}
