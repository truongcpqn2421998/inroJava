import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số tiền muốn đổi: ");
        int USD= scanner.nextInt();
        int changeVND=USD*23000;
        System.out.printf("%d USD tương đương với %d VND ",USD,changeVND);
    }
}
