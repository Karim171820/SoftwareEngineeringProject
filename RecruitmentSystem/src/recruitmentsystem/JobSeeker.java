/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.util.ArrayList;

/**
 *
 * @author Kemiaa
 */
public class JobSeeker extends User implements JobSeekerJobObserver {
    private String name;
    private int age;
    private String email;
    private String education;
    private ArrayList<JobSeeker> experince;

    public JobSeeker(String name, int age, String education, ArrayList<JobSeeker> experince) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.experince = experince;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setExperince(ArrayList<JobSeeker> experince) {
        this.experince = experince;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getEducation() {
        return education;
    }

    public ArrayList<JobSeeker> getExperince() {
        return experince;
    }

}
