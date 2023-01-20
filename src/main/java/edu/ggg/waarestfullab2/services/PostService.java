package edu.ggg.waarestfullab2.services;

import edu.ggg.waarestfullab2.domain.dto.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> findAll();
    PostDto findById(int id);
    void save(PostDto p);
    void delete(int id);
    void update(int id, PostDto p);
}
