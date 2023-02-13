package com.alura.aluraflix.api.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoVideos(
        @NotNull
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
       String descricao,
        @NotBlank
       String url) {
}
