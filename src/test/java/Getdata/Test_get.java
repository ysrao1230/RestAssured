package Getdata;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_get {

	@Test
	void test1(){
		baseURI="https://reqres.in/api";
		given().
			get("/users?page=2").
		then()
			.statusCode(200).body("data.id[0]", equalTo(7)).
			body("data.first_name", hasItems("Michael","Rachel")).log().all();
		
		JSONObject obj = new JSONObject();
			
	
	}
}
