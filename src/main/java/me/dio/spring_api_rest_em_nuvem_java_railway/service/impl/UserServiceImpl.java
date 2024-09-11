package me.dio.spring_api_rest_em_nuvem_java_railway.service.impl;

import me.dio.spring_api_rest_em_nuvem_java_railway.domain.model.User;
import me.dio.spring_api_rest_em_nuvem_java_railway.domain.repository.UserRepository;
import me.dio.spring_api_rest_em_nuvem_java_railway.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return this.userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    @Override
    public User create(User userToCreate) {
        if (this.userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("Esse numero de conta ja esta cadastrado!");
        }

        return userRepository.save(userToCreate);
    }
    /*
    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && this.userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("Usuario com esse id ja cadastrado no banco de dados.");
        }

        return userRepository.save(userToCreate);
    }

     */
}
