import java.util.Scanner;

class AlphabetPrinter {
    public void printChar(char c) {
        switch(Character.toUpperCase(c)) {
            case 'A':
                System.out.println("  *  ");
                System.out.println(" * * ");
                System.out.println("*****");
                System.out.println("*   *");
                System.out.println("*   *");
                break;
            case 'B':
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("**** ");
                break;
            case 'C':
                System.out.println(" ****");
                System.out.println("*    ");
                System.out.println("*    ");
                System.out.println("*    ");
                System.out.println(" ****");
                break;
            case 'D':
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("**** ");
                break;
            case 'E':
                System.out.println("*****");
                System.out.println("*    ");
                System.out.println("*****");
                System.out.println("*    ");
                System.out.println("*****");
                break;
            case 'F':
                System.out.println("*****");
                System.out.println("*    ");
                System.out.println("*****");
                System.out.println("*    ");
                System.out.println("*    ");
                break;
            case 'G':
                System.out.println(" ****");
                System.out.println("*    ");
                System.out.println("*  **");
                System.out.println("*   *");
                System.out.println(" ****");
                break;
            case 'H':
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*****");
                System.out.println("*   *");
                System.out.println("*   *");
                break;
            case 'I':
                System.out.println("*****");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("*****");
                break;
            case 'J':
                System.out.println("*****");
                System.out.println("    *");
                System.out.println("    *");
                System.out.println("*   *");
                System.out.println(" *** ");
                break;
            case 'K':
                System.out.println("*   *");
                System.out.println("*  * ");
                System.out.println("***  ");
                System.out.println("*  * ");
                System.out.println("*   *");
                break;
            case 'L':
                System.out.println("*    ");
                System.out.println("*    ");
                System.out.println("*    ");
                System.out.println("*    ");
                System.out.println("*****");
                break;
            case 'M':
                System.out.println("*   *");
                System.out.println("** **");
                System.out.println("* * *");
                System.out.println("*   *");
                System.out.println("*   *");
                break;
            case 'N':
                System.out.println("*   *");
                System.out.println("**  *");
                System.out.println("* * *");
                System.out.println("*  **");
                System.out.println("*   *");
                break;
            case 'O':
                System.out.println(" *** ");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println(" *** ");
                break;
            case 'P':
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("**** ");
                System.out.println("*    ");
                System.out.println("*    ");
                break;
            case 'Q':
                System.out.println(" *** ");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*  **");
                System.out.println(" ****");
                break;
            case 'R':
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("**** ");
                System.out.println("*  * ");
                System.out.println("*   *");
                break;
            case 'S':
                System.out.println(" ****");
                System.out.println("*    ");
                System.out.println(" *** ");
                System.out.println("    *");
                System.out.println("**** ");
                break;
            case 'T':
                System.out.println("*****");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                break;
            case 'U':
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println(" *** ");
                break;
            case 'V':
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println(" * * ");
                System.out.println("  *  ");
                break;
            case 'W':
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("* * *");
                System.out.println("** **");
                System.out.println("*   *");
                break;
            case 'X':
                System.out.println("*   *");
                System.out.println(" * * ");
                System.out.println("  *  ");
                System.out.println(" * * ");
                System.out.println("*   *");
                break;
            case 'Y':
                System.out.println("*   *");
                System.out.println(" * * ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                break;
            case 'Z':
                System.out.println("*****");
                System.out.println("   * ");
                System.out.println("  *  ");
                System.out.println(" *   ");
                System.out.println("*****");
                break;
            default:
                System.out.println("Art for letter " + c + " not defined.");
        }
    }
    public void printAll() {
        for(char c='A'; c<='Z'; c++) {
            System.out.println("ASCII for: " + c);
            printChar(c);
            System.out.println();
        }
    }
    // New method: print a string in big character mode
    public void printString(String name) {
        for(int i=0; i<name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isLetter(ch))
                printChar(ch);
            else if (ch == ' ') {
                System.out.println();
            }
            // You can add support for printing special chars here if desired
            System.out.println();
        }
    }
}


