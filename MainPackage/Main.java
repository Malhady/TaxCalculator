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

        double userIncome = 4000.00;

        
        //temp user inputs
        String filingStatus = "Single";
        double standardDeduction = 24800;
        userDetailsSingle.setIncome(userIncome);
        userDetailsSingle.setFilingStatus(filingStatus);
        userDetailsSingle.setStandardDeduction(standardDeduction); 
        //This will call the federal tax calculator depending on the inputs given
        //and return a double of the federal taxes owed
        
        System.out.println(userIncome);
        FederalTaxCalculations federalTax = new FederalTaxCalculations();
        double federalOwed = federalTax.calculateFederalTax();

        FicaTaxCalculations ficaTax = new FicaTaxCalculations();
        double ficaTaxOwed = ficaTax.calculateFicaTax();

        MAStateTax maStateTax = new MAStateTax();
        double maStateTaxOwed = maStateTax.calcMAStateTax();

        double totalTaxesOwed = maStateTaxOwed + ficaTaxOwed + federalOwed;
        System.out.println(totalTaxesOwed);
    }
    
}
