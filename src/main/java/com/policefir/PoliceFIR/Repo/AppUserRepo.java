package com.policefir.PoliceFIR.Repo;


import java.util.Collection;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
@Repository
public interface AppUserRepo extends JpaRepository<AppUserEntity,Long>{

	 
//	@Query("select u from AppUser u where u.username=:name and u.password=:password")
//	AppUserEntity findUByNameAndPassword(@PathParam("name") String name, @PathParam("password") String password);
//    @Query(value = "SELECT * FROM app_user WHERE username = user and password = password", nativeQuery = true)
//    AppUserEntity findByName(String name,String passord );
//	AppUserEntity findByUserNameAndPassword(String name, String password);
//	AppUserEntity findAppUserByName(@PathParam("name") String name, @PathParam("password") String password);

}
