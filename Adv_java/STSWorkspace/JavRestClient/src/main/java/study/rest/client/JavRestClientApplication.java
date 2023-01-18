package study.rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


//@SpringBootApplication
public class JavRestClientApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JavRestClientApplication.class, args);
	
	RestTemplate rs = new RestTemplate();  //for clients 
//	String url = "http://localhost:8080/primary/hello";
//	String responsevalue = rs.getForObject(url, String.class);
//	
//	System.out.println("the reat API sent this - "+responsevalue);

	ResponseEntity<Integer> resEntity = rs.getForEntity("http://localhost:8080/primary/helloRE", Integer.class);
	
	
	System.out.println(resEntity.getBody()+" "+resEntity.getStatusCodeValue());
			
			
			
			
/*			
	url="http://localhost:8080/primary/postit";
	String resp = rs.postForObject(url, null, String.class);
	
	System.out.println("the post result is "+resp);
	 
	
	ResponseEntity resEntity = rs.getForEntity(url, String.class);
	
	System.out.println(resEntity.getBody() + " "+resEntity.getStatusCodeValue());
	
	rs.put("http://localhost:8080/primary/putit", null);
	
	rs.delete("http://localhost:8080/primary/deleteit");
*/	
	
	}

}
