import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5 {
    static void main() {
        Date todayDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE,MMM dd,yyyy");

        System.out.println(simpleDateFormat.format(todayDate));
    }
}
