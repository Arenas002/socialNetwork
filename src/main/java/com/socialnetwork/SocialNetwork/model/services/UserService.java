package com.socialnetwork.SocialNetwork.model.services;


import com.socialnetwork.SocialNetwork.model.domain.User;
import com.socialnetwork.SocialNetwork.model.repository.UserRepository;
import com.socialnetwork.SocialNetwork.model.utilities.MyResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import static org.springframework.http.HttpStatus.Series.SERVER_ERROR;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private MyResponseUtility response;

public MyResponseUtility save(User user){
    try{
        response = new MyResponseUtility();
        response.data= userRepository.save(user);
        response.status = HttpStatus.CREATED.value();
        return response;
    }catch (Exception e){
        response.message = "Error interno";
        response.status = HttpStatus.INTERNAL_SERVER_ERROR.value();
        return response;
    }
}



}
