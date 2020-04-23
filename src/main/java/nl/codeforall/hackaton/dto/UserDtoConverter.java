package nl.codeforall.hackaton.dto;

import nl.codeforall.hackaton.model.User;
import nl.codeforall.hackaton.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDtoConverter {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User convertToUser(UserDto userDto){

        User user = (userDto.getId() != null ? userService.get(userDto.getId()) : new User());

        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setScore(userDto.getScore());
        return user;
    }

    public UserDto convertToDto(User user){

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        userDto.setEmail(user.getEmail());
        userDto.setScore(user.getScore());

        return userDto;
    }

    public List<UserDto> convertToDtoList(List<User> users){

        List<UserDto> userDtos = new ArrayList<>();

        for(User user : users){
            UserDto userDto = convertToDto(user);
            userDtos.add(userDto);
        }

        return userDtos;
    }
}
