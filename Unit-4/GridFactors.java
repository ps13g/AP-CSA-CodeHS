public class GridFactors {
    public static void main(String args[]) {
        printFactors(3);
        printFactors(5);

    }

    public static void printFactors(int factor) {
        int number = 0;
        for (int i = 0; i < 10; i++) {
            for (int x = 0; x < 10; x++) {
                number++;
                if (number % factor == 0) {
                    System.out.print(number + " ");
                } else {
                    System.out.print("x ");
                }

            }
            System.out.println();
        }
    }
}