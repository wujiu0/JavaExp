package exp12_collection.db;

import java.util.*;

import exp12_collection.entity.User;

public class UserDataSet {
    private static Set<User> users = new HashSet<User>();
    static {
        users.add(new User("10001", "张三", "123456", "男", "北京", "管理员"));
        users.add(new User("20001", "李四", "123456", "男", "上海", "普通用户"));
    }

    public UserDataSet() {

    }

    public static Set<User> getUsers() {
        return users;
    }

    public static void setUsers(Set<User> users) {
        UserDataSet.users = users;
    }

    public static boolean addUser(User user) {
        return users.add(user);
    }
}
