package exp09.content4;

/**
 * 用户信息操作接口IUserDao及其实现类UserDaoImpl，完成用户的登录、注册，商品信息录入、修改、查询、购买等功能。
 */
public interface IUserDao {

    // 用户登录
    User login(String username,String password);

    // 用户注册 
    void register(String username,String password);

    // 商品信息录入
    boolean add(Book book);

    // 商品信息修改
    boolean modify(int index, Book book);

    // 商品信息查询
    Book query();

    // 购买商品
    void buy();
}

