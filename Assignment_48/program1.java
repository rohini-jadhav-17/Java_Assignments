// ! Write a Java program which accept string from user and display below pattern
/*
Input : Hello
Output : 
    H   e   l   l   o
    H   e   l   l   o
    H   e   l   l   o
    H   e   l   l   o
 */

import java.util.Scanner;

class Pattern
{
    private String str;

    public Pattern(String a)
    {
        this.str = a;
    }

    public void DisplayPattern()
    {
        int i = 0, j = 0;
        char Arr[] = this.str.toCharArray();

        for(i = 0; i < 4; i++)
        {
            for(j = 0; j < Arr.length; j++)
            {
                System.out.print(Arr[j]+"\t");
            }
            System.out.println("");
        }
    }

}

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        Pattern pobj = new Pattern(str);

        pobj.DisplayPattern();

        sobj = null;
        pobj = null;
    }
}