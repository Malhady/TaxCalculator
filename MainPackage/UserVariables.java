/*
*
*This class will be used to hold all of the user inputted variables
*
*/

package MainPackage;

public class UserVariables {
    private static Double userIncome; 
    private static Double itemizedDeductions; 
    private static String filingStatus;


    //Getter and setter methods used for encapsulation of the private static variables
    public static void setIncome(double userIncome){
        UserVariables.userIncome = userIncome; 
    }
    
    public static void setItemizedDeductions(double itemizedDeductions){
        UserVariables.itemizedDeductions = itemizedDeductions;
    }
    
    public static void setFilingStatus(String filingStatus){
        UserVariables.filingStatus = filingStatus;
    }
    
    
    public double getIncome(){
        return userIncome;
    }
    
    public double getItemizedDeductions(){
        return itemizedDeductions;
    }
    
    public String getFilingStatus(){
        return filingStatus;
    }
}



