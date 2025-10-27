import javax.swing.JFrame;

public class SimpleWindow {
    public static void main(String[] args) {
        // Tạo một cửa sổ JFrame
        JFrame frame = new JFrame("Galaxy Client");
        
        // Đặt kích thước cửa sổ
        frame.setSize(300, 200);
        
        // Đặt chế độ thoát khi đóng cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}
