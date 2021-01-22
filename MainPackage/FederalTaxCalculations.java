/*
*
* This class will be used to calculate federal tax
*
*/
package MainPackage;

public class FederalTaxCalculations{
    private double federalTaxAmount = 0.0;

    //this method seperates filing status type depending on input given by user
    public double calculateFederalTax() {   
        UserVariables person = new UserVariables();
        if(person.getFilingStatus().equals("Single")){
            federalTaxesSingleStatus(person);
        }    

        return federalTaxAmount;
    }
    
    //this method will caclulate the federal liability for a 'single' filer
    private double federalTaxesSingleStatus(UserVariables person) {
        double amountOwed=0.0;
        double tempIncome = 0.0;
        double[] amountPreviousTaxBracket = new double[6];


        //Logic is incorrect here
            if(person.getIncome() >= 12400){
                amountOwed = 0.0;
                tempIncome = 12400;
                amountPreviousTaxBracket[0] = 0;
            }
            if(person.getIncome() > 40125){
                amountOwed = (person.getIncome() - tempIncome) *.12;
                amountPreviousTaxBracket[1] = amountOwed;
                tempIncome = 40125;
            }
            if(person.getIncome() > 85525){
                System.out.println(amountOwed);
                amountOwed = (person.getIncome() - tempIncome) *.22 + amountPreviousTaxBracket[1];
                System.out.println(amountOwed);
                amountPreviousTaxBracket[2] = amountOwed;
                tempIncome = 85525;
            }
        
        return amountOwed;
    }


}
