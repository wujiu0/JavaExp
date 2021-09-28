package week3.exp5;

import java.util.Arrays;

public class MyArrayList {
    String[] data;
    int size;// 长度
    int CAPACITY;// 容量

    // 初始化线性表
    public void init() {
        data = new String[10];
        size = 0;
        CAPACITY = data.length;
    }

    // 插入元素
    public void insertElem(int position, String str) {
        if (position < 1 || position >= size) {
            System.out.println("插入位置不合法");
            return;
        }
        if (size >= CAPACITY) {
            data = Arrays.copyOf(data, CAPACITY + 10);
            CAPACITY += 10;
        }
        int j = size - 1;
        while (j >= position) {
            data[j] = data[j - 1];// 插入位置及之后的元素右移
            j--;
        }
        data[j] = str;
        size++;
    }

    // 查找
    public int search(String str) {
        for (int i = 0; i < size; i++) {
            if (str == data[i]) {
                return i;
            }
        }
        return -1;
    }

    // 遍历线性表
    public void visit() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    // 删除元素
    public void deleteElem(int position) {
        if (position < 1 || position >= size) {
            System.out.println("删除位置不合法");
            return;
        }
        int j = position - 1;
        while (j >= position) {
            data[j] = data[j + 1];// 删除位置及前的元素前移
            j++;
        }
        size--;
    }

    // 求长度
    public int length() {
        return size;
    }

    // 判空
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    // 清空线性表
    public void empty() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;

    }

    // 替换元素
    public void replaceElem(int position, String str) {
        data[position] = str;
    }

    // 获取元素
    public String getElem(int position) {
        if (position < 1 || position >= size) {
            System.out.println("输入位置不合法");
            return "Error";
        }
        return data[position];
    }

    // 判断是否包含某个元素
    public boolean isIncludeElem(String str) {
        if (this.search(str) == -1) {
            return false;
        }
        return true;
    }

    // 反向查找
    public int searchReverse(String str) {
        for (int i = size - 1; i > 0; i--) {
            if (str == data[i]) {
                return i;
            }
        }
        return -1;
    }

    // 末尾插入元素
    public void endInsert(String str) {
        if (size >= CAPACITY) {
            data = Arrays.copyOf(data, CAPACITY + 10);
            CAPACITY += 10;
        }
        data[size - 1] = str;
        size++;
    }

}
