package edu.ggg.waarestfullab2.controller;

import edu.ggg.waarestfullab2.domain.dto.PostDto;
import edu.ggg.waarestfullab2.domain.dto.UserDto;
import edu.ggg.waarestfullab2.services.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/api/v1/posts"))
public class PostController {
    private final PostService service;
    public PostController(PostService service) {
        this.service = service;
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<PostDto> getAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PostDto getById(@PathVariable("id") int id){
        return service.findById(id);
    }
}
