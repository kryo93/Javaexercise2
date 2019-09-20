import java.util.Scanner;

public class userTask extends user
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        user data = new user();
        int check = 1;

        System.out.println("Enter First Name ");
        String giveString=sc.nextLine();
        data.setfirstName(giveString);

        System.out.println("Enter Last Name ");
        giveString=sc.nextLine();
        data.setLastName(giveString);

        while(check==1)
        {
            System.out.println("Enter the age ");
            int res = sc.nextInt();
            if(res>0 && res<100)
            {
                check =-1;
                data.setAge(res);
            }
            else
            {
                System.out.println("Invalid Entry , Try again (between 1-100)");
            }
        }

        System.out.println("Enter Salary ");
        int givesal = sc.nextInt();

        data.setSalary(givesal);


        System.out.println(data.getFirstName());
        System.out.println(data.getAge());
        System.out.println(data.getLastName());
        System.out.println(data.getSalary());


    }
}

