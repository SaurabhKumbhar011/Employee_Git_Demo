package com.example.demo.model;

//SpringBoootJpaHibernateEmployeeManagement

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cts_emp_info") // If we don't specify it will take class name as table name with lowercase -->
//@Getter								// employee
//@Setter
//@ToString
//@EqualsAndHashCode
@Data				//--> @Data annotation is equal to ==> @Getter @Setter @ToString @EqualsAndHashCode @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	@Id
	@Column(name = "emp_no")
	// @GeneratedValue
	@Min(value = 1, message = "Emp id cannot be -ve")
	private int empId;

	@NotBlank(message = "Employee name cannot be empty/blank/null")
	@Column(name = "ename", nullable = false, length = 10)
	private String empName;

	@Min(value = 1, message = "Emp salary cannot be below 1000")
	@Max(value = 1000000, message = "Emp salary cannot be above 1000000")
	private int empSal;

	@NotEmpty( message = "")
	private String empDesg;

}
