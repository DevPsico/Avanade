package me.dio.avanade.model;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	private String agency;
	
	@Column(scale = 2, precision = 13)
	private BigDecimal balance;
	
	@Column(name = "additional_limit", scale = 2, precision = 13)
	private BigDecimal limit;
	
	

}
