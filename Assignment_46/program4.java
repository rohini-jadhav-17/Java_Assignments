// ! Write a Java program which accept number of rows and number of columns from user and display below pattern
/*
Input : iRow - 4    iCol - 5
Output : 
    4   4   4   4   4
    3   3   3   3   3
    2   2   2   2   2
    1   1   1   1   1
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
        int i = 0, j = 0;

        for(i = iRow; i > 0; i--)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println("");
        }
    }

}

class program4
{
    public static void main(String A[])
    {
        Pattern pobj = new Pattern();

        pobj.Accept();
        pobj.DisplayPattern();
    }
}