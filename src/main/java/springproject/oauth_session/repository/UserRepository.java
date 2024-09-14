package springproject.oauth_session.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springproject.oauth_session.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findByUsername(String username);
}
