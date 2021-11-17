import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("Enter names separated by a space.");
            System.out.print(">>>");

            String names = new Scanner(System.in).nextLine();
            String[] nameArr = names.split(" ");

            Collections.shuffle(Arrays.asList(nameArr));

            for(int i = 0; i < nameArr.length; i++) {
                System.out.print(nameArr[i] + " --> ");
            }
            System.out.print(nameArr[0]);
    }
}