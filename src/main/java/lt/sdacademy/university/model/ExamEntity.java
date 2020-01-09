package lt.sdacademy.university.model;

import javax.persistence.CascadeType;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Builder;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

import lombok.ToString;

@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@Builder

@ToString

@Entity

@Table(name = "exam")

public class ExamEntity extends AbstractEntity{

    @Column(name="grade")

    private Byte grade;

    @ManyToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "exam_type_id")

    private ExamTypeEntity examType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private StudentEntity student;

}
