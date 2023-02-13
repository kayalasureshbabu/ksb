package com.example.securies.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.example.securies.entity.role;
import com.example.securies.entity.user;

@Repository
public interface securitesRepo extends JpaRepository<user, Integer> {
	
	@Query("select * from User u where u.name=?1 ")
	public abstract user getuseruname(String username);
	
	@Query("select * from user u join u.roles r where u.name=?1")
	public abstract List<role> getroles(String userName);

}
