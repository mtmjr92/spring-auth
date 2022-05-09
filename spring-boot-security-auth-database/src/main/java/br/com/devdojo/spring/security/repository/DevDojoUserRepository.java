package br.com.devdojo.spring.security.repository;

import br.com.devdojo.spring.security.domain.DevDojoUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevDojoUserRepository extends JpaRepository<DevDojoUser, Long> {

    DevDojoUser findByLogin(String login);

}
