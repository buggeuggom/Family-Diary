package com.family.hwang.controller.response;

import com.family.hwang.model.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserSignUpResponse {

    private String email;
    private String userName;

    public static UserSignUpResponse fromUser(User user){
        return new UserSignUpResponse(user.getEmail(), user.getUsername());
    }
}
