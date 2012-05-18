package comissao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import model.CalculoComissao;
import model.ComissaoException;
import model.Preco;
import model.Venda;
import model.Vendedor;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marina Vinhaes
 */
public class ComissaoTest {
    
   private Venda v;
   private Preco p;
   private Vendedor vend;
   private CalculoComissao c;
    
    @Before 
    public void Venda(){
        v = new Venda("10/03/2011", "0020" , 10 , 30 , 50);
        Assume.assumeNotNull(v);
    }
    
    @Before 
    public void Preco(){
        p = new Preco("10/02/2011", 40.00 , 50.00 , 70.00);
        Assume.assumeNotNull(p);
    }
    
    @Before 
    public void Vendedor(){
        vend = new Vendedor("0019" , "AFONSO CARVALHO" , 1);
        Assume.assumeNotNull(vend);
    }

}
