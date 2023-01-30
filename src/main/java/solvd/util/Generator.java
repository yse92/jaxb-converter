package solvd.util;

import solvd.models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static Branches generateBranches() throws ParseException {
        List<Branch> branchesList = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();
        List<Customer> customerList = new ArrayList<>();

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        Employee employee1 = new Employee(1, "FirstName1", "LastName1", "Loan processor", 23450f);
        Employee employee2 = new Employee(2, "FirstName2", "LastName2", "Mortgage consultant", 29075f);
        Account account1 = new Account(1, 54500, true);
        Account account2 = new Account(2, 37800, false);
        Login login1 = new Login(1, "Nick1", "password1", account1);
        Login login2 = new Login(2, "Nick2", "password2", account2);
        Customer customer1 = new Customer(1, "FName1", "LName1", "+380504340405", df.parse("15-10-1992"), login1);
        Customer customer2 = new Customer(1, "FName2", "LName2", "+380990880586", df.parse("12-09-1998"), login2);
        Branches branches = new Branches();

        employeeList.add(employee1);
        employeeList.add(employee2);
        customerList.add(customer1);
        customerList.add(customer2);

        Branch branch1 = new Branch(1, "address1", "044-356-35-05", employeeList, customerList);
        Branch branch2 = new Branch(2, "address2", "057-096-05-25", employeeList, customerList);

        branchesList.add(branch1);
        branchesList.add(branch2);

        branches.setBranches(branchesList);
        return branches;
    }
}
