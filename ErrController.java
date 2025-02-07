import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        String message = "Hello, World!";
        return ResponseEntity.statu(HttpStatus.OK).body(message);
    }

    @GetMapping("/error")
    public ResponseEntity<String> getError() {
        int result = 10 / 0;
        return ResponseEntity.ok("Result: " + result);
    }
    
    public ResponseEntity<String> missingAnnotation() {
        return "This method is missing an annotation";
    }
}
