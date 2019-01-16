/**
 *
 * @author Dr. Lillis
 */
public class MultiDimArrays {
    public static void main(String[] args) {
        //defaultInit();
        //multiplicationTable();
        //giveInitValues();
        //raggedArrays();
        //triangleArray();
        higherDimensions();
    }
    
    static void defaultInit(){
        // Default initialization to all zeros
        int[][] table = new int[5][5];
        display(table);
    }
    
    static void multiplicationTable(){
        int[][] multTable = new int[13][13];
        for (int x = 0; x <= 12; x++){
            for(int y = 0; y <= 12; y++){
                multTable[x][y] = x * y;
            }
        }
        display(multTable);
    }
    
    static void giveInitValues(){
        int[][] data = {
            {10, 11, 12, 13},
            {14, 15, 16, 17}
        };        
        display(data);
        
        // Now reset to and provide values
        data = new int[][] {
            {10, 20},
            {30, 40},
            {50, 60},
            {70, 80}
        };
        display(data);
    }
    
    static void raggedArrays(){
        int[][] ragged = {
            {1, 2},
            {3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12, 13}
        };
        
        display(ragged);
        
        // Set each value in this array to zero
        for(int i = 0; i < ragged.length; i++){
            for(int j = 0; j < ragged[i].length; j++){
                ragged[i][j] = 0;
            }
        }
        System.out.println();
        display(ragged);
    }
    
    static void triangleArray(){
        int n = 12;
        int [][] triangle = new int[n][];
        for(int i = 0; i < n; i++){
            triangle[i] = new int[i+1];
            for (int j = 0; j < triangle[i].length; j++){
                triangle[i][j] = j+1;
            }
        }
        
        display(triangle);
    }
    
    static void higherDimensions(){
        int[][][] cube = {
            {
                {1,2,3},
                {4,5,6},
                {7,8,9}
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
        
        // Print the array
        for (int i = 0; i < cube.length; i++){
            for(int j = 0; j < cube[i].length; j++){
                for(int k = 0; k < cube[i][j].length; k++){
                    System.out.printf("%4d", cube[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println("=============================");
        // Can also do this
        for(int i = 0; i < cube.length; i++){
            display(cube[i]);
            System.out.println();
        }
        
        //=================================
        // This can be done, but is pretty useless
        int[][][][][][][][] depth8 = new int[2][2][2][2][2][2][2][2];
        // How many int values would this hold?
    }
    
    static void display(int[][] arr){
        String s = "";
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                s += String.format("%4d", arr[r][c]);
            }
            s += "\n";
        }
        System.out.print(s);
    }
}
