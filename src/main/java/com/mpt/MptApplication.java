package com.mpt;

import com.mpt.model.Provider;
import com.mpt.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MptApplication {

	@Autowired
	private ProviderRepository providerRepository;
	public static void main(String[] args) {
		SpringApplication.run(MptApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(String[] params) throws Exception {
		return args -> {
			return; // remove return to add data
//			providerRepository.deleteAll();
//			Provider p = new Provider("Blue Cross", "123 ne", 98199);
//			providerRepository.save(p);
//
//			 p = new Provider("Humana", "123 ne", 98199);
//			providerRepository.save(p);
//
//			 p = new Provider("Concierge Medicine ", "123 ne", 98199);
//			providerRepository.save(p);
//
//			 p = new Provider("Uninsured ", "123 ne", 98199);
//			providerRepository.save(p);
		};
	}

}
