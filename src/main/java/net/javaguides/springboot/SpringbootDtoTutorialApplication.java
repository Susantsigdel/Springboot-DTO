package net.javaguides.springboot;

import net.javaguides.springboot.model.Location;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.LocationRepository;
import net.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoTutorialApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("pune");
		location.setDescription("pune is a great place to livee");
		location.setLongitude(23.4);
		location.setLatitude(56.5);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Susant");
		user1.setLastName("Sigdel");
		user1.setEmail("susantsigdel@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Salim");
		user2.setLastName("Mah");
		user2.setEmail("saliml@gmail.com");
		user2.setPassword("secret1");
		user2.setLocation(location);
		userRepository.save(user2);

		User user3 = new User();
		user3.setFirstName("Sujan");
		user3.setLastName("Ashikari");
		user3.setEmail("sujan@gmail.com");
		user3.setPassword("secret3");
		user3.setLocation(location);
		userRepository.save(user3);




	}

}
