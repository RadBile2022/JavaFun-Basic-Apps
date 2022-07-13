package BAB_03;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author WahRadar
 */
public class Bioskop extends javax.swing.JFrame {

    int choose;
    String tempName;
    String tempEmail;

    /**
     * Creates new form Bioskop
     */
    public Bioskop() {
        initComponents();
    }

    // 08. ARRAY
    String header = "             BIOSKOP 21 CS"
            + "\n--------------------------------------------"
            + "\n|Kode| Nama Film |"
            + "\n--------------------------------------------";

    String[] film = {"Minion", "Teletubies", "Dora"};
    String films = "\n|1      | " + film[0] + "|"
            + "\n|2      | " + film[1] + " |"
            + "\n|3      | " + film[2] + " |"
            + "\n--------------------------------------------"
            + "\n";

    String option = "\n1. Buy"
            + "\n2. View"
            + "\n3. Update"
            + "\n4. Delete"
            + "\n5. Exit"
            + "\n"
            + "\nChoose >> ";
 
    // informasi awal kepada user
    private String menu = header + films + option;

    public String getMenu() {
        return menu;
    }

    int tempCode;
    int tempAmount;
    int tempPrice = 75000;
    int totalPrice;
    int money;
    int charge;

    Vector<String> name = new Vector<>();
    Vector<Integer> code = new Vector<>();
    Vector<Integer> amount = new Vector<>();
    Vector<Integer> price = new Vector<>();

    public void case01() {
        // input nama
        String B = menu + choose + "\nMasukkan Nama Anda : ";
        do {
            tempName = JOptionPane.showInputDialog(B);
        } while (tempName.isEmpty() || tempName.length() < 5);

        // input email
        String C = B + tempName + "\nMasukkan Email Anda : ";
        do {
            tempEmail = JOptionPane.showInputDialog(C);
        } while (!tempEmail.contains("@") || tempEmail.contains(".com"));

        // input kode file
        String D = C + tempEmail + "\nMasukkan Kode File [1...3] : ";
        do {
            tempCode = Integer.parseInt(JOptionPane.showInputDialog(D));
        } while (tempCode < 1 || tempCode > 3);

        // input pembelian
        String E = D + tempCode
                + "\nMasukkan Jumlah Pembelian [harus lebih dari 0] : ";
        do {
            tempAmount = Integer.parseInt(JOptionPane.showInputDialog(E));
        } while (tempAmount <= 0);

        // ketentuan pembelian item
        if (tempAmount == 1) {
            tempPrice = 35000;
        } else if (tempAmount >= 2) {
            tempPrice = 25000;
        } else {
            tempPrice = 50000;
        }

        // penghitungan item
        totalPrice = tempAmount * tempPrice;
        String F = E + tempAmount + "\nTotal Harga : ";

        // proses pembayaran
        String G = F + totalPrice + "\nMasukkan Jumlah Uang : ";
        money = Integer.parseInt(JOptionPane.showInputDialog(G));

        // ketentuan pembayaran
        String G1 = F + money + "\nCharge : ";
        if (money < totalPrice) {
            JOptionPane.showMessageDialog(null, "Uang Ndak Cukup Cuy !",
                    "Attention", JOptionPane.CANCEL_OPTION);
        } else {
            charge = money - totalPrice;
            JOptionPane.showMessageDialog(null, G1 + charge
                    + "\nThank You :)");
        }

        name.add(tempName);
        code.add(tempCode);
        amount.add(tempAmount);
        price.add(totalPrice);
        dispose();
    }

    public void case02() {
        if (name.size() == 0) {
            JOptionPane.showMessageDialog(null, "There is no data !",
                    "Attention", JOptionPane.WARNING_MESSAGE);
        } else {
            // tampilan data yang ada di vector
            String show = "\n==============================================="
                    + "\n|No.|      Nama     | Kode Film | Jumlah |    Price    |"
                    + "\n===============================================";

            String items = "\n|1    |"
                    + name.get(0) + "     |"
                    + code.get(0) + "               |"
                    + amount.get(0) + "            |"
                    + price.get(0) + "    "
                    + "|";
// + "\n|2    |"   + name.get(1) + "     |" + code.get(1) + "  |"  + 
// amount.get(1) + "            |"   + price.get(1) + "    " + "|";
// Harus input 2, kalau tidak array index exception bouND

            JOptionPane.showMessageDialog(null, show + items);
        }
    }

    public void case03() {
        if (name.size() == 0) {
            JOptionPane.showMessageDialog(null, "There is no data !", "Attention",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // tampilan data yang ada di vector
            String show = "\n==============================================="
                    + "\n|No.|      Nama     | Kode Film | Jumlah |    Price    |"
                    + "\n===============================================";

            String items = "\n|1    |"
                    + name.get(0) + "     |"
                    + code.get(0) + "               |"
                    + amount.get(0) + "            |"
                    + price.get(0) + "    "
                    + "|";
            String a = "\n“Choose>>”";
            String b = "\n“Masukkan Nama Anda [3 .. 25 karakter ] : ”";
            do {
                choose = 0;

                try {
                    choose = Integer.parseInt(JOptionPane.showInputDialog
                        (null, show + items + a));
                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Must Be Numeric ! ", 
                            "Attention", JOptionPane.WARNING_MESSAGE);
                    choose = -1;
                }

            } while (choose <= 0 || choose > name.size());

            do {

                tempName = JOptionPane.showInputDialog(null, show + items + a 
                        + choose + b);
            } while (tempName.isEmpty() || tempName.length() < 5);
        }

        // replace data nama pada vector
        name.set(choose - 1, tempName);
    }

    public void case04() {
        if (name.size() == 0) {
            JOptionPane.showMessageDialog(null, "There is no data !", "Attention",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // tampilan data yang ada di vector
            String show = "\n==============================================="
                    + "\n|No.|      Nama     | Kode Film | Jumlah |    Price    |"
                    + "\n===============================================";

            String items = "\n|1    |"
                    + name.get(0) + "     |"
                    + code.get(0) + "               |"
                    + amount.get(0) + "            |"
                    + price.get(0) + "    "
                    + "|";
            String a = "\n“Choose>>”";
            String b = "\n“Masukkan Nama Anda [3 .. 25 karakter ] : ”";
            do {
                choose = 0;

                try {
                    choose = Integer.parseInt(JOptionPane.showInputDialog(null, 
                            show + items + a));
                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Must Be Numeric ! ", 
                            "Attention", JOptionPane.WARNING_MESSAGE);
                    choose = -1;
                }

            } while (choose <= 0 || choose > name.size());
//                    // hapus data pada vector	XI...
            name.remove(choose - 1);
            code.remove(choose - 1);
            amount.remove(choose - 1);
            price.remove(choose - 1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 25)); // NOI18N
        jLabel1.setText("BIOSKOP CS UI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnStart)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(btnStart)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:        
        do {
            // informasi awal kepada user
            String A = getMenu();
            try {
                // input pilihan
                choose = Integer.parseInt(JOptionPane.showInputDialog(A));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Must Be Numeric !",
                        "Attention", JOptionPane.ERROR_MESSAGE);
            }

            switch (choose) {
                case 1:
                    case01();
                    break;

                case 2:
                    case02();
                    break;

                case 3:
                    case03();
                    break;

                case 4:
                    case04();
                    break;

            }

        } while (choose != 5);

    }//GEN-LAST:event_btnStartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bioskop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
