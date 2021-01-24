/*
*
*This class will be used to hold all of the user inputted variables
*
*/


public class UserVariables {
    private static Double userIncome; 
    private static String filingStatus;
    private static Double standardDeduction;

    //Getter and setter methods used for encapsulation of the private static variables
    public static void setIncome(Double userIncome){
        UserVariables.userIncome = userIncome; 
    }
      
    public static void setFilingStatus(String filingStatus){
        UserVariables.filingStatus = filingStatus;
    }

    public static void setStandardDeduction(Double standardDeduction){
        UserVariables.standardDeduction = standardDeduction;
    }
    
    
    public double getIncome(){
        return userIncome;
    }
    
    
    public String getFilingStatus(){
        return filingStatus;
    }

    public Double getStandardDeduction(){
        return standardDeduction;
    }
}



