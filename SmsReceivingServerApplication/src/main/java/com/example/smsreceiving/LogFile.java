package com.example.smsreceiving;//package com.example.smsreceiving;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
//class LogFile {   //This class was added on 01/09/2013 as create a log
//
//    public LogFile() {}
//    public static void info(String text) {
//
//        SimpleDateFormat date_Format = new SimpleDateFormat("yyyy_MM_dd");
//
//        Calendar cal = Calendar.getInstance();
//        String c_date = date_Format.format(cal.getTime());
//        String log_f_name="SMSLog_" + c_date.substring(0,4) + "_" + c_date.substring(5,7) + "_" + c_date.substring(8,10) + ".txt"; 		// File logfile = new File("ATMSMSLog.txt");
//
//        File logfile = new File(log_f_name);
//        try{
//            FileWriter file = new FileWriter(logfile,true); // Create Log file if not exist
//            BufferedWriter log = new BufferedWriter(file);
//            log.write(text+"|Live");
//            log.write("\r\n");
//            log.close(); //Close the output stream
//        }catch (Exception e){
//            System.err.println("Error in Log File: " + e.getMessage());
//        }
//    }
//}


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class LogFile {

    public LogFile() {}

    public static void info(String text) {
        SimpleDateFormat date_Format = new SimpleDateFormat("yyyy_MM_dd");
        Calendar cal = Calendar.getInstance();
        String c_date = date_Format.format(cal.getTime());
        String log_f_name = "SMSLog_" + c_date.substring(0, 4) + "_" + c_date.substring(5, 7) + "_" + c_date.substring(8, 10) + ".txt";
        String currentDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        File logfile = new File(log_f_name);
        try {
            FileWriter file = new FileWriter(logfile, true); // Create Log file if not exist
            BufferedWriter log = new BufferedWriter(file);
            log.write("[" + currentDateTime + "] " + text);
            log.write("\r\n");
            log.close(); // Close the output stream
        } catch (Exception e) {
            System.err.println("Error in Log File: " + e.getMessage());
        }
    }
}