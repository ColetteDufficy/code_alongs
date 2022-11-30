package com.example.codeclan.course_service.components;

import com.example.codeclan.course_service.models.Booking;
import com.example.codeclan.course_service.models.Course;
import com.example.codeclan.course_service.models.Customer;
import com.example.codeclan.course_service.repositories.BookingRepository;
import com.example.codeclan.course_service.repositories.CourseRepository;
import com.example.codeclan.course_service.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Profile("!test") //Run every time EXCEPT Tests
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) throws ParseException {

        Course course1 = new Course("Intro To Python", "Glasgow",5);
        courseRepository.save(course1);

        Course course2 = new Course("JavaScript for beginners", "Edinburgh",4);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Bob", "Modena", 30);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Jeff", "Novato", 41);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Jackie", "San Francisco", 40);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Eric", "Novato", 55);
        customerRepository.save(customer4);

        String date_string = "24-12-2018";
        //Instantiating the SimpleDateFormat class
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        //Parsing the given String to Date object
        Date date = formatter.parse(date_string);

        // Bob booked Python on xmas eve
        Booking booking1 = new Booking(date, customer1, course1);
        bookingRepository.save(booking1);

        // jeff booked Javascript on xmas eve
        Booking booking2 = new Booking(date, customer2, course2);
        bookingRepository.save(booking2);

        String date_string2 = "17-11-2019";
        Date date2 = formatter.parse(date_string2);

        // Jackie booked javascript on 17th November
        Booking booking3 = new Booking(date2, customer3, course2);
        bookingRepository.save(booking3);

        //Eric booked javascript on xmas eve
        Booking booking4  = new Booking(date, customer4, course2);
        bookingRepository.save(booking4);

    }
}