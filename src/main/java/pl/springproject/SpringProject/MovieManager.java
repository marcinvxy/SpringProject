package pl.springproject.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class MovieManager {

    private static MovieRepository movieRepository;

    @Autowired
    public MovieManager(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Iterable<MovieEntity> findAll(){ // pobieranie danych
        return movieRepository.findAll();
    }

    public MovieEntity save(MovieEntity movieEntity){
        return movieRepository.save(movieEntity);
    }

    public Optional<MovieEntity> findById(Long id){ // pobieranie danych
        return movieRepository.findById(id);
    }

    public void deleteById(Long id){
        movieRepository.deleteById(id);
    }
}