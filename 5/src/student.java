import java.util.Scanner;


public class student
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int n = sc.nextInt();

       grader obj = new grader();

        obj.entry(n);
        int avg=obj.aggregate(n);
        System.out.println("Average =" + avg);
        int max=obj.maximum(n);
        System.out.println("Maximum =" + max);
        int min = obj.minimum(n);
        System.out.println("Minimum =" + min);

    }
}

