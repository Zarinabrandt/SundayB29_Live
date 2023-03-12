package util;

public class CoolCode {

    public static double convertFromDollar(String currency, double dollar) {


        double result = 0;
        switch (currency.toLowerCase().trim()) {

            case "euro":
                result = dollar * 0.91;
                break;
            //instead: return dollar * 0.91
            case "yen":
                result = dollar * 121.03;
                break;
            case "lira":
                result = dollar * 14.85;
                break;
            case "won":
                result = dollar * 1217.52;
                break;
            case "rupee":
                result = dollar * 184.45;
                break;

        }
        return result;

    }
}
