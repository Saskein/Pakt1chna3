import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("chislo: ");
        int num = Integer.parseInt(in.nextLine().trim());

        System.out.print("int: ");
        double int1 = Double.parseDouble(in.nextLine().trim());

        System.out.print("bool: ");
        boolean Boolka = Boolean.parseBoolean(in.nextLine().trim());

        System.out.print("text: ");
        String str = in.nextLine();

        System.out.println();

        System.out.printf(" %X | %.4f%n", num, int1);
        System.out.printf(" %25s | %b%n", str, Boolka);
        System.out.printf(" %-10s | %b | %05d | %e%n", str, Boolka, num, int1);
        System.out.printf(" % d | %.3s%n", num, str);
        System.out.printf(" %+,d | %.1f%n", num, int1);
        System.out.printf(" %04o | %-25s%n", num, str);
        System.out.println(MessageFormat.format(" {0,number,#,##0.00} | {1,number,percent}", num, int1));
        System.out.println(MessageFormat.format(" {1,number,integer} | {2}", int1, num, str));
        System.out.println(MessageFormat.format(" {2} {3} {0} {1}", num, int1, str, Boolka));
        System.out.println(" " + str + " ; " + Boolka + " ; " + num + " ; " + int1);
    }
}
