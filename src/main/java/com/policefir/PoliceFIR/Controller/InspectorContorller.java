package com.policefir.PoliceFIR.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policefir.PoliceFIR.Service.IInspectorService;

@RestController
@RequestMapping("/AssignOfficerToComplaint")
public class InspectorContorller {

	@Autowired
	IInspectorService iInspectorService;
	
	
	@GetMapping("/officer/{officerId}/{camplaintId}")
	public String assignComplaintToOfficer(@PathVariable ("officerId") Long cId,@PathVariable ("camplaintId") Long oId) {
		
		String assignOfficerToComplaint = this.iInspectorService.assignOfficerToComplaint(cId, oId);
		return assignOfficerToComplaint;
	}
	
	
}
