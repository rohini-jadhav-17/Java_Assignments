// ! Write a Java program which accept number of rows and number of columns from user and display below pattern
/*
Input : iRow - 5    iCol - 5
Output : 
    1   2   3   4   5
    1   2           5
    1       3       5
    1           4   5
    1   2   3   4   5
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

        sobj = null;
    }

    public void DisplayPattern()
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol ; j++)
            {
                if(i == j)
                {
                    System.out.print(j+"\t");
                }
                else if(i == 1 || i == iRow || j == 1 || j == iCol)
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print(" \t");                    
                }
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

        pobj = null;
    }
}