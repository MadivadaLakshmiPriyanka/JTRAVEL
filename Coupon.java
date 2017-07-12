
import java.util.*;
public class Coupon 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int c,b;
        int n=0;
        int i,j;
        int rt1=0,ct1=0;
        
        char [][]a =new char[5][5];
        {
            for( i=0;i<a.length;i++)
            {
                for( j=0;j<a.length;j++)
                {
                    a[i][j]='n';
                }
                System.out.println();
            }
             for( i=0;i<a.length;i++)
            {
                for( j=0;j<a.length;j++)
                {
                System.out.print( "  "+a[i][j]);    
                }
                System.out.println();
            }
              
        }
            //System.out.println("please enter ur character A");
            Scanner obj=new Scanner(System.in);
            //c=obj.nextChar();
            System.out.println("mister c please enter ur desired location row and column");
            int  r1=obj.nextInt();
            int  c1=obj.nextInt();
            a[r1][c1]='c';
             for( i=0;i<a.length;i++)
            {
                for( j=0;j<a.length;j++)
                {
                System.out.print("  " +a[i][j]);    
                }
                System.out.println();
            }
            //  System.out.println("please enter ur character B");
             // b=obj.nextChar();
              System.out.println("mister b please enter ur desired location row and column");
              int  r2=obj.nextInt();
              int  c2=obj.nextInt();
              a[r2][c2]='b';
              for( i=0;i<a.length;i++)
            {
                for( j=0;j<a.length;j++)
                {
                System.out.print("  " +a[i][j]);    
                }
                System.out.println();
            }
              
                  {
                      
           System.out.println(" hey mister c please enter 1 to move downwds\nenter 2 to move upwds\nenter 3 to move left \nenter 4 to move right");
           int opt1=obj.nextInt();
           switch(opt1)
                   {
               case 1:
                   if(a[r1+1][c1]=='n'){
                  a[rt1][ct1]= a[r1][c1];
                  a[r1][c1]=a[r1+1][c1];
                  a[r1+1][c1]=a[rt1][ct1];
                  a[rt1][ct1]='n';
                  a[r1][c1]='n';
                  r1=r1+1;}
                   else{
                       System.out.println("c killed b");
                   }
               
                  break;
               case 2:
                   if(a[r1-1][c1]=='n')
                   {
                   a[rt1][ct1]= a[r1][c1];
                   a[r1][c1]=a[r1-1][c1];
                   a[r1-1][c1]=a[rt1][ct1];
                    a[rt1][ct1]='n';
                    a[r1][c1]='n';
                    r1=r1-1;
                   }
                    else{
                       System.out.println("c killed b");
                   }
                   
                   break;
               case 3:
                   if(a[r1][c1-1]=='n')
                   {
                   a[rt1][ct1]= a[r1][c1];
                   a[r1-1][c1]=a[r1][c1-1];
                   a[r1][c1-1]=a[rt1][ct1];
                   a[rt1][ct1]='n'; 
                   a[r1][c1]='n';
                   c1=c1-1;
                   }
                    else{
                       System.out.println("c killed b");
                   }
                   break;
               case 4:
                    if(a[r1][c1+1]=='n')
                   
               {
                   a[rt1][ct1]= a[r1][c1];
                   a[r1-1][c1]=a[r1][c1+1];
                   a[r1][c1+1]=a[rt1][ct1];
                    a[rt1][ct1]='n';
                   a[r1][c1]='n';
                   c1=c1+1;
               }
                else{
                       System.out.println("c killed b");
                   }
               break;
                   }
            for( i=0;i<a.length;i++)
            {
                for( j=0;j<a.length;j++)
                {
                System.out.print( "  "+a[i][j]);    
                }
                System.out.println();
            }
                while(n!=3)  
                {
           System.out.println(" hey mister b please enter 1 to move downwds\nenter 2 to move upwds\nenter 3 to move left \nenter 4 to move right");
           int opt2=obj.nextInt();
           switch(opt2)
                   {
               case 1:
                   if(a[r2+1][c2]=='n')
                   {
                    a[rt1][ct1]= a[r2][c2];
                  a[r2][c2]=a[r2+1][c2];
                  a[r2+1][c2]=a[rt1][ct1];
                  a[rt1][ct1]='n';
                  a[r2][c2]='n';
                  r2=r2+1;
                   }
                   else{
                       System.out.println("b killed c");
                   }
                  break;
               case 2:
                    if(a[r2-1][c2]=='n')
                   {
                    a[rt1][ct1]= a[r2][c2];
                   a[r2][c2]=a[r2-1][c2];
                   a[r2-1][c1]=a[rt1][ct1];
                    a[rt1][ct1]='n';
                    a[r2][c2]='n';
                    r2=r2-1;
                   }
                    else{
                       System.out.println("b killed c");
                   }
                     break;
               case 3:
                    if(a[r2][c2-1]=='n')
                   {
                    a[rt1][ct1]= a[r2][c2];
                   a[r2-1][c2]=a[r2][c2-1];
                   a[r2][c2-1]=a[rt1][ct1];
                   a[rt1][ct1]='n'; 
                   a[r2][c2]='n';
                   c2=c2-1;
                   }
                    
                    else{
                       System.out.println("b killed c");
                   }
                    break;
               case 4:
                    if(a[r2][c2+1]=='n')
                   {
                    a[rt1][ct1]= a[r2][c2];
                   a[r2-1][c2]=a[r2][c2+1];
                   a[r2][c2+1]=a[rt1][ct1];
                    a[rt1][ct1]='n';
                   a[r2][c2]='n';
                   c2=c2+1;
                   }
                    else{
                       System.out.println("b killed c");
                   }
                    break;
                   }
           }
           for( i=0;i<a.length;i++)
            {
                for( j=0;j<a.length;j++)
                {
                System.out.print( "  " +a[i][j]);    
                }
                System.out.println();
            }
          }  }
      }
    
