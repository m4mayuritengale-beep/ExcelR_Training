//Display All Perfect Numbers from Array
package day4;

public class ArrayDemo5 {

    public static void main(String[] args) {

        int arr[] = {23, 18, 6, 40, 28};

        System.out.println("Perfect numbers from array are as follows:");

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 1; j < arr[i]; j++) {

                if (arr[i] % j == 0) {
                    sum = sum + j;
                }
            }

            if (sum == arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }
}
