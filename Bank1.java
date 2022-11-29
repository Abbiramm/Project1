package project1;

import java.util.Scanner;

public class Bank1 {
	 Scanner in=new Scanner(System.in);
	
	 float deposit,withdraw,balance;
	 String s1;
	 long n1,n;
	 int a=0;
	 void deposit()
	 {    

         System.out.println("Enter the amount to deposit:");
         deposit=in.nextFloat();
         if(deposit<0)
         {
        	System.out.println("Invalid amount"); 
         }
         
         else
         { 
        	 out();
         System.out.println("Deposit Amount:"+deposit);
         balance=balance+deposit;
        
         }
	 }
	 
	 void withdraw()
	 {  
	       
         System.out.println("Enter the amount to withdraw");
         withdraw=in.nextFloat();
         if(withdraw>balance)
	      {
		 System.out.println("Cannot withdraw deposit the required amount");
		 
	      }
         
         else
         {   out();
        	 balance=balance-withdraw;
        	 System.out.println("Withdraw Amount:"+withdraw);
        	
            
         }
	      
	 }
	 void balance()
	 {     
	
	
	       out();
		 System.out.println("BALANCE= "+balance);
	 
	 }
	 
	 
	 void inp()
	 {
		 System.out.println("Enter your name:");
		 s1=in.next();
		 System.out.println("Enter account number:");
		 n1=in.nextLong();
		 n=n1;
		 a=0;
		 while(n!=0)
		 {
			 n=n/10;
			 a=a+1;
		 }
		 
		 
			 
		 
	 }
	
	   void out()
	   {
		   System.out.println("NAME:"+s1);
		   System.out.println("Account number:"+n1);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
          Bank1 b=new Bank1();
          char c;
          int i;
          
          
         
          
          System.out.println("        BANKING       ");
          System.out.println("Enter choice(1-3): ");
          while(true)
          {
        	  System.out.println("1.Deposit");
        	  System.out.println("2.Withdraw");
        	  System.out.println("3.Balance");
        	  
          i=in.nextInt();
          switch(i)
          {
          
          case 1:
        	  b.inp();
        	
        	  if((b.a<11)||(b.a>11))
     		      System.out.println("Enter a valid 11 digit account number");
        	  else
        		  b.deposit();
        	  break;
          case 2:
        	  b.inp();
          	
        	  if((b.a<11)||(b.a>11))
     		      System.out.println("Enter a valid 11 digit account number");
        	  else
        	      b.withdraw();
              break;
          case 3:
        	  b.inp();
          	
        	  if((b.a<11)||(b.a>11))
     		      System.out.println("Enter a valid 11 digit account number");
        	  else
        	   b.balance();
        	  break;
         default:System.out.println("Entered a wrong choice");	  
        	 
          }
          
          
          System.out.println("Press 'n' to exit or any other key to continue");
          c=in.next().charAt(0);
          if(c=='n')
        	  break;
          }
         
        
          
	}

}
