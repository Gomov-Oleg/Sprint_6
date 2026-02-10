import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();

        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals("Списки не совпадают", expectedResult, actualResult);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();

        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Данные не совпадают", expected, actual);
    }

    @Test
    public void getKittensFiveTest() {
        Feline feline = new Feline();

        int actual = feline.getKittens(5);
        assertEquals("Количество котят не совпадает", 5, actual);
    }

    @Test
    public void getKittensWithoutArgumentsTest() {
        Feline feline = new Feline();

        int actual = feline.getKittens();
        assertEquals("Количество котят не совпадает", 1, actual);

    }
}