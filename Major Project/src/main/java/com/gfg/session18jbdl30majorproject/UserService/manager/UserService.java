package com.gfg.session18jbdl30majorproject.UserService.manager;

import com.gfg.session18jbdl30majorproject.UserService.Entities.UserResponse;
import com.gfg.session18jbdl30majorproject.UserService.Entities.UserServiceRequest;

public interface UserService{
    void create(UserServiceRequest userServiceRequest);
    UserResponse get(String username);
}
