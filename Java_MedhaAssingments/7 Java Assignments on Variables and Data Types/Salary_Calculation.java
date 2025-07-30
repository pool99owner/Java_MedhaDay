import java.util.Scanner;

public class Salary_Calculation {

    public static void main(String[] args) {
        
        
        
    

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your monthly salary : ");
         int basic = sc.nextInt();

         float HRA = basic*20/100F;
         float DA =  basic*80/100F;


        float Gross_Salary = basic + HRA + DA;

        System.out.println("Gross Salary is " + Gross_Salary);
        System.out.println("HRA is : " + HRA );
        System.out.println("DA is : "+ DA);


    }
    
}
