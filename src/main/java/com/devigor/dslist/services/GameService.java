package com.devigor.dslist.services;

import com.devigor.dslist.dto.GameMinDTO;
import com.devigor.dslist.entities.Game;
import com.devigor.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
     List<Game> result = gameRepository.findAll();
     List<GameMinDTO> dto = result.stream().map(data -> new GameMinDTO(data)).toList();
     return dto;
    }

}
