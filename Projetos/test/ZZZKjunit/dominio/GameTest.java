package ZZZKjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game game1;
    private Game game2;
    private Game game3;
    @BeforeEach
    public void setUp(){
        game1 = new Game("Nine Sols", 79);
        game2 = new Game("Nine Sols", 79);
        game3 = new Game("GTA 5", 125);
    }

    @Test
    public void acessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Nine Sols", game2.name());
        Assertions.assertEquals(79, game2.value());
    }

    @Test
    public void equals_ReturnTrue_WhenObjecttAreTheSame(){
        Assertions.assertEquals(game1, game2);
    }

    @Test
    public void hashCode_ReturnTrue_WhenObjecttAreTheSame(){
        Assertions.assertEquals(game1.hashCode(), game2.hashCode());
    }

    @Test
    public void constructor_ThrowNullPointerException_WhenNameIsNull(){
        Assertions.assertThrows(NullPointerException.class, () -> new Game(null, 200));
    }

    @Test
    public void isRecord_ReturnTrue_WhenCalledFromGame(){
        Assertions.assertTrue(Game.class.isRecord());
    }
}