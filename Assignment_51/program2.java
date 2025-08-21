// ! Write a java program which accept matrix from the user and swap the contents of each consecutive columns

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

    public void SwapCols()
    {
        int i = 0, j = 0, temp = 0, iColNew = 0;

        if(this.iCol % 2 != 0)
        {
            iColNew = this.iCol - 1;
        }
        else
        {
            iColNew = this.iCol;
        }

        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < iColNew; j=j+2)
            {
                temp = this.arr[i][j];
                this.arr[i][j] = this.arr[i][j+1];
                this.arr[i][j+1] = temp;
            }
        }

        System.out.println("Elements after swap :");
        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < this.iCol; j++)
            {
                System.out.print(this.arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void finalize()
    {
        this.arr = null;
    }

}

class program2
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix();

        mobj.Accept();
        mobj.SwapCols();

    }
}