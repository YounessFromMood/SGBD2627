package be.ipam.sgbd2627.anOldExample.controllers;

import be.ipam.sgbd2627.anOldExample.models.Lesson;
import be.ipam.sgbd2627.anOldExample.services.LessonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/")
class LessonController {
    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping("/lesson/{id}")
    public Lesson getLesson(@PathVariable UUID id) {
        return lessonService.getLesson(id);
    }
}
