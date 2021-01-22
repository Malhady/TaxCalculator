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
        UserVariables userDetails = new UserVariables();

        //temp user inputs
        double userIncome = 90000.00;
        String filingStatus = "Single";
        double itemizedDeductions = 1000.00;
        userDetails.setIncome(userIncome);
        userDetails.setFilingStatus(filingStatus);
        userDetails.setItemizedDeductions(itemizedDeductions);

        //This will call the federal tax calculator depending on the inputs given
        //and return a double of the federal taxes owed
        FederalTaxCalculations federalTax = new FederalTaxCalculations();
        double federalOwned = federalTax.calculateFederalTax();
    }
    
}
