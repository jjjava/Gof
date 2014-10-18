package br.com.schumaker.nogof.creational.simplefactory.example2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String args[]) {
        Calendar cal = Calendar.getInstance();
        List<Bread> breadList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            breadList.add(BreadFactory.produceBread(cal));
            cal.add(Calendar.DATE, 1);
        }
        System.out.println("Bread for next 7 days:");
        for (Bread b : breadList) {
            System.out.println(b.getDesc());
        }
    }
}
