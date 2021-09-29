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
        if (position < 1) {
            System.out.println("插入位置不合法");
            return;
        }
        // 若线性表空间不足，扩容数组
        if (size >= CAPACITY) {
            data = Arrays.copyOf(data, CAPACITY + 10);
            CAPACITY += 10;
        }

        if (position > size + 1) {
            System.out.println("输入位置超出当前线性表长度，自动将元素插入末尾");
            endInsert(str);
        } else {
            int j = size;
            while (j > position - 1) {
                data[j] = data[j - 1];// 插入位置及之后的元素右移
                j--;
            }
            data[j] = str;
            size++;
        }
    }

    /*
    * ==是进行对象的地址值的比较，字符串的内容比较，可以equals()方法
    * 
    * public boolean equals(Object)：参数可以是任何对象，只有参数是一个字符串的并且内容相同的才会true，否则返回false
    */
    // 查找
    public int search(String str) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    // 遍历线性表
    public void visit() {
        System.out.println("结果为：");
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    // 删除元素
    public void deleteElem(int position) {
        if (position < 1 || position > size) {
            System.out.println("删除位置不合法");
            return;
        }
        int j = position - 1;
        while (j <= size) {
            data[j] = data[j + 1];// 删除位置及之后的元素前移
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
        data[position - 1] = str;
    }

    // 获取元素
    public String getElem(int position) {
        if (position < 1 || position >= size) {
            System.out.println("输入位置不合法");
            return "Error";
        }
        return data[position - 1];
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
        data[size] = str;
        size++;
    }

}
