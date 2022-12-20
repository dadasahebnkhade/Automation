package com.rest.api.get;

import  static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class GETBDDAPI {
	
	@Test
	public void getAPICircuitTest_1() {
		given().log().all()
		.when().log().all()
		.get("http://ergast.com/api/f1/2017/circuits.json")
		.then().log().all()
		.assertThat()
		.body("MRData.CircuitTable.Circuits.circuitID",hasSize(20));
		
	}
	
	@Test
	public void getAPICircuitTest_2() {
		Response response =given().log().all()
		.when().log().all()
		.get("http://ergast.com/api/f1/2017/circuits.json");
		int statusCode=response.getStatusCode();
		System.out.println("Status code is :"+statusCode);
		
		
		
	}

}
