package com.esturando.PrimeiroProjeto.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.esturando.PrimeiroProjeto.entities.Category;
import com.esturando.PrimeiroProjeto.entities.Order;
import com.esturando.PrimeiroProjeto.entities.User;
import com.esturando.PrimeiroProjeto.entities.enums.OrderStatus;
import com.esturando.PrimeiroProjeto.repositories.CategoryRepository;
import com.esturando.PrimeiroProjeto.repositories.OrderRepository;
import com.esturando.PrimeiroProjeto.repositories.UserRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		Order o1 = new Order(null, Instant.parse("2020-08-20T19:53:07Z"), OrderStatus.PAID,u1);
		Order o2 = new Order(null, Instant.parse("2020-08-20T19:53:07Z"),OrderStatus.WAITING_PAYMENT,u2);
		orderRepository.saveAll(Arrays.asList(o1,o2));
		
		Category c1 = new Category(null, "Eletronics");
		Category c2 = new Category(null, "Books");
		categoryRepository.saveAll(Arrays.asList(c1,c2));
		
	}

}
