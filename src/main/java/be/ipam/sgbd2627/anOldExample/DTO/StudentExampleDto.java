package be.ipam.sgbd2627.anOldExample.DTO;

import be.ipam.sgbd2627.anOldExample.models.Student;
import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link Student}
 */
@Value
public class StudentExampleDto implements Serializable {
    UUID id;
    String name;
}