import java.util.*;
public class Timsonhonhathaiso {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập số thứ nhất: ");
    double so1 = scanner.nextDouble();

    System.out.print("Nhập số thứ hai: ");
    double so2 = scanner.nextDouble();

    double nhoNhat = (so1 < so2) ? so1 : so2;

    System.out.println("Số nhỏ nhất là: " + nhoNhat);

    scanner.close();
}
}
