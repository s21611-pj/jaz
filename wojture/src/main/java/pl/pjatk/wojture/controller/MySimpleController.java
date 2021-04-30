package pl.pjatk.wojture.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.wojture.Car;

@RestController
@RequestMapping("/test")
public class MySimpleController {

    @GetMapping("/hello")
    public ResponseEntity<String> findSpecificPost() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        return ResponseEntity.ok(new Car(2005, "Volvo"));
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> getString(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello2")
    public ResponseEntity<String> getString2(@RequestParam String reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    @PostMapping("/model2")
    public ResponseEntity<Car> getCar2(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }
}
