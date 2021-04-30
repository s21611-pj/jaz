package pl.pjatk.wojture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    @GetMapping("/{someValue}")
    public ResponseEntity<String> getString(@PathVariable String someValue) {
        return ResponseEntity.ok().body(someValue);
    }

    @GetMapping
    public ResponseEntity<String> getString2(@RequestParam String value) {
        return ResponseEntity.ok().body(value);
    }

    @PutMapping("/update/{someString}")
    public ResponseEntity<String> updateString(@RequestBody String updatedStr, @PathVariable String someString) {
        return ResponseEntity.ok(updatedStr.concat(someString));
    }

    @PostMapping
    public ResponseEntity<String> postString(@RequestBody String value) {
        return ResponseEntity.ok(String.format(value));
    }

    @DeleteMapping("/delete/{value}")
    public ResponseEntity<HttpStatus> deleteMethod(@PathVariable String value){
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
