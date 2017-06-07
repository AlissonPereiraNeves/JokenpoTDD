/**
 * Created by apereira on 06/06/17.
 */
public class JokenpoTDD {

    public String result;

    public String play(String jogador1, String jogador2) {

        if(jogador1 == jogador2 || jogador2 == jogador1) {
            result = "empate";
        }

        if(jogador1 == "papel" && jogador2 == "pedra" || jogador2 == "pedra" && jogador1 == "papel"){
            result = "papel";
        }

        if(jogador1 == "pedra" && jogador2 == "tesoura" || jogador2 == "tesoura" && jogador1 == "pedra"){
            result = "pedra";
        }

        if(jogador1 == "tesoura" && jogador2 == "papel" || jogador2 == "papel" && jogador1 == "tesoura"){
            result = "tesoura";
        }

        return result;
    }
}