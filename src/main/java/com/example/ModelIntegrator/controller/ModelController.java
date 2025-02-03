package kia.shamaei.serverapp.controller;


import kia.shamaei.serverapp.service.PythonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/predict")

public class PredictSimpleController {

    private final PythonService pythonService;


   
/**
    //if you want use process builder implementation 
    public PredictSimpleController(PythonServiceProcessBuilderImpl pythonService) {
        this.pythonService = pythonService;
    }
**/

    @GetMapping("/{input}")
    public double predict(@PathVariable String  input) {
        System.out.println("log");
        return pythonService.predict(input); // Predict using the Python model
    }


}