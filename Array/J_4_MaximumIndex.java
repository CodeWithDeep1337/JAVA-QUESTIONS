import java.util.Scanner;

public class MaximumIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int ans=0;
        int[] arr={1,2,4,6,1137};
        for(int i=0;i<=4;i++){
            
            if(arr[i]>ans){
              ans=arr[i];
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
