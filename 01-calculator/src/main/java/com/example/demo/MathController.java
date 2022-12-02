package com.example.demo;

import com.example.demo.converters.StringToDouble;
import com.example.demo.exception.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {


    private StringToDouble sd = new StringToDouble();

    @RequestMapping(value = "/soma/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double soma(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!sd.isNumeric(numberOne) || !sd.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Please set a numeric value");

        }
        return sd.convertToDouble(numberOne) + sd.convertToDouble(numberTwo);
    }

    @RequestMapping(value = "/subtracao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtracao (@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!sd.isNumeric(numberOne) || !sd.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return sd.convertToDouble(numberOne) - sd.convertToDouble(numberTwo);
    }

    @RequestMapping(value = "/divisao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double divisao (@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!sd.isNumeric(numberOne) || !sd.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return sd.convertToDouble(numberOne) / sd.convertToDouble(numberTwo);
    }

    @RequestMapping(value = "/multiplicacao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplicacao (@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!sd.isNumeric(numberOne) || !sd.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return sd.convertToDouble(numberOne) * sd.convertToDouble(numberTwo);
    }
    @RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double media (@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!sd.isNumeric(numberOne) || !sd.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return sd.convertToDouble(numberOne)+sd.convertToDouble(numberTwo) /2 ;
    }
    @RequestMapping(value = "/raiz/{number}", method = RequestMethod.GET)
    public Double raiz (@PathVariable("number") String number) throws Exception {
        if(!sd.isNumeric(number)){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return (Double) Math.sqrt(sd.convertToDouble(number));
    }

}