package comissao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.CalcCommission;
import controller.CommissionException;
import model.Price;
import model.Sale;
import model.Seller;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marina Vinhaes
 */
public class ComissionTest {
    
   private Sale v;
   private Price p;
   private Seller vend;
   private CalcCommission c;
    
    @Before 
    public void Venda(){
        v = new Sale("10/03/2011", "0020" , 10 , 30 , 50);
        Assume.assumeNotNull(v);
    }
    
    @Before 
    public void Preco(){
        p = new Price("10/02/2011", 40.00 , 50.00 , 70.00);
        Assume.assumeNotNull(p);
    }
    
    @Before 
    public void Vendedor(){
        vend = new Seller("0019" , "AFONSO CARVALHO" , 1);
        Assume.assumeNotNull(vend);
    }

}
