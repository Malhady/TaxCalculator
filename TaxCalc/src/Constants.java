
public class Constants {
    
    private Constants() {
        throw new IllegalStateException("Utility class");
      }


    //FederalTaxCalculations Class Constants
    //Upper bounds for each Federal Single Bracket 
    public static final double FIRSTBRACKETSINGLE  = 9875;
    public static final double SECONDBRACKETSINGLE = 40125;
    public static final double THIRDBRACKETSINGLE  = 85525;
    public static final double FOURTHBRACKETSINGLE = 163300;
    public static final double FIFTHBRACKETSINGLE  = 207350;
    public static final double SIXTHBRACKETSINGLE  = 518400;
    
    //Taxed Amounts for previous bracket
    public static final double FIRSTBRACKETSINGLEOWED  = 987;
    public static final double SECONDBRACKETSINGLEOWED = 4617;
    public static final double THIRDBRACKETSINGLEOWED  = 14605;
    public static final double FOURTHBRACKETSINGLEOWED = 33271;
    public static final double FIFTHBRACKETSINGLEOWED  = 47366;
    public static final double SIXTHBRACKETSINGLEOWED  = 156233;

    //Upper bounds for each Federal Married Bracket
    public static final double FIRSTBRACKETMARRIED  = 19750;
    public static final double SECONDBRACKETMARRIED = 80250;
    public static final double THIRDBRACKETMARRIED  = 171050;
    public static final double FOURTHBRACKETMARRIED = 326600;
    public static final double FIFTHBRACKETMARRIED  = 414700;
    public static final double SIXTHBRACKETMARRIED  = 622050;

    //Taxed Amounts for previous bracket
    public static final double FIRSTBRACKETMARRIEDOWED  = 1975;
    public static final double SECONDBRACKETMARRIEDOWED = 9235;
    public static final double THIRDBRACKETMARRIEDOWED  = 29211;
    public static final double FOURTHBRACKETMARRIEDOWED = 66543;
    public static final double FIFTHBRACKETMARRIEDOWED  = 94735;
    public static final double SIXTHBRACKETMARRIEDOWED  = 167307;


    //FicaTaxCalculations Constants
    //Max FICA Tax at 7.65% rate
    public static final double FICA_TAX_HIGHRATE_LIMIT          = 137700;
    public static final double FICA_TAX_HIGHRATE_PERCENT        = 0.0765;
    public static final double FICA_TAX_HIGHRATE_LIMIT_PAID     = 10534;
    public static final double FICA_TAX_LOWRATE_PERCENT         = 0.0145;
    public static final double FICA_TAX_PAYROLL_RATE            = 0.0235;
    public static final double FICA_TAX_PAYROLL_LIMIT_SINGLE    = 200000;
    public static final double FICA_TAX_PAYROLL_LIMIT_MARRIED   = 250000;
    public static final double FICA_PAYROLL_TAX_BETWEEN         = 903;
    public static final double FICA_PAYROLL_TAX_BETWEEN_MARRIED = 1628;


    //MAStateTax Constants
    public static final double MA_STATE_TAX_MINNIMUM_SINGLE = 4400;
    public static final double MA_STATE_TAX_RATE = 0.05;
    public static final double MA_STATE_TAX_MINNIMUM_MARRIED = 8800;
}
