 
import java.util.Scanner;

public class J_15_RotateArray {

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter element of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter rotate count: ");
        int k = sc.nextInt();
        sc.close();

        int N = arr.length;
      // reverse(arr, 0, N - 1);    // !! if anyone fill to rotate it from right only do this: comment line no.37 & comment-out line no.30 !!

        reverse(arr, 0, k- 1);
        
        
        reverse(arr, k, N - 1);

        reverse(arr, 0, N - 1);
       
        

        System.out.print("Rotated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
