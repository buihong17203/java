public class Main
{
    public static void main(String[] args)
    {
        // đầu ra
        System.out.println("Hello world!");

        //biến trong java
        int x2 = 0;
        float x3 = 5.01f;
        char x4 = 'A';
        boolean x5 = false;

        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

        //chuỗi
        String y1 = "ABCDE 12345";
        System.out.println("chiều dài chuỗi" + y1.length()); //length() dùng để đo chiều dài chuỗi
        System.out.println(y1.toUpperCase());   // toUpperCase() dùng để in chuỗi ra theo kiểu chữ hoa
        System.out.println(y1.toLowerCase());   // toLowerCase() dùng để in chuỗi ra theo kiểu chữ thường
        System.out.println(y1.indexOf("C"));    // indexOf() dùng để tìm vị chí và chỉ ra vị chí của chuỗi cần tìm trong hàm

        int y2 = 6;
        String z = y1 + y2; // + dùng để nối chuỗi với nhau hoặc với biến khác
/*
                 \ n : dùng để xuống dòng
                 \ r : dùng để Trở lại
                 \ t : dùng để tạo khoảng cách (tab)
                 \ B : dùng để tạo 1 khoảng chống (backspace)
                 \ f : Form Feed
*/

        // toán trong java
        System.out.println(Math.max(5, 10));    //Math.max(x,y):  được sử dụng để tìm giá trị cao nhất của x và y
        System.out.println(Math.min(5, 10));    //Math.min(x,y): được sử dụng để tìm giá trị thấp nhất của x và y
        System.out.println(Math.sqrt(64));      //Math.sqrt(x) : dùng để trả về căn bậc hai của x :
        System.out.println(Math.abs(-4.7));     //Math.abs(x) : dùng để trả về giá trị tuyệt đối (dương) của x :
        System.out.println(Math.random());      //Math.random()  : dùng để trả về một số ngẫu nhiên trong khoảng từ 0,0 (bao gồm) và 1,0 (độc quyền):

        // câu lệnh nếu- thì (if-else)
        int c1 = 17;
        if (c1 < 18)
        {
            System.out.println("d");
        } else {
            System.out.println("s");
        }

        //câu lệnh chuyển đổi (switch-case)
        int day = 4;
        switch (day)
        {
            case 1:
                System.out.println("Thứ hai");
                break;
            case 2:
                System.out.println("Thứ ba");
                break;
            case 3:
                System.out.println("Thứ tư");
                break;
            case 4:
                System.out.println("Thứ năm");
                break;
            case 5:
                System.out.println("Thứ sáu");
                break;
            case 6:
                System.out.println("Thứ bảy");
                break;
            case 7:
                System.out.println("Chủ nhật");
                break;
        }

        //vòng lặp (while) hoặc (do-while)

        int i = 0;
        while (i < 5)
        {
            System.out.println(i);
            i++;
        }
        //-------------------------------------//
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        //vòng lặp (for)
        for (int f = 0; f < 5; f++)
        {
            System.out.println(f);
        }
                //dùng để lặp trong 1 mảng
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String c2 : cars) {
            System.out.println(c2);
        }

        //ta có thể sử dung (break;) hoặc (continue;) trong vòng lặp while

        //mảng trong java
        String[] c3 = {"A", "B", "C", "D" , "E"};
        System.out.println(c3[0]);

        int[] c4 = {10, 20, 30, 40};
        System.out.println(c4[3]);

                // lặp các phần tử trong mảng
        String[] c5 = {"a", "b", "c", "d", "e"};
        for (int i1 = 0; i1 < cars.length; i1++) {
            System.out.println(cars[i1]);
        }

        for (String i1 : cars) {
            System.out.println(i1);
        }

        //mảng đa chiều trong java
        int[][] d1 = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(d1 [1][2]);

                //thay đổi giá trị phần tử trong mảng đa chiều
        d1 [1][2] = 9;


                // lặp mảng đa chiều
        int[][] d2 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i2 = 0; i < d2.length; ++i2) {
            for(int j = 0; j < d2[i2].length; ++j) {
                System.out.println(d2[i2][j]);
            }
        }


    }
}