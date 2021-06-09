package cu.fizzspringboot.fizzbuzz.fizzbuzznumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
	}

	@GetMapping
	public String hello(@RequestParam(value = "name", defaultValue = "dude") String name) {
		return String.format(
			"Hello %s!, this is a simple FizzBuzz App"+
			"<br> You can go to <a href=\'/api/fizzbuzz\'>/api/fizzbuzz</a> to get the full list"+
			"<br> also you can ask for a number <a href=\'/api/fizzbuzz/15\'>/api/fizzbuzz/15</a>"+
			"<br> or get a <a href=\'/api/fizzbuzz/random\'>random one</a>"
			, name);
	}
}
