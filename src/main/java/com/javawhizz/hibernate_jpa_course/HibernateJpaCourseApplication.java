package com.javawhizz.hibernate_jpa_course;

import com.javawhizz.hibernate_jpa_course.entity.Course;
import com.javawhizz.hibernate_jpa_course.entity.FullTimeEmployee;
import com.javawhizz.hibernate_jpa_course.entity.PartTimeEmployee;
import com.javawhizz.hibernate_jpa_course.entity.Student;
import com.javawhizz.hibernate_jpa_course.repository.CourseRepository;
import com.javawhizz.hibernate_jpa_course.repository.EmployeeRepository;
import com.javawhizz.hibernate_jpa_course.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class HibernateJpaCourseApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaCourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		studentRepository.saveStudentWithPassport();
//		List<Review> reviews = new ArrayList<>();
//		reviews.add(new Review("5", "Great Hands-on Stuff"));
//		reviews.add(new Review("5", "Hatsoff"));
//		courseRepository.addReviewsForCourse(10003L, reviews);
//		studentRepository.insertHardCodedStudentAndCourse();
//		studentRepository.insertStudentAndCourse(
//				new Student("Jack"),
//				new Course("Microservices in 100 Steps")

//		employeeRepository.insert(
//				new PartTimeEmployee("Jill", new BigDecimal("50"))
//		);
//
//		employeeRepository.insert(
//				new FullTimeEmployee("Jack", new BigDecimal("1000")));
//
//		logger.info("Full Time Employees -> {}", employeeRepository.retrieveAllFullTimeEmployees());
//		logger.info("Part Time Employees -> {}", employeeRepository.retrieveAllPartTimeEmployees());

	}
}
