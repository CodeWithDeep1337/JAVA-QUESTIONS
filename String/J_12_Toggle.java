import java.util.Scanner;

public class J_12_Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter srting:");
        StringBuilder str=new StringBuilder(sc.nextLine());

        for(int i=0;i<str.length();i++){
            boolean flag=true; //capital
            char ch=str.charAt(i);
            if(ch==' '){
                continue;
            }
            
           int asci=(int)ch;
          if(asci>=48 && asci<=57){
            continue;
          }
          else{
            if(asci>=97){
                flag=false;
               }
               if(flag==true){
                asci +=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
               }
               else{
                asci -=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
               }
    
            }
          }
        System.out.println(str);
        sc.close();
    }
}
