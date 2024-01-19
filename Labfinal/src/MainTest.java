import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.LinkedList;

class MainTest {

    @BeforeAll
    static  void methodBeforeAll()
    {
        System.out.println("This is the Before All");
    }

    

    @Test
    void subTest() {
        int result= Main.subt(10,5);
        assertEquals(5,result);
        assertFalse(result!=5);

    }

    @BeforeEach
    void methodBeforeEach()
    {
        System.out.println("Testing Before Each");
    }

    @Test
    void addTest() {

        int result=Main.add(2,3);
        assertEquals(5,result);

        LinkedList<Integer> lk=null;
    }
}