package lan.dk.poc.multiproject.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	public static class ExampleController {

		@RequestMapping("/api/foo")
		public Greeting greeting() {
			return new Greeting("Kevin");
		}

	}

	@Controller
	public static class StaticController {

		public String home() {
			return "index";
		}

	}
}
