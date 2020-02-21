
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SparseMatrixTester {

    static List<TestResult> tests = new ArrayList<>();
    
    static SparseMatrix mat, mat2;
    
    static String expected, result;

    static int numRows, numCols;
    static boolean allZeros, passed;
    static int[] arr;
    static int [][] arr2d;
    
    public static void main(String[] args) {
        
        testConstructors();
        testAccessors();
        testMutator();
        testEquals();
        testPredicates();
        testOperations();
        testStaticMethod();
        
        TestResult.reportTestResults(tests);
    }

    
    static void testConstructors(){
        // These tests also test the get(int i, int j) method
        SparseMatrix mat;
        
        //========================================================= Constructor ()
        mat = new SparseMatrix();
        expected = "1";
        result = "" + mat.getN();
        tests.add(new TestResult("Constructor 1", expected, result));

        expected = "1";
        result = "" + mat.getM();
        tests.add(new TestResult("Constructor 2", expected, result));
        
        expected = "1";
        result = "" + mat.get(0,0);
        tests.add(new TestResult("Constructor 3", expected, result));
        
        expected = "1";
        result = "" + mat.getMax();
        tests.add(new TestResult("Constructor 4", expected, result));

        expected = "1";
        result = "" + mat.getMin();
        tests.add(new TestResult("Constructor 5", expected, result));

        expected = "" + true;
        result = "" + mat.isVector();
        tests.add(new TestResult("Constructor 6", expected, result));

        expected = "" + true;
        result = "" + mat.isSquare();
        tests.add(new TestResult("Constructor 7", expected, result));

        expected = "" + true;
        result = "" + mat.isDiagonal();
        tests.add(new TestResult("Constructor 8", expected, result));

        expected = "" + true;
        result = "" + mat.isScalar();
        tests.add(new TestResult("Constructor 9", expected, result));

        expected = "" + true;
        result = "" + mat.isIdentity();
        tests.add(new TestResult("Constructor 10", expected, result));

        expected = "" + true;
        result = "" + mat.isSymmetric();
        tests.add(new TestResult("Constructor 11", expected, result));

        expected = "" + false;
        result = "" + mat.isSkewSymmetric();
        tests.add(new TestResult("Constructor 12", expected, result));
        
        //==================================================== Constructor (int n)
        mat = new SparseMatrix(4);
        numRows = mat.getN();
        numCols = mat.getM();
        
        expected = "4";
        result = "" + numRows;
        tests.add(new TestResult("Constructor 13", expected, result));

        expected = "4";
        result = "" + numCols;
        tests.add(new TestResult("Constructor 14", expected, result));
        
        allZeros = true;
        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numCols; c++){
                if (mat.get(r, c) != 0){
                    allZeros = false;
                }
            }
        }
        expected = "all Zeros";
        result = allZeros ? "all Zeros" : "NOT all Zeros";
        tests.add(new TestResult("Constructor 15", expected, result));
        
        //===================================== Constructor (int numRows, numCols)
        mat = new SparseMatrix(4, 5);
        numRows = mat.getN();
        numCols = mat.getM();
        
        expected = "4";
        result = "" + numRows;
        tests.add(new TestResult("Constructor 16", expected, result));

        expected = "5";
        result = "" + numCols;
        tests.add(new TestResult("Constructor 17", expected, result));
        
        allZeros = true;
        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numCols; c++){
                if (mat.get(r, c) != 0){
                    allZeros = false;
                }
            }
        }
        expected = "all Zeros";
        result = allZeros ? "all Zeros" : "NOT all Zeros";
        tests.add(new TestResult("Constructor 18", expected, result));      


        //================================================ Constructor (int[] arr)
        arr = new int[]{1, 0, 0, 0, 2, 0, 0};
        mat = new SparseMatrix(arr);
        numRows = mat.getN();
        numCols = mat.getM();

        expected = "1";
        result = "" + numRows;
        tests.add(new TestResult("Constructor 19", expected, result));

        expected = "7";
        result = "" + numCols;
        tests.add(new TestResult("Constructor 20", expected, result));

        passed = true;
        for (int c = 0; c < numCols; c++) {
            if (mat.get(0, c) != arr[c]) {
                passed = false;
            }
        }
        expected = "Values match";
        result = passed ? "Values match" : "Values do NOT match";
        tests.add(new TestResult("Constructor 21", expected, result));

        //============================================== Constructor (int[][] arr)
        arr2d = new int[][]
        {
            {0, 4, 0, 0},
            {0, 0, 0, 0},
            {1, 5, 0, 0}
        };
        mat = new SparseMatrix(arr2d);
        numRows = mat.getN();
        numCols = mat.getM();

        expected = "3";
        result = "" + numRows;
        tests.add(new TestResult("Constructor 22", expected, result));

        expected = "4";
        result = "" + numCols;
        tests.add(new TestResult("Constructor 23", expected, result));

        passed = true;
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (mat.get(r, c) != arr2d[r][c]) {
                    passed = false;
                }
            }
        }
        expected = "Values match";
        result = passed ? "Values match" : "Values do NOT match";
        tests.add(new TestResult("Constructor 24", expected, result));

        //======================================= Constructor (SparseMatrix other)
        
        SparseMatrix mat2 = new SparseMatrix(mat);
        passed = true;
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (mat.get(r, c) != mat2.get(r, c)) {
                    passed = false;
                }
            }
        }
        expected = "Values match";
        result = passed ? "Values match" : "Values do NOT match";
        tests.add(new TestResult("Constructor 25", expected, result));        

    }
    
    static void testAccessors(){
        //======================================getM(), getN(), getMax(), getMin()
        mat = new SparseMatrix(12, 14);
        
        expected = "0";
        result = "" + mat.getMax();
        tests.add(new TestResult("getMax 1", expected, result));

        expected = "0";
        result = "" + mat.getMin();
        tests.add(new TestResult("getMin 1", expected, result));
        
        expected = "12";
        result = "" + mat.getN();
        tests.add(new TestResult("getN 1", expected, result));

        expected = "14";
        result = "" + mat.getM();
        tests.add(new TestResult("getM 1", expected, result));
        
        arr2d = new int[][]
        {
            {0, 4, 0, 0},
            {0, 0, 0, 0},
            {0, 0, -8, 0},
            {0, 0, 0, 0},
            {1, 5, 0, 0}
        };  
        mat = new SparseMatrix(arr2d);
        
        expected = "5";
        result = "" + mat.getMax();
        tests.add(new TestResult("getMax 2", expected, result));

        expected = "-8";
        result = "" + mat.getMin();
        tests.add(new TestResult("getMin 2", expected, result));
        
        expected = "5";
        result = "" + mat.getN();
        tests.add(new TestResult("getN 2", expected, result));

        expected = "4";
        result = "" + mat.getM();
        tests.add(new TestResult("getM 2", expected, result));
        

        arr2d = new int[][]
        {
            {0, 4, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 8, 0},
            {0, 0, 0, 0},
            {1, 5, 0, 0}
        };  
        mat = new SparseMatrix(arr2d);
        
        expected = "8";
        result = "" + mat.getMax();
        tests.add(new TestResult("getMax 3", expected, result));

        expected = "0";
        result = "" + mat.getMin();
        tests.add(new TestResult("getMin 3", expected, result));
        
        
        arr2d = new int[][]
        {
            {0, -4, 0, 0},
            {0, 0, 0, 0},
            {0, 0, -8, 0},
            {0, 0, 0, 0},
            {-1, -5, 0, 0}
        };  
        mat = new SparseMatrix(arr2d);
        
        expected = "0";
        result = "" + mat.getMax();
        tests.add(new TestResult("getMax 4", expected, result));

        expected = "-8";
        result = "" + mat.getMin();
        tests.add(new TestResult("getMin 4", expected, result));        
    }
    
    static void testMutator(){
        arr2d = new int[][]
        {
            {0, 4, 0, 0},
            {0, 0, 0, 0}
        };  
        
        mat = new SparseMatrix(arr2d);
        
        for(int r = 0; r < arr2d.length; r++){
            for(int c = 0; c < arr2d[0].length; c++){
                mat.set(r, c, r*c);
            }
        }

        passed = true;
        for(int r = 0; r < arr2d.length; r++){
            for(int c = 0; c < arr2d[0].length; c++){
                if(mat.get(r, c) != r*c){
                    passed = false;
                }
            }
        }
        
        expected = "Values set correctly";
        result = passed ? "Values set correctly" : "Values NOT set correctly";
        tests.add(new TestResult("set 1", expected, result));        
        
        
    }
    
    static void testEquals(){
        arr2d = new int[][]
        {
            {0, 4, 0, 0, 6, 3, 0, 0, 9, 5},
            {0, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {0, 3, 0, 7, 16, 3, 0, 0, 92, 0},
            {0, 0, 0, 0, 0, 0, 12, 0, 0, 45},
        };  
        
        mat = new SparseMatrix(arr2d);    
        mat2 = new SparseMatrix(arr2d);    
        
        passed = mat.equals(mat2);
        
        expected = "Matrices are equal";
        result = passed ? "Matrices are equal" : "Matrices are NOT equal";
        tests.add(new TestResult("equals 1", expected, result));          

    }

    static void testPredicates(){
        //============================================================ isVector ()
        arr2d = new int[][] {{0, 4, 0, 0, 6, 3, 0, 0, 9, 5}};  
        mat = new SparseMatrix(arr2d);    
        expected = "" + true;
        result = "" + mat.isVector();
        tests.add(new TestResult("isVector 1", expected, result));          
        
        arr2d = new int[][] {{0, 4, 0}, {0, 6, 3}, {0, 0, 9}};  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isVector();
        tests.add(new TestResult("isVector 2", expected, result));          


        //============================================================ isSquare ()
        arr2d = new int[][] {{0, 4, 0}, {0, 6, 3}, {0, 0, 9}};  
        mat = new SparseMatrix(arr2d);    
        expected = "" + true;
        result = "" + mat.isSquare();
        tests.add(new TestResult("isSquare 1", expected, result));          

        arr2d = new int[][] {{0, 4, 0}, {0, 6, 3}, {0, 0, 9}, {1, 0, 0}};  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isSquare();
        tests.add(new TestResult("isSquare 2", expected, result));          


        //========================================================== isDiagonal ()
        arr2d = new int[][] {
            {0, 0, 0},
            {0, 6, 0},
            {0, 0, 9}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + true;
        result = "" + mat.isDiagonal();
        tests.add(new TestResult("isDiagonal 1", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 6, 0},
            {2, 0, 9}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isDiagonal();
        tests.add(new TestResult("isDiagonal 2", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + true;
        result = "" + mat.isDiagonal();
        tests.add(new TestResult("isDiagonal 3", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isDiagonal();
        tests.add(new TestResult("isDiagonal 4", expected, result));          


        //============================================================ isScalar ()
        arr2d = new int[][] {
            {0, 0, 0},
            {0, 6, 0},
            {0, 0, 9}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isScalar();
        tests.add(new TestResult("isScalar 1", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 6, 0},
            {2, 0, 9}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isScalar();
        tests.add(new TestResult("isScalar 2", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + true;
        result = "" + mat.isScalar();
        tests.add(new TestResult("isScalar 3", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isScalar();
        tests.add(new TestResult("isScalar 4", expected, result));          

        arr2d = new int[][] {
            {7, 0, 0},
            {0, 7, 0},
            {0, 0, 7}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + true;
        result = "" + mat.isScalar();
        tests.add(new TestResult("isScalar 5", expected, result));         
        
        //========================================================== isIdentity ()
        arr2d = new int[][] {
            {0, 0, 0},
            {0, 6, 0},
            {0, 0, 9}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isIdentity();
        tests.add(new TestResult("isIdentity 1", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 6, 0},
            {2, 0, 9}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isIdentity();
        tests.add(new TestResult("isIdentity 2", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isIdentity();
        tests.add(new TestResult("isIdentity 3", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isIdentity();
        tests.add(new TestResult("isIdentity 4", expected, result));          

        arr2d = new int[][] {
            {7, 0, 0},
            {0, 7, 0},
            {0, 0, 7}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isIdentity();
        tests.add(new TestResult("isIdentity 5", expected, result));            
        
        arr2d = new int[][] {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + true;
        result = "" + mat.isIdentity();
        tests.add(new TestResult("isIdentity 6", expected, result));  
        
        arr2d = new int[][] {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1},
            {0, 0, 0}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isIdentity();
        tests.add(new TestResult("isIdentity 7", expected, result));          
        
        
        
        //========================================================= isSymmetric ()
        arr2d = new int[][] {
            {1, 7, 3},
            {7, 4, -5},
            {3, -5, 6}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + true;
        result = "" + mat.isSymmetric();
        tests.add(new TestResult("isSymmetric 1", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 6, 0},
            {2, 0, 9}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isSymmetric();
        tests.add(new TestResult("isSymmetric 2", expected, result));          

        //===================================================== isSkewSymmetric ()
        arr2d = new int[][] {
            {0, 2, -45},
            {-2, 0, -4},
            {45, 4, 0}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + true;
        result = "" + mat.isSkewSymmetric();
        tests.add(new TestResult("isSkewSymmetric 1", expected, result));          

        arr2d = new int[][] {
            {0, 0, 0},
            {0, 6, 0},
            {2, 0, 9}
        };  
        mat = new SparseMatrix(arr2d);    
        expected = "" + false;
        result = "" + mat.isSkewSymmetric();
        tests.add(new TestResult("isSkewSymmetric 2", expected, result));           
    }
    
    static void testOperations(){
        SparseMatrix A, B, SOL, answer;
        int r, c;
        //=============================================== add (SparseMatrix other)
        A = new SparseMatrix(new int[][] {
            {1, 0, 3},
            {4, 0, 6}
        });

        B = new SparseMatrix(new int[][] {
            {5, 4, 3},
            {2, 0, 0}
        });
        
        SOL = new SparseMatrix(new int[][] {
            {6, 4, 6},
            {6, 0, 6}
        });
        
        answer = A.add(B);
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("Add 1", expected, result));           
        

        //================================================= scalarMultiply (int r)
        A = new SparseMatrix(new int[][] {
            {1, 0, 3},
            {4, 0, 6}
        });
        
        r = 5;
        SOL = new SparseMatrix(new int[][] {
            {5, 0, 15},
            {20, 0, 30}
        });
        
        answer = A.scalarMultiply(r);
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("scalarMultiply 1", expected, result));   

        r = 0;
        SOL = new SparseMatrix(2, 3);        
        answer = A.scalarMultiply(r);
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("scalarMultiply 2", expected, result));   
        
        A = new SparseMatrix(2, 3);
        r = 12;
        SOL = new SparseMatrix(2, 3);
        
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("scalarMultiply 3", expected, result));   
        
        
        //======================================== difference (SparseMatrix other)
        A = new SparseMatrix(new int[][] {
            {1, 0, 3},
            {4, 0, 6}
        });

        B = new SparseMatrix(new int[][] {
            {5, 4, 3},
            {2, 0, 0}
        });
        
        SOL = new SparseMatrix(new int[][] {
            {-4, -4, 0},
            {2, 0, 6}
        });
        
        answer = A.difference(B);
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("difference 1", expected, result));           

        //=========================================================== transpose ()
        A = new SparseMatrix(new int[][] {
            {1, 0, 3},
            {4, 0, 6}
        });

        SOL = new SparseMatrix(new int[][] {
            {1, 4},
            {0, 0},
            {3, 6}
        });
        
        answer = A.transpose();
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("transpose 1", expected, result));           

        
        
        A = new SparseMatrix(new int[][] {
            {1, 0, 3},
            {0, 2, 0},
            {4, 0, 6}
        });

        SOL = new SparseMatrix(new int[][] {
            {1, 0, 4},
            {0, 2, 0},
            {3, 0, 6}
        });
        
        answer = A.transpose();
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("transpose 2", expected, result));          


        A = new SparseMatrix(new int[][] {{0}});

        SOL = new SparseMatrix(new int[][] {{0}});
        
        answer = A.transpose();
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("transpose 3", expected, result));  


        //========================================================== dotProduct ()
        A = new SparseMatrix(new int[][] {{1, 0, 3}});
        B = new SparseMatrix(new int[][] {{1, 0, 3}});

        expected = "10";
        result = "" + A.dotProduct(B);
        tests.add(new TestResult("dotProduct 1", expected, result));           


        A = new SparseMatrix(new int[][] {{0, 0, 3}});
        B = new SparseMatrix(new int[][] {{1, 0, 0}});

        expected = "0";
        result = "" + A.dotProduct(B);
        tests.add(new TestResult("dotProduct 2", expected, result));           


        A = new SparseMatrix(new int[][] {{3}});
        B = new SparseMatrix(new int[][] {{5}});

        expected = "15";
        result = "" + A.dotProduct(B);
        tests.add(new TestResult("dotProduct 3", expected, result));            


        //========================================== multiply (SparseMatrix other)
        A = new SparseMatrix(new int[][] {
            {3, 2, 1, 3},
            {6, 5, 4, 5},
            {6, 2, 1, 5}
        });

        B = new SparseMatrix(new int[][] {
            {3, 2},
            {1, 2},
            {6, 1},
            {2, 1}
        });
        
        SOL = new SparseMatrix(new int[][] {
            {23, 14},
            {57, 31},
            {36, 22}
        });
        
        answer = A.multiply(B);
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("multiply 1", expected, result));           


        A = new SparseMatrix(new int[][] {
            {0, 0, 0, 0},
            {6, 5, 4, 5},
            {6, 2, 1, 5}
        });

        B = new SparseMatrix(new int[][] {
            {3, 2},
            {1, 2},
            {6, 1},
            {2, 1}
        });
        
        SOL = new SparseMatrix(new int[][] {
            {0, 0},
            {57, 31},
            {36, 22}
        });
        
        answer = A.multiply(B);
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("multiply 2", expected, result));           

        
        //========================================= subMatrix (SparseMatrix other)
        A = new SparseMatrix(new int[][] {
            {3, 2, 1, 3},
            {6, 5, 4, 5},
            {6, 2, 1, 5}
        });
        r = 1;
        c = 2;
        SOL = new SparseMatrix(new int[][] {
            {3, 2, 3},
            {6, 2, 5}
        });
        
        answer = A.subMatrix(r, c);
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("subMatrix 1", expected, result));           
        

        A = new SparseMatrix(new int[][] {
            {3, 2, 1, 3},
            {6, 5, 4, 5},
            {6, 2, 1, 5}
        });
        r = 1;
        c = 2;
        SOL = new SparseMatrix(new int[][] {
            {3, 2, 3},
            {6, 2, 5}
        });
        
        answer = A.subMatrix(r, c);
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("subMatrix 2", expected, result));           
        

        A = new SparseMatrix(new int[][] {
            {3, 2, 1, 3},
            {6, 5, 4, 5},
            {6, 2, 1, 5}
        });
        r = 0;
        c = 0;
        SOL = new SparseMatrix(new int[][] {
            {5, 4, 5},
            {2, 1, 5}
        });
        
        answer = A.subMatrix(r, c);
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("subMatrix 3", expected, result));           

        
        A = new SparseMatrix(new int[][] {
            {3, 2, 1, 3},
            {6, 5, 4, 5},
            {6, 2, 1, 5}
        });
        r = 2;
        c = 3;
        SOL = new SparseMatrix(new int[][] {
            {3, 2, 1},
            {6, 5, 4}
        });
        
        answer = A.subMatrix(r, c);
        expected = "true";
        result = "" + equal(SOL, answer);
        tests.add(new TestResult("subMatrix 4", expected, result));           

    }
    
    static void testStaticMethod(){
        mat = SparseMatrix.identity(3);
        mat2 = new SparseMatrix(new int[][]{
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        });

        expected = "true";
        result = "" + equal(mat, mat2);
        tests.add(new TestResult("identity 1", expected, result));           

    }
    
    static boolean equal(SparseMatrix m1, SparseMatrix m2){
        if (m1.getM() != m2.getM() || m1.getN() != m2.getN()){
            return false;
        }
        int numRows = m1.getN();
        int numCols = m1.getM();
        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numCols; c++){
                if (m1.get(r, c) != m2.get(r, c)){
                    return false;
                }
            }
        }
        return true;
    }

}


/* Holds results of a single result */
class TestResult {

    private final String message;
    private final String expected;
    private final String received;

    public TestResult(String message, String expected, String received) {
        this.message = message;
        this.expected = expected;
        this.received = received;
    }

    private boolean passed() {
        return expected.equals(received);
    }

    public static void reportTestResults(List<TestResult> testResults) {
        System.out.println("Results of " + testResults.size() + " tests:");
        boolean errorsFound = false;
        for (TestResult result : testResults) {
            if (!result.passed()) {
                System.out.println("Error: " + result.message);
                System.out.println("\tExpected: \"" + result.expected + "\"");
                System.out.println("\tReceived: \"" + result.received + "\"");
                errorsFound = true;
            }
        }

        if (!errorsFound) {
            System.out.println("No Errors Found.");
        }
    }
} // End of class TestResult
