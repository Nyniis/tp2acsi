package com.example.tp2.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AuthResponse {
    private Integer idUser;


    private  String userName;


    private String email;

    private  String password;

    private userType  type;

    public AuthResponse(String emailNotFound) {
    }







   /* @JsonProperty("idUser")
    public Integer getIdUser() {
        return idUser;
    }

    @JsonProperty("idUser")
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("type")
    public userType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(userType type) {
        this.type = type;
    }

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }*/
}
