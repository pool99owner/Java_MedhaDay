import java.util.Scanner;

public class Area_Perimeter_Calculator {


    public static void main(String[] args) {
        
        int lenght;
        int breadth;

   

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Area");
        lenght = sc.nextInt();
        System.out.println("Enter Breadth");
        breadth = sc.nextInt();
        

        int area = lenght * breadth;
        int perimeter =2*(lenght+breadth);

        System.out.println("Area is : " + area);
        System.out.println("Perimeter is: " +  perimeter);










    }
    
}
