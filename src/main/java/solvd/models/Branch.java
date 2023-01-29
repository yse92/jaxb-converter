package solvd.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.reflect.Field;
import java.util.List;

@XmlRootElement
public class Branch {
    private int id;
    private String adress;
    private String phone;
    private List<Employee> employees;
    private List<Customer> customers;

    public Branch() {
    }

    public Branch(int id, String adress, String phone, List<Employee> employees, List<Customer> customers) {
        this.id = id;
        this.adress = adress;
        this.phone = phone;
        this.employees = employees;
        this.customers = customers;
    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @XmlElement
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @XmlElementWrapper(name="Employees")
    @XmlElement(name="Employee")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @XmlElement(name = "Customer")
    @XmlElementWrapper(name = "Customers")
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        Field[] fields = this.getClass().getDeclaredFields();
        String res = "\n";
        try {
            for (Field field : fields) {
                res += field.getName() + " : " + field.get(this) + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }
}
