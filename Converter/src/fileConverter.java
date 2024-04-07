import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.*;
import java.util.Scanner;

class fileConverter {
    public static void run() {
        System.out.println("The converter is running.");
            try {
                FileInputStream txtFile = new FileInputStream(new File("C:\\Users\\Dilibrium\\Desktop\\UCP\\file3000.txt"));
                BufferedReader br = new BufferedReader(new InputStreamReader(txtFile));

                XWPFDocument wordFile = new XWPFDocument();
                XWPFParagraph paragraph = wordFile.createParagraph();
                XWPFRun run = paragraph.createRun();

                String line;
                while ((line = br.readLine()) != null) {
                    run.setText(line);
                    run.addBreak();
                }
                FileOutputStream fos = new FileOutputStream("C:\\Users\\Dilibrium\\Desktop\\UCP\\output.docx");
                wordFile.write(fos);

                fos.close();
                br.close();

                System.out.println("Файл успешно сконвертирован в формат Word.");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}