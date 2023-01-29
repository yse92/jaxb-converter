package solvd.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.reflect.Field;

@XmlRootElement
public class Login {
    private int id;
    private String name;
    private String password;
    private Account account;

    public Login(int id, String name, String password, Account account) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.account = account;
    }

    public Login() {
    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement(name="Account")
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        Field[] fields = this.getClass().getDeclaredFields();
        String res = "{";
        try {
            for (Field field : fields) {
                res += field.getName() + " : " + field.get(this) + ", ";
            }
            res += "}";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
