import java.lang.reflect.Array;
import java.util.*;
class Java{
    void raj(int n){
        int temp[] = new int[n];
      
         int l=0,count=0;
        for( int i=1;i<=n;i++){
            
              temp[i-1]=i;     
        }
     
    for(int j : temp){
       while(j>0){
        j=j/10;
        count++;
       }
       System.out.println(count);
         if(count%2!=0){
            l+=count*2;
         }
         else if(count%2==0 && count/4==0){
            l+=count*3;
         }
         else if(count%2==0 && count/4!=0){
            l+=count*4;
         }
        count=0; 
        
    }

    System.out.println((l));
    while(l>9){
        int a=l%10;
        int b=l/10;
        l=a+b;
    }
    System.out.println("result : "+l);
    
    }

}

public class Practice1 {
    public static void main(String[] args) {
        Java obj = new Java();
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        obj.raj(n);
    }
}
