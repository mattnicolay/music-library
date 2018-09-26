package com.example.artistservice.dao;

import com.example.artistservice.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

}
