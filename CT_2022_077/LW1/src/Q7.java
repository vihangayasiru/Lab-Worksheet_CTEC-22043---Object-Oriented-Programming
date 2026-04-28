import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q7 {
    static void main() {

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter currentTimeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");

        String formattedCurrentTime = currentTime.format(currentTimeFormat);

        //System.out.println(currentTime.format(currentTimeFormat));


        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(500,500);
        myWindow.setTitle(formattedCurrentTime);
        myWindow.setVisible(true);


    }
}
