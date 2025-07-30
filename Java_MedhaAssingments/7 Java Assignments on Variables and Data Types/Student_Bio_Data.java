import java.util.Scanner;

public class Student_Bio_Data{

    public static void main(String[] args) {
        
        String name;
        int age;
        String gender;
        String collage;
        Float percent;
        boolean isPassed = false;

        System.out.println("bio data");

        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        name = sc.nextLine();
       
        System.out.println("Enter college");
        collage = sc.nextLine();

        System.out.println("Enter Gender");
        gender = sc.nextLine();


        System.out.println("Enter age");
        age = sc.nextInt();

       

        System.out.println("Enter percentage");
        percent = sc.nextFloat();

        

        System.out.println("Enter status");
        isPassed = sc.hasNext();


          
      
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Gender :" + gender);
        System.out.println("Collage :" + collage);
        System.out.println("Percentage :" + percent);
        System.out.println("Status:" +  isPassed);
        





    }

}