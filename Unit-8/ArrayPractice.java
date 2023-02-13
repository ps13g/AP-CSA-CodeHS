public class ArrayPractice
{
    public static void main(String[] args)
    {
        int[][] array = {{3, 5, 7, 8, 0}, {500, 250, 125, 784, 267, 674, 0}, {9, 8, 0}};
        int sum = 0;
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[0].length; col++)
            {
                sum++;
            }
        }
        // Call the updateValue method three times on this array:
        updateValue(array, 0, array[0].length - 1, array.length);
        updateValue(array, 1, array[1].length - 1, sum);
        updateValue(array, 2, array[2].length - 1, array[0][0] + array[2][array.length-1]);


        print(array);
    }

    //Create a method to add the correct value to the array at the correct col, row
    public static void updateValue(int[][] arr, int row, int col, int value)
    {
        arr[row][col] = value;
    }



    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

