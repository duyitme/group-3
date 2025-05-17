import java.util.*;
public class bai2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();

        if (soThuNhat < soThuHai) {
            System.out.println("Hai số theo thứ tự tăng dần là: " + soThuNhat + ", " + soThuHai);
        } else if (soThuNhat > soThuHai) {
            System.out.println("Hai số theo thứ tự tăng dần là: " + soThuHai + ", " + soThuNhat);
        } else {
            System.out.println("Hai số bằng nhau: " + soThuNhat + ", " + soThuHai);
        }

        scanner.close();
    }
}
