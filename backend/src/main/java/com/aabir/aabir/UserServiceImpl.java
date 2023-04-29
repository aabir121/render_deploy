package com.aabir.aabir;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    UserServiceImpl(UserRepository repository) {
        this.userRepository = repository;
    }

    @Override
    public List<Employee> getAll() {
        return userRepository.findAll();
    }
}
