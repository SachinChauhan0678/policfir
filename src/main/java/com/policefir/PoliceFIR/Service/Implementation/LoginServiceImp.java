package com.policefir.PoliceFIR.Service.Implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Exception.AppUserException;
import com.policefir.PoliceFIR.Repo.AppUserRepo;
import com.policefir.PoliceFIR.Service.IUSerService;
import com.policefir.PoliceFIR.Service.LoginService;
//import com.policefir.PoliceFIR.Service.LoginDTO;
import com.policefir.PoliceFIR.dto.LoginDTO;


@Service
public class LoginServiceImp implements LoginService {
	
@Autowired
private AppUserRepo repo;

@Override
public String login(String username, String password) {
//     Optional<AppUserEntity> user = Optional.of(this.repo.findByUserNameAndPassword(username, password));
//	if(user.isPresent()) {
//		return "Login SuccessFully";
//	}else {
//		return "Bad Credientials";
//	}
	return "Login Successfull";
}

}