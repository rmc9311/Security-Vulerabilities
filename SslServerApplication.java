package com.snhu.sslserver;
import org.springframework.boot.SpringApplication;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
	

class ServerController{
	@RequestMapping("/hash")
	public String myHash()
		throws NoSuchAlgorithmException{
		String algorithm = "SHA-256";
		String data = "Hello Rebekah Collett!";
		    
		MessageDigest md = MessageDigest.getInstance(algorithm);
		md.update(data.getBytes());
		byte[] digest = md.digest();
		//call function to convert to hexadecimal
		String hexiDecimal = bytesToHex(digest);
		   
		return "<p>data:"+data+ "<p>Name of cypher Algorithm Used: " +hexiDecimal;
	}
}
	//converts bytes to hexadecimal
	public static String bytesToHex(byte[] bytes){
	    BigInteger bi = new BigInteger(1, bytes);
	    return String.format("%0" + (bytes.length << 1)+ "X", bi);
	}
}
