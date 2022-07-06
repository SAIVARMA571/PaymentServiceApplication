package com.gfg.session18jbdl30majorproject.UserService.Entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserCreatedResponse {
    private String username;
    private String email;
}
