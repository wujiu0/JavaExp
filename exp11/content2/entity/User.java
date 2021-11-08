package exp11.content2.entity;

public class User {
    private String id;
    private String name;
    private String password;
    private String sex;
    private String city;
    private String userType;

    public User() {
    }

    public User(String id, String name, String password, String sex, String city, String userType) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.city = city;
        this.userType = userType;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
