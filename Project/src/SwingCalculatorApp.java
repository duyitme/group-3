import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculatorApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainMenu());
    }
}

class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("Chương trình tính toán Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 1, 10, 10));

        JButton btnTong = new JButton("1. Tính tổng hai số");
        JButton btnHieu = new JButton("2. Tính hiệu hai số");
        JButton btnTich = new JButton("3. Tính tích hai số");
        JButton btnChiaHet = new JButton("4. Kiểm tra chia hết");
        JButton btnTienNuoc = new JButton("5. Tính tiền nước");
        JButton btnHCN = new JButton("6. Tính diện tích & chu vi HCN");

        add(btnTong);
        add(btnHieu);
        add(btnTich);
        add(btnChiaHet);
        add(btnTienNuoc);
        add(btnHCN);

        btnTong.addActionListener(e -> new TwoInputDialog("Tính Tổng", "+"));
        btnHieu.addActionListener(e -> new TwoInputDialog("Tính Hiệu", "-"));
        btnTich.addActionListener(e -> new TwoInputDialog("Tính Tích", "*"));
        btnChiaHet.addActionListener(e -> new ChiaHetDialog());
        btnTienNuoc.addActionListener(e -> new TienNuocDialog());
        btnHCN.addActionListener(e -> new HinhChuNhatDialog());

        setVisible(true);
    }
}

class TwoInputDialog extends JFrame {
    public TwoInputDialog(String title, String operation) {
        setTitle(title);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lbl1 = new JLabel("Số thứ nhất:");
        JTextField txt1 = new JTextField();
        JLabel lbl2 = new JLabel("Số thứ hai:");
        JTextField txt2 = new JTextField();
        JButton btnTinh = new JButton("Tính");
        JLabel result = new JLabel("");

        add(lbl1); add(txt1);
        add(lbl2); add(txt2);
        add(btnTinh); add(result);

        btnTinh.addActionListener(e -> {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());
                double res = switch (operation) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    default -> 0;
                };
                result.setText("Kết quả: " + res);
            } catch (Exception ex) {
                result.setText("Lỗi nhập số!");
            }
        });

        setVisible(true);
    }
}

class ChiaHetDialog extends JFrame {
    public ChiaHetDialog() {
        setTitle("Kiểm tra chia hết");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblA = new JLabel("Số a:");
        JTextField txtA = new JTextField();
        JLabel lblB = new JLabel("Số b:");
        JTextField txtB = new JTextField();
        JButton btnCheck = new JButton("Kiểm tra");
        JLabel result = new JLabel("");

        add(lblA); add(txtA);
        add(lblB); add(txtB);
        add(btnCheck); add(result);

        btnCheck.addActionListener(e -> {
            try {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                if (b == 0) {
                    result.setText("Không chia cho 0!");
                } else if (a % b == 0) {
                    result.setText(a + " chia hết cho " + b);
                } else {
                    result.setText(a + " không chia hết cho " + b);
                }
            } catch (Exception ex) {
                result.setText("Lỗi nhập số!");
            }
        });

        setVisible(true);
    }
}

class TienNuocDialog extends JFrame {
    public TienNuocDialog() {
        setTitle("Tính tiền nước");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblStart = new JLabel("Chỉ số đầu:");
        JTextField txtStart = new JTextField();
        JLabel lblEnd = new JLabel("Chỉ số cuối:");
        JTextField txtEnd = new JTextField();
        JButton btnTinh = new JButton("Tính");
        JLabel result = new JLabel("");

        add(lblStart); add(txtStart);
        add(lblEnd); add(txtEnd);
        add(btnTinh); add(result);

        btnTinh.addActionListener(e -> {
            try {
                int start = Integer.parseInt(txtStart.getText());
                int end = Integer.parseInt(txtEnd.getText());
                if (end >= start) {
                    int used = end - start;
                    int cost = used * 10000;
                    result.setText("Tổng tiền: " + cost + " VND");
                } else {
                    result.setText("Lỗi: cuối >= đầu");
                }
            } catch (Exception ex) {
                result.setText("Lỗi nhập số!");
            }
        });

        setVisible(true);
    }
}

class HinhChuNhatDialog extends JFrame {
    public HinhChuNhatDialog() {
        setTitle("Tính diện tích & chu vi HCN");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblDai = new JLabel("Chiều dài:");
        JTextField txtDai = new JTextField();
        JLabel lblRong = new JLabel("Chiều rộng:");
        JTextField txtRong = new JTextField();
        JButton btnTinh = new JButton("Tính");
        JLabel result = new JLabel("");

        add(lblDai); add(txtDai);
        add(lblRong); add(txtRong);
        add(btnTinh); add(result);

        btnTinh.addActionListener(e -> {
            try {
                double dai = Double.parseDouble(txtDai.getText());
                double rong = Double.parseDouble(txtRong.getText());
                if (dai > 0 && rong > 0) {
                    double dt = dai * rong;
                    double cv = 2 * (dai + rong);
                    result.setText("DT: " + dt + ", CV: " + cv);
                } else {
                    result.setText("Dữ liệu > 0");
                }
            } catch (Exception ex) {
                result.setText("Lỗi nhập số!");
            }
        });

        setVisible(true);
    }
}
