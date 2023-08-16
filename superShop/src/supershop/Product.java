/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supershop;

/**
 *
 * @author maksu
 */
public class Product {
        int total;
        
    int price;
    
    int calculateCost(int p_code, int quantity){
        
        switch(p_code){
            case 9001:
             price=80;
                
            total=price*quantity;
            
            return(+total);
            
           
           
            
            case 9002:
                 price=60;
                
            total=price*quantity;
            
            return(+total);
           
            
            case 9003:
                 price=50;
                
            total=price*quantity;
            
            return(+total);
            
            
            case 9004:
                 price=500;
                
            total=price*quantity;
            
            return(+total);
           
            
            case 9005:
                 price=450;
                
            total=price*quantity;
            
            return (+total);
            
            
            default:
                return 0;
                
      
        
        }
    
    
}

    
}
