import java.util.*;

class test2{
      void puka(){
    Scanner sc = new Scanner(System.in);
     

   int amount=0,a=0,b=0,c=0,ticket;
  for (int i=0;i<3;i++){
    System.out.println("enter number of persion");
     ticket = sc.nextInt();
    System.out.println("enter age");
    int age = sc.nextInt();
  if(age<3){
     
      a=ticket;
      
  } 
   if((age>=3) &&(age<=12) ){
    
      b=ticket;
     amount+=ticket*100;
  }
   if(age>12){
     
      c=ticket;
     amount+=ticket*150;
   }
      
      }
 System.out.println("total generate bill : "+(a+b+c)+"\ntotal amount of tickets : "+amount);
}

}

public class Practice3 {
    public static void main(String[] args) {
        test2 obj = new test2();
        obj.puka();
        
    }
}
