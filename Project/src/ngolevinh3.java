import java.util.*;
public class ngolevinh3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        if (chieuDai > 0 && chieuRong > 0) {
            double dienTich = chieuDai * chieuRong;
            System.out.println("Diện tích hình chữ nhật là: " + dienTich);
        } else {
            System.out.println("Lỗi: Chiều dài và chiều rộng phải lớn hơn 0.");
        }
        scanner.close();
    }
}
