package ua.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import ua.project.entity.UserEntity;



@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	
	@Query("SELECT u FROM UserEntity u WHERE u.email = :email")
	UserEntity findUserByEmail(@Param("email") String email);
	
	@Query(" select u from UserEntity u join fetch u.userDetails ud join fetch u.category where u.email = :email ")
	UserEntity findAllInf(@Param("email") String email);

	
	
}
