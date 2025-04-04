package com.assignment.orm.service.orm_final_course_work_health_care.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class AdminDashBoardController {

//    public AnchorPane ancMain;
    public AnchorPane AncMain;
    @FXML
    private Button PatientManagement;

    @FXML
    private Button PaymentInvoiceManagement;

    @FXML
    private Button ReportingAnalytics;

    @FXML
    private Button TherapySessionScheduling;

    @FXML
    private Label adminNameLabel;

    @FXML
    private Label dateLabel;

    @FXML
    private Button logout;

    @FXML
    private LineChart<?, ?> sessionTrendChart;

    @FXML
    private Button therapyManagement;

    @FXML
    private Label todaySessionsLabel;

    @FXML
    private Label totalPatientsLabel;

    @FXML
    private Label totalProgramsLabel;

    @FXML
    private Label totalSessionsLabel;

    @FXML
    private Label totalTherapistsLabel;

    @FXML
    private Label totalUsersLabel;

    @FXML
    private PieChart userDistributionChart;

    @FXML
    private Button userMnagement;

    @FXML
    private HBox ancHBox;


    @FXML
    void handleLogOut(ActionEvent event) {

    }

    @FXML
    void handlePatientManagement(ActionEvent event) throws IOException {
        AncMain.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/VIew/PatientManage.fxml"));
        AncMain.getChildren().add(parent);
    }

    @FXML
    void handlePaymentInvoiceManagement(ActionEvent event) {

    }

    @FXML
    void handleReportingAnalytics(ActionEvent event) {

    }

    @FXML
    void handleTherapistManagement(ActionEvent event) throws IOException {
        AncMain.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/VIew/TherapistManage.fxml"));
        AncMain.getChildren().add(parent);
    }

    @FXML
    void handleTherapySessionScheduling(ActionEvent event) {

    }

    @FXML
    void handleUserManagement(ActionEvent event) throws IOException {
        AncMain.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/VIew/User.fxml"));
        AncMain.getChildren().add(parent);

    }

    public void btnprogram(ActionEvent actionEvent) throws IOException {
        AncMain.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("/VIew/TherapyProgram.fxml"));
        AncMain.getChildren().add(parent);


    }
}
