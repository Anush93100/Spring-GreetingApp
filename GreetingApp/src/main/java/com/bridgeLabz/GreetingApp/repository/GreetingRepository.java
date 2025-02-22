package com.bridgeLabz.GreetingApp.repository;

import com.bridgeLabz.GreetingApp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
