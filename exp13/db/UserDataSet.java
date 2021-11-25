package exp13.db;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

import exp13.entity.User;

public class UserDataSet {
    private static Set<User> users = new HashSet<User>();
    static {
        // users.add(new User("10001", "张三", "123456", "男", "北京", "管理员"));
        // users.add(new User("20001", "李四", "123456", "男", "上海", "普通用户"));
        setUsers();
    }

    public UserDataSet() {

    }

    public static Set<User> getUsers() {
        return users;
    }

    public static void setUsers() {
        File f = new File(DatabaseConfig.USER_FILE_PATH);
        try (FileInputStream fis = new FileInputStream(f); ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = null;
            while ((obj = ois.readObject()) != null && (obj instanceof Set)) {
                for (Object item : (Set<?>) obj) {
                    if (item instanceof User) {
                        users.add((User) item);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean addUser(User user) {
        boolean b = users.add(user);
        saveData();
        return b;
    }

    public static void saveData() {
        File f = new File(DatabaseConfig.USER_FILE_PATH);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));) {
            oos.writeObject(users);
            oos.writeObject(null);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(users);
    }
}
