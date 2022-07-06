package com.gfg.session18jbdl30majorproject.UserService.Entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserServiceRequest {
    private String username;
    private String password;
    private String email;
}
