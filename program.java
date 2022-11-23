import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

/**
 * programm
 */
public class program {
    static public void main(String[] args) {
        // LocalDateTime t = LocalDateTime.now(ZoneId.of("hh;mm"));
        // Scanner iScanner = new Scanner(System.in);
        // System.out.print("name: ");
        // String name = iScanner.nextLine();
        LocalDateTime ti = LocalDateTime.now(ZoneId.of("HH:mm"));
        System.out.print(ti);

    }

}
