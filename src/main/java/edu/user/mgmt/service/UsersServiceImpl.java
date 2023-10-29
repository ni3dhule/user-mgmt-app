package edu.user.mgmt.service;

import edu.user.mgmt.entity.User;
import edu.user.mgmt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void save(User user) {
        if (user.getUserId() == 0) {
            userRepository.save(user);
        } else {
            //User userUpdate = userRepository.findById(user.getUserId()).get();
            User userUpdate = userRepository.findByUserId(user.getUserId()).get();
            userUpdate.setFirstName(userUpdate.getFirstName());
            userUpdate.setLastName(user.getLastName());
            userUpdate.setGender(user.getGender());
            userUpdate.setDob(user.getDob());
            userUpdate.setEmailId(user.getEmailId());
            userUpdate.setAadhaarNo(user.getAadhaarNo());
            userUpdate.setPanNo(user.getPanNo());
            userUpdate.setContactNo(user.getContactNo());
            userRepository.save(userUpdate);
        }
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long userId) {
        return userRepository.findByUserId(userId).get();
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
