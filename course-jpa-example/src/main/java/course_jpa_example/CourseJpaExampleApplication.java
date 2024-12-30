package course_jpa_example;

import course_jpa_example.entities.User;
import course_jpa_example.repository.DepartmentRepository;
import course_jpa_example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CourseJpaExampleApplication implements CommandLineRunner  {

	@Autowired
//	private DepartmentRepository departmentRepository;
	private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(CourseJpaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("going  to save user : ");
//
//		User user = new User();
//		user.setUserId(123);
//		user.setName("Sandeep");
//		user.getAge(23);
//		user.isActive(true);
//		User savedUser = userRepository.save(user);
//		System.out.println(savedUser.getName());
//		System.out.println("user saved :");

      List<User> all =userRepository.findAll();
	  all.forEach(user -> System.out.println(user.getName()));

	}
}
