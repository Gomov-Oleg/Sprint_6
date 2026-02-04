import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);

        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals("Количество львят не совпадает", expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
       Lion lion = new Lion("Самец", feline);

       Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
       List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
       List<String> actualResult = lion.getFood();
       assertEquals("Некорректный результат", expectedResult, actualResult);
    }
}