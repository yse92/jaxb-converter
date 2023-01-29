package solvd.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.reflect.Field;

@XmlRootElement
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private float salary;

    public Employee(int id, String firstName, String lastName, String position, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {

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
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @XmlElement
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
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
