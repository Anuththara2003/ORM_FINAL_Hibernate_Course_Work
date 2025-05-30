package com.assignment.orm.service.orm_final_course_work_health_care.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private String id;
    private String name;
    private String email;
    private String password;
    private String role;
}
