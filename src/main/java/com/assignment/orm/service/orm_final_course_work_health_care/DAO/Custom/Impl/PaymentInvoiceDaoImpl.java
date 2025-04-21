package com.assignment.orm.service.orm_final_course_work_health_care.DAO.Custom.Impl;

import com.assignment.orm.service.orm_final_course_work_health_care.DAO.Custom.PaymentInvoiceDao;
import com.assignment.orm.service.orm_final_course_work_health_care.Entity.Payment;

import java.sql.SQLException;
import java.util.ArrayList;

public class PaymentInvoiceDaoImpl implements PaymentInvoiceDao {
    @Override
    public String getNextId() throws SQLException {
        return "";
    }

    @Override
    public ArrayList<Payment> getAll() throws SQLException {
        return null;
    }

    @Override
    public boolean save(Payment payment) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String Id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Payment payment) throws SQLException {
        return false;
    }
}
