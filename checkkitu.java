
package nhapxuat;

import java.util.Scanner;

public class checkkitu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = scanner.nextLine();
        
        if (s.length() > 1) {
            System.out.println("The character is String");
        } else {
            System.out.println("The character isn't String");
        }
    }    
}

