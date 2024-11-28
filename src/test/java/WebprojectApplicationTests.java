

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.web.Database.User.User;
import com.example.web.Database.User.UserRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class WebprojectApplicationTests {

	@Autowired
	UserRepository userRepo;
	
	@Test
	void contextLoads() {
	}

	@Test
	void userRepofindAllActiveUsers() {
		
		Collection<User> users = userRepo.findAllActiveUsers();

		assertThat(!users.isEmpty());
	}

}
