package com.alura.aluraflix.api.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@Entity
@Table (name = "tb_videos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Videos {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    @URL
    private String url;


    public Videos(DadosCadastroVideos dados) {
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this.url = dados.url();
    }

    public Videos(DadosAtualizacaoVideos dados) {
        this.id = dados.id();
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this.url = dados.url();
    }
}
