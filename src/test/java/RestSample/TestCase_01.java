package RestSample;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import  io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestCase_01 {

	@Test
	void Test_01() {
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println("BODY: " + response.getBody());
		System.out.println("get class: " + response.getClass());
		System.out.println("Status code: " + response.getStatusCode());
		System.out.println("As String:" + response.asString());
		System.out.println("Status Line: " + response.getStatusLine());
		System.out.println("header: " + response.getHeader("Content Type"));

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 202);

	}
	
	@Test
	void test_02(){
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7));
	}
}
