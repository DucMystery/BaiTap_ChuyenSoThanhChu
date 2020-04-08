import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao so can chuyen:");
        int number = scanner.nextInt();
        if (number<10){
            System.out.println(checkSo(number));
        }else if (number<20 && number>10){
            int soDu = number%10;
            System.out.println(checkSo(soDu)+"teen");
        }else if (number>=20 && number<100){
            int donVi =number%10;
            int chuc = number/10;
            System.out.println(checkSo(chuc)+"ty"+" "+checkSo(donVi));
        }else if (number>99 && number<1000){
            int donVi =number%10;
            int tram = number/100;
            int chuc = (number%100)/10;
            if (chuc<1){
                System.out.println(checkSo(tram)+" hundred "+checkSo(donVi));
            }else if (chuc>0 && chuc<2){
                System.out.println(checkSo(tram)+" hundred "+checkSo(donVi)+"teen");
            }else {
                System.out.println(checkSo(tram)+" hundred"+checkSo(chuc)+"ty"+checkSo(donVi));
            }
        }
    }

    static String checkSo(int number) {
        String word;
        switch (number) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
            case 10:
                word = "ten";
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
        return word.toString();
    }
}
