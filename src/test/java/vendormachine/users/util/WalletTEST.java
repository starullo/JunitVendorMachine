package vendormachine.users.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import vendormachine.users.util.Wallet;


public class WalletTEST {

    @Test
    public void createInstanceTest(){
    	Wallet w1 = new Wallet();
    	assertEquals(w1.getBrand(), "Generic");
    	assertEquals(w1.getAllCredit(), 0.5f);
    	
    	Wallet w2 = new Wallet("Polo", .7f);
    	assertEquals(w2.getBrand(), "Polo");
    	assertEquals(w2.getAllCredit(), 0.7f);
    	
    	Wallet w3 = new Wallet(.9f);
    	assertEquals(w3.getAllCredit(), .9f);
    }
    
    @Test public void creditTest() {
    	Wallet w1 = new Wallet("Dolce and Gabana", 0.6f);
    	assertEquals(w1.getAllCredit(), 0.6f);
    	
    	w1.addCredit(0.2f);
    	assertEquals(w1.getAllCredit(), 0.8f);
    	
    	w1.getCredit(0.3f);
    	assertEquals(w1.getAllCredit(), 0.5f);
    	
    	double res = w1.getCredit(0.9f);
    	assertEquals(res, 0);
    	
    	w1.setCredit(0.2f);
    	assertEquals(w1.getAllCredit(), 0.2f);
    	
    }
    
    @Test public void brandTest() {
    	Wallet w1 = new Wallet("Fancy", 0.5f);
    	assertEquals("Fancy", w1.getBrand());
    	
    	w1.setBrand("Fancier");
    	assertEquals("Fancier", w1.getBrand());
    }
}
