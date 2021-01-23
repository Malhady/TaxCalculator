/*
*
* This class will be used to run the main program
*
*/
package MainPackage;

public class Main {

    public static void main(String[] args) {

        //The userDetails object is being pulled from the UserVariables class
        //This class holds the getter/setter methods for the user input
        UserVariables userDetailsSingle = new UserVariables();
        UserVariables userDetailsMarried = new UserVariables();
        double userIncome = 159666.00;

        
        //temp user inputs
        String filingStatus = "Single";
        double standardDeduction = 12400;
        userDetailsSingle.setIncome(userIncome);
        userDetailsSingle.setFilingStatus(filingStatus);
        userDetailsSingle.setStandardDeduction(standardDeduction);
        
        /*
        String filingStatusMarried = "Married";
        double standardDeductionMarried = 24800;
        userDetailsMarried.setIncome(userIncome);
        userDetailsMarried.setFilingStatus(filingStatusMarried);
        userDetailsMarried.setStandardDeduction(standardDeductionMarried);
        */
        //This will call the federal tax calculator depending on the inputs given
        //and return a double of the federal taxes owed
        
        /*
        FederalTaxCalculations federalTax = new FederalTaxCalculations();
        double federalOwed = federalTax.calculateFederalTax();
        System.out.println(federalOwed);
        */

        FicaTaxCalculations ficaTax = new FicaTaxCalculations();
        double ficaTaxOwed = ficaTax.calculateFicaTax();
        System.out.println(ficaTaxOwed);
    }
    
}
