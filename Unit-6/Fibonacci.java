public class Fibonacci {
    public static void main(String[] args) {

        //number of elements to generate in the sequence
        int max = 15;

        // create the array to hold the sequence of Fibonacci numbers
        int[] sequence = new int[max];
        //create the first 2 Fibonacci sequence elements
        sequence[0] = 0;
        sequence[1] = 1;

        //create the Fibonacci sequence and store it in int[] sequence
        for (int i = 2; i < sequence.length; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        //print the Fibonacci sequence numbers
        System.out.println("The first 15 elements in the Fiboncacci sequence are:");
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }

        System.out.println("\nThe element after 55 is " + findNextElement(sequence, 55));

    }

    // This method returns the element that comes after element 'toFind'
    public static int findNextElement(int[] arr, int toFind) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == toFind) {
                return arr[x + 1];
            }
        }
        return -1;
    }
}
