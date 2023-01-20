package edu.ggg.waarestfullab2.repo;

import edu.ggg.waarestfullab2.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post,Integer>{
}