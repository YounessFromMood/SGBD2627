package be.ipam.sgbd2627.anOldExample.services;

import be.ipam.sgbd2627.anOldExample.models.Lesson;
import be.ipam.sgbd2627.anOldExample.repositories.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class LessonService {
    private final LessonRepository lessonRepository;

    LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public Lesson addLesson(String subjectName) {
        Lesson lesson = new Lesson();
        lesson.setSubjectName(subjectName);

        return lessonRepository.save(lesson);
    }

    public Lesson getLesson (UUID id){
        Optional<Lesson> optionalLesson = this.lessonRepository.findById(id);

        return optionalLesson.orElse(null);
    }
}
