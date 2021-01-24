/*
*
* This class will be used to calculate federal tax
*
*/
package MainPackage;

public class FederalTaxCalculations{
    
    //this method seperates filing status type depending on input given by user
    public double calculateFederalTax() {   
        UserVariables person = new UserVariables();
        //runs the single or the married filing status
        if(person.getFilingStatus().equals("Single")){
            return (federalTaxesSingleStatus(person));
            
        }else{
            federalTaxesMarriedStatus(person);
            return(federalTaxesMarriedStatus(person));
        }    
    }

    // This method will caclulate the federal liability for a 'single' filer
    private double federalTaxesSingleStatus(UserVariables person) {
        double federalTaxOwedAmount = -1;
        //due to Standard Deduction, -12400 is auto taken out
        double deductedIncome = person.getIncome() - person.getStandardDeduction();

        //Can not use a switch as varialbes are doubles
        //And switch statemnts are for conditionals not
        //calcualtions such as # is inbetween X and Y
            if(deductedIncome <= Constants.FIRSTBRACKETSINGLE) {
                federalTaxOwedAmount = (deductedIncome * .10);
            }
            //checks if the amount their deductedIncome total is between which bracket
            //If it is between the bracket it adds the previous bracket's tax total
            //then it subtracts their amount from the second bracket and multiplies it by the percent taxed
            //all brackets follow the same order
            else if(deductedIncome <= Constants.SECONDBRACKETSINGLE && deductedIncome >= Constants.FIRSTBRACKETSINGLE){
                federalTaxOwedAmount = ((Constants.FIRSTBRACKETSINGLEOWED)
                        + ((deductedIncome) - Constants.FIRSTBRACKETSINGLE) * .12);
            }
            else if(deductedIncome <= Constants.THIRDBRACKETSINGLE && deductedIncome >= Constants.SECONDBRACKETSINGLE){
                federalTaxOwedAmount = ((Constants.SECONDBRACKETSINGLEOWED) 
                        + ((deductedIncome - Constants.SECONDBRACKETSINGLE) * .22)); 
            }
            else if(deductedIncome <= Constants.FOURTHBRACKETSINGLE && deductedIncome >= Constants.THIRDBRACKETSINGLE){
                federalTaxOwedAmount = ((Constants.THIRDBRACKETSINGLEOWED)
                         + ((deductedIncome - Constants.THIRDBRACKETSINGLE) * .24)); 
            }
            //EX:
            //if statements checks if between 207350 and 163300. If the income is 180000 then it will run this if statement
            //Inside the if statement it will add the total tax amount from all the brackets up to 163300
            //Deducted income is then subtracted by the lowest bracket which leaves whatever is above the lowest bracket
            //that amount is then multiplied by the percentage. They are all added then to show the total taxed amount
            else if(deductedIncome <= Constants.FIFTHBRACKETSINGLE && deductedIncome >= Constants.FOURTHBRACKETSINGLE){
                federalTaxOwedAmount = ((Constants.FOURTHBRACKETSINGLEOWED) 
                        + ((deductedIncome - Constants.FOURTHBRACKETSINGLE) * .32)); 
            }
            else if(deductedIncome <= Constants.SIXTHBRACKETSINGLE && deductedIncome >= Constants.FIFTHBRACKETSINGLE){
                federalTaxOwedAmount = ((Constants.FIFTHBRACKETSINGLEOWED) 
                        + ((deductedIncome - Constants.FIFTHBRACKETSINGLE) * .35)); 
            }
            else if(deductedIncome >= Constants.SIXTHBRACKETSINGLE){
                federalTaxOwedAmount = ((Constants.SIXTHBRACKETSINGLEOWED) 
                        + ((deductedIncome - Constants.SIXTHBRACKETSINGLE) * .37)); 
            }

            if(federalTaxOwedAmount <=0){
                federalTaxOwedAmount =0;
            }
        return federalTaxOwedAmount;
    }



    private double federalTaxesMarriedStatus(UserVariables person) {
        double federalTaxOwedAmount = -1;
        double deductedIncome = person.getIncome() - person.getStandardDeduction();

        //the formula to get the previous tax brackets full tax liability
        //is to subtract the higherbar - lowerbar * the % taxed, then add to the previous
        if(deductedIncome <= Constants.FIRSTBRACKETMARRIED){
            federalTaxOwedAmount = (deductedIncome * .10);
        }
        else if(deductedIncome <= Constants.SECONDBRACKETMARRIED && deductedIncome >= Constants.FIRSTBRACKETMARRIED){
            federalTaxOwedAmount = ((Constants.FIRSTBRACKETMARRIEDOWED) 
                        + ((deductedIncome) - Constants.FIRSTBRACKETMARRIED) * .12);
        }
        else if(deductedIncome <= Constants.THIRDBRACKETMARRIED && deductedIncome >= Constants.SECONDBRACKETMARRIED){
            federalTaxOwedAmount = ((Constants.SECONDBRACKETMARRIEDOWED) 
                        + ((deductedIncome - Constants.SECONDBRACKETMARRIED) * .22)); 
        }
        else if(deductedIncome <= Constants.FOURTHBRACKETMARRIED && deductedIncome >= Constants.THIRDBRACKETMARRIED){
            federalTaxOwedAmount = ((Constants.THIRDBRACKETMARRIEDOWED) 
                        + ((deductedIncome - Constants.THIRDBRACKETMARRIED) * .24)); 
        }
        else if(deductedIncome <= Constants.FIFTHBRACKETMARRIED && deductedIncome >= Constants.FOURTHBRACKETMARRIED){
            federalTaxOwedAmount = ((Constants.FOURTHBRACKETMARRIEDOWED) 
                        + ((deductedIncome - Constants.FOURTHBRACKETMARRIED) * .32)); 
        }
        else if(deductedIncome <= Constants.SIXTHBRACKETMARRIED && deductedIncome >= Constants.FIFTHBRACKETMARRIED){
            federalTaxOwedAmount = ((Constants.FIFTHBRACKETMARRIEDOWED) 
                        + ((deductedIncome - Constants.FIFTHBRACKETMARRIED) * .35)); 
        }
        else if(deductedIncome >= Constants.SIXTHBRACKETMARRIED){
            federalTaxOwedAmount = ((Constants.SIXTHBRACKETMARRIEDOWED) 
                        + ((deductedIncome - Constants.SIXTHBRACKETMARRIED) * .37)); 
        }

        if(federalTaxOwedAmount <=0){
            federalTaxOwedAmount =0;
        }
        return federalTaxOwedAmount;
    }

}