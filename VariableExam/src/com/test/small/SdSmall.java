package com.test.small;
import java.util.Scanner;
public class SdSmall {

   

      public static void main(String args[]){
    	 
         Scanner scanner = new Scanner(System.in);
        
         System.out.print("원하는 숫자를 입력하시오 ");
           int a1 = scanner.nextInt();
           System.out.print("원하는 숫자를 입력하시오 ");
           int b1 = scanner.nextInt();          
           
           int a2 = ((int)(Math.random()*10)+1);
           int b2 = ((int)(Math.random()*10)+1);
           
           System.out.println("a1 = " + a1);
           System.out.println("a2 = " + a2);
           
           System.out.println("b1 = " + b1); 
           System.out.println("b2 = " + b2);
           
       int res_a=0;
       int res_b=0;
       
      if(a1 == a2) {
         switch(a1){
         case 1:
            System.out.println("1땡");
              res_a = 10;
              break;
         case 2:
            System.out.println("2땡");
              res_a = 11;
              break;
         case 3:
            System.out.println("3땡");
              res_a = 13;
              break;
         case 4:
            System.out.println("4땡");
              res_a = 14;
              break;
         case 5:
            System.out.println("5땡");
              res_a = 15;
              break;
         case 6:
            System.out.println("6땡");
              res_a = 16;
              break;
         case 7:
            System.out.println("7땡");
              res_a = 17;
              break;
         case 8:
            System.out.println("8땡");
              res_a = 18;
              break;
         case 9:
            System.out.println("9땡");
              res_a = 19;
              break;
         case 10:
            System.out.println("장땡");
              res_a = 20;
              break;
          default :
              break;
         }   
      }
      else if(a1==3 & a2==8 || a1==8 & a2==3){
         System.out.println("38광땡!!!!!");
           res_a = 21;
      }
      else{
         res_a = a1+a2;
         if(res_a>10){
            res_a = res_a-10;
         }
            switch (res_a){
            case 0:
               System.out.println("망통");
               break;
            case 1:
               System.out.println("1끗");
               break;
            case 2:
               System.out.println("2끗");
               break;
            case 3:
               System.out.println("3끗");
               break;
            case 4:
               System.out.println("4끗");
               break;
            case 5:
               System.out.println("5끗");
               break;
            case 6:
               System.out.println("6끗");
               break;
            case 7:
               System.out.println("7끗");
               break;
            case 8:
               System.out.println("8끗");
               break;
            case 9:
               System.out.println("9끗");
               break;
            default :
                 break;
            }
         
      }
      
      if(b1 == b2) {
         switch(b1){
         case 1:
            System.out.println("1땡");
              res_b = 10;
              break;
         case 2:
            System.out.println("2땡");
              res_b = 11;
              break;
         case 3:
            System.out.println("3땡");
              res_b = 13;
              break;
         case 4:
            System.out.println("4땡");
              res_b = 14;
              break;
         case 5:
            System.out.println("5땡");
              res_b = 15;
              break;
         case 6:
            System.out.println("6땡");
              res_b = 16;
              break;
         case 7:
            System.out.println("7땡");
              res_b = 17;
              break;
         case 8:
            System.out.println("8땡");
              res_b = 18;
              break;
         case 9:
            System.out.println("9땡");
              res_b = 19;
              break;
         case 10:
            System.out.println("장땡");
              res_b = 20;
              break;
          default :
              break;
         }   
      }
      else if(b1==3 & b2==8 || b1==8 & b2==3){
         System.out.println("38광땡!!!!!");
           res_b = 21;
      }
      else{
         res_b = b1+b2;
         if(res_b>10){
            res_b = res_b-10;
         }
            switch (res_b){
            case 0:
               System.out.println("망통");
               break;
            case 1:
               System.out.println("1끗");
               break;
            case 2:
               System.out.println("2끗");
               break;
            case 3:
               System.out.println("3끗");
               break;
            case 4:
               System.out.println("4끗");
               break;
            case 5:
               System.out.println("5끗");
               break;
            case 6:
               System.out.println("6끗");
               break;
            case 7:
               System.out.println("7끗");
               break;
            case 8:
               System.out.println("8끗");
               break;
            case 9:
               System.out.println("9끗");
               break;
            default :
                 break;
            }

      }
            if (res_a > res_b)
                System.out.println("a가 이겼습니다.");
            if(res_a < res_b)
                System.out.println("b가 이겼습니다.");
            if(res_a == res_b)
                System.out.println("a와 b가 비겼습니다.");
      
      
}
}