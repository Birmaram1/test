import java.util.*;
 class Test{
    static void ram(){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        char a[]=str.toCharArray(); 
        String st ="";
        for(int i=0;i<a.length;i++){
            if((a[i]!=' ')){
                st+=a[i];
            }
        }
        System.out.println(st);
        }
        
    }



public class Practice2 {
   public static void main(String[] args) {
    Test obj= new Test();
       Test.ram();
   } 
}
