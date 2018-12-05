/**
 * Planet class for Lab3B
 *
 * @author Good Example
 * @version Lab3B
 */
public class Planet
{
    /*
     * Instance Variables
     */
    private String name;
    private boolean innerPlanet;
    private double astronomicalUnitsFromSun;
    private double earthMasses;

    /**
     * Constructor for objects of class Planet
     * 
     * @param name The name of the Planet
     * @param innerPlanet Whether the Planet is an inner Planet of the Solar System or not
     * @param astronomicalUnitsFromSun The Planet's distance from the Sun measured in Astronomical Units
     * @param earthMasses The Planet's mass in proportion to the Earth's mass
     */
    public Planet(String name, boolean innerPlanet, double astronomicalUnitsFromSun, double earthMasses)
    {
        if (name != null) {     //Checks that Planet's name is not empty
            this.name = name;
        } else {
            throw new IllegalArgumentException("Planet's name cannot be empty");
        }

        this.innerPlanet = innerPlanet;     //Initializes the innerPlanet parameter

        if (astronomicalUnitsFromSun > 0.0) {       //Checks that Planet's distance from the Sun is a valid number
            this.astronomicalUnitsFromSun = astronomicalUnitsFromSun;
        } else {
            throw new IllegalArgumentException("Distance from the sun must be a positive number");
        }

        if (earthMasses > 0.0) {        //Checks that Planet's mass is a valid number
            this.earthMasses = earthMasses;
        } else {
            throw new IllegalArgumentException("Mass of planet must be a positive number");
        }
    }

    /*
     * Accesor Methods
     */

    /**
     * @return The Planet's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Whether the Planet is an inner Planet of the Solar System or not
     */
    public boolean getInnerPlanet() {
        return innerPlanet;
    }

    /**
     * @return The Planet's distance from the Sun in Astronomical Units
     */
    public double getAstronomicalUnitsFromSun() {
        return astronomicalUnitsFromSun;
    }

    /**
     * @return The Planet's mass in proportion to the Earth's mass
     */
    public double getEarthMasses() {
        return earthMasses;
    }

    /*
     * Other Methods
     */

    /**
     * @return a String in the format "Planet.name is an inner/outer planet, weighs Planet.earthMasses, and is Planet.astronomicalUnitsFromSun AU"
     */
    public String getPlanetaryData() {
        if (innerPlanet) {
            return name + " is an inner planet, weighs " + earthMasses + " Earth masses, and is " + astronomicalUnitsFromSun + " AU.";
        } else {
            return name + " is an outer planet, weighs " + earthMasses + " Earth masses, and is " + astronomicalUnitsFromSun + " AU."; 
        }
    }

    /**
     * @return true if either the Planet's distance from the sun is less than 1.0 AU or the Planet's mass is less than 15.0 Earth masses, else returns false
     */
    public boolean isSimilarToEarth() {
        if ((astronomicalUnitsFromSun < 1.0) || (earthMasses < 15)) {
            return true;
        } else {
            return false;
        }
    }
}