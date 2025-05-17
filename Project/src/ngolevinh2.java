import java.util.*;
public class ngolevinh2 {
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
       System.out.print("Nhập số đầu của đồng hồ nước: ");
       int soDau = scanner.nextInt();
       System.out.print("Nhập số cuối của đồng hồ nước: ");
       int soCuoi = scanner.nextInt();

       if (soCuoi >= soDau) {
           int soTieuThu = soCuoi - soDau;
           int thanhTien = soTieuThu * 10000;
           System.out.println("Số nước tiêu thụ: " + soTieuThu + " m³");
           System.out.println("Thành tiền: " + thanhTien + " VND");
       } else {
           System.out.println("Lỗi: Số cuối phải lớn hơn hoặc bằng số đầu.");
       }

       scanner.close();
   }
}
