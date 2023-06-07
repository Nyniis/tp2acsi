package com.example.tp2.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.example.tp2.user.userRepository;
import com.example.tp2.user.AuthResponse;
import com.example.tp2.user.AuthRequest;
import com.example.tp2.user.user;
@Service
@RequiredArgsConstructor
public class AuthService {
    private final userRepository repository;

    public AuthResponse register (@RequestBody AuthRequest request){
        var user= com.example.tp2.user.user.builder()
                .userName(request.getUserName())
                .email(request.getEmail())
                .password((request.getPassword()))
                .type(userType.patient)
                .build();
        repository.save(user);
        return AuthResponse.builder()
                .idUser(user.getIdUser())
                .userName(user.getUserName())
                .email(user.getEmail())
                .password(user.getPassword())
                .type(user.getType())
                .build();
    }

    public AuthResponse Login( @RequestBody AuthRequest request){
        var user =repository.findByemail(request.getEmail())
                .orElse(null);
        if (user == null) {
            return new AuthResponse("Email not found");
        }
        else {
        return AuthResponse.builder()
                .idUser(user.getIdUser())
                .email(user.getEmail())
                .type(user.getType())
                .userName(user.getUserName())
                .build();
    }}
}
