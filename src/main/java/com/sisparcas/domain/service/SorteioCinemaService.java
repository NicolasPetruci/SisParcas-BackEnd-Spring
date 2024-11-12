package com.sisparcas.domain.service;

import com.sisparcas.api.dto.CinemaDTO;
import com.sisparcas.common.optional.OptionalUtils;
import com.sisparcas.domain.mapper.CinemaMapper;
import com.sisparcas.exception.custom.BadRequestException;
import com.sisparcas.infra.model.Cinema;
import com.sisparcas.infra.model.Filme;
import com.sisparcas.infra.repository.CinemaRepository;
import com.sisparcas.infra.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SorteioCinemaService {

    private final CinemaRepository _repository;
    
    private final FilmeRepository _filmeRepository;
    private final CinemaMapper _mapper;
    private final OptionalUtils _optionalUtils;

    public CinemaDTO sortearFilme(Long idCinema) {
        Cinema cinema = _optionalUtils.getOrElseThrow(_repository.findById(idCinema));
        if(cinema.getFilmesSorteio().isEmpty()) {
            throw new BadRequestException("O cinema precisa ter filmes cadastrado para sortear.");
        }
        Collections.shuffle(cinema.getFilmesSorteio());
        cinema.setFilmeSelecionado(cinema.getFilmesSorteio().getFirst());
        _repository.save(cinema);
        return _mapper.toDTO(cinema);
    }

    public CinemaDTO adicionarFilmeSorteio(Long idCinema, Long idFilme) {

        Cinema cinema =  _optionalUtils.getOrElseThrow(_repository.findById(idCinema));
        Filme filme = _optionalUtils.getOrElseThrow(_filmeRepository.findById(idFilme));
        if(!isFilmeSorteio(cinema,filme)) {
            cinema.getFilmesSorteio().add(filme);
            _repository.save(cinema);
        }
        return _mapper.toDTO(cinema);
    }

    public CinemaDTO removerFilmeSorteio(Long idCinema, Long idFilme) {

        Cinema cinema =  _optionalUtils.getOrElseThrow(_repository.findById(idCinema));
        Filme filme = _optionalUtils.getOrElseThrow(_filmeRepository.findById(idFilme));
        if(isFilmeSorteio(cinema, filme)) {
            cinema.getFilmesSorteio().remove(filme);
            _repository.save(cinema);
        }
        return _mapper.toDTO(cinema);
    }

    public Boolean isFilmeSorteio(Cinema cinema, Filme filme){
        return cinema.getFilmesSorteio().contains(filme);
    }
}
