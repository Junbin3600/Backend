package com.topex.Virtual_Stock_Api.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(OrderException.class)
	public ResponseEntity<MyErrorDetails> BrokerHandler(OrderException ee,WebRequest req){
		MyErrorDetails err=new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ee.getMessage());
		err.setDetails(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(SupplierException.class)
	public ResponseEntity<MyErrorDetails> propertyHandler(SupplierException ee,WebRequest req){
		MyErrorDetails err=new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ee.getMessage());
		err.setDetails(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(OrderItemException.class)
	public ResponseEntity<MyErrorDetails> CustomerExceptionHandler(OrderItemException ee,WebRequest req){
		MyErrorDetails err=new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ee.getMessage());
		err.setDetails(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myAnyExceptionHandler(Exception ee,WebRequest req){
		MyErrorDetails err=new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ee.getMessage());
		err.setDetails(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> myAnyExceptionHandler(NoHandlerFoundException ee,WebRequest req){
		MyErrorDetails err=new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ee.getMessage());
		err.setDetails(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myMethodHandlerExceptionHandler(MethodArgumentNotValidException ee){
		MyErrorDetails err=new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage("Validation Error");
		err.setDetails(ee.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	

}
