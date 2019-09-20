public class factFind extends factorialFinder
{
    public int factor(int num) {
        int fact = 1;

        while (num > 0)
        {
            fact = fact * num;
            num--;
        }
        return fact;
    }
}
