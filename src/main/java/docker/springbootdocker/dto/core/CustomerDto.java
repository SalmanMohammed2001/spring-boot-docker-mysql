package docker.springbootdocker.dto.core;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Blob;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {
    private long id;
    private long publicId;
    private String name;
    private String address;
    private double salary;
    private boolean activeState;

    /*================*/
    private Blob fileName;
    private Blob resourceUrl;
    private Blob directory;
    private Blob hash;

    /*================*/
}
