import java.util.Scanner;

public class Stringop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        String result = str1 + " " + str2;
        System.out.println("1. Concatenated String: " + result);
        System.out.println("2. Length of str1: " + str1.length());
        if (str1.length() >= 3) {
            System.out.println("3. Substring of str1 (0 to 3): " + str1.substring(0, 3));
        } else {
            System.out.println("3. str1 is too short for substring(0,3)");
        }
        String replacedStr = str1.replace("e", "a");
        System.out.println("4. Replaced String (replace 'e' with 'a'): " + replacedStr);
        System.out.println("5. str1 in lowercase: " + str1.toLowerCase());
        System.out.println("   str1 in uppercase: " + str1.toUpperCase());
        System.out.print("Enter a string with spaces at the beginning or end: ");
        String strWithSpaces = sc.nextLine();
        System.out.println("6. Trimmed String: '" + strWithSpaces.trim() + "'");
        int comparison = str1.compareTo(str2);
        System.out.println("7. Comparing str1 and str2 using compareTo(): " + comparison);
        if (!str1.isEmpty()) {
            System.out.print("Enter an index to get character from str1: ");
            int index = sc.nextInt();

            if (index >= 0 && index < str1.length()) {
                System.out.println("8. Character at index " + index + ": " + str1.charAt(index));
            } else {
                System.out.println("8. Invalid index! Must be between 0 and " + (str1.length() - 1));
            }
        } else {
            System.out.println("8. str1 is empty, cannot use charAt().");
        }

        sc.close();
    }
}
