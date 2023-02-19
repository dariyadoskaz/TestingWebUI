import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {


    @ParameterizedTest
    @ValueSource(int =  3, 4, 5)
    public void isParameterizedTest(double){
        System.out.println(double);
    }

    public class AssertAssumTest {

        Boolean myBoolean = true;
        Integer myInteger = 100;
        String myString = "str";

        @Test
        void notAtEST(){
            System.out.println("Это не тест");
        }

        @Test
        void test(){
            assertTrue(myBoolean, "Не true");
            assertFalse(!myBoolean, "Не False");
            assertEquals(100,myInteger.intValue(), "Не 100");
            assertEquals("str", myString, "Другое значение переменно myString");
            Assertions.assertSame(myString, myString);
            Assertions.assertNotNull(myInteger);
        }

        private String getException() throws NullPointerException{
            if(myBoolean) throw new NullPointerException();
            return "result";
        }
}
