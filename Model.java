
/**
 * This class describes attributes of a Model
 *
 * @author Mert Bekdemir
 * @version 1409
 */
public class Model
{
    //Constants
    private static final int MAX_CHARACTERS = 20;
    private static final int MIN_CHARACTERS = 3;
    private static final double MAX_HEIGHT = 84;
    private static final double MIN_HEIGHT = 24;
    private static final double MAX_WEIGHT = 280;
    private static final double MIN_WEIGHT = 80;

    // Class ( Static ) variables

    private static String OCCUPATION = "modeling";

    // instance variables 

    private String firstName;
    private String lastName;
    private double heightInInches;
    private double weightInPounds;
    private boolean canTravel;
    private boolean smokes;

    /**
     * First constructor for objects of class Model
     * @param theFirstName defines first name
     * @param theLastName defines last name
     * @param theHeightInInches defines the height
     * @param theWeightInPounds defines the weight
     * @param willTravel checks if able to travel or not
     * @param smokes checks if model is a smoker or not
     */
    public Model(String theFirstName,
    String theLastName,
    double theHeightInInches,
    double theWeightInPounds,
    boolean willTravel,
    boolean smoker)
    {
        setFirstName(theFirstName);
        setLastName(theLastName);
        setHeightInInches(theHeightInInches);
        setWeightInPounds(theWeightInPounds);
        setCanTravel(willTravel);
        setSmokes(smoker);
    }

    //Setter Methods

    /**
     * @param firstName first name of model
     */
    public final void setFirstName(String theFirstName){
        if(theFirstName >= MIN_CHARACTERS && theFirstName <= MAX_CHARACTERS){
            firstName = theFirstName;
        }else{
            throw new IllegalArgumentException("First name must be 3 to 20 characters long");
        }
    }

    /**
     * @param lastName first name of model
     */
    public final void setLastName(String theLastName){
        if(theLastName >= MIN_CHARACTERS && theLastName <= MAX_CHARACTERS){
            lastName = theLastName;
        }else{
            throw new IllegalArgumentException("Last name must be 3 to 20 characters long");
        }
    }

    /**
     *@param height height of model
     */
    public final void setHeightInInches(double theHeightInInches){
        if(theHeightInInches >= MIN_HEIGHT && theHeightInInches <= MAX_HEIGHT){
            heightInInches = theHeightInInches;
        }else{
            throw new IllegalArgumentException("height must be 24 to 84 inches");
        }
    }

    /**
     * @param weight weight of model
     */
    public final void setWeightInPounds(double theWeightInPounds){
        if(theWeightInPounds >= MIN_WEIGHT && theWeightInPounds <= MAX_WEIGHT){
            weightInPounds = theWeightInPounds;
        }else{
            throw new IllegalArgumentException("weight must be 80 or 280 pounds");
        }
    }

    /**
     * @param canTravel checks if model can travel or not
     */
    public final void setCanTravel(boolean canTravel){
        this.canTravel = canTravel;
    }

    /**
     *@param smokes checks if model is smoking or not
     */
    public final void setSmokes(boolean smokes){
        this.smokes = smokes;
    }

    /**
     * Second constructor for objects of class Model 
     */
    public Model(String firstName,
    String lastName,
    double heightInInches,
    double weightInPounds){
        setFirstName(firstName);
        setLastName(lastName);
        setHeightInInches(heightInInches);
        setWeightInPounds(weightInPounds);
    }

    /**
     * @param canTravel sets can travel to true
     */
    public final void setCanTravel(){
        canTravel = true;
    }

    /**
     * @param smokes sets smoke to false
     */
    public final void setSmokes(){
        smokes = false;
    }

    //Getter Methods 

    /**
     * @return first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * @return last name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * @return height In Inches
     */
    public double getHeightInInches(){
        return heightInInches;
    }

    /**
     * @return weight In Pounds
     */
    public double getWeightInPounds(){
        return weightInPounds;
    }

    /**
     * @return can travel or not 
     */
    public boolean getCanTravel(){
        return canTravel;
    }

    /**
     * @return smokes or not
     */
    public boolean getSmokes(){
        return smokes;
    } 

    /**
     * @return occupation
     */
    public static String getOccupation(){

    }

    public void printDetails(){
        Model modelObject = new Model("Harry","Potter",6,1,170,false,true);
        
        System.out.println("Name: " + modelObject.getFirstName() + " " + modelObject.getLastName());
        System.out.println("Height: " + modelObject.getHeightInInches() + " inches");
        System.out.println("Weight: " + Math.round(modelObject.getWeightInPounds()) + " pounds");
        if(canTravel){
            System.out.println("Does travel");
            }else{
                System.out.println("Does not travel");
            }
            
            if(smokes){
                System.out.println("Does Smoke");
            }else{
                System.out.println("Does not smoke");
            }
        
    }
    
    
}

    
    


