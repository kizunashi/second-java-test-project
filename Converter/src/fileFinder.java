import java.io.*;
import java.util.Scanner;
class fileFinder {
    public static void run() throws FileNotFoundException {
        System.out.println("Enter the file name (with the file extension): ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        File fileDir = new File(System.getProperty("user.home") +  "/Desktop/UCP/" + answer);
        if (fileDir.exists()){
            Scanner scan = new Scanner(fileDir);
            System.out.println("");
            System.out.println(scan.nextLine());
        }
    }
}
