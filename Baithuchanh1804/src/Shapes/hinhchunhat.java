package shapes;
import java.util.Scanner;
public class Hinhchunhat extents Hinhhoc {
    public float dai;
    public float rong;
    public Hinhchunhat() {
        ten = "Hinh chu nhat";
    }
    public void nhapchieudai() {
        system.out.println("Chieu dai = ");
        Scanner sc = new scanner(system.in);
        dai = scanner.nextFLoat();
    }
    public void nhapchieurong() {
        system.out.println("Chieu rong = ");
        Scanner sc = new scanner(system.in);
        rong = scanner.nextFLoat();
    }
    public void tinhChuvi() {
        chuvi = 2 * (dai + rong);
    }
    public void tinhDientich() {
        dientich = dai * rong;
    }