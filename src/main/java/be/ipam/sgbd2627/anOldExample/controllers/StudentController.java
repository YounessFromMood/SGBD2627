package be.ipam.sgbd2627.anOldExample.controllers;

import be.ipam.sgbd2627.anOldExample.DTO.StudentExampleDto;
import be.ipam.sgbd2627.anOldExample.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RestController
//on précise quel est notre API
@RequestMapping("/")
class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    //on précise d'où vient la variable que l'on cherche dans notre API
    @GetMapping("/student/{id}")
    //Spring va automatiquement convertir l'objet en JSON WOAH
    //PathVariable dit cherche l'id dans l'url et réponds a cette même url en JSON automatiquement
    public StudentExampleDto getStudent(@PathVariable UUID id){
        return studentService.getStudent(id);
    }
}
