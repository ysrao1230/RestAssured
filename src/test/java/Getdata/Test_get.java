package Getdata;

import static io.restassured.RestAssured.*;
import  io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Test_get {

	@Test
	void test1(){
		
		given().
			get("https://reqres.in/api/users?page=2").
		then()
			.statusCode(200).body("data.id[0]", equalTo(7)).
			body("data.first_name", hasItems("Michael","Rachel"));
			
	
	}
}