class NumberPrinter {
    public void printNumber(int n) {
        switch(n) {
            case 0:
                System.out.println(" *** ");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println(" *** ");
                break;
            case 1:
                System.out.println("  *  ");
                System.out.println(" **  ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println(" *** ");
                break;
            case 2:
                System.out.println(" *** ");
                System.out.println("    *");
                System.out.println(" *** ");
                System.out.println("*    ");
                System.out.println(" *** ");
                break;
            case 3:
                System.out.println(" *** ");
                System.out.println("    *");
                System.out.println(" *** ");
                System.out.println("    *");
                System.out.println(" *** ");
                break;
            case 4:
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*****");
                System.out.println("    *");
                System.out.println("    *");
                break;
            case 5:
                System.out.println("*****");
                System.out.println("*    ");
                System.out.println("**** ");
                System.out.println("    *");
                System.out.println("**** ");
                break;
            case 6:
                System.out.println(" *** ");
                System.out.println("*    ");
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println(" *** ");
                break;
            case 7:
                System.out.println("*****");
                System.out.println("    *");
                System.out.println("   * ");
                System.out.println("  *  ");
                System.out.println(" *   ");
                break;
            case 8:
                System.out.println(" *** ");
                System.out.println("*   *");
                System.out.println(" *** ");
                System.out.println("*   *");
                System.out.println(" *** ");
                break;
            case 9:
                System.out.println(" *** ");
                System.out.println("*   *");
                System.out.println(" ****");
                System.out.println("    *");
                System.out.println(" *** ");
                break;
            default:
                System.out.println("Art for number " + n + " not defined.");
        }
    }
    public void printAll() {
        for(int i=0; i<=9; i++) {
            System.out.println("ASCII for: " + i);
            printNumber(i);
            System.out.println();
        }
    }
}


class SpecialCharPrinter {
    public void printChar(char c) {
        switch(c) {
            case '$':
                System.out.println("  * :");
                System.out.println(" * * ");
                System.out.println("*****");
                System.out.println(" * * ");
                System.out.println(": *  ");
                break;
            case '#':
                System.out.println(" * * ");
                System.out.println("*****");
                System.out.println(" * * ");
                System.out.println("*****");
                System.out.println(" * * ");
                break;
            case '@':
                System.out.println(" *** ");
                System.out.println("*   *");
                System.out.println("* * *");
                System.out.println("* ** ");
                System.out.println(" *** ");
                break;
            case '%':
                System.out.println("*   *");
                System.out.println("   * ");
                System.out.println("  *  ");
                System.out.println(" *   ");
                System.out.println("*   *");
                break;
            default:
                System.out.println("Art for special char " + c + " not defined.");
        }
    }
    public void printAll() {
        char[] chars = {'$', '#', '@', '%'};
        for(char c : chars) {
            System.out.println("ASCII for: " + c);
            printChar(c);
            System.out.println();
        }
    }
}


public class ascii{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlphabetPrinter alpha = new AlphabetPrinter();
        NumberPrinter num = new NumberPrinter();
        SpecialCharPrinter spec = new SpecialCharPrinter();
        int choice;

        do {
            System.out.println("\nASCII Art Printer Menu:");
            System.out.println("1. Print Single Alphabet");
            System.out.println("2. Print Number (0-9)");
            System.out.println("3. Print Special Character");
            System.out.println("4. Print your name in big letter mode");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
           // System.out.println("2. Print Full Alphabet");
          //  System.out.println("4. Print All Numbers");
           // System.out.println("6. Print All Special Characters");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter alphabet (A-Z): ");
                    char a = sc.next().charAt(0);
                    alpha.printChar(a);
                    break;
                // case 2:
                //     alpha.printAll();
                //     break;
                case 2:
                    System.out.print("Enter number (0-9): ");
                    int n = sc.nextInt();
                    num.printNumber(n);
                    break;
                // case 4:
                //     num.printAll();
                //     break;
                case 3:
                    System.out.print("Enter special character ($, #, @, %): ");
                    char s = sc.next().charAt(0);
                    spec.printChar(s);
                    break;
                // case 6:
                //     spec.printAll();
                //     break;
                case 4:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    alpha.printString(name);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while(choice != 8);

        sc.close();
    }
}
