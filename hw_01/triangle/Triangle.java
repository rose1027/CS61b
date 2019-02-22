/* *****************************************************************************
 *  Name:  Tingting
 *  Date:  02/20/19
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

public class Triangle {
    private int row;
    private int leng;

    public Triangle(int len) {
        row = 0;
        leng = len;
    }

    public void printStar() {
        while (row < leng) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            row += 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int len = 5;
        Triangle tri = new Triangle(len);
        tri.printStar();
    }
}
