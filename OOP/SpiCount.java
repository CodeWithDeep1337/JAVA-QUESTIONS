import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    public Student(int id_no, int no_of_subjects_registered, String[] subject_code, int[] subject_credits, String[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
    }
    public void ask(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID Number:");
        this.id_no = sc.nextInt();

        System.out.print("Enter Number of Subjects Registered: ");
        this.no_of_subjects_registered = sc.nextInt();

       
        this.subject_code = new String[no_of_subjects_registered];
        this. subject_credits = new int[no_of_subjects_registered];
    this. grade_obtained = new String[no_of_subjects_registered];

        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.print("Enter " + (i + 1) + "st Subject Code: ");
             subject_code[i] = sc.next();

            
        }
        System.out.println();
        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.print("Enter " + (i + 1) + "st Subject Credit: ");
            subject_credits[i] = sc.nextInt();
            
        }
        System.out.println();
        for (int i = 0; i < no_of_subjects_registered; i++) {
           
            System.out.print("Enter " + (i + 1) + "st Grade Obtained(A++,A+,A,B+,B,C,P) : ");
            grade_obtained[i] = sc.next();
            
        }
         spi();
       
      


      }
     

   

    public int calculate_spi(String grade) {
        switch (grade) {
            case "A++": return 10;
            case "A+": return 9;
            case "A": return 8;
            case "B+": return 7;
            case "B": return 6;
            case "C": return 5;
            case "P": return 4;
            default: return 0;
        }
    }

    public void spi() {
        int total_credit = 0;
        int total_point = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            total_credit += subject_credits[i];
            total_point += subject_credits[i] * calculate_spi(grade_obtained[i]);
        }

       

        spi = (double) total_point / total_credit;
      
        System.out.print("|");
        System.out.print("Your SPI: " + spi);
        System.out.println("|");
      
    }
}

public class SpiCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id_no = 0;
        int no_of_subjects_registered=0;
        String[] subject_code=null;
        int[] subject_credits=null;
        String[] grade_obtained=null;

     System.out.println("enter number of students:");
     int n=sc.nextInt();
     Student[] s=new Student[n];
       
 for(int i=0;i<n;i++){
     
      
       

     s[i] =  new Student(id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained);
     s[i].ask();
   
   


 }
        
       

        sc.close();//
    }
}
