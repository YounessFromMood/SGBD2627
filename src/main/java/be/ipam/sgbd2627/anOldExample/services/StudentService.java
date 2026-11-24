package be.ipam.sgbd2627.anOldExample.services;

import be.ipam.sgbd2627.anOldExample.DTO.StudentExampleDto;
import be.ipam.sgbd2627.anOldExample.mappers.StudentMapper;
import be.ipam.sgbd2627.anOldExample.mappers.Student;
import be.ipam.sgbd2627.anOldExample.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@Service
//Classe service qui réalise toute la logique business
public class StudentService {
    //Attribut de la classe
    //Spring crée automatiquement le studentRepository et l'instancier
    //On appelle ça l'IOC -> Inversion Of Control
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    //constructeur de la classe
    StudentService(StudentRepository studentRepository, StudentMapper studentMapper){
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public Student addStudent(String name) {
        Student student = new Student();
        student.setName(name);

        return studentRepository.save(student);
    }

    public StudentExampleDto addStudent(StudentExampleDto studentExampleDto) {

        return studentMapper.toDto(studentRepository.save(studentMapper.toEntity(studentExampleDto)));
    }

    public StudentExampleDto getStudent (UUID id){
        /*Ne fonctionnera pas car Java et Spring ont mis une sécurité aux nulls
         * -> return this.studentRepository.findById(id);
         */

        //Donc on est obligé de passer par les Optionals que les interfaces repositories implémentent par héritage
        Optional<Student> optionalStudent = this.studentRepository.findById(id);

        if (optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            return studentMapper.toDto(student);
        } else {
            return null;
        }
    }
}
