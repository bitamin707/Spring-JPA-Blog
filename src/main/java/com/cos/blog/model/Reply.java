package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Reply {

	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; //시퀀스
	
	@Column(nullable = false, length = 200)
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "boardId")
	private Board board; //FK
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user; //FK
	
	@CreationTimestamp
	private Timestamp createDate;
}
