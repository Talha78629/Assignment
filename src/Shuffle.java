import java.util.Random;

public class Shuffle {
    private static void shf(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        
        shf(arr);

        System.out.print("Shuffled Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }




}
