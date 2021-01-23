package MainPackage;

public class FicaTaxCalculations {

    public double calculateFicaTax(){
        UserVariables person = new UserVariables();
        double ficaTaxesPaid;
        double tempInc;
            if(person.getIncome() <= Constants.FICA_TAX_HIGHRATE_LIMIT){
                ficaTaxesPaid = person.getIncome() * Constants.FICA_TAX_HIGHRATE_PERCENT;
            }
            else if(person.getIncome() <= Constants.FICA_TAX_PAYROLL_LIMIT) {
                tempInc = (person.getIncome() - Constants.FICA_TAX_HIGHRATE_LIMIT);
                ficaTaxesPaid = ((tempInc * Constants.FICA_TAX_LOWRATE_PERCENT) + Constants.FICA_TAX_HIGHRATE_LIMIT_PAID);
            }else{
                tempInc = (person.getIncome() - Constants.FICA_TAX_PAYROLL_LIMIT);
                ficaTaxesPaid = (Constants.FICA_PAYROLL_TAX_BETWEEN 
                            + (tempInc * Constants.FICA_TAX_PAYROLL_RATE) 
                            + Constants.FICA_TAX_HIGHRATE_LIMIT_PAID);
            }

            return ficaTaxesPaid;
    }
}
