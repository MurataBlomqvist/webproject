package com.example;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.example.web.Database.User.User;
import com.example.web.Database.User.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations="classpath:/com/example/test.properties")
class WebprojectApplicationTests {

	@Autowired
	UserRepository userRepo;
	
	@Test
	void contextLoads() {
		User user = new User();
	}

	@Test
	void userRepoSaveOneUser() {
		
		User user = new User();
		user.setFirstname("Murata");
		user.setLastname("Blom");
		user.setPassword("safePassword");
		user.setUsername("Bubblenidis");
		user.setCreationDate("19980606");
		user.setCreationUser("systemUser");
		user.setUpdateDate("19980606");
		user.setUpdateUser("systemUser");
		user.setStatus('1');

		User savedUser = userRepo.save(user);

		assertThat(user).usingRecursiveComparison().isEqualTo(savedUser);

	}

}
