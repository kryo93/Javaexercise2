import java.util.Scanner;

public class member
{
    private String name;
    private int age;
    private int salary;

    public void setup(String sName, int sAge, int sal)
    {
        name=sName;
        age=sAge;
        salary=sal;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

        //setters and getters
    }
}

class memberVariable extends member
{
    public static void main(String[] args)
    {
        member obj = new member();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name ");
        String setName = sc.nextLine();
        System.out.println("Enter Age ");
        int setAge = sc.nextInt();
        System.out.println("Enter Salary");
        int setSal = sc.nextInt();

        obj.setup(setName,setAge,setSal);


    }
}
