package com.synclab.regenerate.repository;

import com.synclab.regenerate.model.Department;
import com.synclab.regenerate.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findDoctorByIdDepartment(Department id);

    Doctor findIdDoctorByName(String name);
}
