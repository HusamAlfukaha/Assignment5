package Assignment5;

public class Application {
    public static void main(String[] args) {

        /** Program to calculate employees Social Security  */

        Func<Double,Func<Double,Double>> ssc = tax->salary-> salary* (tax)/100;
        Func<Double, Double> taxValue = ssc.apply(7.5);
        Double monthlyDeduction = taxValue.apply(550.0);
        System.out.println( "your monthly deduction from SSC: " + monthlyDeduction);

        /**We are able to do as many we have since we pinned tax value  */
        Double employeeNo1 = taxValue.apply(700.0);
        System.out.println("employeeNo1 deduction  = " + employeeNo1 );
        Double employeeNo2 = taxValue.apply(750.0);
        System.out.println("employeeNo2 deduction  = " + employeeNo2 );
        Double employeeNo3 = taxValue.apply(980.0);
        System.out.println("employeeNo3 deduction  = " + employeeNo3 );




    }
}
