package com.rc.passwordreset.repository;

import com.rc.passwordreset.model.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginUser,Long> {

   public LoginUser findByNUID(String nuid);
}
