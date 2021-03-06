package learn.epam.mlhh.entity;

import javax.persistence.*;

/**
 * Database entity classes for candidates.
 * @author
 * @version 1.1.2
 */
@Entity
@Table(name = "Candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candidateId;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String gender;

    @Column
    private String region;

    @Column
    private Double salary;

    @Column
    private String developer;

    @Column
    private Integer experience;

    @Column
    private String keyword;

    public Candidate() {
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getKeyWord() {
        return keyword;
    }

    public void setKeyWord(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId=" + candidateId +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", region='" + region + '\'' +
                ", salary='" + salary + '\'' +
                ", developer='" + developer + '\'' +
                ", experience='" + experience + '\'' +
                ", keyword=" + keyword +
                '}';
    }
}
