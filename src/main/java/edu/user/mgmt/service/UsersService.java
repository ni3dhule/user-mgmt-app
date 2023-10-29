package edu.user.mgmt.service;

import edu.user.mgmt.entity.User;
import java.util.List;

public interface UsersService {
    void save(User user);
    List<User> getAll();
    User getById(Long id);
    void delete(User user);
}
