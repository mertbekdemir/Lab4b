/**
 * Account details at Royal Bank.
 *
 * @author Mike Mulder
 * @version 2018-09-29
 */
public class 
{
    // Constants
    private static final String BANK_MOTTO = "You're poorer than you think";
    private static final double MAX_DEPOSIT = 10000.0;
    private static final int MIN_PIN_NUMBER = 0;
    private static final double MIN_INTEREST_RATE = 0.0;
    private static final double MAX_INTEREST_RATE = 1.0;
    
    // Class (Static) Variables
    private static double primeInterestRate = 0.025;
    
    // Instance Variables
    private double personalInterestRate;
    private int    pin;
    private double balanceUsd;
    private String firstName;
    private String lastName;
    private boolean isOverdraftAvailable;
    private double overdraftAmountUsd;
    private final String personalAccountNumber;

    /**
     * Constructor for objects of class RoyalBankAccount
     */
    public RoyalBankAccount(double personalInterestRate,
                            int pin,
                            double balanceUsd,
                            String firstName,
                            String lastName,
                            boolean isOverdraftAvailable,
                            double overdraftAmountUsd,
                            String personalAccountNumber)  
    {
        
        setPersonalInterestRate(personalInterestRate);
        setPin(pin);
        setBalanceUsd(balanceUsd);
        setFirstName(firstName);
        setLastName(lastName);
        setIsOverdraftAvailable(isOverdraftAvailable);
        setOverdraftAmountUsd(overdraftAmountUsd);
        
        if (null != personalAccountNumber) {
            this.personalAccountNumber = personalAccountNumber;
        } else {
            throw new IllegalArgumentException("Invalid Personal Account Number");
        }
    }
}