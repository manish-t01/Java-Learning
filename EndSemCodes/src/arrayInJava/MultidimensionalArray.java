package arrayInJava;

public class MultidimensionalArray {
    public static void main(String[] args) {
        
        // ====================================================================
        // 1. 2D ARRAY DECLARATION & INSTANTIATION [00:05:43]
        // ====================================================================
        // Syntax: DataType[][] arrayName = new DataType[rows][columns];
        // This creates an array with 2 rows and 3 columns (like a 2x3 grid/matrix)
        int[][] flats = new int[2][3]; 
        
        
        // ====================================================================
        // 2. ASSIGNING VALUES TO THE 2D ARRAY [00:07:30]
        // ====================================================================
        // Think of it like floors (rows) and flat numbers (columns)
        
        // Ground Floor (Row 0)
        flats[0][0] = 101; // Row 0, Column 0
        flats[0][1] = 102; // Row 0, Column 1
        flats[0][2] = 103; // Row 0, Column 2

        // First Floor (Row 1)
        flats[1][0] = 201; // Row 1, Column 0
        flats[1][1] = 202; // Row 1, Column 1
        flats[1][2] = 203; // Row 1, Column 2


        // ====================================================================
        // 3. TRAVERSAL & DISPLAYING THE 2D ARRAY [00:10:45]
        // ====================================================================
        System.out.println("=== DISPLAYING 2D ARRAY USING NESTED FOR-LOOPS ===");
        
        // Outer loop handles the Rows (flats.length gives the total number of rows = 2)
        for (int i = 0; i < flats.length; i++) {
            
            // Inner loop handles the Columns (flats[i].length gives the size of that specific row = 3)
            for (int j = 0; j < flats[i].length; j++) {
                
                // Print elements side by side separated by a space
                System.out.print(flats[i][j] + " "); 
            }
            
            // Moves cursor to a new line once an entire row finishes printing [00:12:19]
            System.out.println(); 
        }
        System.out.println();


        // ====================================================================
        // 4. BONUS CONCEPT: 3D ARRAY SYNTAX OVERVIEW [00:14:02]
        // ====================================================================
        // Though rarely used compared to 2D arrays, you can declare a 3D array like this:
        // Syntax: DataType[][][] arrayName = new DataType[depth][rows][columns];
        String[][][] deepArray = new String[2][3][4];
        
        System.out.println("3D Array depth length: " + deepArray.length); // Outputs 2
    }
}