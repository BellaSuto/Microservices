<<<<<<< HEAD
package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    public UnsuportedMathOperationException(String exception) {
        super(exception);
    }
}

=======
package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    public UnsuportedMathOperationException(String exception) {
        super(exception);
    }
}

>>>>>>> db142fbfb68cd0a7637f1f704eaa863658e9a734
