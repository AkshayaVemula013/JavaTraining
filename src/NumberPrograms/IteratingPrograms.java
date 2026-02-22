package NumberPrograms;

public class IteratingPrograms {
	public static void main(String[] args)
	{
		int n=5;
		
//iterate numbers row wise
		
		for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++) 
            {
                System.out.print(i+" ");
            }                
            System.out.println();
        }
        System.out.println();
 
//iterate letters row wise
        
        int c='A';
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++) 
            {
                System.out.print((char)c+" ");
            }                
            System.out.println();
        }
        System.out.println();
        
//iterate letters columns wise
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++) 
            {
                System.out.print((char)c+" ");
                c++;
            }                
            System.out.println();
            c='A';
        }
        System.out.println();
        
	}

}
