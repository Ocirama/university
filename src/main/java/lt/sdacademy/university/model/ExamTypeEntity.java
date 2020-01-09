package lt.sdacademy.university.model;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;

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

@Table(name = "exam_type")

public class ExamTypeEntity extends AbstractEntity {

    @Column(name = "title", length = 250, nullable = false)

    private String title;

    @OneToMany(mappedBy = "examType", cascade = CascadeType.ALL)

    private List<ExamEntity> exams;

    @ManyToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "module_id")

    private ModuleEntity module;

}
