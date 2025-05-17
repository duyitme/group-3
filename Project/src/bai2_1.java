import java.util.*;
public class bai2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương thứ nhất: ");
        int so1 = scanner.nextInt();

        System.out.print("Nhập số nguyên dương thứ hai: ");
        int so2 = scanner.nextInt();

        if (so1 <= 0 || so2 <= 0) {
            System.out.println("Vui lòng nhập hai số nguyên dương.");
        } else {
            int uscln = timUSCLN(so1, so2);
            System.out.println("Ước số chung lớn nhất (USCLN) của " + so1 + " và " + so2 + " là: " + uscln);
        }

        scanner.close();
    }

    public static int timUSCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
