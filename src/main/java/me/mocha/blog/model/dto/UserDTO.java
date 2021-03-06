package me.mocha.blog.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class UserDTO {

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String nickname;

    @Builder
    public UserDTO(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }

    public boolean verify(String password) {
        return this.password.equals(password);
    }

    public boolean equals(UserDTO user) {
        if (user == null) return false;
        return user.getUsername().equals(username) && user.getNickname().equals(nickname);
    }

}
