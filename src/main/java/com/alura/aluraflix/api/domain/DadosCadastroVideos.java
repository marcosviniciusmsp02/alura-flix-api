package com.alura.aluraflix.api.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroVideos(
        @NotBlank(message = "Titulo é obrigatório")
        String titulo,
        @NotBlank
        String descricao,
        @NotBlank
        String url)
{}
