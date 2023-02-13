package com.alura.aluraflix.api.domain;


public record DadosListagemVideos(Long id, String titulo, String descricao, String url) {

    public DadosListagemVideos(Videos videos) {
        this(videos.getId(), videos.getTitulo(), videos.getDescricao(), videos.getUrl());
    }

}
