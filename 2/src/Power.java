import java.util.Scanner;

public class Power
{
    public static void main(String[] args)
    {
        System.out.println("Please Enter the number");
        Scanner sc = new Scanner(System.in);
        float givenNumber = sc.nextInt();

        while((int)givenNumber/4!=0)
        {

            givenNumber=givenNumber/4;

        }
        if(givenNumber==1.0)
        {
            System.out.println("The number is a power 4");
        }
        else
        {
            System.out.println("The number is not a power 4");
        }





    }
}
