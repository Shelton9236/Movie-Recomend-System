package com.example.demo.service;


import com.example.demo.model.Movie;
import com.example.demo.respository.MovieRepository;
import com.example.demo.util.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * @author 黄腾
 * @Date 2017/12/8-16:39
 * @function
 */
@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    MovieRepository movieRepository;
    @Override
    public Movie addMovie(Movie movie) {
        movie.setCreatedate(new Date());
        movieRepository.save(movie);
        return movie;
    }

    @Override
    public List<Movie> listMovie() {
        return (List<Movie>)movieRepository.findAll();
    }

    @Override
    public void deleteMovie(Integer movieId) {
        movieRepository.delete(movieId);
    }

}
