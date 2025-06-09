/**
 * Person class with name and age.
 */
public class Person {
    private String name;
    private int age;

    /**
     * Constructor for Person.
     *
     * @param name the person's name
     * @param age the person's age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
