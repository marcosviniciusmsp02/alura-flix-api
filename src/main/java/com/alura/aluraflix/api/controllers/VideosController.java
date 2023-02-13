package com.alura.aluraflix.api.controllers;


import com.alura.aluraflix.api.domain.DadosAtualizacaoVideos;
import com.alura.aluraflix.api.domain.DadosCadastroVideos;
import com.alura.aluraflix.api.domain.DadosListagemVideos;
import com.alura.aluraflix.api.domain.Videos;
import com.alura.aluraflix.api.repositories.VideosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("videos")
@RestController
public class VideosController {

    @Autowired
    private VideosRepository repository;

    @GetMapping
    public List<Videos> lista() {
        List<Videos> listaDeVideos = repository.findAll();
        return listaDeVideos;
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        try {
        Videos page = repository.findById(id).get();
        return ResponseEntity.ok(page);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Video não encontrado");
        }
        }
    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroVideos dados) {
        repository.save(new Videos(dados));

    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoVideos dados) {
      repository.save(new Videos(dados));
    }
    @DeleteMapping(value = "/{id}")
    @Transactional
    public ResponseEntity deletar(@PathVariable Long id) {
        try {
            repository.deleteById(id);
            return ResponseEntity.ok().body("Video deletado com sucesso");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Falha ao deletar");
        }


    }
}