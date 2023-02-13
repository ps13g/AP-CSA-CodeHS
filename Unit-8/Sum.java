public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{32, 4, 14, 65, 23, 6},
                {4, 2, 53, 31, 765, 34},
                {64235, 23, 522, 124, 42, 64}};
        System.out.println(sumRow(array, 0));
        System.out.println(sumRow(array, 1));
        System.out.println(sumRow(array, 2));
    }
    // Returns the sum of row in 2D array
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;
        for(int i : array[row])
            sum += i;
        return sum;
    }
    // Returns the sum of all elements in array
    public static int sumArray(int[][] array)
    {
        int start = 0;
        int sumofall = 0;
        while (start < array.length)
        {
            sumofall += sumRow(array, start);
            start++;
        }
        return sumofall;
    }
}
