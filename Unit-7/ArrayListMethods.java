import java.util.ArrayList;

public class ArrayListMethods
{

    public static void print(ArrayList<Double> arr)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }

    public static void condense(ArrayList<Double> arr)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            arr.set(i, (arr.get(i) * arr.get(i+1)));

            arr.remove(i + 1);
        }
    }

    public static void duplicate(ArrayList< Double> arr)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            if(i > 5)
            {
                break;
            }
            arr.add(arr.size(), arr.get(i));


        }
    }

}
