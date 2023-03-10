package edu.ggg.waarestfullab2.services.Impl;

import edu.ggg.waarestfullab2.domain.Post;
import edu.ggg.waarestfullab2.domain.dto.PostDto;
import edu.ggg.waarestfullab2.repo.PostRepo;
import edu.ggg.waarestfullab2.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private PostRepo repo;
    private ModelMapper modelMapper;
    public PostServiceImpl(PostRepo repo, ModelMapper modelMapper){
        this.repo = repo;
        this.modelMapper = modelMapper;
    }
    public List<PostDto> findAll() {
        List<Post> list = new ArrayList<>();
        repo.findAll().forEach(list::add);
        return list
                .stream()
                .map( p -> modelMapper.map(p,PostDto.class))
                .collect(Collectors.toList());
    }
    public PostDto findById(int id){
        return modelMapper.map(repo.findById(id).get(), PostDto.class);
    }
    public void save(PostDto dto){
        Post post = new Post();//modelMapper.map(dto, Post.class);
        post.setTitle(dto.getTitle());
        post.setContent(dto.getContent());
        repo.save(post);
    }

    @Override
    public void update(int id,  PostDto p) {
        //repo.update(id, modelMapper.map(p, Post.class));
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
