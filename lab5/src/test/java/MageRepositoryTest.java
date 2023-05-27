import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertThrows;
import static org.testng.AssertJUnit.assertTrue;

public class MageRepositoryTest {
    @Test
    public void deleteUnexistent() {
        //given
        MageRepository repository= new MageRepository(); //empty

        //when
        Exception exception = assertThrows(Exception.class, () -> {
            repository.delete("Imie");
        });

        //assert
        String expectedMessage = "IllegalArgumentException";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
