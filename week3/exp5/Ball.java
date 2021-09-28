package week3.exp5;

public class Ball {
    private Circle bottom;

    public Ball(Circle bottom) {
        this.bottom = bottom;
    }

    public double getVolumn() {
        return 4.0/ 3.0 * Math.PI * Math.pow(bottom.getR(), 3);

        // return Math.PI * Math.pow(bottom.getR(), 3) * 4 / 3;

        // return 1.33 * Math.PI * Math.pow(bottom.getR(), 3);
    }

    // public double getVolumn() {
    // double result = Math.PI * Math.pow(bottom.getR(), 3);

    // // return 4 / 3 * result;

    // return result * 4 / 3;
    // }
}
