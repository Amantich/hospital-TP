package com.example.hopital;

import com.example.hopital.entities.Patient;
import com.example.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "John", new Date(), true, 125));
        patientRepository.save(new Patient(null, "Alice", new Date(), false, 130));
        patientRepository.save(new Patient(null, "Emma", new Date(), true, 140));
        patientRepository.save(new Patient(null, "Michael", new Date(), false, 150));
        patientRepository.save(new Patient(null, "Sophia", new Date(), true, 135));
        patientRepository.save(new Patient(null, "William", new Date(), false, 128));
        patientRepository.save(new Patient(null, "Olivia", new Date(), true, 145));
        patientRepository.save(new Patient(null, "James", new Date(), false, 160));
        patientRepository.save(new Patient(null, "Ava", new Date(), true, 122));
        patientRepository.save(new Patient(null, "Liam", new Date(), false, 137));
        patientRepository.save(new Patient(null, "Ethan", new Date(), true, 132));
        patientRepository.save(new Patient(null, "Isabella", new Date(), false, 127));
        patientRepository.save(new Patient(null, "Mia", new Date(), true, 138));
        patientRepository.save(new Patient(null, "Alexander", new Date(), false, 142));
        patientRepository.save(new Patient(null, "Charlotte", new Date(), true, 129));
        patientRepository.save(new Patient(null, "Benjamin", new Date(), false, 313));
        patientRepository.save(new Patient(null, "Amelia", new Date(), true, 136));
        patientRepository.save(new Patient(null, "Lucas", new Date(), false, 141));
        patientRepository.save(new Patient(null, "Harper", new Date(), true, 131));
        patientRepository.save(new Patient(null, "Evelyn", new Date(), false, 126));
        patientRepository.save(new Patient(null, "John", new Date(), true, 125));
        patientRepository.save(new Patient(null, "Alice", new Date(), false, 130));
        patientRepository.save(new Patient(null, "Emma", new Date(), true, 140));
        patientRepository.save(new Patient(null, "Michael", new Date(), false, 150));
        patientRepository.save(new Patient(null, "Sophia", new Date(), true, 135));
        patientRepository.save(new Patient(null, "William", new Date(), false, 128));
        patientRepository.save(new Patient(null, "Olivia", new Date(), true, 145));
        patientRepository.save(new Patient(null, "James", new Date(), false, 160));
        patientRepository.save(new Patient(null, "Ava", new Date(), true, 122));
        patientRepository.save(new Patient(null, "Liam", new Date(), false, 137));
        patientRepository.save(new Patient(null, "Ethan", new Date(), true, 132));
        patientRepository.save(new Patient(null, "Isabella", new Date(), false, 127));
        patientRepository.save(new Patient(null, "Mia", new Date(), true, 138));
        patientRepository.save(new Patient(null, "Alexander", new Date(), false, 142));
        patientRepository.save(new Patient(null, "Charlotte", new Date(), true, 129));
        patientRepository.save(new Patient(null, "Benjamin", new Date(), false, 313));
        patientRepository.save(new Patient(null, "Amelia", new Date(), true, 136));
        patientRepository.save(new Patient(null, "Lucas", new Date(), false, 141));
        patientRepository.save(new Patient(null, "Harper", new Date(), true, 131));
        patientRepository.save(new Patient(null, "Evelyn", new Date(), false, 126));
        patientRepository.save(new Patient(null, "John", new Date(), true, 125));
        patientRepository.save(new Patient(null, "Alice", new Date(), false, 130));
        patientRepository.save(new Patient(null, "Emma", new Date(), true, 140));
        patientRepository.save(new Patient(null, "Michael", new Date(), false, 150));
        patientRepository.save(new Patient(null, "Sophia", new Date(), true, 135));
        patientRepository.save(new Patient(null, "William", new Date(), false, 128));
        patientRepository.save(new Patient(null, "Olivia", new Date(), true, 145));
        patientRepository.save(new Patient(null, "James", new Date(), false, 160));
        patientRepository.save(new Patient(null, "Ava", new Date(), true, 122));
        patientRepository.save(new Patient(null, "Liam", new Date(), false, 137));
        patientRepository.save(new Patient(null, "Ethan", new Date(), true, 132));
        patientRepository.save(new Patient(null, "Isabella", new Date(), false, 127));
        patientRepository.save(new Patient(null, "Mia", new Date(), true, 138));
        patientRepository.save(new Patient(null, "Alexander", new Date(), false, 142));
        patientRepository.save(new Patient(null, "Charlotte", new Date(), true, 129));
        patientRepository.save(new Patient(null, "Benjamin", new Date(), false, 313));
        patientRepository.save(new Patient(null, "Amelia", new Date(), true, 136));
        patientRepository.save(new Patient(null, "Lucas", new Date(), false, 141));
        patientRepository.save(new Patient(null, "Harper", new Date(), true, 131));
        patientRepository.save(new Patient(null, "Evelyn", new Date(), false, 126));


    }
}
