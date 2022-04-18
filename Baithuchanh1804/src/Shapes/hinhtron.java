package shapes;
import java.util.Scanner;
public class HinhTron extents Hinhhoc {
    public float bankinh;
    public HinhTron(){
        ten = "Hinh tron";
    }
    public void nhapBankinh() {
        system.out.println("Ban kinh = ");
        Scanner sc = new Scanner(system.in);
        bankinh = scanner.nextFLoat();
    }
    public void tinhChuvi() {
        chuvi = 2* PI * bankinh;
    }
    public void tinhDientich() {
        dientich = PI * bankinh * bankinh;
    }
}