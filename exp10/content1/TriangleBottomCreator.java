package exp10.content1;

public class TriangleBottomCreator extends BottomCreator{

    @Override
    public GeometryBottom getBottom(double... args) {
        if(args.length!=2){
            throw new RuntimeException("制造三角形需要两个参数：底边，高");
        }
        return new TriangleBottom(args[0], args[1]);
    }
    
}
