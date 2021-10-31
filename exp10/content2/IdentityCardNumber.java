package exp10.content2;

public class IdentityCardNumber {
    private static IdentityCardNumber instance = new IdentityCardNumber();
    private String number = "140103199008168359";

    private IdentityCardNumber() {
    }

    public static IdentityCardNumber getInstance() {
        return instance;
    }

    public String getNumber() {
        return number;
    }
}
