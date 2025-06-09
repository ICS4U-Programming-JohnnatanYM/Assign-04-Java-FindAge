/**
 * Person class with name and age.
 */
public class Person {
    /** Stores name.
    */
    private String name;
    /** Stores age.
    */
    private int age;

    /**
     * Constructor for Person.
     *
     * @param nameP the person's name
     * @param ageP the person's age
     */
    public Person(final String nameP, final int ageP) {
        this.name = nameP;
        this.age = ageP;
    }

    /**
     * Checks if the person is a minor.
     *
     * @return true if under 18, false if not
     */
    public boolean isMinor() {
        return age < 18;
    }

    /**
     * Gets the person's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
}
