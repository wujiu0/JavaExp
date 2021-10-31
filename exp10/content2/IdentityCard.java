package exp10.content2;

import java.time.LocalDate;

public class IdentityCard {
    private String name;
    private String sex;
    private String ethnicity;
    private LocalDate birthday;
    private String address;
    private IdentityCardNumber identityCardNumber;

    public IdentityCard(String name, String sex, String ethnicity, LocalDate birthday, String address) {
        this.name = name;
        this.sex = sex;
        this.ethnicity = ethnicity;
        this.birthday = birthday;
        this.address = address;
        this.identityCardNumber = IdentityCardNumber.getInstance();
    }

    @Override
    public String toString() {
        return "姓名：" + name + ", 性别：" + sex + ", 民族：" + ethnicity + "\n出生日期：" + birthday + "\n身份证号："
                + identityCardNumber.getNumber() + "\n住址：" + address;
    }

}
