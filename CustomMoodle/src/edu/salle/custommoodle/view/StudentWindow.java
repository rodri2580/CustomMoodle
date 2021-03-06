package edu.salle.custommoodle.view;

import edu.salle.custommoodle.businesslogic.StudentBLO;
import edu.salle.custommoodle.model.Student;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import edu.salle.custommoodle.businesslogic.CURP;
import edu.salle.custommoodle.businesslogic.SubjectBLO;
import edu.salle.custommoodle.model.Subject;
import java.text.Normalizer;

/**
 *
 * @author Rodrigo
 */
public class StudentWindow extends javax.swing.JFrame {

    private StudentBLO studentBLO = new StudentBLO();    
    private SubjectBLO subjectBLO = new SubjectBLO();

    public StudentWindow() {
        initComponents();
        setLocationRelativeTo(null);
        studentBLO.load();
        subjectBLO.load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        bSave = new javax.swing.JButton();
        bSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtLastNameM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbState = new javax.swing.JComboBox<>();
        cmbGender = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnDeleteS = new javax.swing.JButton();
        btnSearchS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStSub = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setText("Last Name F");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        getContentPane().add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 110, -1));
        getContentPane().add(tfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, -1));

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        getContentPane().add(bSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });
        getContentPane().add(bSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel3.setText("CURP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        fID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fIDActionPerformed(evt);
            }
        });
        getContentPane().add(fID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 340, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Last Name", "State", "Gender", "Day", "Month", "Year", "CURP"
            }
        ));
        jScrollPane1.setViewportView(tblStudents);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 580, 380));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 650, -1, -1));

        jLabel4.setText("Last Name M");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        getContentPane().add(txtLastNameM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, -1));

        jLabel5.setText("State");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel6.setText("Day");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel7.setText("Month");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel8.setText("Year");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecciona estado --", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Ciudad de México", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas", "No Mexicano" }));
        getContentPane().add(cmbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 140, -1));

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H", "M" }));
        getContentPane().add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel10.setText("Registro de alumnos a materias");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        jLabel11.setText("Id");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        jLabel12.setText("Materia");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 320, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemticas", "Computacion", "Ingles" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 90, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        btnDeleteS.setText("Delete");
        btnDeleteS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteS, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 70, -1));

        btnSearchS.setText("Search");
        btnSearchS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchS, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 70, -1));

        tblStSub.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "Teacher"
            }
        ));
        jScrollPane2.setViewportView(tblStSub);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 370, 380));

        jButton2.setText("Search subjects");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String limpiarAcentos(String cadena) {
    String limpio =null;
    if (cadena !=null) {
        String valor = cadena;
        valor = valor.toUpperCase();
        // Normalizar texto para eliminar acentos, dieresis, cedillas y tildes
        limpio = Normalizer.normalize(valor, Normalizer.Form.NFD);
        // Quitar caracteres no ASCII excepto la enie, interrogacion que abre, exclamacion que abre, grados, U con dieresis.
        limpio = limpio.replaceAll("[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308)]", "");
        // Regresar a la forma compuesta, para poder comparar la enie con la tabla de valores
        limpio = Normalizer.normalize(limpio, Normalizer.Form.NFC);
    }
    return limpio;
    }
    
    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
      String name = tfName.getText();
      String LastName[] = tfLastName.getText().split(" ");
      String LastNameM[] = this.txtLastNameM.getText().split(" ");
      Student student = new Student();
      CURP cur = new CURP();
      student.setDay(this.jComboBox1.getSelectedItem().toString());
      student.setGender(this.cmbGender.getSelectedItem().toString());
      student.setLastName(LastName[LastName.length - 1] + " " + LastNameM[LastNameM.length - 1]);
      student.setMonth(this.jComboBox2.getSelectedItem().toString());
      student.setName(name);
      student.setState(this.cmbState.getSelectedItem().toString());
      student.setYear(this.jComboBox3.getSelectedItem().toString());
      cur.day = student.getDay();
      cur.gender = student.getGender().charAt(0);
      cur.homeState = student.getState();
      cur.lastNameF = limpiarAcentos(LastName[LastName.length - 1]);
      cur.lastNameM = limpiarAcentos(this.txtLastNameM.getText());
      cur.month = student.getMonth();
      cur.year = student.getYear().substring(2);
      cur.name = limpiarAcentos(student.getName());
      student.setId(cur.getCURP());
      student.setId(cur.getCURP());
      studentBLO.save(student);
      cur = null;
      student = null;
      tfName.setText("");
      tfLastName.setText("");
      this.txtLastNameM.setText("");
    }//GEN-LAST:event_bSaveActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        String lastName = tfLastName.getText().trim();
        if(!lastName.isEmpty()){                
            List<Student> studentList = studentBLO.findByLastName(lastName);
            if(!studentList.isEmpty()){
                refreshTable(studentList);
            }
        }
    }//GEN-LAST:event_bSearchActionPerformed

    private void clearTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblStudents.getModel();
        while(dtm.getRowCount() > 0) dtm.removeRow(0);
    }
    private void refreshTable(List<Student> studentList){
        clearTable();
        DefaultTableModel dtm = (DefaultTableModel)tblStudents.getModel();
        Object[] emptyRow = {""};
        
        for(int i = 0; i < studentList.size(); i++){
            dtm.addRow(emptyRow);
            dtm.setValueAt(studentList.get(i).getName(), i, 0);
            dtm.setValueAt(studentList.get(i).getLastName(), i, 1);
            dtm.setValueAt(studentList.get(i).getState(), i, 2);
            dtm.setValueAt(studentList.get(i).getGender(), i, 3);
            dtm.setValueAt(studentList.get(i).getDay(), i, 4);
            dtm.setValueAt(studentList.get(i).getMonth(), i, 5);
            dtm.setValueAt(studentList.get(i).getYear(), i, 6);
            dtm.setValueAt(studentList.get(i).getId(), i, 7);
        }
    }
    
    private void clearTableSub(){
        DefaultTableModel dtm = (DefaultTableModel)this.tblStSub.getModel();
        while(dtm.getRowCount() > 0) dtm.removeRow(0);
    }
    private void refreshTableSub(List<Student> studentList, int id){
        clearTableSub();
        clearTable();
        DefaultTableModel dtm = (DefaultTableModel)tblStudents.getModel();
        Object[] emptyRow = {""};
        DefaultTableModel dts = (DefaultTableModel)this.tblStSub.getModel();
        String sub = "";
        switch(id){
            case 0:
                sub = "Matematicas";
                break;
            case 1:
                sub = "Computacion";
                break;
            case 2:
                sub = "Ingles";
                break;
            default:
                break;
        }
        String teacher = "";
        for(int i = 0; i < subjectBLO.findAll().size(); i++) if(subjectBLO.findAll().get(i).getId() == id) teacher = subjectBLO.findAll().get(i).getTeacher();
        
        for(int i = 0; i < studentList.size(); i++){
            dtm.addRow(emptyRow);
            dts.addRow(emptyRow);
            dtm.setValueAt(studentList.get(i).getName(), i, 0);
            dtm.setValueAt(studentList.get(i).getLastName(), i, 1);
            dtm.setValueAt(studentList.get(i).getState(), i, 2);
            dtm.setValueAt(studentList.get(i).getGender(), i, 3);
            dtm.setValueAt(studentList.get(i).getDay(), i, 4);
            dtm.setValueAt(studentList.get(i).getMonth(), i, 5);
            dtm.setValueAt(studentList.get(i).getYear(), i, 6);
            dtm.setValueAt(studentList.get(i).getId(), i, 7);
            dts.setValueAt(sub, i, 0);
            dts.setValueAt(teacher, i, 1);
        }
    }
    private void refreshTableStu(List<Subject> subjectList){
        clearTableSub();
        clearTable();
        DefaultTableModel dtm = (DefaultTableModel)tblStudents.getModel();
        Object[] emptyRow = {""};
        DefaultTableModel dts = (DefaultTableModel)this.tblStSub.getModel();
        for(int i = 0; i < subjectList.size(); i++){
            dts.addRow(emptyRow);
            dts.setValueAt(subjectList.get(i).getName(), i, 0);
            dts.setValueAt(subjectList.get(i).getTeacher(), i, 1);
        }
    }
    
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refreshTable(studentBLO.findAll());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        studentBLO.commitChanges();
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void fIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fIDActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      String name = tfName.getText();
      String LastName[] = tfLastName.getText().split(" ");
      String LastNameM[] = this.txtLastNameM.getText().split(" ");
      Student student = new Student();
      CURP cur = new CURP();
      student.setDay(this.jComboBox1.getSelectedItem().toString());
      student.setGender(this.cmbGender.getSelectedItem().toString());
      student.setLastName(this.tfLastName + " " + this.txtLastNameM);
      student.setMonth(this.jComboBox2.getSelectedItem().toString());
      student.setName(name);
      student.setState(this.cmbState.getSelectedItem().toString());
      student.setYear(this.jComboBox3.getSelectedItem().toString());
      cur.day = student.getDay();
      cur.gender = student.getGender().charAt(0);
      cur.homeState = student.getState();
      cur.lastNameF = limpiarAcentos(LastName[LastName.length - 1]);
      cur.lastNameM = limpiarAcentos(LastNameM[LastNameM.length - 1]);
      cur.month = student.getMonth();
      cur.year = student.getYear().substring(2);
      cur.name = limpiarAcentos(student.getName());
      student.setId(cur.getCURP());
      studentBLO.update(student);
      cur = null;
      student = null;
//      tfName.setText("");
//      tfLastName.setText("");
//      this.txtLastNameM.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        studentBLO.addSubject(this.jTextField1.getText(), this.jComboBox4.getSelectedIndex());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSActionPerformed
        studentBLO.subjectRemove(this.jTextField1.getText(),this.jComboBox4.getSelectedIndex());
    }//GEN-LAST:event_btnDeleteSActionPerformed

    private void btnSearchSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSActionPerformed
        List<Student> studentListS = studentBLO.searchStudentsSubject(this.jComboBox4.getSelectedIndex());
        refreshTableSub(studentListS, this.jComboBox4.getSelectedIndex());
    }//GEN-LAST:event_btnSearchSActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        List<Subject> subs = studentBLO.getStudentSubjects(this.fID.getText());
        refreshTableStu(subs);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSave;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteS;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearchS;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JTextField fID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblStSub;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField txtLastNameM;
    // End of variables declaration//GEN-END:variables
}
