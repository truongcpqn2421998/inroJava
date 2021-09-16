import java.util.Scanner;

public class CountDayInMoth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập Tháng bạn muốn tính ngày");
        int month= scanner.nextInt();
        String dayinmonth;
        switch (month){
            case 2:
                dayinmonth="28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayinmonth="31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayinmonth="30";
                break;
            default:
                dayinmonth="";
        }
        if (!dayinmonth.equals("")) System.out.printf("The month '%d' has %s days!", month, dayinmonth);
        else System.out.print("Invalid input!");
    }
}
