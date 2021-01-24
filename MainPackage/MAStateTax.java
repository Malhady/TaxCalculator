package MainPackage;

public class MAStateTax {

    public double calcMAStateTax(){
        UserVariables person = new UserVariables();
        double massTaxOwed;

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
