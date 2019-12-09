package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.beans.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;

//@Controller
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") // to accept requests from any(*) port
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/getEmployee")
	// @ResponseBody
	public EmployeeResponse getEmployee(int empId) {

		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if (employeeInfoBean != null) {
			response.setStatusCode(201);
			response.setMessage("Success!!");
			response.setDescription("Employee Record Found ...");
			response.setEmployeeInfoBean(employeeInfoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed !!");
			response.setDescription("Employee record " + empId + "not found ...");

		}
		return response;
	}// End of getEmployee()

	@GetMapping(path = "/getAll", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse getAllEmployees() {
		List<EmployeeInfoBean> employeesList = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();

		if (employeesList != null && !employeesList.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success!!");
			response.setDescription("Employee Records Found ...");
			response.setEmployeesList(employeesList);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failed !!");
			response.setDescription("Unable to fetch Employee Records ...");
		}

		return response;
	}// End of getAllEmployees()

	@DeleteMapping(path = "/deleteEmployee", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse deleteEmployee(int empId) {
		boolean isDeleted = service.deleteEmployee(empId);

		EmployeeResponse response = new EmployeeResponse();

		if (isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Success !!");
			response.setDescription("Employee Deleted Successfully ... ");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to delete Employee record..");
		}
		return response;

	}// End of deleteEmployee()

	@PutMapping(path = "/addEmployee", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	// @ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded = service.addEmployee(employeeInfoBean);

		EmployeeResponse response = new EmployeeResponse();

		if (isAdded) {

			response.setStatusCode(201);
			response.setMessage("Success !! ");
			response.setDescription("Employee added Successfully ...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed ");
			response.setDescription("Unable to add Employee Record...");
		}
		return response;
	}// End of addEmployee()

	@PostMapping(path = "/updateEmployee", consumes = { MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated = service.updateEmployee(employeeInfoBean);

		EmployeeResponse response = new EmployeeResponse();

		if (isUpdated) {
			response.setStatusCode(201);
			response.setMessage("Success !!");
			response.setDescription("Employee Updated Successfully ...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed !!");
			response.setDescription("Unable to Update Employee Record ...");
		}
		return response;

	}// End of updateEmployee()

}// End Of Controller
