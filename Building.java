/*
 * The Building class
 */
public class Building {

    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    /* Constructor */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /* 
     * Getter for the name of the building
     * @return String the name of the building
     */
    public String getName() {
        return this.name;
    }

    /* 
     * Getter for the address of the building
     * @return String address of the building
     */
    public String getAddress() {
        return this.address;
    }

    /*
     * Getter for the number of floors of the building
     * @return int number of floors
     */
    public int getFloors() {
        return this.nFloors;
    }

    /*
     * Overriden toString method
     * @return String representation of a building
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}