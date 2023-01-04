package com.policefir.PoliceFIR.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
import com.policefir.PoliceFIR.Exception.AppUserException;
import com.policefir.PoliceFIR.Service.IUSerService;
import com.policefir.PoliceFIR.Service.LoginService;
import com.policefir.PoliceFIR.dto.LoginDTO;
@CrossOrigin
@RestController
@RequestMapping("/AppUserlogin")
public class UserController {
	
	

@Autowired
private LoginService loginService;


@PostMapping("/validate")
public String validate (@RequestBody LoginDTO dto){
	
	String login = this.loginService.login(dto.getUserName(), dto.getPassword());
	return login;
	}
//@PostMapping("/register")
//public ResponseEntity<AppUserEntity> createNewAppUser(@RequestBody AppUserEntity appuser) throws AppUserException{
//return new ResponseEntity<AppUserEntity>(service.register(appuser),HttpStatus.CREATED);
//}


}
