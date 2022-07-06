package com.gfg.session18jbdl30majorproject.UserService.repo;

import com.gfg.session18jbdl30majorproject.UserService.Entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User,Long> {
    Optional<User> findByUsername(String username);
}
