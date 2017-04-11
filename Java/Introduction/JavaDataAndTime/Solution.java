package Introduction.JavaDataAndTime;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);
        int month = Integer.parseInt(in.next());
        int day = Integer.parseInt(in.next());
        int year = Integer.parseInt(in.next());

        /*Calendar calendar = new GregorianCalendar(2017, 4,13);
        System.out.println(calendar.getWee);*/

        //Locale.setDefault(Locale.CHINA);
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        System.out.println(String.format("%1$tA", c).toUpperCase());
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        String dateInString = "11-4-2017";
        Date date = sdf.parse(dateInString);

        Calendar dataCalendar = sdf.parse(dateInString);*/

    }
}
