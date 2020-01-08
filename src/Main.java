import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {

        int[] anArray = {3,2,65,32,654,234,12,43,66,58};
        System.out.println("Before sorting");
        for(int i = 0; i<anArray.length; i++)
        {
            System.out.print(anArray[i] + " ");
        }
        System.out.println("After sorting");
        Arrays.sort(anArray);
        display(anArray);
    }
    public static void display(int[] anArray)
    {
        for(int i = 0; i<anArray.length; i++)

            System.out.print(anArray[i] +" ");
        System.out.println();

    }
}
