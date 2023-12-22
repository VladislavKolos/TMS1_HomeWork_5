import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter q and w");
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        int result1 = q / w;
        int result2 = q % w;
        System.out.println("Result = " + result1 + " ost " + result2);
    }
}