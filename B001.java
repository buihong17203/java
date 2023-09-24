import java.util.Scanner;

public class B001
{


    public static void main(String[] args)
    {
        Scanner scanIn = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            String input = "";
            System.out.println("Nhập tháng bằng số:");
            input = scanIn.nextLine();
            switch (input) {
                case "1":
                    System.out.println("31 ngày.");
                    break;
                case "2":
                    System.out.println("28 hoặc 29 ngày.");
                    break;
                case "3":
                    System.out.println("31 ngày.");
                    break;
                case "4":
                    System.out.println("30 ngày.");
                    break;
                case "5":
                    System.out.println("31 ngày.");
                    break;
                case "6":
                    System.out.println("30 ngày.");
                    break;
                case "7":
                    System.out.println("31 ngày.");
                    break;
                case "8":
                    System.out.println("31 ngày.");
                    break;
                case "9":
                    System.out.println("30 ngày.");
                    break;
                case "10":
                    System.out.println("31 ngày.");
                    break;
                case "11":
                    System.out.println("30 ngày.");
                    break;
                case "12":
                    System.out.println("31 ngày.");
                    break;
                case "exit":
                    stop = true;
                    break;
                case "0":
                    stop = true;
                    break;
                default:
                    try {
                        int m = Integer.parseInt(input);
                        if (m < 1 || m > 12) {
                            System.out.println("Không có tháng này.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Phải nhập bằng số.");
                    }
                    break;
            }
        }
        System.out.println("Đã thoát.");
        System.exit(0);

        }
    }
