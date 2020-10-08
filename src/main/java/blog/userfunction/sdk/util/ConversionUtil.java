package blog.userfunction.sdk.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ConversionUtil {

    public static String codeValue(String inValue){
        String retVal;
        try{
            retVal = inValue.replaceAll(" ", "").toLowerCase();
        } catch (Exception ex){
            retVal = null;
        }
        return retVal;
    }

    public static Date dateValue(int year, int month, int day){
        Date retVal;
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.of(year, month, day);
        retVal = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        return retVal;
    }

    public static Date dateNowValue(){
        Date retVal;
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.now();
        retVal = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        return retVal;
    }

    public static String stringValue(Object inObject){
        String retVal;
        retVal = String.valueOf(inObject);
        return retVal;
    }

}
