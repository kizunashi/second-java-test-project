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
            System.out.println("");
            System.out.println("Is this file ok?(y/n)");
            Scanner in2 = new Scanner(System.in);
            String answer2 = in2.nextLine();
            if( answer2 == "y"){
                fileConverter app1 = new fileConverter();
                app1.run();
            }
            if (answer2 == "n") {
                System.out.println("");
            }
        }
    }
}
