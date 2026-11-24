package be.ipam.sgbd2627.anOldExample.repositories;

import be.ipam.sgbd2627.anOldExample.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}