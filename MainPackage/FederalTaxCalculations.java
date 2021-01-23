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
            federalTaxAmount = federalTaxesSingleStatus(person);
            
        }else{
            federalTaxesMarriedStatus(person);
        }    

        return federalTaxAmount;
    }
    // this method will caclulate the federal liability for a 'single' filer
    private double federalTaxesSingleStatus(UserVariables person) {

        double deductedIncome =-1;
        deductedIncome = person.getIncome() - 12400;

            if(deductedIncome <= 9875){
                return 0.0;
            }
            if(deductedIncome <= 40125 && deductedIncome >= 9875){
                return ((987) + ((deductedIncome) - 9875) * .12);
            }
            if(deductedIncome <= 85525 && deductedIncome >= 40126){
                //the 3375 was found by the following calculator
                //(40125 - 9875) * .12
                return ((4617) + ((deductedIncome - 40125) * .22)); 
            }
            if(deductedIncome <= 163300 && deductedIncome >= 85526){
                return ((14605) + ((deductedIncome - 85526) * .24)); 
            }
                //33271 is caluclated by 
                //207350 - 163301 = ans * .32 = ans1 + 14605 from previous brackets
            if(deductedIncome <= 207350 && deductedIncome >= 163301){
                return ((33271) + ((deductedIncome - 163301) * .32)); 
            }
            if(deductedIncome <= 518400 && deductedIncome >= 207351){
                return ((47366) + ((deductedIncome - 207351) * .35)); 
            }
            if(deductedIncome >= 518401){
                return ((156233) + ((deductedIncome - 518401) * .37)); 
            }
        return -1;
    }

    private void federalTaxesMarriedStatus(UserVariables person) {
        //method empty for now
    }

}


/*
9875*.10 = 987
30250*.12 = 3630
9875*.22 = 2172






*/