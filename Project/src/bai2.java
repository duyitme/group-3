import java.util.*;
public class bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();

        double soLonNhat;

        if (soThuNhat > soThuHai) {
            soLonNhat = soThuNhat;
        } else {
            soLonNhat = soThuHai;
        }

        System.out.println("Số lớn nhất trong hai số " + soThuNhat + " và " + soThuHai + " là: " + soLonNhat);

        scanner.close();
    }

}
