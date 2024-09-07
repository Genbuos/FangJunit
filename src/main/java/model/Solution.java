package model;

import jakarta.persistence.*;

@Entity
@Table(name = "solutions")
public class Solution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sol_id")
    private Long id;
    private String language;
    private String code;
    private  String explanation;

    public Solution() {

    }

    public Solution(Long id, String language, String code, String explanation) {
        this.id = id;
        this.language = language;
        this.code = code;
        this.explanation = explanation;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Solution{" +
                "id=" + id +
                ", language='" + language + '\'' +
                ", code='" + code + '\'' +
                ", explanation='" + explanation + '\'' +
                '}';
    }
}


