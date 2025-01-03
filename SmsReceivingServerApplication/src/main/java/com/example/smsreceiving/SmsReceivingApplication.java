package com.example.smsreceiving;

import com.example.smsreceiving.service.SmsReceivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

@SpringBootApplication
public class SmsReceivingApplication {

	private static SmsReceivingService smsReceivingService;

	@Autowired
	public SmsReceivingApplication(SmsReceivingService smsReceivingService) {
		SmsReceivingApplication.smsReceivingService = smsReceivingService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SmsReceivingApplication.class, args);

		try {
			// Sending a test message via socket
			try (Socket socket = new Socket("localhost", 8082)) {
				PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
				String message = "Test Message from Receiving Server by Nadil Liyanage BOC";
				writer.println(message);


				// Inserting to the log file
				LogFile.info("Err |            |                 |" + message);
			}

			// Processing database records
			if (smsReceivingService != null) {

				smsReceivingService.processRecords();
				System.out.println("Successfully processed records from the database.");
			} else {
				System.err.println("SmsReceivingService is not initialized.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error while processing database records: " + e.getMessage());
		}
	}
}


