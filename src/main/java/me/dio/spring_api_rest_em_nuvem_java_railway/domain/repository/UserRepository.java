package me.dio.spring_api_rest_em_nuvem_java_railway.domain.repository;

import me.dio.spring_api_rest_em_nuvem_java_railway.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String accountNumber);
}
