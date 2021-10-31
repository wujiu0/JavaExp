package exp10.content1;

public class CircleBottomCreator extends BottomCreator {

    @Override
    public GeometryBottom getBottom(double... args) {
        if (args.length != 1) {
            throw new RuntimeException("制造圆需要一个参数：半径！");
        }
        return new CircleBottom(args[0]);
    }

}
