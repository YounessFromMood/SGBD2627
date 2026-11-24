package be.ipam.sgbd2627.anOldExample.mappers;

import be.ipam.sgbd2627.anOldExample.DTO.StudentExampleDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentMapper {
    Student toEntity(StudentExampleDto studentExampleDto);

    StudentExampleDto toDto(Student student);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Student partialUpdate(StudentExampleDto studentExampleDto, @MappingTarget Student student);
}