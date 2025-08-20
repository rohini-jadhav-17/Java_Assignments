// ! Write a Java program which accept number of rows and number of columns from user and display below pattern
/*
Input : iRow - 4    iCol - 4
Output : 
    *   *   *   #
    *   *   #   @
    *   #   @   @
    #   @   @   @
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

        for(i = 0; i < iRow; i++)
        {
            for(j = iCol-1; j >= 0 ; j--)
            {
                if(i == j)
                {
                    System.out.print("#\t");
                }
                else if(i > j)
                {
                    System.out.print("@\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println("");
        }
    }

}

class program2
{
    public static void main(String A[])
    {
        Pattern pobj = new Pattern();

        pobj.Accept();
        pobj.DisplayPattern();

        pobj = null;
    }
}