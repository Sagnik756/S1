import java.util.*;
class Alter
{
    public static void main()
    {
        int n=6;
        int sum=0;
        int i;
        for(i=1;i<=n;i++){
            if(i%2==0)
            {
                sum-=i;
            }
            else{
                sum+=i;
            }
        }
        System.out.println("Sum="+sum);
    }
}/* 1-2+3-4+5-6*/