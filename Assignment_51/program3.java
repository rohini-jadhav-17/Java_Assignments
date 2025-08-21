// ! Write a java program which accept matrix from the user and return its transpose matrix.
//Transpose of the given matrix is formed by interchanging the rows and columns of a matrix.

import java.util.Scanner;

class Matrix
{
    private int iRow;
    private int iCol;
    private int[][] arr;

    public Matrix()
    {
        this.iRow = 0;
        this.iCol = 0;
        this.arr = null;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Enter the number of rows :");
        this.iRow = sobj.nextInt();

        System.out.println("Enter the number of columns :");
        this.iCol = sobj.nextInt();

        this.arr = new int[this.iRow][this.iCol];

        System.out.println("Enter the number of elements :");
        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < this.iCol; j++)
            {
                this.arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("The matrix :");
        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < this.iCol; j++)
            {
                System.out.print(this.arr[i][j]+"\t");
            }
            System.out.println();
        }

        sobj = null;
    }

    public int[][] Transpose()
    {
        int i = 0, j = 0;
        int[][] temp = null;
        
        temp = new int[this.iCol][this.iRow];
        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < this.iCol; j++)
            {
                temp[j][i] = this.arr[i][j];
            }
        }

        return temp;
    }

    public void finalize()
    {
        this.arr = null;
    }

}

class program3
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix();
        int[][] transpose = null;

        mobj.Accept();
        transpose = mobj.Transpose();

        System.out.println("Elements after Transpose :");
        for(int i = 0; i < transpose.length; i++)
        {
            for(int j = 0; j < transpose[0].length; j++)
            {
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }

        transpose = null;
    }
}