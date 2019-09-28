package siege_random_operator;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import static siege_random_operator.Randomizer.AttackersOwned;
import static siege_random_operator.Randomizer.DefendersOwned;

public class Attackers_Owned_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu2
     */
    public Attackers_Owned_Menu() {
        initComponents();
        setLocationRelativeTo(null);
        Recruit.setSelected (Randomizer.AttackersOwned[0] );
        Ash.setSelected (Randomizer.AttackersOwned[1] );
        Blackbeard.setSelected (Randomizer.AttackersOwned[2] );
        Blitz.setSelected (Randomizer.AttackersOwned[3] );
        Buck.setSelected (Randomizer.AttackersOwned[4] );
        Capitão.setSelected (Randomizer.AttackersOwned[5] );
        Dokkaebi.setSelected (Randomizer.AttackersOwned[6] );
        Fuze.setSelected (Randomizer.AttackersOwned[7] );
        Glaz.setSelected (Randomizer.AttackersOwned[8] );
        Hibana.setSelected (Randomizer.AttackersOwned[9] );
        IQ.setSelected (Randomizer.AttackersOwned[10] );
        Jackal.setSelected (Randomizer.AttackersOwned[11] );
        Montagne.setSelected (Randomizer.AttackersOwned[12] );
        Sledge.setSelected (Randomizer.AttackersOwned[13] );
        Thatcher.setSelected (Randomizer.AttackersOwned[14] );
        Thermite.setSelected (Randomizer.AttackersOwned[15] );
        Twitch.setSelected (Randomizer.AttackersOwned[16] );
        Ying.setSelected (Randomizer.AttackersOwned[17] );
        Zofia.setSelected (Randomizer.AttackersOwned[18] );
        Finka.setSelected (Randomizer.AttackersOwned[19] );
        Lion.setSelected (Randomizer.AttackersOwned[20] );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        Blitz = new javax.swing.JCheckBox();
        Randomizer_Go = new javax.swing.JButton();
        Ash = new javax.swing.JCheckBox();
        Dokkaebi = new javax.swing.JCheckBox();
        Blackbeard = new javax.swing.JCheckBox();
        Fuze = new javax.swing.JCheckBox();
        Ying = new javax.swing.JCheckBox();
        Glaz = new javax.swing.JCheckBox();
        Zofia = new javax.swing.JCheckBox();
        Recruit = new javax.swing.JCheckBox();
        IQ = new javax.swing.JCheckBox();
        Jackal = new javax.swing.JCheckBox();
        Montagne = new javax.swing.JCheckBox();
        Sledge = new javax.swing.JCheckBox();
        Thatcher = new javax.swing.JCheckBox();
        Capitão = new javax.swing.JCheckBox();
        Buck = new javax.swing.JCheckBox();
        Thermite = new javax.swing.JCheckBox();
        Hibana = new javax.swing.JCheckBox();
        Twitch = new javax.swing.JCheckBox();
        Finka = new javax.swing.JCheckBox();
        Lion = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));

        BackGround.setBackground(new java.awt.Color(255, 153, 0));
        BackGround.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BackGround.setForeground(new java.awt.Color(0, 0, 0));
        BackGround.setToolTipText("");

        Blitz.setBackground(new java.awt.Color(255, 153, 0));
        Blitz.setForeground(new java.awt.Color(255, 255, 255));
        Blitz.setText("Blitz");
        Blitz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlitzActionPerformed(evt);
            }
        });

        Randomizer_Go.setText("Randomizer");
        Randomizer_Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Randomizer_GoActionPerformed(evt);
            }
        });

        Ash.setBackground(new java.awt.Color(255, 153, 0));
        Ash.setForeground(new java.awt.Color(255, 255, 255));
        Ash.setText("Ash");
        Ash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AshActionPerformed(evt);
            }
        });

        Dokkaebi.setBackground(new java.awt.Color(255, 153, 0));
        Dokkaebi.setForeground(new java.awt.Color(255, 255, 255));
        Dokkaebi.setText("Dokkaebi");
        Dokkaebi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DokkaebiActionPerformed(evt);
            }
        });

        Blackbeard.setBackground(new java.awt.Color(255, 153, 0));
        Blackbeard.setForeground(new java.awt.Color(255, 255, 255));
        Blackbeard.setText("Blackbeard");
        Blackbeard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackbeardActionPerformed(evt);
            }
        });

        Fuze.setBackground(new java.awt.Color(255, 153, 0));
        Fuze.setForeground(new java.awt.Color(255, 255, 255));
        Fuze.setText("Fuze");
        Fuze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuzeActionPerformed(evt);
            }
        });

        Ying.setBackground(new java.awt.Color(255, 153, 0));
        Ying.setForeground(new java.awt.Color(255, 255, 255));
        Ying.setText("Ying");
        Ying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YingActionPerformed(evt);
            }
        });

        Glaz.setBackground(new java.awt.Color(255, 153, 0));
        Glaz.setForeground(new java.awt.Color(255, 255, 255));
        Glaz.setText("Glaz");
        Glaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GlazActionPerformed(evt);
            }
        });

        Zofia.setBackground(new java.awt.Color(255, 153, 0));
        Zofia.setForeground(new java.awt.Color(255, 255, 255));
        Zofia.setText("Zofia");
        Zofia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZofiaActionPerformed(evt);
            }
        });

        Recruit.setBackground(new java.awt.Color(255, 153, 0));
        Recruit.setForeground(new java.awt.Color(255, 255, 255));
        Recruit.setText("Recruit");
        Recruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecruitActionPerformed(evt);
            }
        });

        IQ.setBackground(new java.awt.Color(255, 153, 0));
        IQ.setForeground(new java.awt.Color(255, 255, 255));
        IQ.setText("IQ");
        IQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IQActionPerformed(evt);
            }
        });

        Jackal.setBackground(new java.awt.Color(255, 153, 0));
        Jackal.setForeground(new java.awt.Color(255, 255, 255));
        Jackal.setText("Jackal");
        Jackal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JackalActionPerformed(evt);
            }
        });

        Montagne.setBackground(new java.awt.Color(255, 153, 0));
        Montagne.setForeground(new java.awt.Color(255, 255, 255));
        Montagne.setText("Montagne");
        Montagne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MontagneActionPerformed(evt);
            }
        });

        Sledge.setBackground(new java.awt.Color(255, 153, 0));
        Sledge.setForeground(new java.awt.Color(255, 255, 255));
        Sledge.setText("Sledge");
        Sledge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SledgeActionPerformed(evt);
            }
        });

        Thatcher.setBackground(new java.awt.Color(255, 153, 0));
        Thatcher.setForeground(new java.awt.Color(255, 255, 255));
        Thatcher.setText("Thatcher");
        Thatcher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThatcherActionPerformed(evt);
            }
        });

        Capitão.setBackground(new java.awt.Color(255, 153, 0));
        Capitão.setForeground(new java.awt.Color(255, 255, 255));
        Capitão.setText("Capitão");
        Capitão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapitãoActionPerformed(evt);
            }
        });

        Buck.setBackground(new java.awt.Color(255, 153, 0));
        Buck.setForeground(new java.awt.Color(255, 255, 255));
        Buck.setText("Buck");
        Buck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuckActionPerformed(evt);
            }
        });

        Thermite.setBackground(new java.awt.Color(255, 153, 0));
        Thermite.setForeground(new java.awt.Color(255, 255, 255));
        Thermite.setText("Thermite");
        Thermite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThermiteActionPerformed(evt);
            }
        });

        Hibana.setBackground(new java.awt.Color(255, 153, 0));
        Hibana.setForeground(new java.awt.Color(255, 255, 255));
        Hibana.setText("Hibana");
        Hibana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HibanaActionPerformed(evt);
            }
        });

        Twitch.setBackground(new java.awt.Color(255, 153, 0));
        Twitch.setForeground(new java.awt.Color(255, 255, 255));
        Twitch.setText("Twitch");
        Twitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwitchActionPerformed(evt);
            }
        });

        Finka.setBackground(new java.awt.Color(255, 153, 0));
        Finka.setForeground(new java.awt.Color(255, 255, 255));
        Finka.setText("Finka");
        Finka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinkaActionPerformed(evt);
            }
        });

        Lion.setBackground(new java.awt.Color(255, 153, 0));
        Lion.setForeground(new java.awt.Color(255, 255, 255));
        Lion.setText("Lion");
        Lion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Recruit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Ash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addComponent(Blackbeard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Blitz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Buck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Capitão, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Fuze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Finka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Dokkaebi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Thatcher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(200, 200, 200))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(Montagne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(67, 67, 67))
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(Sledge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(84, 84, 84))
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(Lion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(99, 99, 99))
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackGroundLayout.createSequentialGroup()
                                        .addComponent(Glaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(15, 15, 15))
                                    .addComponent(Hibana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(BackGroundLayout.createSequentialGroup()
                                        .addComponent(IQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(27, 27, 27)))
                                .addGap(18, 18, 18)
                                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackGroundLayout.createSequentialGroup()
                                        .addComponent(Ying, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(14, 14, 14))
                                    .addComponent(Twitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(BackGroundLayout.createSequentialGroup()
                                        .addComponent(Zofia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(10, 10, 10))))
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(Jackal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(85, 85, 85)))
                        .addGap(128, 128, 128))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Thermite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(102, 102, 102)
                        .addComponent(Randomizer_Go, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Recruit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Blackbeard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Blitz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Capitão, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(Glaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Hibana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(Twitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ying, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Zofia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jackal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Montagne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Sledge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Thatcher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Thermite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Dokkaebi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Finka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fuze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Randomizer_Go, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BlitzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlitzActionPerformed
        Randomizer.AttackersOwned[3] = !Randomizer.AttackersOwned[3];
    }//GEN-LAST:event_BlitzActionPerformed

    private void Randomizer_GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Randomizer_GoActionPerformed
        Randomizer.Acount = 0;
        Arrays.fill(Randomizer.AttackersOwnedS, null );
        for (int i = 0; i < Randomizer.AttackersOwned.length; i++) {
            if( Randomizer.AttackersOwned[i] == true ){
                switch ( i ){
                    case 0:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Recruit";
                        Randomizer.Acount++;
                        break;
                    case 1:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Ash";
                        Randomizer.Acount++;
                        break;
                    case 2:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Blackbeard";
                        Randomizer.Acount++;
                        break;
                    case 3:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Blitz";
                        Randomizer.Acount++;
                        break;
                    case 4:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Buck";
                        Randomizer.Acount++;
                        break;
                    case 5:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Capitão";
                        Randomizer.Acount++;
                        break;
                    case 6:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Dokkaebi";
                        Randomizer.Acount++;
                        break;
                    case 7:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Fuze";
                        Randomizer.Acount++;
                        break;
                    case 8:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Glaz";
                        Randomizer.Acount++;
                        break;
                    case 9:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Hibana";
                        Randomizer.Acount++;
                        break;
                    case 10:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "IQ";
                        Randomizer.Acount++;
                        break;
                    case 11:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Jackal";
                        Randomizer.Acount++;
                        break;
                    case 12:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Montagne";
                        Randomizer.Acount++;
                        break;
                    case 13:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Sledge";
                        Randomizer.Acount++;
                        break;
                    case 14:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Thatcher";
                        Randomizer.Acount++;
                        break;
                    case 15:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Thermite";
                        Randomizer.Acount++;
                        break;
                    case 16:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Twitch";
                        Randomizer.Acount++;
                        break;
                    case 17:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Ying";
                        Randomizer.Acount++;
                        break;
                    case 18:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Zofia";
                        Randomizer.Acount++;
                        break;
                    case 19:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Finka";
                        Randomizer.Acount++;
                        break;
                    case 20:
                        Randomizer.AttackersOwnedS[ Randomizer.Acount ] = "Lion";
                        Randomizer.Acount++;
                        break;
                    default:
                        break;
                }
            }
        }
        
        File dir = new File("C:\\R6Randomizer");
        File Info = new File("C:\\R6Randomizer\\R6RandomInfo.txt");
        if ( Info.exists() ){
            Info.delete();
        }
        try {
            dir.mkdir();
            FileWriter fWriter = new FileWriter( Info );
            PrintWriter output = new PrintWriter( fWriter );
            
            for (int i = 0; i < AttackersOwned.length; i++) {
                output.println( AttackersOwned[i] );
            }
            
            for (int i = 0; i < DefendersOwned.length; i++) {
                output.println( DefendersOwned[i] );
            }
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Randomizer.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(4);
        }
        
        this.dispose();
        Randomizer Ops = new Randomizer();
        Ops.setVisible(true);
    }//GEN-LAST:event_Randomizer_GoActionPerformed

    private void AshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AshActionPerformed
        Randomizer.AttackersOwned[1] = !Randomizer.AttackersOwned[1];
    }//GEN-LAST:event_AshActionPerformed

    private void DokkaebiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DokkaebiActionPerformed
        Randomizer.AttackersOwned[6] = !Randomizer.AttackersOwned[6];
    }//GEN-LAST:event_DokkaebiActionPerformed

    private void BlackbeardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackbeardActionPerformed
        Randomizer.AttackersOwned[2] = !Randomizer.AttackersOwned[2];
    }//GEN-LAST:event_BlackbeardActionPerformed

    private void FuzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuzeActionPerformed
        Randomizer.AttackersOwned[7] = !Randomizer.AttackersOwned[7];
    }//GEN-LAST:event_FuzeActionPerformed

    private void YingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YingActionPerformed
        Randomizer.AttackersOwned[17] = !Randomizer.AttackersOwned[17];
    }//GEN-LAST:event_YingActionPerformed

    private void GlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GlazActionPerformed
        Randomizer.AttackersOwned[8] = !Randomizer.AttackersOwned[8];
    }//GEN-LAST:event_GlazActionPerformed

    private void ZofiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZofiaActionPerformed
        Randomizer.AttackersOwned[18] = !Randomizer.AttackersOwned[18];
    }//GEN-LAST:event_ZofiaActionPerformed

    private void RecruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecruitActionPerformed
        Randomizer.AttackersOwned[0] = !Randomizer.AttackersOwned[0];
    }//GEN-LAST:event_RecruitActionPerformed

    private void IQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IQActionPerformed
        Randomizer.AttackersOwned[10] = !Randomizer.AttackersOwned[10];
    }//GEN-LAST:event_IQActionPerformed

    private void JackalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JackalActionPerformed
        Randomizer.AttackersOwned[11] = !Randomizer.AttackersOwned[11];
    }//GEN-LAST:event_JackalActionPerformed

    private void MontagneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MontagneActionPerformed
        Randomizer.AttackersOwned[12] = !Randomizer.AttackersOwned[12];
    }//GEN-LAST:event_MontagneActionPerformed

    private void SledgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SledgeActionPerformed
        Randomizer.AttackersOwned[13] = !Randomizer.AttackersOwned[13];
    }//GEN-LAST:event_SledgeActionPerformed

    private void ThatcherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThatcherActionPerformed
        Randomizer.AttackersOwned[14] = !Randomizer.AttackersOwned[14];
    }//GEN-LAST:event_ThatcherActionPerformed

    private void CapitãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapitãoActionPerformed
        Randomizer.AttackersOwned[5] = !Randomizer.AttackersOwned[5];
    }//GEN-LAST:event_CapitãoActionPerformed

    private void BuckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuckActionPerformed
        Randomizer.AttackersOwned[4] = !Randomizer.AttackersOwned[4];
    }//GEN-LAST:event_BuckActionPerformed

    private void ThermiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThermiteActionPerformed
        Randomizer.AttackersOwned[15] = !Randomizer.AttackersOwned[15];
    }//GEN-LAST:event_ThermiteActionPerformed

    private void HibanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HibanaActionPerformed
        Randomizer.AttackersOwned[9] = !Randomizer.AttackersOwned[9];
    }//GEN-LAST:event_HibanaActionPerformed

    private void TwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwitchActionPerformed
        Randomizer.AttackersOwned[16] = !Randomizer.AttackersOwned[16];
    }//GEN-LAST:event_TwitchActionPerformed

    private void FinkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinkaActionPerformed
        Randomizer.AttackersOwned[19] = !Randomizer.AttackersOwned[19];
    }//GEN-LAST:event_FinkaActionPerformed

    private void LionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LionActionPerformed
        Randomizer.AttackersOwned[20] = !Randomizer.AttackersOwned[20];
    }//GEN-LAST:event_LionActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attackers_Owned_Menu().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ash;
    private javax.swing.JButton Attackers;
    private javax.swing.JButton Attackers1;
    private javax.swing.JButton Attackers2;
    private javax.swing.JPanel BackGround;
    private javax.swing.JCheckBox Blackbeard;
    private javax.swing.JCheckBox Blitz;
    private javax.swing.JCheckBox Buck;
    private javax.swing.JCheckBox Capitão;
    private javax.swing.JLabel Chosen_Operator;
    private javax.swing.JLabel Chosen_Operator1;
    private javax.swing.JLabel Chosen_Operator2;
    private javax.swing.JButton Defenders;
    private javax.swing.JButton Defenders1;
    private javax.swing.JButton Defenders2;
    private javax.swing.JCheckBox Dokkaebi;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Exit1;
    private javax.swing.JButton Exit2;
    private javax.swing.JCheckBox Finka;
    private javax.swing.JCheckBox Fuze;
    private javax.swing.JCheckBox Glaz;
    private javax.swing.JCheckBox Hibana;
    private javax.swing.JCheckBox IQ;
    private javax.swing.JCheckBox Jackal;
    private javax.swing.JCheckBox Lion;
    private javax.swing.JCheckBox Montagne;
    private javax.swing.JButton RandomAttacker;
    private javax.swing.JButton RandomAttacker1;
    private javax.swing.JButton RandomAttacker2;
    private javax.swing.JButton RandomDefender;
    private javax.swing.JButton RandomDefender1;
    private javax.swing.JButton RandomDefender2;
    private javax.swing.JButton Randomizer_Go;
    private javax.swing.JCheckBox Recruit;
    private javax.swing.JTextPane Selected;
    private javax.swing.JTextPane Selected1;
    private javax.swing.JTextPane Selected2;
    private javax.swing.JCheckBox Sledge;
    private javax.swing.JCheckBox Thatcher;
    private javax.swing.JCheckBox Thermite;
    private javax.swing.JCheckBox Twitch;
    private javax.swing.JCheckBox Ying;
    private javax.swing.JCheckBox Zofia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}