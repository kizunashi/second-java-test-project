import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        makeDir app1 = new makeDir();
        app1.run();
        while (true) {
            System.out.println("");
            System.out.println("Welcome to the Universal Converter Program.");
            System.out.println("");
            System.out.println("Please put the desired file inside the UCP folder.");
            System.out.println("    [1]Scan UCP folder");
            System.out.println("    [2]Exit");
            Scanner in = new Scanner(System.in);
            int answer = in.nextInt();
            if(answer == 1){
                fileFinder app2 = new fileFinder();
                app2.run();
            }
            if(answer == 2){
                break;
            }
        }
    }
}