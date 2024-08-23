
package nhapxuat;

import java.util.Scanner;

public class Nhapxuat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //cau lenh nhac
        
        System.out.println("Enter your full name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        
        System.out.println("Enter year of birth: ");
        int year = scanner.nextInt();
        
        System.out.println("Enter your sex: ");
        String sex = scanner.next();

        String junk = scanner.nextLine();
        
        System.out.println("Enter your major: ");
        String major = scanner.nextLine();
        
        System.out.println("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        
        String test = scanner.nextLine();
        
        System.out.println("Enter Country: ");
        String country = scanner.nextLine();
        
       
        
        System.out.println("full name: " + name);
        System.out.println("Age: " + age);
        System.out.println("year of birth: " + year);
        System.out.println("set: " + sex);
        System.out.println("major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Country: " + country );
    }
    
}
