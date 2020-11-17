package com.sunnyhith.reactive.reactivemongoexample1.repository;

import com.sunnyhith.reactive.reactivemongoexample1.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.support.SimpleReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {

}
