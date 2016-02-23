/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

/**
 *
 * @author Ricardo Jobse
 */
public class IteratorPatternDemo {
	
   public static void main(String[] args) {
      DishesRepository dishesRepository = new DishesRepository();

      for(Iterator iter = dishesRepository.getIterator(); iter.hasNext();){
         String dish = (String)iter.next();
         System.out.println("Gerecht : " + dish);
      } 	
   }
}
