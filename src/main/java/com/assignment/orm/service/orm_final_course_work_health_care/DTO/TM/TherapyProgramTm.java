package com.assignment.orm.service.orm_final_course_work_health_care.DTO.TM;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TherapyProgramTm {
    private String T_id;
    private String name;
    private String description;
    private String duration;
    private double fee;

}
