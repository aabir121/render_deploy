package com.aabir.aabir;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<Employee, String>, JpaSpecificationExecutor<Employee> {
}
