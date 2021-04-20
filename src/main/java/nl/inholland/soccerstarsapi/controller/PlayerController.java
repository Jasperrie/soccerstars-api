package nl.inholland.soccerstarsapi.controller;

import nl.inholland.soccerstarsapi.model.Player;
import nl.inholland.soccerstarsapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllPlayers(){
        List<Player> players = playerService.getAllPlayers();
        return ResponseEntity.status(200).body(players);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Player> createPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
        return ResponseEntity.status(201).body(player);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player){
        playerService.updatePlayer(player);
        return ResponseEntity.status(201).body(player);
    }
}
