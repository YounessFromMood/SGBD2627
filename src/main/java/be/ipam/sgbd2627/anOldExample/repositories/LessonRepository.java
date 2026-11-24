package be.ipam.sgbd2627.anOldExample.repositories;

import be.ipam.sgbd2627.anOldExample.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LessonRepository extends JpaRepository<Lesson, UUID> {
}