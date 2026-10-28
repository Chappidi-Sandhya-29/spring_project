package com.teks.beans;


import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;

// Tell Spring that this class contains Bean definitions
@Configuration
public class SpringConfig {

    // Create and configure the Address Bean
    @Bean
    public Address createAddress() {

        // Create an Address object
        Address addr = new Address();

        
        addr.setCity("Pulivendula");

        
        addr.setHousno("2-29");

        
        addr.setPincode(516390);

        
        return addr;
    }

    // Create and configure the Student Bean
    
    @Bean
    public Student createStdObj(Address address) {

        // Create a Student object
        Student std = new Student();

       
        std.setId(214);

        
        std.setName("sandhya");

        
        std.setEmail("sandhya@gmail.com");

        
        std.setAddress(address);

        
        return std;
    }
}