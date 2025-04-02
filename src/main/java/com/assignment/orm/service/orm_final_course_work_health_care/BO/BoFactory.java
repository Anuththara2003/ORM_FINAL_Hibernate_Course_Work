package com.assignment.orm.service.orm_final_course_work_health_care.BO;

import com.assignment.orm.service.orm_final_course_work_health_care.BO.Custom.Impl.EncyptAndBycriptImpl;
import com.assignment.orm.service.orm_final_course_work_health_care.BO.Custom.Impl.TherapistBoImpl;
import com.assignment.orm.service.orm_final_course_work_health_care.BO.Custom.Impl.TherapyProgramBoImpl;
import com.assignment.orm.service.orm_final_course_work_health_care.BO.Custom.Impl.UserBoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BoFactory {

    private static BoFactory boFactory;

    private BoFactory() {
    }

    public static BoFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BoFactory();
        }
        return boFactory;
    }

    public enum BoType {
        USER,
        ENCRYPT,

//        PATIENT,
       THERAPIST,
       THERAPY_PROGRAM,
//        THERAPY_SESSION_SCHEDULING,
//        PAYMENT,
//        PROGRAM_DETAILS
    }

    public <T extends SuperBo> T getBo(BoType boType) {
        switch (boType) {
            case USER:
                return (T) new UserBoImpl();
            case ENCRYPT:
                return (T) new EncyptAndBycriptImpl(new BCryptPasswordEncoder());
            case THERAPY_PROGRAM:
                return (T) new TherapyProgramBoImpl();
            case THERAPIST:
                return (T) new TherapistBoImpl();
            default:
                return null;
        }

    }
}

