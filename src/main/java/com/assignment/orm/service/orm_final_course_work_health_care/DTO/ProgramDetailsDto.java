package com.assignment.orm.service.orm_final_course_work_health_care.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProgramDetailsDto {
    private String patient;
    private String therapyProgram;
    private String therapyProgramName;
}
