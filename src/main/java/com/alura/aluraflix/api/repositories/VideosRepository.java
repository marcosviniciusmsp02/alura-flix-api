package com.alura.aluraflix.api.repositories;
import com.alura.aluraflix.api.domain.Videos;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VideosRepository extends JpaRepository<Videos, Long> {
}
