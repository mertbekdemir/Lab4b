/**
 * Main class/method for Planet Class from Lab3B
 *
 * @author Good Example
 * @version Lab3B
 */
public class Main
{
    public static void main(String[] args) {
        Planet mercury = new Planet("Mercury",
                                    true,
                                    0.4,
                                    0.055);
        Planet venus = new Planet("Venus",
                                  true,
                                  0.7,
                                  0.815);
        Planet earth = new Planet("Earth",
                                  true,
                                  1.0,
                                  1.0);
        Planet mars = new Planet("Mars",
                                 true,
                                 1.5,
                                 0.107);
        Planet jupiter = new Planet("Jupiter",
                                    false,
                                    5.2,
                                    318.0);
        Planet saturn = new Planet("Saturn",
                                   false,
                                   9.5,
                                   95.0);
        Planet uranus = new Planet("Uranus",
                                   false,
                                   19.2,
                                   14.0);
        Planet neptune = new Planet("Neptune",
                                    false,
                                    30.1,
                                    17.0);
                                
        System.out.println(mercury.getPlanetaryData());        //Mercury
        if (mercury.isSimilarToEarth()) {
            System.out.println(mercury.getName() + " is similar to Earth.");
        } else {
            System.out.println(mercury.getName() + " is not similar to Earth.");
        }

        System.out.println(venus.getPlanetaryData());        //Venus
        if (venus.isSimilarToEarth()) {
            System.out.println(venus.getName() + " is similar to Earth.");
        } else {
            System.out.println(venus.getName() + " is not similar to Earth.");
        }

        System.out.println(earth.getPlanetaryData());        //Earth
        if (earth.isSimilarToEarth()) {
            System.out.println(earth.getName() + " is similar to Earth.");
        } else {
            System.out.println(earth.getName() + " is not similar to Earth.");
        }

        System.out.println(mars.getPlanetaryData());        //Mars
        if (mars.isSimilarToEarth()) {
            System.out.println(mars.getName() + " is similar to Earth.");
        } else {
            System.out.println(mars.getName() + " is not similar to Earth.");
        }

        System.out.println(jupiter.getPlanetaryData());        //Jupiter
        if (jupiter.isSimilarToEarth()) {
            System.out.println(jupiter.getName() + " is similar to Earth.");
        } else {
            System.out.println(jupiter.getName() + " is not similar to Earth.");
        }

        System.out.println(saturn.getPlanetaryData());        //Saturn
        if (saturn.isSimilarToEarth()) {
            System.out.println(saturn.getName() + " is similar to Earth.");
        } else {
            System.out.println(saturn.getName() + " is not similar to Earth.");
        }

        System.out.println(uranus.getPlanetaryData());        //Uranus
        if (uranus.isSimilarToEarth()) {
            System.out.println(uranus.getName() + " is similar to Earth.");
        } else {
            System.out.println(uranus.getName() + " is not similar to Earth.");
        }

        System.out.println(neptune.getPlanetaryData());        //Neptune
        if (neptune.isSimilarToEarth()) {
            System.out.println(neptune.getName() + " is similar to Earth.");
        } else {
            System.out.println(neptune.getName() + " is not similar to Earth.");
        }
    }
}
