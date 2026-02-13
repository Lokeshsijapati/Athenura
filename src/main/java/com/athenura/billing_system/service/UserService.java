package com.athenura.billing_system.service;

import com.athenura.billing_system.dto.CreateUserRequest;
import com.athenura.billing_system.repository.UserRepository;
import com.athenura.billing_system.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public void createUser(CreateUserRequest request){

        if(userRepository.findByEmail(request.getEmail()).isPresent()){
            throw new RuntimeException("user already exists");
        }
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(request.getRole())
                .build();

        userRepository.save(user);
    }
}
