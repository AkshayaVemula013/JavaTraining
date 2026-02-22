package NumberPrograms;

public class StarsProgram {
    public static void main(String[] args)
    {
        int n = 5;
        int mid=n%2==0 ? n/2 : n/2+1;
//
////1st column only
//        
//        for(int i = 1; i <= 5; i++)
//        {
//            for(int j = 1; j <= 5; j++)
//            {
//
//                if(j == 1)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//            
//        }
//        System.out.println();
//
////L shape
//        
//        for(int i = 1; i <= 5; i++) 
//        {
//            for(int j = 1; j <= 5; j++) 
//            {
//
//                if(j == 1 || i == 5)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
//        System.out.println();
////BOX
//        
//        for(int i = 1; i <= n; i++)
//        {
//            for(int j = 1; j <= n; j++)
//            {
//                if(j == 1 || i == n || i == 1 || j == n)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//
//            System.out.println();  
//        }
//        System.out.println();
//        
////box with star in mid
//
//        for(int i = 1; i <= n; i++)
//        {
//            for(int j = 1; j <= n; j++)
//            {
//
//                if(i == 1 || i == n || j == 1 || j == n || (i == (n+1)/2 && j == (n+1)/2)) 
//                {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//        
////Left to right diagonal
//
//        
//        for(int i = 1; i <= n; i++)
//        {
//            for(int j = 1; j <= n; j++) 
//            {
//
//                if(i == j)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        
////Right to left
//
//        for(int i = 1; i <= n; i++)
//        {
//            for(int j = 1; j <= n; j++) 
//            {
//
//                if(i == j)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();            
//        }
//        System.out.println();
//        
////X pattern
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <= n; j++) {
//
//                if(i == j || i + j == n + 1) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        
////Z pattern
//            for(int i = 1; i <= n; i++)
//            {
//                for(int j = 1; j <= n; j++) 
//                {
//
//                    if(j == n-i+1||i==1||i==5)
//                        System.out.print("* ");
//                    else
//                        System.out.print("  ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//            
////I Pattern
//
//            for(int i = 1; i <= n; i++)
//            {
//                for(int j = 1; j <= n; j++) 
//                {
//
//                    if(j == n-j+1||i==1||i==5)
//                        System.out.print("* ");
//                    else
//                        System.out.print("  ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//            
////+ pattern with # in middle
//
//            for(int i = 1; i <= n; i++)
//            {
//                for(int j = 1; j <= n; j++) 
//                {
//
//                    if(i==mid&&j==mid)
//                        System.out.print("# ");
//                    
//                    else if((i==mid)||(j==mid))
//                        System.out.print("* ");
//
//                    else
//                        System.out.print("  ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//            
//            
//            
////Lower half left triangle
//            for(int i=1;i<=n;i++)
//            {
//            	for (int j=1;j<=i;j++)
//            	{
//                    System.out.print("* ");
//                }                
//                System.out.println();
//            }
//            System.out.println();
//            
////Upper half right triangle
//            
//            for(int i = 1; i <= n; i++)
//            {
//                for(int j = 1; j <= n; j++) 
//                {
//
//                    if(j>=i)
//                        System.out.print("* ");
//                    else
//                        System.out.print("  ");
//                }
//                System.out.println();            
//            }
//            System.out.println();
//
//
////Upper half left triangle
//            int s=n;
//            for(int i = 1; i <= n; i++)
//            {
//                for(int j = 1; j <= s; j++) 
//                {
//
//                    if(j<=i+j)
//                        System.out.print("* ");
//                    else
//                        System.out.print("  ");
//                }
//                System.out.println();
//                s--;
//            }
//            System.out.println();
//         
////lower half right triangle
//            int sp=4,st=1;
//           
//            for(int i = 1; i <= n; i++)
//            {
//                for(int j = 1; j <= sp; j++) 
//                {
//  
//                      System.out.print(" ");
//                 
//                }
//                for(int j = 1; j <= st; j++) 
//                {
//  
//                      System.out.print("* ");
//                 
//                }
//                sp--;
//                st++;
//                System.out.println();
//
//            }
//            System.out.println();
//            
////Full box
//            for(int i = 1; i <= n; i++)
//            {
//                for(int j = 1; j <= n; j++) 
//                {
//                    System.out.print("* ");
//                }                
//                System.out.println();
//            }
//            System.out.println();
//            
//            
        
//right arrow
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
      
//left arrow
        
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = n - 1; i >= 1; i--) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        
        System.out.println();

//upper arrow triangle
            for(int i = 1; i <= n; i++) {

                for(int j = 1; j <= n - i; j++)
                    System.out.print("  ");

                for(int j = 1; j <= 2*i - 1; j++)
                    System.out.print("* ");

                System.out.println();
            }
            System.out.println();

//lower arrow triangle
            
     

            for(int i = n; i >= 1; i--) {

                for(int j = 1; j <= n - i; j++)
                    System.out.print("  ");

                for(int j = 1; j <= 2*i - 1; j++)
                    System.out.print("* ");

                System.out.println();
        
            }
            System.out.println();
//diamond

            for(int i = 1; i <= n; i++) {

                for(int j = 1; j <= n - i; j++)
                    System.out.print("  ");

                for(int j = 1; j <= 2*i - 1; j++)
                    System.out.print("* ");

                System.out.println();
            }

            for(int i = n - 1; i >= 1; i--) {

                for(int j = 1; j <= n - i; j++)
                    System.out.print("  ");

                for(int j = 1; j <= 2*i - 1; j++)
                    System.out.print("* ");

                System.out.println();
            }
            System.out.println();

//V                
            
            for(int i = 1; i <= n; i++) {

                for(int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                for(int j = 1; j <= 2*(n - i); j++) {
                    System.out.print("  ");
                }

                for(int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
            System.out.println();
//X type
            
            for(int i = n; i >= 1; i--) {

                for(int j = 1; j <= n - i; j++)
                    System.out.print(" ");

                for(int j = 1; j <= 2*i - 1; j++)
                    System.out.print("*");

                System.out.println();
            }

            for(int i = 2; i <= n; i++) {

                for(int j = 1; j <= n - i; j++)
                    System.out.print(" ");

                for(int j = 1; j <= 2*i - 1; j++)
                    System.out.print("*");

                System.out.println();
            }
    }
}
