// ! Write a Java program which accept number of rows and number of columns from user and display below pattern
/*
Input : iRow - 3    iCol - 5
Output : 
    A   A   A   A   A
    B   B   B   B   B
    C   C   C   C   C
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
        char ch = '\0';

        for(i = 0, ch = 'A'; i < iRow; i++, ch++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println("");
        }
    }

}

class program3
{
    public static void main(String A[])
    {
        Pattern pobj = new Pattern();

        pobj.Accept();
        pobj.DisplayPattern();

        pobj = null;
    }
}