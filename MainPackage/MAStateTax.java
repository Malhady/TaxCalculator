package MainPackage;

public class MAStateTax {

    public double calcMAStateTax(){
        UserVariables person = new UserVariables();
        double massTaxOwed;
            //State tax is at a solid 5% other than the 4400 for single
            //or the 8800 for married. Disregarding that every rate is the same
            //and does not change with an increase in amount
        if(person.getFilingStatus().equals("Single")){
            if(person.getIncome() <= Constants.MA_STATE_TAX_MINNIMUM_SINGLE){
            massTaxOwed = 0;
            }   
            else{
            massTaxOwed = ((person.getIncome()-Constants.MA_STATE_TAX_MINNIMUM_SINGLE) 
                        * Constants.MA_STATE_TAX_RATE);
            }
        }
        else if(person.getFilingStatus().equals("Married")){
            if(person.getIncome() <= Constants.MA_STATE_TAX_MINNIMUM_MARRIED){
            massTaxOwed = 0;
            }
            else{
            massTaxOwed = ((person.getIncome()-Constants.MA_STATE_TAX_MINNIMUM_MARRIED) 
            * Constants.MA_STATE_TAX_RATE);
            }
        }
        else{
            massTaxOwed = -1;
        }
        
        return massTaxOwed;

    }
    
}
