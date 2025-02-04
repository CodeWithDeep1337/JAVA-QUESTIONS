import java.util.Scanner;

public class J_15_PalindromicNumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int k=1;k<=2*n-2*i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
                 
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
                 
            }
            System.out.println();
        }
        sc.close();
    }
}
