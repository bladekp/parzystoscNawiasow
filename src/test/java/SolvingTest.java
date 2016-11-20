import org.junit.Test;
import static org.junit.Assert.*;
import pl.edu.pw.ee.zadanie2.Zadanie2;

/**
 *
 * @author bladekp
 */
public class SolvingTest {
    
    /* 3 pierwsze obowiązkowe testy */
    @Test
    public void test1() {
        assertFalse(Zadanie2.solve("(a(c)"));
    }
    
    @Test
    public void test2() {
        assertFalse(Zadanie2.solve(")b"));
    }
    
    @Test
    public void test3() {
        assertTrue(Zadanie2.solve("(b(s))"));
    }
    
    /* pozostałe, zaproponowane przeze mnie testy */
    @Test
    public void test4() {
        assertTrue(Zadanie2.solve("(((((((b(s))))))))"));
    }
    
    @Test
    public void testPustyString() {
        assertTrue(Zadanie2.solve(""));
    }
    
    @Test
    public void testStringBezNawiasow() {
        assertTrue(Zadanie2.solve("xyz"));
    }
    
    @Test
    public void testBrakObiektu() {
        assertFalse(Zadanie2.solve(null));
    }
    
    @Test
    public void test8() {
        assertTrue(Zadanie2.solve("()()()()()()()()()()"));
    }
    
    @Test
    public void test9() {
        assertFalse(Zadanie2.solve("()()()()()()()()()()("));
    }
    
    @Test
    public void test10() {
        assertFalse(Zadanie2.solve("()()()()()()()()()())"));
    }
    
    @Test
    public void testUnicode1() {
        assertTrue(Zadanie2.solve("\u0028\u0029"));
    }
    
    @Test
    public void testUnicode2() {
        assertFalse(Zadanie2.solve("\u0029\u0028"));
    }
}
