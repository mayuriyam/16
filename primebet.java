import java.io.*;
import java.util.*;
class primebet
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
       for(int i=a;i<=b;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
                System.out.print(i+" ");
        }
        
        
    }
}







