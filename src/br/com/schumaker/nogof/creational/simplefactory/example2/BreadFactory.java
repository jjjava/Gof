package br.com.schumaker.nogof.creational.simplefactory.example2;

import java.util.Calendar;

/**
 *
 * @author Hudson Schumaker
 */
public class BreadFactory {

    public static Bread produceBread(Calendar cal) {
        if (cal == null) {
            cal = Calendar.getInstance();
        }
        // 3rd day of week
        if (cal.get(Calendar.DAY_OF_WEEK) == 3) {
            return new WonderfulBread();
        }
        // other days
        return new CommonBread();
    }
}
