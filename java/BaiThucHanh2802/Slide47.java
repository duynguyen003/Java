package BaiThucHanh2802;
import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args){
        float sum = 0, number;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Nhap vao so:");
            number = scanner.nextFloat();
            sum += number;
            
            if (sum > 100);
                break;
        }
        while (number > 0);
        System.out.println("tong = " + sum);
    }
}
