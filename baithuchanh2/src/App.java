import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //đối tượng sử dụng để nhập xuất dữ liệu trong java
        Scanner sc = new Scanner(System.in);
        //khai báo 1 biến để chứa giá trị nhập vào từ bàn phím
        String strHoTen = "";
        //thông báo cho người dùng biết cần nhập vào họ tên
        System.out.println("nhập họ tên: ");
        //gắn giá trị nhập từ bàn phím cho biến strHoTen
        strHoTen = sc.nextLine();
        System.out.println("Xin chào" + strHoTen);
    }
}
