package com.johny.hrworker.repository;

import com.johny.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker , Long>{
}
