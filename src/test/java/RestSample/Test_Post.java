package RestSample;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_Post {

	@Test
	void test_01(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
				map.put("name", "Srinivas");
				map.put("Job", "Software");
				map.put("Sal", "18200");
				map.put("City", "Vizag");
				map.put("State", "AP");
				map.put("Country", "IN");
				
				
				System.out.println(map);
				
				JSONObject jsonobj = new JSONObject(map);
				
				System.out.println(jsonobj);
				
		
	}
}
