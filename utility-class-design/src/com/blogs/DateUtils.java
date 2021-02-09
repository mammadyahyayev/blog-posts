package com.blogs;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class DateUtils {

    public static final String PATTERN = "dd-MM-yyyy";

    public static String parseDate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN);
        return dateFormat.format(calendar.getTime());
    }

}
