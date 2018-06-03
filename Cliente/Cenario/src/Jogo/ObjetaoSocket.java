package Jogo;

import Entidades.*;

import Entidades.PersonagemDTO;
import Entidades.JogadorDTO;
import Entidades.HistoricoBatalhaDTO;
import Entidades.BatalhaDTO;
import java.io.Serializable;


public class ObjetaoSocket implements Serializable {
    public String mensagem;
    public JogadorDTO jogador, jogadorAdversario;
    public PersonagemDTO personagem;
    public BatalhaDTO batalha;
    public HistoricoBatalhaDTO historicoBatalha;
}
