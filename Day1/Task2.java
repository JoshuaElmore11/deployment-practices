import java.util.Arrays;
import java.util.Collections;

public class Task2 {

    public static void main(String[] args) {
        Integer[] arr = {5, 1, 25, 24, 1345, 224, 14, 6, 5};
        System.out.println("Given array : " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Second Largest Value : " + arr[1]);
    }


}
