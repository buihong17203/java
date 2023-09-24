
import javax.net.ssl.SNIHostName;
import javax.print.attribute.standard.NumberUpSupported;
import java.util.*;

public class B003 {
    static ArrayList<Double> SN = new ArrayList<>();
    static ArrayList<Double> LK = new ArrayList<>();

    static void nhap() {

        Scanner scanner = new Scanner(System.in);

        boolean yn = true;

        while (yn) {
            System.out.println("Nhap n: ");
            double n = Double.parseDouble(scanner.nextLine());
            SN.add(n);

            String qd = scanner.nextLine();

            switch (qd) {
                case "y":
                    yn = true;
                    break;
                case "n":
                    yn = false;
                    break;
                default:

                    System.err.println();
            }
            if (n % 2 != 0) {
                System.out.println(n);
                LK.add(n);
            }


        }
    }

    static void xuat() {

        System.out.println("Danh sach so nguyen : " + SN);
    }

    public static void lietkesole() {

        System.out.println("Danh sach so lẻ : " + LK);
    }

    public static void tongsole() {
        Double S = (double) 0;
        for (Double i : LK) {
            S = S + i;
            i++;
        }
        System.out.println("Tổng Số Lẻ : " + S);
    }

    public static void timkiem() {
        nhap();
        System.out.println("Nhap so can tìm : ");
        Scanner scanner = new Scanner(System.in);
        Double k = scanner.nextDouble();
        boolean Kiemtra = SN.contains(k);
        int position2 = SN.indexOf(k);

        if (Kiemtra == true) {
            System.out.println("Vị trí  của phần tử k trong ArrayList là " + position2);
        } else {
            System.out.println("Không tìm thấy phần tử k.");
        }
    }

    public static void xapxep() {
        nhap();
        System.out.println("Mảng arraylist khi chưa xắp xếp : " + SN);
        SN.sort(Comparator.naturalOrder());
        System.out.println("Mảng arraylist sau khi duoc sắp xếp tăng dần : " + SN);
        SN.sort(Comparator.reverseOrder());
        System.out.println("Mảng arraylist sau khi duoc sắp xếp giam dần : " + SN);
    }

    public static void Xoa() {
        nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị k : ");
        Double k1 = scanner.nextDouble();
        SN.remove(k1);
        System.out.println("Danh sach arraylist sau khi xóa k1" + SN);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lc = scanner.nextInt();
//        switch (lc)
//        {
//            case 1:
        System.out.println("Thêm Phần tử vào arralist");
        nhap();
//                break;
//            case 2:
        System.out.println("In phần tử trong arraylist");
        xuat();
//                break;
//            case 3:
        System.out.println("Liệt Kê các phần tử lẻ trong arraylist");
        lietkesole();
//                break;
//            case 4:
        System.out.println("Tổng các số lẻ ");
        tongsole();
//                break;
//            case 5:
        System.out.println("tìm kiếm phần tử trong arraylist");
        timkiem();
//                break;
//           case 6:
        System.out.println("Xắp xếp");
        xapxep();
//                break;
//            case 7:
        System.out.println("đảo thứ tự");
//                break;
//            case 8:
        System.out.println("Xóa phần tử trong arraylist");
        Xoa();
//                break;
//            case 9:
        System.out.println("Chèn 1 phần tử vào arraylist và xóa phần tử cuối");
//                break;
//            case 10:
        System.out.println("Tìm phần tử max");
//                break;
//            case 11:
        System.out.println("Tìm Phần tử lớn thứ 2");
//                break;
//            default:
    }
}