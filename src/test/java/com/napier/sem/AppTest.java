package  com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;
    @BeforeAll
    static void init()
    {
        app = new App();
    }

    //Test to check method works while employee list is null
    @Test
    void printSalariesTestNull()
    {
        app.printSalaries(null);
    }

    //test to check method works while employee list is empty
    @Test
    void printSalariesTestEmpty()
    {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        app.printSalaries(employess);
    }

    //Test to check method works while employee list contains a null value
    @Test
    void printSalariesTestContainsNull()
    {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(null);
        app.printSalaries(employees);
    }

    //Test to check if method works while employee list is behaving as expected
    @Test
    void printSalaries()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
    }
}