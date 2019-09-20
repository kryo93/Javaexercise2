import java.util.Scanner;

public class grader extends student
{


    int[] studentData = new int[100];

    Scanner sc= new Scanner(System.in);

    public void entry(int n)
    {

        for(int i=0;i<n;i++)
        {   Scanner dc = new Scanner(System.in);
            System.out.println("Enter the grades for Student " + (i+1));
            studentData[i]= dc.nextInt();
        }

    }
    public int aggregate(int n)
    {
        int tot=0;
        int avg;
        for(int i=0;i<n;i++)
        {
            tot= tot+studentData[i];
        }
        avg=tot/n;
        return avg;
    }
    public int maximum(int n)
    {
        int max=studentData[0];
        for(int i=1;i<n;i++)
        {
            if(studentData[i]>max)
            {
                max=studentData[i];
            }
        }
        return max;
    }
    public int minimum(int n)
    {
        int min=studentData[0];
        for(int i=1;i<n;i++)
        {
            if(studentData[i]<min)
            {
                min=studentData[i];
            }
        }
        return min;
    }

}