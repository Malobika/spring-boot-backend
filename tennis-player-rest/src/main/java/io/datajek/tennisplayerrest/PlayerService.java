package io.datajek.tennisplayerrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository repo;
    public List<Player> getAllPlayers() {
        return repo.findAll();
    }
    public Player getPlayer(int id) {

        Optional<Player> tempPlayer = repo.findById(id);

        Player p = null;

        //if the Optional has a value, assign it to p
        if(tempPlayer.isPresent())
            p = tempPlayer.get();

            //if value is not found, throw a runtime exception
        else
            throw new RuntimeException("Player with id "+ id + " not found.");

        return p;
    }

    //Get all players

    //Get player by ID

    //Add a player

    //Update a player

    //Partial update

    //delete a player
}

