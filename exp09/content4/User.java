package exp09.content4;

/**
 * 内容4：结合产教融合案例-电商购物平台，综合运用所学知识（包括异常处理机制）进一步完善电商购物平台项目，
 * 在商品类目类Category、商品类Book、商品数据库类BookDataSet、商品信息操作接口IBookDao类及其实现类BookDaoImpl的基础上，
 * 
 * 增加购物车类ShoppingCart（可以使用两个数组实现：一个String类型的数组用于存放商品编号，另 一个int数组用于存放相应的库存量）、
 * 
 * 用户类User（包括用户编号id、用户姓名name、用户密码password、性别sex、所在城市city、专属购物车cart等属性，
 * 其中sex为byte型，cart为ShoppingCart型，其余属性为String型）、
 * 
 * 用户信息操作接口IUserDao及其实现类UserDaoImpl，完成用户的登录、注册，商品信息录入、修改、查询、购买等功能。
 * 要求设计一个自定义异常类CartyException，当单个用户对应的购物车操作时，
 * 且商品无法购买时将抛出该异常，并给用户返回提示信息："您要购买的商品数量不足！"
 */
public class User {
    private String id;// 用户编号
    private String name;// 用户姓名
    private String password;// 用户密码
    private byte sex;// 性别
    private String city;// 所在城市
    private ShoppingCart cart;// 专属购物车

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

}
