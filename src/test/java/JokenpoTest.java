import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by apereira on 06/06/17.
 */
public class JokenpoTest {

    JokenpoTDD round = new JokenpoTDD();

    private String result;

    @Test
    public void RoundPapelEmpateTest(){

        result = round.play("papel", "papel");
        assertEquals(result, "empate");
        }

    @Test
    public void RoundPedraEmpateTest(){

        result = round.play("pedra", "pedra");
        assertEquals(result, "empate");
    }

    @Test
    public void RoundTesouraEmpateTest(){

        result = round.play("tesoura", "tesoura");
        assertEquals(result, "empate");
    }

    @Test
    public void RoundPapelWinsPedraTest(){

        result = round.play("papel", "pedra");
        assertEquals(result, "papel");
    }

    @Test
    public void RoundPedraWinTesouraTest(){
        result = round.play("pedra", "tesoura");
        assertEquals(result, "pedra");
    }

    @Test
    public void RoundTesouraWinPapelTest(){
        result = round.play("tesoura", "papel");
        assertEquals(result, "tesoura");
    }

}