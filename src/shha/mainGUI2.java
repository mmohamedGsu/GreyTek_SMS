
package shha;


import javax.swing.*;

/**
 *
 * @author Sheldon
 */
public class mainGUI2 extends javax.swing.JFrame {

    //Build Main GUI
    public mainGUI2() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        logoLabel = new javax.swing.JLabel();
        patientsButton = new javax.swing.JButton();
        apptButton = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();
        billButton = new javax.swing.JButton();
        empButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        containerPanel = new javax.swing.JPanel();
        patientsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        adminPanel = new javax.swing.JPanel();
        adminContainerPanel = new javax.swing.JPanel();
        defaultAdminPanel = new javax.swing.JPanel();
        addUserPanel = new javax.swing.JPanel();
        firstNameText = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        middleIntText = new javax.swing.JTextField();
        middleIntLabel = new javax.swing.JLabel();
        ssnLabel = new javax.swing.JLabel();
        ssnText = new javax.swing.JTextField();
        address1Text = new javax.swing.JTextField();
        address1Label = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        stateText = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        zipLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        genderLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        dobText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        address2Label = new javax.swing.JLabel();
        address2Text = new javax.swing.JTextField();
        countryText = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        empIDLabel = new javax.swing.JLabel();
        empIDText = new javax.swing.JTextField();
        positionComboBox = new javax.swing.JComboBox();
        positionLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        addNewUserButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        patientsButton.setText("Patients");
        patientsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsButtonActionPerformed(evt);
            }
        });

        apptButton.setText("Appointments");
        apptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        reportsButton.setText("Reports");
        reportsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        billButton.setText("Billing");
        billButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        empButton.setText("Employees");
        empButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        adminButton.setText("Admin");
        adminButton.setToolTipText("");
        adminButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        containerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        containerPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
        containerPanel.setMinimumSize(new java.awt.Dimension(1170, 613));
        containerPanel.setLayout(new java.awt.CardLayout());

        patientsPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
        patientsPanel.setMinimumSize(new java.awt.Dimension(1170, 613));
        patientsPanel.setPreferredSize(new java.awt.Dimension(1170, 613));

        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextPane1.setText("Sorry nothing here yet! Make your way over to the Admin Tab! \n\n-- GreyTek Inc.");
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout patientsPanelLayout = new javax.swing.GroupLayout(patientsPanel);
        patientsPanel.setLayout(patientsPanelLayout);
        patientsPanelLayout.setHorizontalGroup(
            patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsPanelLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );
        patientsPanelLayout.setVerticalGroup(
            patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientsPanelLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        containerPanel.add(patientsPanel, "card2");

        adminPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
        adminPanel.setMinimumSize(new java.awt.Dimension(1170, 613));
        adminPanel.setPreferredSize(new java.awt.Dimension(1170, 613));

        adminContainerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        adminContainerPanel.setMaximumSize(new java.awt.Dimension(995, 577));
        adminContainerPanel.setPreferredSize(new java.awt.Dimension(995, 577));
        adminContainerPanel.setLayout(new java.awt.CardLayout());

        defaultAdminPanel.setMaximumSize(new java.awt.Dimension(995, 577));
        defaultAdminPanel.setMinimumSize(new java.awt.Dimension(995, 577));

        javax.swing.GroupLayout defaultAdminPanelLayout = new javax.swing.GroupLayout(defaultAdminPanel);
        defaultAdminPanel.setLayout(defaultAdminPanelLayout);
        defaultAdminPanelLayout.setHorizontalGroup(
            defaultAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        defaultAdminPanelLayout.setVerticalGroup(
            defaultAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        adminContainerPanel.add(defaultAdminPanel, "card3");

        addUserPanel.setMaximumSize(new java.awt.Dimension(991, 573));
        addUserPanel.setMinimumSize(new java.awt.Dimension(991, 573));

        firstNameLabel.setLabelFor(firstNameText);
        firstNameLabel.setText(" First Name");

        lastNameLabel.setLabelFor(lastNameText);
        lastNameLabel.setText(" Last Name");

        middleIntLabel.setLabelFor(middleIntText);
        middleIntLabel.setText(" Middle Name");

        ssnLabel.setLabelFor(ssnText);
        ssnLabel.setText(" Social Security #");

        ssnText.setText("###-##-####");
        ssnText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ssnTextFocusGained(evt);
            }
        });
        ssnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssnTextMouseClicked(evt);
            }
        });

        address1Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                address1TextMouseClicked(evt);
            }
        });

        address1Label.setLabelFor(address1Text);
        address1Label.setText(" Address 1");

        cityText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityTextMouseClicked(evt);
            }
        });

        cityLabel.setLabelFor(cityText);
        cityLabel.setText(" City");

        stateText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stateTextMouseClicked(evt);
            }
        });

        stateLabel.setLabelFor(stateText);
        stateLabel.setText(" State");

        zipText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zipTextMouseClicked(evt);
            }
        });

        zipLabel.setLabelFor(stateText);
        zipLabel.setText(" Zip Code");

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        genderLabel.setText(" Sex");

        dobLabel.setLabelFor(dobText);
        dobLabel.setText(" Date of Birth");

        dobText.setText("MM-DD-YYYY");
        dobText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobTextFocusGained(evt);
            }
        });
        dobText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dobTextMouseClicked(evt);
            }
        });

        emailLabel.setLabelFor(emailText);
        emailLabel.setText(" Email");

        emailText.setText("john@doe.com");
        emailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFocusGained(evt);
            }
        });
        emailText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailTextMouseClicked(evt);
            }
        });

        address2Label.setLabelFor(address2Text);
        address2Label.setText(" Address 2");

        address2Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                address2TextMouseClicked(evt);
            }
        });

        countryText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countryTextMouseClicked(evt);
            }
        });

        countryLabel.setLabelFor(countryText);
        countryLabel.setText(" Country");

        phoneLabel.setLabelFor(emailText);
        phoneLabel.setText(" Phone");

        phoneText.setText("###-###-####");
        phoneText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTextFocusGained(evt);
            }
        });
        phoneText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneTextMouseClicked(evt);
            }
        });

        empIDLabel.setLabelFor(empIDText);
        empIDLabel.setText(" Employee ID");

        empIDText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empIDTextMouseClicked(evt);
            }
        });

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Doctor", "Nurse", "Receptionist", "IT", "Janitorial", "Maintenance", "Other" }));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });

        positionLabel.setLabelFor(positionComboBox);
        positionLabel.setText("Position");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addUserPanelLayout = new javax.swing.GroupLayout(addUserPanel);
        addUserPanel.setLayout(addUserPanelLayout);
        addUserPanelLayout.setHorizontalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dobLabel)
                                .addComponent(dobText, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addComponent(phoneLabel)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(address2Label)
                        .addComponent(address1Text)
                        .addComponent(address1Label)
                        .addComponent(address2Text)
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstNameLabel)
                                .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(middleIntText)
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addComponent(middleIntLabel)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(zipText, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cityText)
                                .addComponent(lastNameText, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(zipLabel)
                            .addComponent(emailLabel)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateLabel)
                            .addComponent(ssnLabel)
                            .addComponent(countryLabel)
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ssnText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(stateText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(countryText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addUserPanelLayout.createSequentialGroup()
                                    .addComponent(empIDLabel)
                                    .addGap(39, 39, 39))
                                .addComponent(empIDText, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLabel)
                            .addComponent(femaleRadioButton)
                            .addComponent(maleRadioButton)
                            .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addUserPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(positionLabel)))
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        addUserPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, saveButton});

        addUserPanelLayout.setVerticalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addUserPanelLayout.createSequentialGroup()
                                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(addUserPanelLayout.createSequentialGroup()
                                        .addComponent(ssnLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ssnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addComponent(middleIntLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(middleIntText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(addUserPanelLayout.createSequentialGroup()
                                                .addComponent(lastNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(addUserPanelLayout.createSequentialGroup()
                                                .addComponent(firstNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(addUserPanelLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(address1Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(address1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(stateLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                                .addComponent(cityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addUserPanelLayout.createSequentialGroup()
                                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addUserPanelLayout.createSequentialGroup()
                                        .addComponent(address2Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(address2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addUserPanelLayout.createSequentialGroup()
                                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(zipLabel)
                                            .addComponent(countryLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(zipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(countryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addUserPanelLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(dobLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dobText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                                                .addComponent(phoneLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                                                .addComponent(empIDLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(empIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(addUserPanelLayout.createSequentialGroup()
                                .addComponent(emailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maleRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(femaleRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(positionLabel)
                        .addGap(18, 18, 18)
                        .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        addUserPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelButton, saveButton});

        adminContainerPanel.add(addUserPanel, "card2");

        addNewUserButton.setText("Add User");
        addNewUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addNewUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(adminContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(addNewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(adminContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(133, 133, 133))
        );

        containerPanel.add(adminPanel, "card2");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(patientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(empButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(logoLabel)))
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        containerPanel.removeAll();
        containerPanel.repaint();
        containerPanel.revalidate();
       
        containerPanel.add(adminPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_adminButtonActionPerformed

    private void patientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsButtonActionPerformed
        containerPanel.removeAll();
        containerPanel.repaint();
        containerPanel.revalidate();

        containerPanel.add(patientsPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_patientsButtonActionPerformed

    private void addNewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewUserButtonActionPerformed
        adminContainerPanel.removeAll();
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();

        adminContainerPanel.add(addUserPanel);
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
    }//GEN-LAST:event_addNewUserButtonActionPerformed

    private void zipTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zipTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_zipTextMouseClicked

    private void stateTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stateTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_stateTextMouseClicked

    private void cityTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextMouseClicked

    private void address1TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address1TextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_address1TextMouseClicked

    private void ssnTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssnTextMouseClicked
        ssnText.setText("");
    }//GEN-LAST:event_ssnTextMouseClicked

    private void dobTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobTextMouseClicked
        dobText.setText("");
    }//GEN-LAST:event_dobTextMouseClicked

    private void emailTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextMouseClicked
        emailText.setText("");
    }//GEN-LAST:event_emailTextMouseClicked

    private void address2TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address2TextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_address2TextMouseClicked

    private void countryTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_countryTextMouseClicked

    private void phoneTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTextMouseClicked
        phoneText.setText("");
    }//GEN-LAST:event_phoneTextMouseClicked

    private void empIDTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empIDTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empIDTextMouseClicked

    private void ssnTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ssnTextFocusGained
        ssnText.selectAll();
    }//GEN-LAST:event_ssnTextFocusGained

    private void dobTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobTextFocusGained
        dobText.selectAll();
    }//GEN-LAST:event_dobTextFocusGained

    private void phoneTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFocusGained
        phoneText.selectAll();
    }//GEN-LAST:event_phoneTextFocusGained

    private void emailTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFocusGained
        emailText.selectAll();
    }//GEN-LAST:event_emailTextFocusGained

    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionComboBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        //Method Call to Clear Fields in the Add User Panel
        //Add DB Calls before this method
        clearAddUserPanel();
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        //Method Call to Clear Fields in the Add User Panel
        clearAddUserPanel();
    }//GEN-LAST:event_cancelButtonActionPerformed
     
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        //Run Main GUI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewUserButton;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JLabel address1Label;
    private javax.swing.JTextField address1Text;
    private javax.swing.JLabel address2Label;
    private javax.swing.JTextField address2Text;
    private javax.swing.JButton adminButton;
    private javax.swing.JPanel adminContainerPanel;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JButton apptButton;
    private javax.swing.JButton billButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityText;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryText;
    private javax.swing.JPanel defaultAdminPanel;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField dobText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton empButton;
    private javax.swing.JLabel empIDLabel;
    private javax.swing.JTextField empIDText;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel middleIntLabel;
    private javax.swing.JTextField middleIntText;
    private javax.swing.JButton patientsButton;
    private javax.swing.JPanel patientsPanel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JComboBox positionComboBox;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JButton reportsButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel ssnLabel;
    private javax.swing.JTextField ssnText;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateText;
    private javax.swing.JLabel zipLabel;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables

    //Method to clear Add User Panel
    private void clearAddUserPanel(){
        adminContainerPanel.removeAll();
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        adminContainerPanel.add(defaultAdminPanel);
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        firstNameText.setText("");
        middleIntText.setText("");
        lastNameText.setText("");
        ssnText.setText("###-##-####");
        genderButtonGroup.clearSelection();
        address1Text.setText("");
        address2Text.setText("");
        cityText.setText("");
        stateText.setText("");
        zipText.setText("");
        countryText.setText("");
        dobText.setText("MM-DD-YYYY");
        phoneText.setText("###-###-####");
        emailText.setText("john@doe.com");
        empIDText.setText("");
        positionComboBox.setSelectedIndex(0);
    }

}
