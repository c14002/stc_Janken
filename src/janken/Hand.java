package janken;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author c14002
 */
public abstract class Hand {

      Random rand=new Random();
public int hand;
    protected String handname[]={"パー","チョキ","グー"};
    protected String result[]={"あいこ","負け","勝ち"};
    
    public int  gethand(){
        return hand;
    }
    
    public void playgame(int x,int y){
      int z=0;
       switch(hand){
           case(0):
               switch(x){
               case(0):if(y==0){z=0;System.out.println(result[z]);break;}
               else if(y==1){z=1;System.out.println(result[z]);break;}
               else if(y==2){z=2;System.out.println(result[z]);break;}
               
               case(1):if(y==0){z=1;System.out.println(result[z]);break;}
               else if(y==1){z=2;System.out.println(result[z]);break;}
               else if(y==2){z=0;System.out.println(result[z]);break;}
                 
               case(2):if(y==0){z=2;System.out.println(result[z]);break;}
               else if(y==1){z=0;System.out.println(result[z]);break;}
               else if(y==2){z=2;System.out.println(result[z]);break;}
               }break;
           case(1):
               switch(x){
               case(0):if(y==0){z=1;System.out.println(result[z]);break;}
               else if(y==1){z=1;System.out.println(result[z]);break;}
               else if(y==2){z=0;System.out.println(result[z]);break;}
               
               case(1):if(y==0){z=2;System.out.println(result[z]);break;}
               else if(y==1){z=0;System.out.println(result[z]);break;}
               else if(y==2){z=2;System.out.println(result[z]);break;}
                 
               case(2):if(y==0){z=0;System.out.println(result[z]);break;}
               else if(y==1){z=1;System.out.println(result[z]);break;}
               else if(y==2){z=1;System.out.println(result[z]);break;}
               }break;
           case(2):
               switch(x){
               case(0):if(y==0){z=1;System.out.println(result[z]);break;}
               else if(y==1){z=0;System.out.println(result[z]);break;}
               else if(y==2){z=1;System.out.println(result[z]);break;}
               
               case(1):if(y==0){z=0;System.out.println(result[z]);break;}
               else if(y==1){z=2;System.out.println(result[z]);break;}
               else if(y==2){z=2;System.out.println(result[z]);break;}
                 
               case(2):if(y==0){z=1;System.out.println(result[z]);break;}
               else if(y==1){z=2;System.out.println(result[z]);break;}
               else if(y==2){z=0;System.out.println(result[z]);break;}
               }break;
       }
        
        
    }
    public void enemyhand(){
    hand=rand.nextInt(3);
}
    public void print(int i){
        System.out.println(handname[i]);
    }
}