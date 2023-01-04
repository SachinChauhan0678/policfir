package com.policefir.PoliceFIR.Service;

import java.util.List;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Exception.AppUserException;
import com.policefir.PoliceFIR.dto.LoginDTO;


public interface IUSerService  {
	
//	public AppUserEntity register(AppUserEntity appuser)throws AppUserException;
	
//	public void register();
	public AppUserEntity addUser(AppUserEntity user);
	public String deleteUser(Long id);
	public AppUserEntity updateUser(AppUserEntity entity);
    public AppUserEntity getUserById(Long id);
	//View All Users
	public List<AppUserEntity> getAllUsers();
	//View Users By Id

	//Lodge Complaint
	public ComplaintEntity addComplaint(ComplaintEntity complaint);
	//Withdraw Complaints
	public String withdrawComplaint(Long id);
	
	
	
	
	
	
}
	