import java.io.*;
import java.util.*;

public class NewMain {

    int max(int ...A)
    {
        int max;
                max=A[0];
                for(int x:A)
                {
                    if(x>max)
                    {
                    max=x;
                    }
                
                }
                return max;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    //Scanner n=new Scanner(System.in);
    //System.out.println("enter the index where u want to insert");
    //int index=n.nextInt();
   // int a[]=new int[10];
/*    int b[][]={{1,10,7,8},{1,2,3,4},{5,7,2,4}};
    int c[][]={{3,3,4,5},{6,7,3,5},{4,5,6,2}};
   // int sum=0,max1=a[0],max2=a[0];
  int i,j,str=0;
  int sum[][]=new int[3][4];
   for(i=0;i<b.length;i++)
   {
       for(int k=0;k<b.length;k++)
       {
        for(k,j=0;j<b[i].length;j++,k++)
        {
            for(k=0,t;k<3;k++, t++)
            {
            str+=b[i][k]*c[j][k];
        
            }
            sum[i][j]
        }
        count++;
        count=count%4;
        sum[k][count]=str;
       }
        j=0;
        sum[i][j]=
   }
      for(i=0;i<b.length;i++)
   {
   
        for(j=0;j<b[i].length;j++)
        {
        System.out.printf("%02d ",sum[i][j]);
        
        
        }
        
        System.out.println("");
   }
    
    
    
    
    */

/*int i,j,temp;

        for(i=11;i<=100;i++)
        {
            temp=0;
            for(j=2;j<=9;j++)
            {
                if(i%j==0)
                {
                    temp=1;
                }
            
            
            }
            if(temp==0)
            {
            
            System.out.print(i+" ");
            }
        
        
        }
    
            
 */
    //int c,val,sum=0;
        //c=max(1,2,3,4,5,6);
     double d=0;
     //   String ss= String.valueOf(new);
    for(String x:args)
    {
       // int new;
    //new= x.valueOf(int);              
    d+=Double.parseDouble(x);
    }
    System.out.println(d);
    }
}
