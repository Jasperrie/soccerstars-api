package nl.inholland.soccerstarsapi.service;

import nl.inholland.soccerstarsapi.model.Player;
import nl.inholland.soccerstarsapi.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {

//    private List<Player> players;
//
//    public PlayerService(List<Player> players){
//        this.players = Arrays.asList(
//                new Player(1, 27, "Fred", "Friday", "FF27", false),
//                new Player(2, 7, "Robbie", "Benson", "Boon", false),
//                new Player(3, 9, "Wout", "Weghorst", "de Goat", false)
//        );
//    }

    private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Iterable<Player> getAllPlayers(){

        return playerRepository.findAll();
    }

    public Player addPlayer(Player player){
        playerRepository.save(player);
        return player;
    }

    public Player updatePlayer(Player player){
        for (Player p : playerRepository.findAll()){
            if (p.getId() == player.getId()){
                p.setNumber(player.getNumber());
                p.setFirstName(player.getFirstName());
                p.setLastName(player.getLastName());
                p.setNickName(player.getNickName());
                p.setInjured(player.isInjured());
            }
        }
        return player;
    }

}
