package com.example.appointmentscheduler.repository;

import com.example.appointmentscheduler.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
