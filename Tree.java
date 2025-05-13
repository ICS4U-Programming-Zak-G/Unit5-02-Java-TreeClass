/**.
* This is the tree class for the tree program
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-05-13
*/

// Define the Tree class
public class Tree {
    // Declare attributes
    int height;
    int numOfLeaves;
    String type;
    int yearPlanted;
    int age;


    /**
    * This is the constructor for the tree.
    *
    * @param height height of the tree
    * @param numOfLeaves number of leaves on the tree
    * @param type type of the tree
    * @param yearPlanted year the tree was planted
    * @param age age of the tree
    */

    // Create constructor for the tree
    public Tree(final int height, final int numOfLeaves,
                final String type, final int yearPlanted, final int age) {
        // Set the attributes to themselves
        this.height = height;
        this.numOfLeaves = numOfLeaves;
        this.type = type;
        this.yearPlanted = yearPlanted;
        this.age = age;

    }

    /**
    * This is the method for growing the tree.
    */

    // Create constructor for growing the tree
    public void grow() {
        // Grow tree a certain amount
        this.height += 5;
        this.numOfLeaves += 200;
    }

    /**
    * This is the method for growing the tree with method overloading.
    *
    * @param height the height of the tree
    */

    // Declare constructor for moving the spike
    public void grow(final int height) {
        // Grow tree a certain amount
        this.height += height;
    }

    /**.
    * This is the method for making the tree lose all leaves
    */

    // Declare constructor for losing all leaves
    public void loseLeaves() {
        // Lose all leaves
        this.numOfLeaves = 0;
    }

    /**.
    * This is the method for incrementing the year planted
    */

    // Declare constructor for incrementing the year planted
    public void year() {
        // Increment the year planted
        this.yearPlanted += 1;
    }

    /**.
    * This is the method for incrementing the age
    */

    // Declare constructor for the age
    public void age() {
        // Get age based off the year planted
        this.age = 2025 - this.yearPlanted;
    }
}
