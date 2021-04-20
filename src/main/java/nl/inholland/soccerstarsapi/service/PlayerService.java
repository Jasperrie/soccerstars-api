package nl.inholland.soccerstarsapi.service;

import nl.inholland.soccerstarsapi.model.Player;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {

    private List<Player> players;

    public PlayerService(List<Player> players){
        this.players = Arrays.asList(
                new Player(1, 27, "Fred", "Friday", false),
                new Player(2, 7, "Robbie", "Benson", false),
                new Player(3, 9, "Wout", "Weghorst", false)
        );
    }

    public List<Player> getAllPlayers(){
        return this.players;
    }

    public Player addPlayer(Player player){
        players.add(player);
        return player;
    }

    public Player updatePlayer(Player player){
        for (Player p : players){
            if (p.getId() == player.getId()){
                p.setNumber(player.getNumber());
                p.setFirstName(player.getFirstName());
                p.setLastName(player.getLastName());
                p.setInjured(player.isInjured());
            }
        }
        return player;
    }

}
