package main;
import shapes.HinhTron;
import shapes.Hinhchunhat;
import shapes.HinhTru;
import shapes.Hinhvuong;

public class mainclass {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBankinh();
        ht.tinhChuvi();
        ht.tinhDientich();
        ht.inChuvi();
        ht.inDientich();

        HinhTru htru = new HinhTru();
        htru.xuatTen();
        htru.nhapChieucao();
        htru.tinhThetich();
        htru.inThetich();

        Hinhchunhat hcn = new Hinhchunhat();
        hcn.xuatTen();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhChuvi();
        hcn.tinhDientich();
        hcn.inChuvi();
        hcn.inDientich();

        Hinhvuong hv = new Hinhvuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuvi();
        hv.tinhDientich();
        hv.inChuvi();
        hv.inDientich();
    }
}