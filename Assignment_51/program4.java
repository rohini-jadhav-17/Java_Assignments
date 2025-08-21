// ! Write a java program which accept matrix from the user and return trace and normal of given matrix. Here trace of the matrix is the sum of the elements of the main diagonal i.e the diagonal from the upper left to the lower right of a matrix. Normal of the matrix is the square root of the sum of all the elements.

import java.util.Scanner;
import java.lang.Math;

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

    public int Normal()
    {
        int i = 0, j = 0, sum = 0;
        
        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < this.iCol; j++)
            {
                sum = sum + this.arr[i][j];
            }
        }

        return (int)Math.sqrt(sum);
    }

    public int Trace()
    {
        int i = 0, j = 0, sum = 0;
        
        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < this.iCol; j++)
            {
                if(i == j)
                {
                    sum = sum + this.arr[i][j];
                }
            }
        }

        return sum;
    }

    public void finalize()
    {
        this.arr = null;
    }

}

class program4
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix();
        int trace = 0, normal = 0;

        mobj.Accept();
        
        trace = mobj.Trace();
        System.out.println("Sum of diagonal elements : "+trace);

        normal = mobj.Normal();        
        System.out.println("sqrt of sum of all elements : "+normal);
    }
}