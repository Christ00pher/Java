/**
 * Created by chris on 30.08.16.
 */
public class App {
    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 301232;

        float floatValue = 555.7f;
        double doubleValue = 29.6;


        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);


        //intValue = longValue;
        intValue = (int)longValue;

        //manual casting is no needed in case int->double
        doubleValue = intValue;
        System.out.println(doubleValue);


        //intValue = floatValue;
        intValue = (int)floatValue;
        System.out.println(intValue);
    }
}
