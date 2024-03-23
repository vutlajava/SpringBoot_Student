package com.psira.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.psira.model.College;
import com.psira.model.ResponseData;
import com.psira.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private WebClient.Builder webClient;
	
	@GetMapping("{studentId}") 
	public ResponseEntity<ResponseData> getStudentDetails(@PathVariable("studentId")  Long studentId) {
		
		
		ResponseData response = new ResponseData();
		Student student = new Student (1L,"Ashok","Midrand",1L);
		
		response.setStudent(student);
		
		Long collegeId = student.getCollegeId();
		
		
		//here you can start the rest call
		// method 1 with resttemplate
		
		 College cl =null;
		  RestTemplate restTemplate = new RestTemplate(); 
		   String endpoint =  "http://localhost:8082/college/{collegeId}"; 
		   ResponseEntity<College> data =  restTemplate.getForEntity(endpoint, College.class,collegeId);
		  
		  System.out.println(data.getStatusCodeValue());
          if(data.getStatusCodeValue() ==200) { 
        	   cl = data.getBody(); response.setCollege(cl);
          }
		  //System.out.println(cl.getCollegeId()); }
		 
		//method 2 with webclient
		//College cl =  webClient.build().get().uri("http://localhost:8082/college/1")
		//		      .retrieve().bodyToMono(College.class).block();
		response.setCollege(cl);
		
		return new ResponseEntity<ResponseData>(response,HttpStatus.OK);
		
		
		
	}

}
