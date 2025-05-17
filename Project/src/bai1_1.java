import java.util.*;

public class bai1_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();

        double tich = soThuNhat * soThuHai;

        System.out.println("Tích của " + soThuNhat + " và " + soThuHai + " là: " + tich);

        scanner.close();	
	}

}
