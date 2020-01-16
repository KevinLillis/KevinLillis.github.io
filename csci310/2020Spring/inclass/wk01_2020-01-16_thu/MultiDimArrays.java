
/**
 *
 * @author Dr. Lillis
 */
public class MultiDimArrays {

    public static void main(String[] args) {
        // defaultInit();
        // multiplicationTable();
        // giveSpecificValues();
        //raggedArrays();
        //triangleArray();
        higherDimensions();
    }

    /**
     * Arrays get initial default values of zero/null
     */
    static void defaultInit() {
        // Default value of zeros
        int[][] table2D = new int[3][6];

        display(table2D);
    }

    /**
     * Example of visiting each array element and assigning it a value.
     */
    static void multiplicationTable() {
        int[][] multTable = new int[13][13];

        for (int x = 0; x <= 12; x++) {
            for (int y = 0; y <= 12; y++) {
                multTable[x][y] = x * y;
            }
        }
        display(multTable);
    }

    static void giveSpecificValues() {
        int[][] data = {
            {1, 2, 3, 4},
            {3, 8, 5, 7},
            {22, 15, 99, 104}
        };
        display(data);

        // Now change the values and provide new specific values
        data = new int[][]{
            {1, 2, 22},
            {2, 8, 15},
            {3, 5, 99},
            {4, 7, 104}
        };
        System.out.println();
        display(data);
    }

    static void raggedArrays() {
        int[][] ragged = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12, 13}
        };
        display(ragged);

        // Let's set all array elements to 7        
        for (int r = 0; r < ragged.length; r++) {
            for (int c = 0; c < ragged[r].length; c++) {
                ragged[r][c] = 7;
            }
        }
        System.out.println();

        display(ragged);
    }

    static void triangleArray() {
        int n = 12;
        int[][] triangle = new int[n][]; // 12 rows, each is null

        for (int r = 0; r < n; r++) {
            triangle[r] = new int[r + 1];
            for (int c = 0; c < triangle[r].length; c++) {
                triangle[r][c] = c + 1;
            }
        }

        display(triangle);
    }

    static void higherDimensions() {
        int[][][] cube = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            },
            {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
            }
        };
        
        // Print the cube
        for(int layer = 0; layer < cube.length; layer++){
            display(cube[layer]);
        }

        // This is OK but stupid
        int[][][][][][][][][][] array10D = new int[3][4][5][4][5][2][4][3][6][9];
        array10D[1][2][4][1][3][0][2][2][3][7] = 6;
        // We won't even try to print this
    }

    static void display(int[][] arr) {
        String s = "";

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                s += String.format("%4d", arr[r][c]);
            }
            s += "\n";
        }

        System.out.println(s);
    }
    
}
