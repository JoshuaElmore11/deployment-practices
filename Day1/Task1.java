import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        Integer[] arr = {5, 1, 25, 24, 1345, 224, 14, 6, 5};
        System.out.println("Given Array: " + Arrays.toString(arr));
        Integer[] topThree = topThree(arr);
        System.out.println("Top Three Values : " + Arrays.toString(topThree));
    }

    public static Integer[] topThree(Integer[] arr) {
        Integer[] topThree = new Integer[3];
        Arrays.sort(arr, Collections.reverseOrder());
        System.arraycopy(arr, 0, topThree, 0, 3);

        return topThree;
    }
}
