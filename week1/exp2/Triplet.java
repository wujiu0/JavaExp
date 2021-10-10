package week1.exp2;

public class Triplet {
    float[] v = new float[3];

    public Triplet() {
    }

    // 创建三元组
    public Triplet(float v0, float v1, float v2) {
        v[0] = v0;
        v[1] = v1;
        v[2] = v2;
    }

    public void init(float v1, float v2, float v3) {
        v[0] = v1;
        v[1] = v2;
        v[2] = v3;
    }

    // 取分量
    public float get(int num) {
        if (num >= 1 && num <= 3) {
            return v[num - 1];
        } else {
            System.out.println("请输入1~3的数字");
            return 0;
        }
    }

    // 置分量
    public void set(int num, float value) {
        if (num >= 1 && num <= 3) {
            v[num - 1] = value;
        } else {
            System.out.println("请输入1~3的数字");
        }
    }

    // 最大值
    public float getMax() {
        float max;
        max = v[0] > v[1] ? v[0] : v[1];
        max = max > v[2] ? max : v[2];
        return max;
    }

    // 最小值
    public float getMin() {
        float min;
        min = v[0] < v[1] ? v[0] : v[1];
        min = min < v[2] ? min : v[2];
        return min;
    }

    // 显示三元组
    public void show() {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    // 销毁三元组
    public static void destory(Triplet t) {
        t = null;
    }
}
