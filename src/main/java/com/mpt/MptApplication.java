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
//
//			Provider p = new Provider("Aetna", "600 University St, Seattle", 98101);
//			providerRepository.save(p);
//
//			p = new Provider("Blue Cross", "459 Terrace St", 98104);
//			providerRepository.save(p);
//
//			 p = new Provider("Concierge Provider ", "1600 E. Jefferson Street Suite 115 ", 98122);
//			providerRepository.save(p);
//
//			 p = new Provider("Uninsured ", "5350 Tallman Ave NW Suite 301 ", 98107);
//			providerRepository.save(p);
//		};
		};
	}


}
