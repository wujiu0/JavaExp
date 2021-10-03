package week3.exp5;

public class Ball {
    private Circle bottom;

    public Ball(Circle bottom) {
        this.bottom = bottom;
    }

    public double getVolume() {
        return 4.0/ 3.0 * Math.PI * Math.pow(bottom.getR(), 3);

        // return Math.PI * Math.pow(bottom.getR(), 3) * 4 / 3;

        // return 4 / 3 * Math.PI * Math.pow(bottom.getR(), 3);//首先计算4/3的结果是整型1，会使得结果出错
    }

}
