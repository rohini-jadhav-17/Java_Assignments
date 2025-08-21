// ! Write a java program which accept matrix from the user and return addition of the border elements of matrix.

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

    public int SumBorderElem()
    {
        int i = 0, j = 0, sum = 0;
        
        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < this.iCol; j++)
            {
                if(i == 0 || i == iRow - 1 || j == 0 || j == iCol - 1)
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

class program5
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix();
        int sum = 0;

        mobj.Accept();

        sum = mobj.SumBorderElem();
        System.out.println("Sum of border elements : "+sum);
    }
}