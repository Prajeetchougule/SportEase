package com.example.demo.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
public class Ground extends BaseEntity{
	
	@Column(name = "ground_desc",nullable = false,length = 10)
	private String groundDescription;
	
	@ManyToOne
	@JoinColumn(name = "sport_id")
	private Sports sports; 
	
	
	@Column(name="equipment_available",nullable = false)
	private Boolean isEquipmentAvailable;
	
	@OneToMany(mappedBy = "ground",cascade = CascadeType.ALL)
	private Set<TimeSlot> timeSlotList=new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name ="academy_id")
	private Academy academy;
	
	

	
}
