/*
*
* This class will be used to run the main program
*
*/
package MainPackage;


public class Main {

    public static void main(String[] args) {

        /*
        Double userIncome = input.nextDouble();
        System.out.println();
        System.out.println("Enter your filing status (s: single | m: married): ");
        String filingStatus = input.nextLine();
        System.out.println();
        
        UserVariables.setIncome(userIncome);
        UserVariables.setFilingStatus(filingStatus);
        */
        UserVariables.setIncome(150000.0);
        UserVariables.setFilingStatus("Single");
        UserVariables.setStandardDeduction(12400.0);
        
        FederalTaxCalculations federalTax = new FederalTaxCalculations();
        double federalOwed = federalTax.calculateFederalTax();
            System.out.println("Federal Taxes Owed: " + federalOwed);
        FicaTaxCalculations ficaTax = new FicaTaxCalculations();
        double ficaTaxOwed = ficaTax.calculateFicaTax();
            System.out.println("FICA Taxes Owed: " + ficaTaxOwed);
        MAStateTax maStateTax = new MAStateTax();
        double maStateTaxOwed = maStateTax.calcMAStateTax();
            System.out.println("Mass State Tax: " + maStateTaxOwed);
        double totalTaxesOwed = maStateTaxOwed + ficaTaxOwed + federalOwed;
        System.out.println("Total Taxes Owed: " + totalTaxesOwed);

    }
    
}
