package com.policefir.PoliceFIR.Service;



public interface IInspectorService {

	String assignOfficerToComplaint(Long id, Long complaintId);
	void updateComplaint(Long complaintId);
}
	