package edu.ggg.waarestfullab2.services;

import edu.ggg.waarestfullab2.domain.User;
import edu.ggg.waarestfullab2.domain.dto.PostDto;
import edu.ggg.waarestfullab2.domain.dto.UserDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserService {
    public List<UserDto> findAll();
    UserDto findById(int id);
    List<PostDto> findPostsByUserId(int id);
    List<UserDto> findUsersHaveMoreThanOnePost(int number);
    void save(UserDto u);
    void delete(int id);
    void update(int id, UserDto u);
}
