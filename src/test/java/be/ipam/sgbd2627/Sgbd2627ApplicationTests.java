package be.ipam.sgbd2627;

import be.ipam.sgbd2627.anOldExample.services.LessonService;
import be.ipam.sgbd2627.anOldExample.services.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sgbd2627ApplicationTests {
    @Autowired
    private StudentService studentService;
    @Autowired
    private LessonService lessonService;

    @Test
    void contextLoads() {
    }












//EXAMPLE
    @Test
    void createStudent(){
        studentService.addStudent("Bob");
    }
    @Test
    void createLesson() {
        lessonService.addLesson("Cours de Java");}
}
