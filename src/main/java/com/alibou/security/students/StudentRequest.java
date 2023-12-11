
package main.java.com.alibou.security.students;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
     
    
    private Integer id;
    private String firstName;
    private String lastName;


}
