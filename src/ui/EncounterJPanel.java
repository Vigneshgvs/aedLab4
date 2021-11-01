/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author vigneshguna
 */
public class EncounterJPanel extends javax.swing.JPanel {
    PatientDirectory patientDirectory;

    EncounterJPanel(PatientDirectory patientDirectory) {
        initComponents();
         this.patientDirectory = patientDirectory;
         
        String[] patientIdArray = new String[patientDirectory.getPatientIdSet().size()];
        patientDirectory.getPatientIdSet().toArray(patientIdArray);
        
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(patientIdArray);
        comboPatients.setModel(model );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblValueName = new javax.swing.JLabel();
        lblValueAge = new javax.swing.JLabel();
        lblValueStreet = new javax.swing.JLabel();
        lblValueCity = new javax.swing.JLabel();
        lblValueCommunity = new javax.swing.JLabel();
        lblValueNumber = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtBreathing = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        txtDiastolic = new javax.swing.JTextField();
        txtSystolic = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        comboPatients = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnClosePatient = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel2.setText("Patient :");

        jLabel4.setText("Name :");

        jLabel5.setText("Age :");

        jLabel6.setText("Home Street :");

        jLabel7.setText("City :");

        jLabel8.setText("Community :");

        jLabel9.setText("Contact Number :");

        jLabel10.setText("Previous Vital Signs Values :");

        jLabel11.setText("Today's Vital Signs Values :");

        jLabel12.setText("Breathing :");

        jLabel13.setText("Pulse :");

        jLabel14.setText("Temperature :");

        jLabel15.setText("Blood Pressure :");

        jLabel16.setText("breaths per minute");

        jLabel19.setText("beats per minute");

        jLabel20.setText("°F");

        jLabel23.setText("mm Hg");

        jLabel24.setText("/");

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Visit Date", "Doctor", "Breathing (breaths per minute)", "Pulse (beats per minute)", "Temperature (°F)", "Blood Pressure (mm Hg)", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalSigns);
        if (tblVitalSigns.getColumnModel().getColumnCount() > 0) {
            tblVitalSigns.getColumnModel().getColumn(0).setPreferredWidth(3);
            tblVitalSigns.getColumnModel().getColumn(1).setPreferredWidth(5);
        }

        btnAdd.setText("Add Today's Values");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        comboPatients.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPatientsActionPerformed(evt);
            }
        });

        jLabel3.setText("Remarks :");

        jLabel17.setText("Doctor :");

        btnClear.setText("Clear Today's Fields");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClosePatient.setText("Close Patient");
        btnClosePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosePatientActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 153, 0));
        lblTitle.setText("Encounter");

        jLabel18.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 0));
        jLabel18.setText("ABC Hospitals");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValueCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValueStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValueName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblValueNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValueCity, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValueAge, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(355, 355, 355))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBreathing, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel19)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel20))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addComponent(jLabel14))))
                                    .addComponent(jLabel13)))
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSystolic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)))
                .addGap(11, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnClosePatient))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblValueName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblValueAge, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblValueStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(lblValueCity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValueCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9))
                    .addComponent(lblValueNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtBreathing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSystolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear)
                    .addComponent(btnClosePatient))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPatientsActionPerformed
        
        int id =  ("--Select--".equals(String.valueOf(comboPatients.getSelectedItem())))? (int)0 :  Integer.parseInt(comboPatients.getSelectedItem().toString());
        if (id!=0) {
            Patient patient = getPatient(id);
            if (null!=patient) {
                displayPatient(patient);
                displayVitalTable(patient);
                
            } else {
                comboPatients.setSelectedItem("--Select--");
                JOptionPane.showMessageDialog(this, "Chosen Patient record is not found! Select another");
                
            }
        }
        
    }//GEN-LAST:event_comboPatientsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        int id =  ("--Select--".equals(String.valueOf(comboPatients.getSelectedItem())))? (int)0 : Integer.parseInt(comboPatients.getSelectedItem().toString());
        if (id!=0) {
            String message = validateFields();
            if (!"pass".equals(message)) {
                JOptionPane.showMessageDialog(this, message);
                return;
            }
                
                Encounter e = new Encounter();
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                Date today = new Date();
                e.setDate(sdf.format(today));
                e.setDoctor(txtDoctor.getText());
                
                VitalSigns vs = new VitalSigns();
                vs.setBreathing(Integer.parseInt(txtBreathing.getText()));
                vs.setPulse(Integer.parseInt(txtPulse.getText()));
                vs.setTemperature(Float.parseFloat(txtTemperature.getText()));
                vs.setSystolic(Integer.parseInt(txtSystolic.getText()));
                vs.setDiastolic(Integer.parseInt(txtDiastolic.getText()));
                vs.setBloodPressure(vs.getSystolic()+"/"+vs.getDiastolic());
                vs.setRemarks(txtRemarks.getText());
                
                //Add vitals to patient
                
                Patient patient = getPatient(id);
                Map<Encounter, VitalSigns> visit = patient.getVisit();
                boolean isDuplicate=false;
                for (Map.Entry<Encounter, VitalSigns> v : visit.entrySet()) {
                    if (v.getKey().getDate().equals(sdf.format(today))) {
                        isDuplicate = true;
                        
                        int dialogResult = JOptionPane.showConfirmDialog(null, "Today's values were already available! Would you like to update to new values?");
                        if (dialogResult == JOptionPane.YES_OPTION) {
                            // so its updating on re-entry on a day
                            v.getKey().setDoctor(txtDoctor.getText());
                            v.setValue(vs);

                            displayVitalTable(patient);
                            clearUpdateLabelValues();
                            JOptionPane.showMessageDialog(this, "Your visit with vital signs are updated! Thank You");
                            break;
                        } else {
                            clearUpdateLabelValues();
                        }
                    }
                }
                if (!isDuplicate) { //inserting for 1st time on a day
                    visit.put(e, vs);
                    
                    displayVitalTable(patient);
                    clearUpdateLabelValues();
                    JOptionPane.showMessageDialog(this, "Your visit with vital signs are added! Thank You");
                } 
            
        } else {
            clearUpdateLabelValues();
            JOptionPane.showMessageDialog(this, "Select a Patient first, to update!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearUpdateLabelValues();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClosePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosePatientActionPerformed
        clearPatientRecord();
        clearUpdateLabelValues();
    }//GEN-LAST:event_btnClosePatientActionPerformed
    private String validateFields() {
        if(txtDoctor.getText() == null || !txtDoctor.getText().matches("[\\w\\s]+")) {
            return "Breathing Value is mandatory and can contain only numbers";
        } else if(txtBreathing.getText() == null || !txtBreathing.getText().matches("^[0-9]+")) {
            return "Breathing Value is mandatory and can contain only numbers";
        } else if (txtPulse.getText() == null || !txtPulse.getText().matches("^[0-9]+")) {
            return "Pulse Value is mandatory and can contain only numbers";
        } else if (txtTemperature.getText() == null || !txtTemperature.getText().matches("[0-9]+([.][0-9]+)?")) {
            return "Temperature Value is mandatory and can contain only numbers";
        } else if (txtSystolic.getText() == null || !txtSystolic.getText().matches("^[0-9]+")) {
            return "Systolic/Upper in BP Value is mandatory and can contain only numbers";
        } else if (txtDiastolic.getText() == null || !txtDiastolic.getText().matches("^[0-9]+")) {
            return "Diastloic/Lower in BP Value is mandatory and can contain only numbers";
        }  else if (txtRemarks.getText() == null || !txtRemarks.getText().matches("[\\w\\s]+")) {
            return "Remarks Value is mandatory and can contain text and/or numbers";
        }
        return "pass";
    }
    private void clearPatientRecord() {
        comboPatients.setSelectedItem("--Select--");
        
        lblValueName.setText("");
        lblValueAge.setText("");
        lblValueNumber.setText("");
        lblValueCity.setText("");
        lblValueStreet.setText("");
        lblValueCommunity.setText("");
        
        // clear table
        DefaultTableModel model = (DefaultTableModel) tblVitalSigns.getModel();
        model.setRowCount(0);
    }
    private void clearUpdateLabelValues(){
        txtDoctor.setText("");
        txtBreathing.setText("");
        txtPulse.setText("");
        txtTemperature.setText("");
        txtDiastolic.setText("");
        txtSystolic.setText("");
        txtRemarks.setText("");
    }
    private Patient getPatient (int id) {
        for (Patient p : patientDirectory.getPatientsFullList()) {
            if (p.getPatientId()==id) {
                return p;
            }
        }
        return null;
    }
    private void displayPatient(Patient patient) {
        Person person = patient.getPerson();
        lblValueName.setText(person.getName());
        lblValueAge.setText(String.valueOf(person.getAge()));
        lblValueNumber.setText(String.valueOf(person.getContactDirectory()));
        lblValueCity.setText(person.getCity());
        lblValueStreet.setText(person.getHomeAddress());
        lblValueCommunity.setText(person.getCommunity());
    }
    private void displayVitalTable (Patient patient) {
        DefaultTableModel model = (DefaultTableModel) tblVitalSigns.getModel();
        model.setRowCount(0);
        
        for (Map.Entry<Encounter, VitalSigns> entry : patient.getVisit().entrySet()) {
            Object[] column = new Object[7];
            Encounter encounter = entry.getKey();
            VitalSigns vitalSigns = entry.getValue();
            
            column[0] = encounter.getDate();
            column[1] = encounter.getDoctor();
            column[2] = vitalSigns.getBreathing();
            column[3] = vitalSigns.getPulse();
            column[4] = vitalSigns.getTemperature();
            column[5] = vitalSigns.getBloodPressure();
            column[6] = vitalSigns.getRemarks();
            
            model.addRow(column);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClosePatient;
    private javax.swing.JComboBox<String> comboPatients;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValueAge;
    private javax.swing.JLabel lblValueCity;
    private javax.swing.JLabel lblValueCommunity;
    private javax.swing.JLabel lblValueName;
    private javax.swing.JLabel lblValueNumber;
    private javax.swing.JLabel lblValueStreet;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtBreathing;
    private javax.swing.JTextField txtDiastolic;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtSystolic;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}