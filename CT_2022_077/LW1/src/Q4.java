import java.util.Date;
import java.text.SimpleDateFormat;

public class Q4 {
    static void main(String[] args) {

        Date todayDate = new Date();
        SimpleDateFormat simpleDataformat = new SimpleDateFormat("dd/MMMM/yyyy");

        System.out.println(simpleDataformat.format(todayDate));
    }
}