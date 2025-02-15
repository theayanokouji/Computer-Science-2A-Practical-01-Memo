import java.util.Scanner;

import acsse.csc2a.TextStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter text to be reversed:");
        
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        TextStore txtInput = new TextStore(line.toCharArray(), line.length());

        txtInput.transform();

        for (int i = 0; i < txtInput.getLength(); i++)
            System.out.print(txtInput.getCharAt(i));
        System.out.println();

        scan.close();
    }
}
