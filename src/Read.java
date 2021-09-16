import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=scanner.nextInt();
        String read;
        if(number>0&&number<20){
            ones(number);
        }
        if(number>=20&&number<100){
            int one=(number-(number%10))/10;
            int two=number%10;
            tens(one);
            ones(two);
        }
        if(number>=100&&number<1000){
            int one=(number-(number%100))/100;
            int two=((number%100)-((number%100)%10))/10;
            int three=(number%100)%10;
            ones(one);
            System.out.print("hundred ");
            tens(two);
            ones(three);
        }
    }
    static void ones(int a){
        String readOnes="";
        switch (a){
            case 1:
                readOnes="one ";
                break;
            case 2:
                readOnes="two ";
                break;
            case 3:
                readOnes="three ";
                break;
            case 4:
                readOnes="four ";
                break;
            case 5:
                readOnes="five ";
                break;
            case 6:
                readOnes="six ";
                break;
            case 7:
                readOnes="seven ";
                break;
            case 8:
                readOnes="eight ";
                break;
            case 9:
                readOnes="nine ";
                break;
            case 10:
                readOnes="ten ";
                break;
            case 11:
                readOnes="eleven";
                break;
            case 12:
                readOnes="twelve";
                break;
            case 13:
                readOnes="thirteen";
                break;
            case 14:
                readOnes="fourteen";
                break;
            case 15:
                readOnes="fifteen";
                break;
            case 16:
                readOnes="sixteen";
                break;
            case 17:
                readOnes="seventeen";
                break;
            case 18:
                readOnes="eighteen";
                break;
            case 19:
                readOnes="nineteen";
                break;
            default:
                readOnes="";
        }
        System.out.printf("%s",readOnes);
    }
    static void tens(int a){
        String readTens="";
        switch (a){
            case 2:
                readTens="Twenty ";
                break;
            case 3:
                readTens="Thirty ";
                break;
            case 4:
                readTens="forty ";
                break;
            case 5:
                readTens="fifty ";
                break;
            case 6:
                readTens="sixty ";
                break;
            case 7:
                readTens="seventy ";
                break;
            case 8:
                readTens="eighty ";
                break;
            case 9:
                readTens="ninety ";
                break;
        }
        System.out.printf("%s",readTens);
    }
}
