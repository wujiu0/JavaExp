package exp09.content4;

public class CartyException extends RuntimeException {

    public CartyException() {
        super("您要购买的商品数量不足");
    }

}
