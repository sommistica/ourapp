package nl.codeforall.hackaton.controller;

import nl.codeforall.hackaton.dto.DtoConverter;
import nl.codeforall.hackaton.dto.UserDto;
import nl.codeforall.hackaton.model.User;
import nl.codeforall.hackaton.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;
    private DtoConverter dtoConverter;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setDtoConverter(DtoConverter dtoConverter) {
        this.dtoConverter = dtoConverter;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/2")
    public void showUser(){
        User user = new User();
        user.setUsername("gijs");
        user.setPassword("sfafdafasdfsdf");
        user.setEmail("gewoongijs@gmail.com");
        userService.save(user);
    }

}
