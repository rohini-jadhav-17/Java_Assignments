// ! Write a Java program which accept number of rows and number of columns from user and display below pattern
/*
Input : iRow - 4    iCol - 4
Output : 
    A   B   C   D
    a   b   c   d
    A   B   C   D
    a   b   c   d
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
        char ch1 = '\0';
        char ch2 = '\0';

        for(i = 0; i < iRow; i++)
        {
            for(j = 0, ch1 = 'A', ch2 = 'a'; j < iCol; j++, ch1++, ch2++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch1+"\t");
                }
                else
                {
                    System.out.print(ch2+"\t");
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