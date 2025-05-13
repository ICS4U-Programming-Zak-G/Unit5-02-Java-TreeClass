/**.
* This is the main class for the three program
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-05-13
*/

// Define the main class
public class Main {
    // Declare the main method
    public static void main(final String[] args) {
        // Create a new instance of the TREE
        Tree myTree = new Tree(30, 10000, "Unknown", 2007, 0);

        // Print current tree information
        System.out.println("Current tree information:");
        System.out.println("Height: " + myTree.height);
        System.out.println("Number of leaves: " + myTree.numOfLeaves);
        System.out.println("Type: " + myTree.type);
        System.out.println("Year planted: " + myTree.yearPlanted);

        // Grow tree
        myTree.grow();

        // Grow tree with method overloading
        myTree.grow(10);

        // Lose all leaves
        myTree.loseLeaves();

        // Increment year
        myTree.year();

        // Declare tree type
        myTree.type = "Oak";

        // Print new line
        System.out.println();

        // Print current tree information
        System.out.println("Current tree information:");
        System.out.println("Height: " + myTree.height + " feet");
        System.out.println("Number of leaves: " + myTree.numOfLeaves);
        System.out.println("Type: " + myTree.type);
        System.out.println("Year planted: " + myTree.yearPlanted);
    }
}
