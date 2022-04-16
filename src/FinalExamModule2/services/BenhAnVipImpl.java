package FinalExamModule2.services;

import FinalExamModule2.models.BenhAnThuong;
import FinalExamModule2.models.BenhAnVIP;
import FinalExamModule2.util.ReadAndWrite;
import FinalExamModule2.util.Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnVipImpl implements BenhAnVIPService {
    public static List<BenhAnVIP> benhAnList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private static final String BENH_AN = "BA-[\\d]{3}";


    @Override
    public void display() {

    }

    @Override
    public void addNew() {

        List<BenhAnVIP> benhAnList = ReadAndWrite.readBenhAnVIP();


        int soThuTu;
        if (benhAnList.isEmpty()) {
            soThuTu = 1;
        } else {
            soThuTu = Integer.parseInt(benhAnList.get(benhAnList.size() - 1).getSoThuTu()) + 1;
        }
        System.out.println("So Thu Tu: " + soThuTu);


        System.out.println("Ma Benh An: ");
        String maBenhAn = inputmaBenhAn();


        String tenBenhNhan;
        do {
            System.out.println("Ten Benh Nhan: ");
            tenBenhNhan= sc.nextLine();
        } while (tenBenhNhan.equals(""));


        String lyDo ;
        do {
            System.out.println("Ly Do Nhap Vien: ");
            lyDo = sc.nextLine();
        } while (lyDo.equals(""));

        String phi;
        do {
            System.out.println("Phi Nam Vien: ");
            phi = sc.nextLine();
        } while (phi.equals(""));

        String vip;
        do {
            System.out.println("Loai Vip: ");
            vip = sc.nextLine();
        } while (vip.equals(""));

        String HanVIP;
        do {
            System.out.println("Thoi Han VIP: ");
            HanVIP = sc.nextLine();
        } while (HanVIP.equals(""));


        String ngayNhapVien;
        while (true) {
            System.out.println("Ngay Nhap Vien: ");
            ngayNhapVien= sc.nextLine();
            SimpleDateFormat ngayNhap = new SimpleDateFormat("dd-MM-yyyy");
            ngayNhap.setLenient(false);
            try {
                ngayNhap.parse(ngayNhapVien);
            }
            catch (ParseException e) {
                System.out.println("Error: Invalid date -> Try again! ");
                continue;
            }
            break;
        }

        String ngayRaVien;
        while (true) {
            System.out.println("Ngay Ra Vien: ");
            ngayRaVien= sc.nextLine();
            SimpleDateFormat ngayRa = new SimpleDateFormat("dd-MM-yyyy");
            ngayRa.setLenient(false);
            try {
                ngayRa.parse(ngayRaVien);
            }
            catch (ParseException e) {
                System.out.println("Error: Invalid date -> Try again! ");
                continue;
            }
            break;
        }



        BenhAnVIP benhAn = new BenhAnVIP(Integer.toString(soThuTu),maBenhAn,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDo,vip,HanVIP);
        benhAnList.add(benhAn);
        if (benhAnList.size() == 1) {
            ReadAndWrite.writeBenhAnVIP(benhAnList, true);
        }
        else
        if (benhAnList.size() > 1) {
            for (int i = 0; i < benhAnList.size()-1; i++) {
                benhAnList.remove(i);
            }
            ReadAndWrite.writeBenhAnVIP(benhAnList, true);
        }

    }

    @Override
    public void delete() {

    }


    public String inputmaBenhAn(){

        return Regex.regexStr(sc.nextLine(),BENH_AN,"Import bad format -> Please enter again: ");
    }


}

