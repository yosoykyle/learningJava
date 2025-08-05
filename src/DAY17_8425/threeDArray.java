package DAY17_8425;

/*
 * threeDArray.java
 *
 * This program demonstrates the use of a three-dimensional (3D) array.
 * 
 * Concept:
 * - A 3D array is essentially an array of 2D arrays.
 * - Structure: storageRoom[layer][row][column]
 *   - Layer: represents a category (e.g., boxes, bags, tools)
 *   - Row: represents storage units or shelves within that category
 *   - Column: represents items stored in each shelf
 *
 * Use cases:
 * - Organizing multi-level data such as inventory in warehouses, buildings with rooms and items, etc.
 * - Useful when data has 3 clear dimensions (e.g., category, shelf, item)
 *
 * Notes:
 * - Access elements using three indices: [layer][row][column]
 * - Can be visualized as layers of 2D grids stacked on top of each other
 */

public class threeDArray {
    public static void main(String[] args) {
        // Initialize a 3D array: [3 layers][2 rows][4 columns]
        String[][][] storageRoom = {
                { // Layer 0: Boxes
                        { "Box1", "Box2", "Box3", "Box4" },
                        { "Box5", "Box6", "Box7", "Box8" }
                },
                { // Layer 1: Bags
                        { "Bag1", "Bag2", "Bag3", "Bag4" },
                        { "Bag5", "Bag6", "Bag7", "Bag8" }
                },
                { // Layer 2: Tools
                        { "Tool1", "Tool2", "Tool3", "Tool4" },
                        { "Tool5", "Tool6", "Tool7", "Tool8" }
                }
        };
        // To access and modify
        storageRoom[2][1][0] = "booooox";
        // Loop through each layer
        for (int i = 0; i < storageRoom.length; i++) {
            // Print layer label
            switch (i) {
                case 0 -> System.out.println("Boxes (" + i + "): ");
                case 1 -> System.out.println("Bags (" + i + "): ");
                case 2 -> System.out.println("Tools (" + i + "): ");
                default -> System.out.println("Unknown layer:");
            }

            // Loop through each row in the current layer
            for (int j = 0; j < storageRoom[i].length; j++) {
                System.out.print("row " + j + ": ");
                // Loop through each item in the current row
                for (int k = 0; k < storageRoom[i][j].length; k++) {
                    System.out.print("item [" + i + "][" + j + "][" + k + "]: ");
                    System.out.print("('" + storageRoom[i][j][k] + "')" + " ");
                }
                System.out.println(); // Move to next row
            }

            System.out.println(); // Blank line between layers
        }

        System.out.println("LAYER LENGHT " + storageRoom.length);           // 3
        System.out.println("ROW LENGHT " + storageRoom[0].length);          // 2
        System.out.println("COLUMN LENGHT " + storageRoom[0][0].length);    // 4
    }
}
