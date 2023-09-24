public class Main1 {

    //phương thức trong java ( hàm  không giá trị trả về )
    static void A1() {
        System.out.println("hello");
    }

    // phương thức có tham số (hàm có tham số )
    static void A2(String a1) {
        System.out.println(a1 + " Refsnes");
    }

    //phương thức có giá trị trả về ( hàm có giá trị trả về)
    static int A3(int x) {
        return 5 + x;
    }

    //phương thức sử dụng lệnh if-else
    static void A4(int a2) {
        if (a2 < 18) {
            System.out.println("d");
        } else {
            System.out.println("s");
        }
    }

    public static void main(String[] args)
    {   //1 hàm ta có thể gọi nhiều lần
        A1();   //cách gọi hàm không có giá trị trả về

        A2("a");    //cách gọi hàm không giá trị trả về có tham số

        System.out.println(A3(3)); // cách gọi hàm có giá trị trả về

        A4(20);

        //

        int x;
        int A5 = sum(10);
        System.out.println(A5);

        int A6 = sum(5, 10);
        System.out.println(A6);


    }

    //sử dụng hàm đệ quy để tính tổng các số từ 0 đến 10 sử dụng tình trạng lặp (return)
    public static int sum ( int k)
    {
        if (k > 0)
        {
            return k + sum(k - 1);
        }
        else
        {
            return 0;
        }
        //
    }

    //sủ dụng hàm để quy để tính tổng các số từ 5 đê 10 có sử dụng tình trạng tạm dừng
        public static int sum ( int start, int end)
        {
            if (end > start)
            {
                return end + sum(start, end - 1);
            }
            else
            {
                return end;
            }
        }



}
