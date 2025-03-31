package com.assignment.orm.service.orm_final_course_work_health_care.DAO;
import com.assignment.orm.service.orm_final_course_work_health_care.DAO.Custom.Impl.UserImpl;


public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public enum DaoType {
        USER,

//        PATIENT,
//        THERAPIST,
//        THERAPY_PROGRAM,
//        THERAPY_SESSION_SCHEDULING,
//        PAYMENT,
//        PROGRAM_DETAILS
    }

    public <T extends SuperDao> T getDao(DaoType daoType) {
        switch (daoType) {
            case USER:
                return (T) new UserImpl();

            default:
                return null;
        }

    }
}

