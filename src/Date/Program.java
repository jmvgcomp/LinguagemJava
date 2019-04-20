package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date();

        long date = System.currentTimeMillis();
        System.out.println(date);
        System.out.println("1552581612737");

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("14/03/2019 13:36:00");

        System.out.println(sdf2.format(x1));
        System.out.println(sdf2.format(x2));
        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2));
        System.out.println(sdf3.format(date));

    }
}
