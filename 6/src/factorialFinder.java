public class factorialFinder
{
    public static void main(String[] args)
    {
        factFind obj = new factFind();
        for(int i=0;i<13;i++)
        {
            System.out.println("The factorial of " + i + " is" + obj.factor(i));
        }

        System.out.println("The factorial of " + 13 + " is out of range");
        System.out.println("\n\nLONG STARTS NOW \n\n");
        longFactFind obj2 = new longFactFind();
        for(int i=0;i<21;i++)
        {
            System.out.println("The factorial of " + i + " is" + obj2.factor(i));
        }
        System.out.println("The factorial of " + 21 + " is out of range");
    }
}
