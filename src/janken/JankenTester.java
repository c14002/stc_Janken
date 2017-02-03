/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;



import java.util.Scanner;

public class JankenTester {
    public static void main(String[] args){
    
    
    int k=0;
    Scanner stdIn=new Scanner(System.in);
   
    Hand[]p=new Hand[3];
    p[0]=new Player(0);
    p[1]=new Enemy(1);
    p[2]=new Enemy(2); 
   do{
       System.out.println("じゃんけん");
      System.out.println("ポン！");
     
         System.out.println("プレイヤーの手は？(1 パー　２　チョキ　３　グー：　)");
      p[0].hand=stdIn.nextInt()-1;
      p[1].enemyhand();
      p[2].enemyhand();
      
     System.out.println("Playerの手は");
     p[0].print(p[0].hand);
     System.out.println("Com1の手は");
      p[1].print(p[1].hand);
       System.out.println("Com2の手は");
      p[1].print(p[2].hand);
      
      p[1].playgame(p[1].gethand(),p[2].gethand());
     
      System.out.println("まだじゃんけんを続けますか？Yes:0 NO:1");
      k=stdIn.nextInt();
   }while(k==0);
   
            }
}
