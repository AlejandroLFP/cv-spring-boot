package com.devtalles.tu_cv_spring_boot.tuCV.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devtalles.tu_cv_spring_boot.tuCV.model.CvData;
import com.devtalles.tu_cv_spring_boot.tuCV.model.Education;
import com.devtalles.tu_cv_spring_boot.tuCV.model.Experience;
import com.devtalles.tu_cv_spring_boot.tuCV.model.PersonalDetails;
import com.devtalles.tu_cv_spring_boot.tuCV.model.Skill;

@Service
public class CvInitializationServiceImpl implements CvInitializationService {

	@Override
	public CvData initializeCvData() {
		CvData cvData = new CvData();
		
		PersonalDetails personal = new PersonalDetails();
		personal.setFirstName("Alejandro");
		personal.setLastName("Lozano FdezPetregal");
		personal.setEmail("alejandro@gmail.com");
		personal.setProfessionalProfile("Desarrollador BackEnd");
		cvData.setPersonalDetails(personal);
		
		Education education1 = new Education();
		education1.setInstitution("I.E.S. Virgen de la Paloma");
		education1.setDegree("Desarrollo de Aplicaciones Multiplataforma");
		education1.setPeriod("September 2018 - June 2022");
		education1.setDescription("Grado superior sobre el desarrollo de app usando el lenguaje de Java");
		cvData.setEducations(Collections.singletonList(education1));
		
		Experience experience1 = new Experience();
		experience1.setJobTitle("Encargado Departamento de Desarrollo");
		experience1.setCompany("DevTalles Corp");
		experience1.setPeriod("2016 - Present");
		experience1.setDescription("Details of responsibilities and achievements");
		cvData.setExperiences(List.of(experience1));
		
		Skill skill1 = new Skill();
		skill1.setName("Java");
		skill1.setLevel("Advance");
		Skill skill2 = new Skill();
		skill2.setName("Spring Framework");
		skill2.setLevel("Intermediate");
		cvData.setSkills(Arrays.asList(skill1, skill2));
		
		return cvData;
	}

}
