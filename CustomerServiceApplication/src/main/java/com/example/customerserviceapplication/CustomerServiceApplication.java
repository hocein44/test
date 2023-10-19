package com.example.customerserviceapplication;


import com.example.entities.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
  @Bean
    CommandLineRunner start(CustomerRepository repo){
        return args ->{
            repo.save(new Customer(null,"eni","contact@eni.tn"));
            repo.findAll().forEach(System.out::println);};
//    CommandLineRunner start(CustomerRepository customerRepository){
//        return args ->{
//        customerRepository.save(new Customer(null,"eni","contact@eni.tn"));
//        customerRepository.save(new Customer(null,"FST","contact@fst.tn"));
//        customerRepository.save(new Customer(null,"ENSI","contact@ensi.tn"));
//        customerRepository.findAll().forEach(System.out::println);};
    }


}
