import java.util.*;
public class Kiemtrasodoixung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        int so = scanner.nextInt();

        int soGoc = so;
        int daoNguoc = 0;

        while (so > 0) {
            int chuSo = so % 10;
            daoNguoc = daoNguoc * 10 + chuSo;
            so /= 10;
        }

     
        if (soGoc == daoNguoc) {
            System.out.println(soGoc + " là số đối xứng.");
        } else {
            System.out.println(soGoc + " không phải là số đối xứng.");
        }

        scanner.close();
    }

	}


