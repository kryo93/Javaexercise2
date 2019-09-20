import java.util.Scanner;

public class user
{
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public void setfirstName(String givenfirstName) {
        firstName = givenfirstName;
    }

    public void setLastName(String givenlastName) {
     lastName = givenlastName;
    }

    public void setAge(int givenage) {
        age = givenage;
    }

    public void setSalary(int givensalary) {
        salary = givensalary;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }


}

