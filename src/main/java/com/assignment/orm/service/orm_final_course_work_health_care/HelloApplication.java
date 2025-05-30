package com.assignment.orm.service.orm_final_course_work_health_care;


import com.assignment.orm.service.orm_final_course_work_health_care.Cunfig.FactoryConfiguration;
import com.assignment.orm.service.orm_final_course_work_health_care.Entity.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class HelloApplication extends Application {

//        private final BCryptPasswordEncoder passwordEncoder;
//
//    public HelloApplication(BCryptPasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    public void save(){
//        String hashedPassword = passwordEncoder.encode("1234");
//
//        User user = new User();
//        user.setId("U001");
//        user.setName("sandaru");
//        user.setPassword(hashedPassword);
//        user.setRole("Admin");
//        user.setEmail("sandaru@gmail.com");
//
//        Session session = FactoryConfiguration.getInstance().getSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.save(user);
//        transaction.commit();
//
//        session.close();
//
//    }
    public static void main(String[] args) {
        FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();
        Session session = factoryConfiguration.getSession();
        session.close();
        launch(args);

//        HelloApplication helloApplication = new HelloApplication(new BCryptPasswordEncoder());
//        helloApplication.save();

    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/View/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),750, 600);
        stage.setTitle("Login Page!");
        stage.setScene(scene);
        stage.show();
    }
}

