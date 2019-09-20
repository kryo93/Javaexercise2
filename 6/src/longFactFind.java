public class longFactFind extends factorialFinder
{

        public long factor(int num) {
            long fact = 1;

            while (num > 0)
            {
                fact = fact * num;
                num--;
            }
            return fact;
        }
}

