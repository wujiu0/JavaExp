package exp5;

public class Bottle {
    Pillar upperPart;// 上半部分柱
    Ball lowerPart;// 下半部分球

    public Bottle(Pillar upperPart, Ball lowerPart) {
        this.upperPart = upperPart;
        this.lowerPart = lowerPart;
    }

    public double getVolume() {
        return upperPart.getVolume() + lowerPart.getVolume();
    }

}
