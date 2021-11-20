package exp04;

import java.util.Scanner;

public class Tuple {

    float[] v;
    int N; // 元素个数

    public Tuple() {
    }

    // 创建N元组
    public Tuple(float... v) {
        N = v.length;
        for (int i = 0; i < N; i++) {
            this.v[i] = v[i];
        }
    }

    public void init(int N) {
        this.N = N;
        v = new float[N];
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别输入" + N + "个实数：");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextFloat();
        }
        // sc.close();
    }

    // 取分量
    public float get(int num) {
        if (num >= 1 && num <= N) {
            return v[num - 1];
        } else {
            System.out.println("请输入1~" + N + "的数字");
            return 0;
        }
    }

    // 置分量
    public void set(int num, float value) {
        if (num >= 1 && num <= N) {
            v[num - 1] = value;
        } else {
            System.out.println("请输入1~" + N + "的数字");
        }
    }

    // 最大值
    public float getMax() {
        float max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (max < v[i]) {
                max = v[i];
            }
        }
        return max;
    }

    // 最小值
    public float getMin() {
        float min = v[0];
        for (int i = 0; i < v.length; i++) {
            if (min > v[i]) {
                min = v[i];
            }
        }
        return min;
    }

    // 显示N元组
    public void show() {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    // 销毁三元组
    public static void destory(Tuple t) {
        t = null;
    }
}
