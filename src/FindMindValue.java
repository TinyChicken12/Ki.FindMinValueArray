public class FindMindValue {
    public static void main(String[] args) {
        System.out.println("The application finds the largest value in the array.");

        int size;
        int[] array;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("List of numbers: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("The smallest value in the list is " + min + " ,at position " + index);

    }
}
