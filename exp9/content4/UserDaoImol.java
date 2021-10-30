package exp9.content4;

public class UserDaoImol implements IUserDao {

    private User[] users = new User[10];

    @Override
    public User login(String username, String password) {
        User u = null;
        for (int i = 0; i < users.length && users[i] != null; i++) {
            if (username.equals(users[i].getName())) {
                if (password.equals(users[i].getPassword())) {
                    u = users[i];
                } else {
                    System.out.println("密码错误");
                }
            } else {
                System.out.println("用户不存在");
            }
        }
        return u;
    }

    @Override
    public void register(String username, String password) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                break;
            }
        }
                

    }

    @Override
    public boolean add(Book book) {
        return false;
    }

    @Override
    public boolean modify(int index, Book book) {
        return false;
    }

    @Override
    public Book query() {
        return null;
    }

    @Override
    public void buy() {
    }

}
