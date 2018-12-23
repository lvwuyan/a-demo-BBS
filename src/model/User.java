package model;

public class User {
    private String id;
    private String password;
    private String name;//昵称
    private String tel;
    private String job;
    private String sex;
    private String sign;//签名
    private boolean admin;//管理员

    public User(String id, String password,String name, String tel, String job, String sex, String sign) {

        this.id = id;
        this.password = password;
        this.name=name;
        this.tel=tel;
        this.job=job;
        this.sex=sex;
        this.sign=sign;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
