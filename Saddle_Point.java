import java.util.*;
public class Saddle_Point
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number of rows and columns");
        int n=in.nextInt();
        int arr[][]=new int [n][n];
        int arr2[]=new int[n];
        int i,j;
        System.out.println("Enter the array elements");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
                if(i==j)
                {
                    arr2[i]=arr[i][j];
                }
            }
        }
        int t=0;
        for (i=0;i<n;i++)
        {
            for (j=i+1;j<n;j++)
            {
                if (arr2[i]<arr2[j])
                {
                    t=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=t;
                }
            }
        }
        System.out.println("The arranged(diagonal) array is ");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                if(i==j)
                {
                    arr[i][j]=arr2[i];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max=0;
        for (i=0;i<n;i++)
        {
            
            for (j=0;j<n;j++)
            {
                max=arr[i][j];
                for (int k=j+1;k<n;k++)
                {
                    if (arr[i][k]>max)
                    max=arr[i][k];
                }
            }
        }
    }
}
