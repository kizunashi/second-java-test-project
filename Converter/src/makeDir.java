import java.awt.*;
import java.io.File;
import java.util.Scanner;
class makeDir {
    public static void run() {
        File ucpDir = new File(System.getProperty("user.home") +  "/Desktop");
        if (!ucpDir.exists()){
            ucpDir.mkdirs();
        }
        File ucpFolder = new File(ucpDir, "UCP");
        boolean created = ucpFolder.mkdir();
        if (created) {
            System.out.println("UCP directory created in ");
        } else {
            System.out.println("Couldn't create new directory / Directory already exists");
        }
    }
}
