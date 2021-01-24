package MainPackage;

public class FicaTaxCalculations {

    public double calculateFicaTax(){
        UserVariables person = new UserVariables();
        double ficaTaxesPaid=-1;
        double tempInc;
        
        
        if(person.getIncome() <= Constants.FICA_TAX_HIGHRATE_LIMIT){
                ficaTaxesPaid = person.getIncome() * Constants.FICA_TAX_HIGHRATE_PERCENT;
        }
        else if(person.getFilingStatus().equals("Single")){
                //If the single persons income is less than 200000 run this 
            if(person.getIncome() <= Constants.FICA_TAX_PAYROLL_LIMIT_SINGLE){
                //tempInc is the amount above 133770 they will pay the 1.45% rate on
                tempInc = (person.getIncome() - Constants.FICA_TAX_HIGHRATE_LIMIT);
                ficaTaxesPaid = ((tempInc * Constants.FICA_TAX_LOWRATE_PERCENT) + Constants.FICA_TAX_HIGHRATE_LIMIT_PAID);
            }
                //If the single persons income is greater than 200000 run this
            else{
                tempInc = (person.getIncome() - Constants.FICA_TAX_PAYROLL_LIMIT_SINGLE);
                ficaTaxesPaid = (Constants.FICA_PAYROLL_TAX_BETWEEN
                + (tempInc * Constants.FICA_TAX_PAYROLL_RATE ) 
                + Constants.FICA_TAX_HIGHRATE_LIMIT_PAID);
            }
        }
        else if(person.getFilingStatus().equals("Married")){
            if(person.getIncome() <= Constants.FICA_TAX_PAYROLL_LIMIT_MARRIED){
                //tempInc is the amount above 133770 they will pay the 1.45% rate on
                tempInc = (person.getIncome() - Constants.FICA_TAX_HIGHRATE_LIMIT);
                ficaTaxesPaid = ((tempInc * Constants.FICA_TAX_LOWRATE_PERCENT) + Constants.FICA_TAX_HIGHRATE_LIMIT_PAID);
            }
                //If the single persons income is greater than 200000 run this
            else{
                tempInc = (person.getIncome() - Constants.FICA_TAX_PAYROLL_LIMIT_MARRIED);
                ficaTaxesPaid = (Constants.FICA_PAYROLL_TAX_BETWEEN_MARRIED
                + (tempInc * Constants.FICA_TAX_PAYROLL_RATE ) 
                + Constants.FICA_TAX_HIGHRATE_LIMIT_PAID);
            }
        }
            return ficaTaxesPaid;
    }
}
