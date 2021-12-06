package com.example.demo.respository;

        import com.example.demo.model.CataLog;
        import com.example.demo.model.Movie;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;


        import java.util.List;

/**
 * @author 黄腾
 * @Date 2017/12/8-18:43
 * @function
 */
public interface MovieRepository extends JpaRepository<Movie,Integer>{
        public Page<Movie> findByCataLog(CataLog cataLog, Pageable pageable);
        public  List<Movie> findByCataLog(CataLog cataLog);
        

}
