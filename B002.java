import java.util.Scanner;

public class B002
{
    private long Tien;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Nhập tên sản phẩm, số lượng và đơn giá. Tính tiền và thuế giá trị gia tăng phải trả, biết:
        String Ten = scanner.nextLine();
        int Tien = scanner.nextInt();
        int SL = scanner.nextInt();
        int DG = scanner.nextInt();
        float Thue = 0.1f;

        //a. tiền = số lượng * đơn giá
        Tien = SL * DG ;
        System.out.println("Tien " + Tien);

        //b. thuế giá trị gia tăng = 10% "
        Thue = Tien * 0.1f ;
        System.out.println(Thue);

    }
}
