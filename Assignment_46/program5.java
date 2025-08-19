// ! Write a Java program which accept number of rows and number of columns from user and display below pattern
/*
Input : iRow - 3    iCol - 4
Output : 
    1   2   3   4
    5   6   7   8
    9   10  11  12
 */

import java.util.Scanner;

class Pattern
{
    private int iRow;
    private int iCol;

    public Pattern()
    {
        this.iRow = 0;
        this.iCol = 0;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        this.iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        this.iCol = sobj.nextInt();
    }

    public void DisplayPattern()
    {
        int i = 0, j = 0, iNo = 0;

        for(i = 0, iNo = 1; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++, iNo++)
            {
                System.out.print(iNo+"\t");
            }
            System.out.println("");
        }
    }

}

class program5
{
    public static void main(String A[])
    {
        Pattern pobj = new Pattern();

        pobj.Accept();
        pobj.DisplayPattern();
    }
}