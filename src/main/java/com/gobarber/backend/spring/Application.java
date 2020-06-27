package com.gobarber.backend.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Autowired
//	public void authenticationManager (AuthenticationManagerBuilder builder, UserRepository repo) throws Exception {
//		builder.userDetailsService(s -> new CustomUserDetails(repo.findUserByEmail(s)));
//	}
}
