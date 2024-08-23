
package nhapxuat;

import java.util.Scanner;

public class checksonguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        boolean checkInt = scanner.hasNextInt();
        
        if (checkInt == true) {
            System.out.println("The character is Integer");
        } else {
            System.out.println("The character isn't Integer");
        }
    }
}
