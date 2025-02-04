import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int w=i-1;w>=1;w--){
                System.out.print(w);
            }
            System.out.println();
        }
        sc.close();
    }
}
