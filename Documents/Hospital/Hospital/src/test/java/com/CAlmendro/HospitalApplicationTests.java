package com.CAlmendro;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.CAlmendro.Doctor.Doctor;
import com.CAlmendro.Doctor.Repos.DoctorRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class HospitalApplicationTests {

	@Autowired
	private DoctorRepository doctorRepo;
	
	@Test
	 public void TestCreateDoctor(){
		
		Doctor doctor = new Doctor();
		
		doctor.setNombre("Cristian");
		doctor.setApellido("Almendro");
		doctor.setDireccion("Almendro");
		doctor.setEstadoRegistro("H");
		doctor.setFotoPerfil("");
//		doctor.setFechaNacimiento(LocalDate.now());

		doctorRepo.save(doctor);
		 
	 }

}
