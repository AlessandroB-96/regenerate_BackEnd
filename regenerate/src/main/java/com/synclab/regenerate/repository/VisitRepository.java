package com.synclab.regenerate.repository;


import com.synclab.regenerate.model.Department;
import com.synclab.regenerate.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long> {

    //Need to initialize id of type Department because it was initialized as a Department type in Visit.java
    List<Visit> findVisitByIdDepartment(Department id);
}
