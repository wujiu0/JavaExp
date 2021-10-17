package week5.exp8.content2;

/**
 * 内容2：首先为线性表定义接口及抽象类，然后使用数组实现线性表。
 * （1）定义一个接口MyList，里面包含插入、查找、删除、替换、获取线性表长度、判断线性表是否为空、清空线性表等抽象方法；
 * （2）定义一个抽象类MyAbstractList实现接口MyList，该抽象类拥有唯一的属性size（protected修饰），表示当前线性表的长度，并提供无参和有参构造方法完成线性表的初始化，重写接口中添加、删除、判断线性表是否为空及返回线性表长度的方法；
 * （3）利用数组实现线性表：定义一个MyArrayList类，继承自抽象类MyAbstractList，并利用数组实现所有操作。 （4）给出测试类
 * 
 */
public interface MyList {

    // 插入
    public abstract void add(int position, String str);

    // 查找
    int indexOf(String str);

    // 删除
    void deleteElem(int position);

    // 替换
    void set(int position, String str);

    // 获取长度
    int size();

    // 判空
    boolean isEmpty();

    // 清空
    void clear();
}
