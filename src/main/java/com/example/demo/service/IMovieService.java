package com.example.demo.service;

import com.example.demo.model.Movie;
import org.springframework.web.multipart.MultipartFile;

import java.nio.MappedByteBuffer;
import java.util.List;

/**
 * @author 黄腾
 * @Date 2017/12/8-16:28
 * @function
 */
public interface IMovieService {
    public Movie addMovie(Movie movie);
    public List<Movie> listMovie();
    public  void deleteMovie(Integer movieId);

}
