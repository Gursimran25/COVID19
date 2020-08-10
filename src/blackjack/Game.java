/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Gursimran
 */
public class Game extends Player {
    public int getBlackjackValue() {
            

         int val;   
         boolean ace;  
                      
         int cards;    

         val = 0;
         ace = false;
         cards = getCardCount();

         for ( int i = 0;  i < cards;  i++ ) {
                 
             Card card;  
             int cardVal; 
             card = getCard(i);
             cardVal = card.getValue();  
             if (cardVal > 10) {
                 cardVal = 10;   
             }
             if (cardVal == 1) {
                 ace = true;     
             }
             val = val + cardVal;
          }


          if ( ace == true  &&  val + 10 <= 21 )
              val = val + 10;

          return val;

     }  
    
}
