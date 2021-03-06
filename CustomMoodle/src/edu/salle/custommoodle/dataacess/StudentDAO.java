/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess;

import edu.salle.custommoodle.model.Student;
import edu.salle.custommoodle.model.Subject;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public interface StudentDAO {
    public void addSubject(String idS, int id);
    
    public Student save(Student student);
    
    public List<Student> findAll();
    
    public Student find(String id);
    
    public List<Student> findByLastName(String lastName);
    
    public void delete(Student student);
    
    public void update(Student student);
    
    public void load();
    
    public void commitChanges();
    
    public List<Student> searchStudentsSubject(int id);
    
    public List<Subject> getStudentSubjects(String id);
    
    public void subjectRemove(String idS, int id);
}
