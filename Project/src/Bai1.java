import java.util.*;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Số b không được là 0 để thực hiện phép chia.");
        } else if (a % b == 0) {
            System.out.println(a + " chia hết cho " + b + ".");
        } else {
            System.out.println(a + " không chia hết cho " + b + ".");
        }

        scanner.close();
    
	}

}
