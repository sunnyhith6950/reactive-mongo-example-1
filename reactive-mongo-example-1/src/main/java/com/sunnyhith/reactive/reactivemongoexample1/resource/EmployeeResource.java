package com.sunnyhith.reactive.reactivemongoexample1.resource;

import com.sunnyhith.reactive.reactivemongoexample1.model.Employee;
import com.sunnyhith.reactive.reactivemongoexample1.model.EmployeeEvent;
import com.sunnyhith.reactive.reactivemongoexample1.repository.EmployeeRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;


import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/*@RestController
@RequestMapping("/rest/employees")*/
public class EmployeeResource {
    /*private EmployeeRepository employeeRepository;

    public EmployeeResource(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @GetMapping("/all")
    public Flux<Employee> getall() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Employee> getId(@PathVariable("id") final String empid){
        return employeeRepository.findById(empid);
    }

    @GetMapping(value = "/{id}/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<EmployeeEvent> getEvents(@PathVariable("id") final String empid) {
        return employeeRepository.findById(empid).
                flatMapMany(employee -> {
                    Flux<Long> interval = Flux.interval(Duration.ofSeconds(2));
                    Flux<EmployeeEvent> employeeEventFlux = Flux.fromStream(
                        Stream.generate(() -> new EmployeeEvent(employee,new Date()))
                    );
                    return   Flux.zip(interval,employeeEventFlux).map(Tuple2::getT2);
                });
    }*/
}
