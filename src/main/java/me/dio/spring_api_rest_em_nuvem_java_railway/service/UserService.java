package me.dio.spring_api_rest_em_nuvem_java_railway.service;

import me.dio.spring_api_rest_em_nuvem_java_railway.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
