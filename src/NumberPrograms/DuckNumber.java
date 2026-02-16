//Must have '0' but not in first position (102 --> correct) (012 --> not correct)
package NumberPrograms;

public class DuckNumber {

    public static boolean isDuck(int num)
    {
    	int LD=0;
    	int ZeroCount=0;
        while(num != 0)
        {
            LD=num%10;
            if(LD==0)ZeroCount++;
            num = num / 10;
        }
        
        if(ZeroCount>0 && LD!=0) return true;

        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(isDuck(1023));  
        System.out.println(isDuck(0123));   
    }
}
