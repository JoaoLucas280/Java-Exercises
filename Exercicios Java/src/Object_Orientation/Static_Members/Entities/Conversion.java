package Object_Orientation.Static_Members.Entities;

public class Conversion {

    public static final double IOF = 1.06;

    public static double CurrencyConverter(double dolarValue, double quantity) {
        return dolarValue * quantity * IOF;
    }







}
