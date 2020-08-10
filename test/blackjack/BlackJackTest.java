/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class BlackJackTest {
    
    public BlackJackTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testMainGood() {
        System.out.println("main");
        String[] args = null;
        BlackJack.main(args);
        fail("The test case is a prototype.");
    } @Test
    public void testMainBad() {
        System.out.println("main");
        String[] args = null;
        BlackJack.main(args);
        fail("The test case is a prototype.");
    }
     @Test
    public void testMainBoundaryIn() {
        System.out.println("main");
        String[] args = null;
        BlackJack.main(args);
        fail("The test case is a prototype.");
    }
     @Test
    public void testMainBoundaryOut() {
        System.out.println("main");
        String[] args = null;
        BlackJack.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPlayBlackjackGood() {
        System.out.println("playBlackjack");
        boolean expResult = false;
        boolean result = BlackJack.playBlackjack();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
     @Test
    public void testPlayBlackjackBad() {
        System.out.println("playBlackjack");
        boolean expResult = false;
        boolean result = BlackJack.playBlackjack();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
     @Test
    public void testPlayBlackjackBoundaryIn() {
        System.out.println("playBlackjack");
        boolean expResult = false;
        boolean result = BlackJack.playBlackjack();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
     @Test
    public void testPlayBlackjackBoundaryOut() {
        System.out.println("playBlackjack");
        boolean expResult = false;
        boolean result = BlackJack.playBlackjack();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
