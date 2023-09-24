public class Main2
{
    //hướng đối tượng trong java
    public static class Main1    //tạo 1 lớp
    {
        int x = 5;
        int x1 = 10;
    }
    public static void main(String[] args)
    {

        //gọi lớp vào main
        Main1 myObj = new Main1();
        System.out.println(myObj.x); //gán x cho đối tượng đc tạo

        //Bạn có thể truy cập các thuộc tính bằng cách tạo một đối tượng của lớp và bằng cách sử dụng cú pháp dấu chấm (.)

        //sửa đổi thuộc tính
        myObj.x = 40;
        System.out.println(myObj.x);

        //Nếu bạn không muốn có khả năng ghi đè các giá trị hiện có, hãy khai báo thuộc tính là final


    }

}
