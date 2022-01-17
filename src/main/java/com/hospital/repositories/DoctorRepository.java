package com.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.models.Doctor;
import com.hospital.models.Patient;

@Repository
public interface DoctorRepository  extends JpaRepository<Doctor, Long>{

	Iterable<Doctor> findByLastNameContaining(String lastName);

}
