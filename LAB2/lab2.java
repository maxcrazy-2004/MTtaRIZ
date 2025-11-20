package LAB2;

public class lab2 {
    public static void main(String[] args) {
        TreePrinter tree = new TreePrinter(6);    
        tree.printTree();    
        Array(); 
    }

    public static class TreePrinter {
    private int levels; 

    public TreePrinter(int levels) {
        this.levels = levels;
    }

    public void printTree() {
        for (int i = 1; i <= levels; i++) {
            for (int j = 0; j < levels - i; j++) {
                System.out.print(" ");
            }         
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
   
    public static void Array() {
        int rows = 4;
        int cols = 4;

        int[][] array = new int[rows][cols];
        int value = 1; 


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value += 3;
            }
        }

      
        System.out.println("\nArray:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%-3d", array[i][j]);
            }
            System.out.println();
        }
       
    }
}


