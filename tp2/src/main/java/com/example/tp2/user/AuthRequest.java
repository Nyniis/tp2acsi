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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthRequest {

    private  String userName;

    private String email;


    private  String password;

/*    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }
    @JsonProperty("email")
    public void setUserName(String UserName) {
        this.userName = userName;
    }


    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }
*/

}
