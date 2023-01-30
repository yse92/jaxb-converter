package solvd.models;

import solvd.util.DateAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private Date dateOfBirth;
    private Login login;

    public Customer(int id, String firstName, String lastName, String phone, Date dateOfBirth, Login login) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.login = login;
        this.dateOfBirth = dateOfBirth;
    }

    public Customer() {

    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @XmlElement(name = "dateOfBirth")
    @XmlJavaTypeAdapter(DateAdapter.class)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @XmlElement(name="Login")
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public String toString() {
        Field[] fields = this.getClass().getDeclaredFields();
        String res = "{";
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
            for (Field field : fields) {
                if (field.getName().equals("dateOfBirth")) {
                    res += field.getName() + " : " + df.format(field.get(this)) + ", ";
                } else {
                    res += field.getName() + " : " + field.get(this) + ", ";
                }
            }
            res += "}";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
