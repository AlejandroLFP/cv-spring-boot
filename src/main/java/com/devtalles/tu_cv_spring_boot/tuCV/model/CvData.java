package com.devtalles.tu_cv_spring_boot.tuCV.model;

import java.util.List;

import lombok.Data;

@Data
public class CvData {
	
	private PersonalDetails personalDetails;
	private List<Education> educations;
	private List<Experience> experiences;
	private List<Skill> skills;
	
}
