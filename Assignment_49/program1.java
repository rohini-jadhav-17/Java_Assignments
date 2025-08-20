// ! Write a Java program which accept string from user and display below pattern
/*
Input : Hello
Output : 
    H   *   *   *   *
    H   e   *   *   *
    H   e   l   *   *
    H   e   l   l   *
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

        for(i = 0; i < Arr.length-1; i++)
        {
            for(j = 0; j < Arr.length; j++)
            {
                if(i == j || i > j)
                {
                    System.out.print(Arr[j]+"\t");
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