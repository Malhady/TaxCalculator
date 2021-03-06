package MainPackage;

public class FicaTaxCalculations {

    public double calculateFicaTax(){
        UserVariables person = new UserVariables();
        double ficaTaxesPaid=-1;
        double tempInc;
        
        //Checks the persons income if it less than the highrate limit of 137700
        //If it is less then it taxes them at the regular rate
        if(person.getIncome() <= Constants.FICA_TAX_HIGHRATE_LIMIT){
                ficaTaxesPaid = person.getIncome() * Constants.FICA_TAX_HIGHRATE_PERCENT;
        }
        //Checks if the filing status is for a single filer
        else if(person.getFilingStatus().equals("Single")){
                //If the single persons income is less than 200000 run this 
            if(person.getIncome() <= Constants.FICA_TAX_PAYROLL_LIMIT_SINGLE){
                //tempInc is the amount above 133770 they will pay the 1.45% rate on
                tempInc = (person.getIncome() - Constants.FICA_TAX_HIGHRATE_LIMIT);
                ficaTaxesPaid = ((tempInc * Constants.FICA_TAX_LOWRATE_PERCENT) + Constants.FICA_TAX_HIGHRATE_LIMIT_PAID);
            }
                //If the single persons income is greater than 200000 run this
            else{
                //The constant variables relate to different values in each category as it changes per group
                tempInc = (person.getIncome() - Constants.FICA_TAX_PAYROLL_LIMIT_SINGLE);
                ficaTaxesPaid = (Constants.FICA_PAYROLL_TAX_BETWEEN
                + (tempInc * Constants.FICA_TAX_PAYROLL_RATE ) 
                + Constants.FICA_TAX_HIGHRATE_LIMIT_PAID);
            }
        }
        //Checks if the filing status is for a married filer
        else if(person.getFilingStatus().equals("Married")){
            if(person.getIncome() <= Constants.FICA_TAX_PAYROLL_LIMIT_MARRIED){
                //tempInc is the amount above 133770 they will pay the 1.45% rate on
                tempInc = (person.getIncome() - Constants.FICA_TAX_HIGHRATE_LIMIT);
                ficaTaxesPaid = ((tempInc * Constants.FICA_TAX_LOWRATE_PERCENT) + Constants.FICA_TAX_HIGHRATE_LIMIT_PAID);
            }
                //If the single persons income is greater than 200000 run this
            else{
                //tempinc represents the income that is going to get taxed at the payroll rate after the fica tax limit hit
                tempInc = (person.getIncome() - Constants.FICA_TAX_PAYROLL_LIMIT_MARRIED);
                ficaTaxesPaid = (Constants.FICA_PAYROLL_TAX_BETWEEN_MARRIED
                + (tempInc * Constants.FICA_TAX_PAYROLL_RATE ) 
                + Constants.FICA_TAX_HIGHRATE_LIMIT_PAID);
            }
        }
        //at the end returns the total amount
            return ficaTaxesPaid;
    }
}
