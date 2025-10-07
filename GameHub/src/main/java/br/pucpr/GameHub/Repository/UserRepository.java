package br.pucpr.GameHub.Repository;


import br.pucpr.GameHub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
