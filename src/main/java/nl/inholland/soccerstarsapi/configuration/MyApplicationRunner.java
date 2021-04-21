package nl.inholland.soccerstarsapi.configuration;

import nl.inholland.soccerstarsapi.model.Competition;
import nl.inholland.soccerstarsapi.model.Player;
import nl.inholland.soccerstarsapi.service.CompetitionService;
import nl.inholland.soccerstarsapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    CompetitionService competitionService;

    @Autowired
    PlayerService playerService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Competition competition = new Competition(1,"Eredivisie");

        competitionService.addCompetition(competition);
        Player player1 = new Player(1, 9, "Wout", "Weghorst", "de GOAT", false);
        player1.setCompetition(competition);
        playerService.addPlayer(player1);

        



    }
}
