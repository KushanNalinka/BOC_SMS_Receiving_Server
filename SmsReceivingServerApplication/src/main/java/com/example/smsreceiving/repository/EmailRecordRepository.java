package com.example.smsreceiving.repository;

import com.example.smsreceiving.model.EmailRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmailRecordRepository extends JpaRepository<EmailRecord, Long> {
    //List<EmailRecord> findByStatus(String status);
    List<EmailRecord> findByStatusAndApplicationType(String status, String applicationType);
}
