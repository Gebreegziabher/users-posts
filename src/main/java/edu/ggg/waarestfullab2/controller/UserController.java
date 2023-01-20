package edu.ggg.waarestfullab2.controller;

import edu.ggg.waarestfullab2.domain.dto.PostDto;
import edu.ggg.waarestfullab2.domain.dto.UserDto;
import edu.ggg.waarestfullab2.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService service;
    UserController(UserService service){
        this.service = service;
    }
//    @GetMapping
//    public List<UserDto> getAll(){
//        return service.findAll();
//    }

    @GetMapping
    public List<UserDto> findAll(@RequestParam(value = "number",required = false) Integer number){
        return number==null?service.findAll():service.findUsersHaveMoreThanOnePost(number);
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @GetMapping("/{id}/posts")
    public List<PostDto> getPostsByUserId(@PathVariable("id") int id){
        return service.findPostsByUserId(id);
    }

//    @GetMapping
//    public List<UserDto> getUsers(@RequestParam(value = "number",required = false) Integer number){
//        return service.findUsersHaveMoreThanOnePost(number);
//    }

    @PostMapping
    public void save(@RequestBody UserDto userDto){
        service.save(userDto);
    }
}