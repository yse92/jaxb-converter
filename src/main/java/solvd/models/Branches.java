package solvd.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.reflect.Field;
import java.util.List;

@XmlRootElement(name="Branches")
public class Branches {

    List<Branch> branches;

    @XmlElement(name="Branch")
    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    @Override
    public String toString() {
        Field[] fields = this.getClass().getDeclaredFields();
        String res = "";
        try {
            for (Field field : fields) {
                res += field.getName() + " :\n" + field.get(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }
}
