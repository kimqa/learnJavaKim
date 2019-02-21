package libs;

public class Calc {

    public static int sum(int temp_var1, int temp_var2) {
        System.out.println("Result = " + (temp_var1 + temp_var2));
        return temp_var1 + temp_var2;
    }

    public static String sum(String temp_strinng1, String temp_string2) {
        System.out.println("String result = " + temp_strinng1+" "+temp_string2);
        return temp_string2 + temp_strinng1;
    }

    public static int multiplication(int multiplier1, int multiplier2) {
        System.out.println("Multiplication result = " + (multiplier1 * multiplier2));
        return multiplier1*multiplier2;
    }

    public static String sum(String varString, int varInt) {
        System.out.println("Result String + int = " + varString + varInt);
        return varString + varInt;
    }

    /**
     * Явное приведение типов
     * @param varInt
     * @param varString
     * @return
     */
    public  static int sum(int varInt, String varString) {
        try {
            int tempResult = varInt + Integer.parseInt(varString);
            System.out.println("Result = " + tempResult);
            return tempResult;
        }catch (NumberFormatException e) {                                           //Дал Exception имя e
            System.out.println("Error " + e);
            return 88888;
        }catch (Exception e) {
            System.out.println("Error " + e);
            return 99999;
        }
    }

    /**
     * HW 4.1
     * @param div1
     * @param div2
     * @return
     */

    public static int div(int div1, int div2) {
        try {
            int tempdiv = div1 / div2;
            System.out.println("div = " + tempdiv);
            return tempdiv;
        } catch (Exception e) {
            System.out.println("[Exception] " + e);
            return 88888;
        }
    }

    public static double div (double div1, double div2) {
        try {
            double temp = div1 / div2;
            System.out.println("div = " + temp);
            return temp;
        } catch (Exception e) {
            System.out.println("[EXCEPTION] = " + e);
            return 666;
        }
    }
}