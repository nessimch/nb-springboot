/*
 * Copyright 2016 Alessandro Falappa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.alexfalappa.nbspringboot.templates.metadata;

import javax.swing.JPanel;

import org.openide.WizardDescriptor;

import static com.github.alexfalappa.nbspringboot.templates.metadata.MetadataWizardIterator.WIZ_SECT_HINTS;
import static com.github.alexfalappa.nbspringboot.templates.metadata.MetadataWizardIterator.WIZ_SECT_HINTS_PROVIDERS;
import static com.github.alexfalappa.nbspringboot.templates.metadata.MetadataWizardIterator.WIZ_SECT_HINTS_VALUES;
import static com.github.alexfalappa.nbspringboot.templates.metadata.MetadataWizardIterator.WIZ_SECT_PROPS;

public final class MetadataVisualPanel1 extends JPanel {

    public MetadataVisualPanel1() {
        initComponents();
    }

    void store(WizardDescriptor wd) {
        wd.putProperty(WIZ_SECT_PROPS, chProperties.isSelected());
        wd.putProperty(WIZ_SECT_HINTS, chHints.isSelected());
        wd.putProperty(WIZ_SECT_HINTS_VALUES, chHintsValues.isSelected());
        wd.putProperty(WIZ_SECT_HINTS_PROVIDERS, chHintsProviders.isSelected());
    }

    void read(WizardDescriptor wd) {
        Boolean flag = (Boolean) wd.getProperty(WIZ_SECT_PROPS);
        if (flag != null) {
            chProperties.setSelected(flag);
        }
        flag = (Boolean) wd.getProperty(WIZ_SECT_HINTS);
        if (flag != null) {
            chHints.setSelected(flag);
        }
        flag = (Boolean) wd.getProperty(WIZ_SECT_HINTS_VALUES);
        if (flag != null) {
            chHintsValues.setSelected(flag);
        }
        flag = (Boolean) wd.getProperty(WIZ_SECT_HINTS_PROVIDERS);
        if (flag != null) {
            chHintsProviders.setSelected(flag);
        }
    }

    /** This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
     * this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chProperties = new javax.swing.JCheckBox();
        chHints = new javax.swing.JCheckBox();
        chHintsValues = new javax.swing.JCheckBox();
        chHintsProviders = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(chProperties, org.openide.util.NbBundle.getBundle(MetadataVisualPanel1.class).getString("MetadataVisualPanel1.chProperties.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chHints, org.openide.util.NbBundle.getBundle(MetadataVisualPanel1.class).getString("MetadataVisualPanel1.chHints.text")); // NOI18N
        chHints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chHintsActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(chHintsValues, org.openide.util.NbBundle.getBundle(MetadataVisualPanel1.class).getString("MetadataVisualPanel1.chHintsValues.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chHintsProviders, org.openide.util.NbBundle.getBundle(MetadataVisualPanel1.class).getString("MetadataVisualPanel1.chHintsProviders.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chProperties)
                    .addComponent(chHints)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chHintsValues)
                            .addComponent(chHintsProviders))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chProperties)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chHints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chHintsValues)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chHintsProviders)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chHintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chHintsActionPerformed
        chHintsValues.setEnabled(chHints.isSelected());
        chHintsProviders.setEnabled(chHints.isSelected());
    }//GEN-LAST:event_chHintsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chHints;
    private javax.swing.JCheckBox chHintsProviders;
    private javax.swing.JCheckBox chHintsValues;
    private javax.swing.JCheckBox chProperties;
    // End of variables declaration//GEN-END:variables

}
