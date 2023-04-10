package tests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class getRequests {
	
	@Test
	public void getUsers() {
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
				.statusCode(200)
				.assertThat().body("page", is(2))
				.header("Content-Type","application/json; charset=utf-8");
	}

}
