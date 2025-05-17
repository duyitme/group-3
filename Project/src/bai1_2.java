import java.util.*;
public class bai1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số bị trừ: ");
        double soBiTru = scanner.nextDouble();

        System.out.print("Nhập số trừ: ");
        double soTru = scanner.nextDouble();

        double hieu = soBiTru - soTru;

        System.out.println("Hiệu của " + soBiTru + " và " + soTru + " là: " + hieu);

        scanner.close();

	}

}
