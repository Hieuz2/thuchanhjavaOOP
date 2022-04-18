package shapes;
import java.util.Scanner;
public class HinhTru extents HinhTron {
    public float chieucao;
    public HinhTru() {
        ten = "Hinh Tru";
    }
    public void nhapChieucao() {
        nhapBankinh();

        system.out.println("Chieu cao = ");
        Scanner sc = new Scanner(system.in);
        chieucao = scanner.nextFLoat();
    }
    public void tinhThetich() {
        tinhDientich();
        thetich = dientich * chieucao;
    }
}
