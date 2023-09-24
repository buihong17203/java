import java.security.PublicKey;

public class Main3
{
    //tạo hàm trong class:  ta có thể tạo nhiều hàm trong 1 lớp
    public static class M1
    {
        static void m1()
        {
            System.out.println("A");
        }


        public static void m2()
        {
            System.out.println("B");
        }
    }

    public static void main(String[] args)
    {
        M1.m1();

        M1.m2();
    }
}
