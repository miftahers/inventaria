package inventaria;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dashboard extends javax.swing.JFrame {
    
    public dashboard() {
        initComponents();
//        tampil_pinjam();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        homepage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barangpage = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        karyawanpage = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField11 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        peminjamanpage = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jmlBarang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelPinjam = new javax.swing.JTable();
        nipKaryawan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        tglPinjam = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        deletePinjam = new javax.swing.JButton();
        btnUpdatePinjam = new javax.swing.JButton();
        insertPinjam = new javax.swing.JButton();
        tglKembali = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        namaBarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKaryawan = new javax.swing.JTable();
        idPinjam = new javax.swing.JTextField();
        txtIdPinjam = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homemenu = new javax.swing.JMenu();
        barangmenu = new javax.swing.JMenu();
        karyawanmenu = new javax.swing.JMenu();
        peminjamanmenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setLayout(new java.awt.CardLayout());

        homepage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("HALAMAN UTAMA/HOME");

        javax.swing.GroupLayout homepageLayout = new javax.swing.GroupLayout(homepage);
        homepage.setLayout(homepageLayout);
        homepageLayout.setHorizontalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homepageLayout.createSequentialGroup()
                .addContainerGap(962, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(786, 786, 786))
        );
        homepageLayout.setVerticalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepageLayout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(jLabel1)
                .addContainerGap(587, Short.MAX_VALUE))
        );

        background.add(homepage, "card2");

        barangpage.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jenis Barang", "Stok"
            }
        ));
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
        }

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Cari");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel2.setText("Kode Barang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel4.setText("Jenis Barang");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel5.setText("Stok");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Kosongkan");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Hapus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Ubah");

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Tambah");

        javax.swing.GroupLayout barangpageLayout = new javax.swing.GroupLayout(barangpage);
        barangpage.setLayout(barangpageLayout);
        barangpageLayout.setHorizontalGroup(
            barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barangpageLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(barangpageLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(barangpageLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(barangpageLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(barangpageLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(barangpageLayout.createSequentialGroup()
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barangpageLayout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        barangpageLayout.setVerticalGroup(
            barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barangpageLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(barangpageLayout.createSequentialGroup()
                        .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );

        background.add(barangpage, "card3");

        karyawanpage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setText("NIP");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel7.setText("Nama ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel8.setText("Alamat");

        jTable4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jenis Barang", "Stok"
            }
        ));
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel9.setText("No Telepon");

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Cari");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Kosongkan");

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setText("Hapus");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setText("Ubah");

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setText("Tambah");

        javax.swing.GroupLayout karyawanpageLayout = new javax.swing.GroupLayout(karyawanpage);
        karyawanpage.setLayout(karyawanpageLayout);
        karyawanpageLayout.setHorizontalGroup(
            karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, karyawanpageLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(karyawanpageLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(karyawanpageLayout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(karyawanpageLayout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(karyawanpageLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(karyawanpageLayout.createSequentialGroup()
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, karyawanpageLayout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        karyawanpageLayout.setVerticalGroup(
            karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, karyawanpageLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(karyawanpageLayout.createSequentialGroup()
                        .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );

        background.add(karyawanpage, "card4");

        peminjamanpage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel10.setText("Nama Barang");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel11.setText("Jumlah");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel12.setText("Karyawan");

        tabelPinjam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabelPinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "nama", "jumlah", "nip_karyawan", "tgl_pinjam", "tgl_kembali"
            }
        ));
        tabelPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPinjamMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabelPinjam);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel13.setText("Tgl Pinjam");

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton13.setText("Cari");

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReset.setText("Kosongkan");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        deletePinjam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deletePinjam.setText("Hapus");
        deletePinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePinjamActionPerformed(evt);
            }
        });

        btnUpdatePinjam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdatePinjam.setText("Ubah");
        btnUpdatePinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePinjamActionPerformed(evt);
            }
        });

        insertPinjam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        insertPinjam.setText("Tambah");
        insertPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPinjamActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel14.setText("Tgl Kembali");

        tblBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        tblKaryawan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKaryawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKaryawan);

        txtIdPinjam.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        txtIdPinjam.setText("Id Pinjam");

        javax.swing.GroupLayout peminjamanpageLayout = new javax.swing.GroupLayout(peminjamanpage);
        peminjamanpage.setLayout(peminjamanpageLayout);
        peminjamanpageLayout.setHorizontalGroup(
            peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanpageLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(peminjamanpageLayout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(nipKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(peminjamanpageLayout.createSequentialGroup()
                            .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43)
                            .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jmlBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                                .addComponent(namaBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                                .addComponent(idPinjam, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(peminjamanpageLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(peminjamanpageLayout.createSequentialGroup()
                                .addComponent(btnUpdatePinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deletePinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(peminjamanpageLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(tglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanpageLayout.createSequentialGroup()
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanpageLayout.createSequentialGroup()
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        peminjamanpageLayout.setVerticalGroup(
            peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanpageLayout.createSequentialGroup()
                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(peminjamanpageLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanpageLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(peminjamanpageLayout.createSequentialGroup()
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(peminjamanpageLayout.createSequentialGroup()
                                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jmlBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nipKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUpdatePinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deletePinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(peminjamanpageLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(insertPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(peminjamanpageLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        background.add(peminjamanpage, "card5");

        jMenuBar1.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N

        homemenu.setText("Home");
        homemenu.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        homemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homemenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(homemenu);

        barangmenu.setText("Barang");
        barangmenu.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        barangmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(barangmenu);

        karyawanmenu.setText("Karyawan");
        karyawanmenu.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        karyawanmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karyawanmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(karyawanmenu);

        peminjamanmenu.setText("Peminjaman");
        peminjamanmenu.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        peminjamanmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peminjamanmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(peminjamanmenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tampil_pinjam() {
        // Membuat object pada table
        DefaultTableModel tbp = new DefaultTableModel();
        tbp.addColumn("id");
        tbp.addColumn("nama_barang");
        tbp.addColumn("jumlah");
        tbp.addColumn("nip_karyawan");
        tbp.addColumn("tgl_pinjam");
        tbp.addColumn("tgl_kembali");
        
        try {
            // 1. Query
//            String query = "select pembelian.id, barang.nama, pembelian.jumlah, karyawan.nama, pembelian.tgl_pinjam, pembelian.tgl_kembali from pembelian inner join karyawan on karyawan.nip = pembelian.nip_karyawan inner join barang on barang.id = pembelian.id_barang;";
            String query = "SELECT * FROM pembelian";
            
            // 2. Fungsi Query
            java.sql.Connection vconn = (Connection)koneksi_database.configDB();
            
            // 3. Kirim parameter fungsi java ke sql
            java.sql.Statement statement = vconn.createStatement();
            
            // 4. Eksekusi
            java.sql.ResultSet rs = statement.executeQuery(query);
            
            // 5. Looping untuk show data per baris
            while (rs.next()) {
                tbp.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)
                });
            }
            // Memasukan data dari penampungan ke tabel
            tabelPinjam.setModel(tbp);
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan data..");
        }
    }
    
    private void tampil_barang() {
        // Membuat object pada table
        DefaultTableModel tbm = new DefaultTableModel();
        tbm.addColumn("Kode Barang");
        tbm.addColumn("Nama Barang");
        tbm.addColumn("Jenis Barang");
        tbm.addColumn("stok");
        
        try {
            // 1. Query
            String query = "SELECT * FROM barang";
            
            // 2. Fungsi Query
            java.sql.Connection vconn = (Connection)koneksi_database.configDB();
            
            // 3. Kirim parameter fungsi java ke sql
            java.sql.Statement statement = vconn.createStatement();
            
            // 4. Eksekusi
            java.sql.ResultSet rs = statement.executeQuery(query);
            
            // 5. Looping untuk show data per baris
            while (rs.next()) {
                tbm.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                });
            }
            // Memasukan data dari penampungan ke tabel
            tblBarang.setModel(tbm);
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan data..");
        }
    }
    
    private void tampil_karyawan() {
        // Membuat object pada table
        DefaultTableModel tbm = new DefaultTableModel();
        tbm.addColumn("NIP");
        tbm.addColumn("Nama Karyawan");
        tbm.addColumn("No Telepon");
        tbm.addColumn("Jabatan");
        
        try {
            // 1. Query
            String query = "SELECT * FROM karyawan";
            
            // 2. Fungsi Query
            java.sql.Connection vconn = (Connection)koneksi_database.configDB();
            
            // 3. Kirim parameter fungsi java ke sql
            java.sql.Statement statement = vconn.createStatement();
            
            // 4. Eksekusi
            java.sql.ResultSet rs = statement.executeQuery(query);
            
            // 5. Looping untuk show data per baris
            while (rs.next()) {
                tbm.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                });
            }
            // Memasukan data dari penampungan ke tabel
            tblKaryawan.setModel(tbm);
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan data..");
        }
    }
    
    private void homemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homemenuMouseClicked
        
        homepage.setVisible(true);
        barangpage.setVisible(false);
        karyawanpage.setVisible(false);
        peminjamanpage.setVisible(false);
        
    }//GEN-LAST:event_homemenuMouseClicked

    private void barangmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangmenuMouseClicked
        
        barangpage.setVisible(true);
        homepage.setVisible(false);
        karyawanpage.setVisible(false);
        peminjamanpage.setVisible(false);
        
    }//GEN-LAST:event_barangmenuMouseClicked

    private void karyawanmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanmenuMouseClicked
        
        karyawanpage.setVisible(true);
        peminjamanpage.setVisible(false);
        homepage.setVisible(false);
        barangpage.setVisible(false);
        
    }//GEN-LAST:event_karyawanmenuMouseClicked

    private void peminjamanmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peminjamanmenuMouseClicked
        
        peminjamanpage.setVisible(true);
        homepage.setVisible(false);
        barangpage.setVisible(false);
        karyawanpage.setVisible(false);
        
        tampil_karyawan();
        tampil_barang();
        tampil_pinjam();
    }//GEN-LAST:event_peminjamanmenuMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void deletePinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePinjamActionPerformed
        int id;
        
        id = Integer.valueOf(idPinjam.getText());
        // gimana cara dapetin id dari nama barang dalem combo box
//        id = Integer.parseInt(namaBarang);
        try{
            String url="jdbc:mysql://localhost/inventaria"; //url database
            String user="root"; //User database
            String pass="";
            String sql = "DELETE FROM pembelian WHERE id ="+ id +";";
            Connection C = (Connection)koneksi_database.configDB();
            Statement s = C.createStatement();
            s.execute(sql);
            JOptionPane.showMessageDialog(barangmenu, "Berhasil");
        } catch (Exception e){
            JOptionPane.showMessageDialog(barangmenu, "Gagal");
        }
        
        tampil_pinjam();
            
            // Membersihkan form
            idPinjam.setText("");
            namaBarang.setText("");
            jmlBarang.setText("");
            nipKaryawan.setText("");
            tglPinjam.setText("");
            tglKembali.setText("");
    }//GEN-LAST:event_deletePinjamActionPerformed
    
    private void insertPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPinjamActionPerformed
        int id_brg, jml, nip;
        Date pinjam, kembali;
        
        id_brg = Integer.valueOf(namaBarang.getText());
        pinjam = Date.valueOf(tglPinjam.getText());
        kembali = Date.valueOf(tglKembali.getText());
        jml = Integer.parseInt(jmlBarang.getText());
        nip = Integer.parseInt(nipKaryawan.getText());

        try{
            String url="jdbc:mysql://localhost/inventaria"; //url database
            String user="root"; //User database
            String pass="";
            String sql = "INSERT INTO pembelian VALUES (null, "+id_brg+","+jml+","+nip+",'"+pinjam+"','" +kembali+"');";
            Connection C = (Connection)koneksi_database.configDB();
            Statement s = C.createStatement();
            s.execute(sql);
            JOptionPane.showMessageDialog(barangmenu, "Berhasil");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(barangmenu, "Gagal");
        }
        
        tampil_pinjam();
            
            // Membersihkan form
            idPinjam.setText("");
            namaBarang.setText("");
            jmlBarang.setText("");
            nipKaryawan.setText("");
            tglPinjam.setText("");
            tglKembali.setText("");
    }//GEN-LAST:event_insertPinjamActionPerformed

    private void tabelPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPinjamMouseClicked
        // TODO add your handling code here:
        // Memindahkan data ke form
        
        // Menampung nilai koordinat barus
        int baris = tabelPinjam.rowAtPoint(evt.getPoint());
        
        // Membuat variabel untuk menampung data-data kolom dari baris yang terpilih
        String id_p = tabelPinjam.getValueAt(baris, 0).toString();
        String id_b = tabelPinjam.getValueAt(baris, 1).toString();
        String jml = tabelPinjam.getValueAt(baris, 2).toString();
        String nip = tabelPinjam.getValueAt(baris, 3).toString();
        String tgl_p = tabelPinjam.getValueAt(baris, 4).toString();
        String tgl_k = tabelPinjam.getValueAt(baris, 5).toString();
        
        idPinjam.setText(id_p);
        namaBarang.setText(id_b);
        jmlBarang.setText(jml);
        nipKaryawan.setText(nip);
        tglPinjam.setText(tgl_p);
        tglKembali.setText(tgl_k);
    }//GEN-LAST:event_tabelPinjamMouseClicked

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
        // TODO add your handling code here:
        int baris = tblBarang.rowAtPoint(evt.getPoint());
        
        // Membuat variabel untuk menampung data-data kolom dari baris yang terpilih
        String id_b = tblBarang.getValueAt(baris, 0).toString();
        
        namaBarang.setText(id_b);
    }//GEN-LAST:event_tblBarangMouseClicked

    private void tblKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKaryawanMouseClicked
        // TODO add your handling code here:
        int baris = tblBarang.rowAtPoint(evt.getPoint());
        
        // Membuat variabel untuk menampung data-data kolom dari baris yang terpilih
        String nip = tblKaryawan.getValueAt(baris, 0).toString();
        
        nipKaryawan.setText(nip);
    }//GEN-LAST:event_tblKaryawanMouseClicked

    private void btnUpdatePinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePinjamActionPerformed
        // TODO add your handling code here:
        //Ubah data barang
        
        try {
        // Menampung data textField/form pada variabel
        int id_pinjam = Integer.parseInt(idPinjam.getText());
        int id_brg = Integer.parseInt(namaBarang.getText());
        int jml = Integer.parseInt(jmlBarang.getText());
        int nip = Integer.parseInt(nipKaryawan.getText());
        String tgl_p = tglPinjam.getText();
        String tgl_k = tglKembali.getText();
        
        // SQL Connection
        String Qsql = "UPDATE pembelian SET id_barang = '"+id_brg+"', jumlah = '"+jml+"', nip_karyawan = '"+nip+"', tgl_pinjam ='"+tgl_p+"', tgl_kembali ='"+tgl_k+"' WHERE pembelian.id = '"+id_pinjam+"';";
        java.sql.Connection C = (Connection)koneksi_database.configDB(); //Mengambil fungsi koneksi DB dari koneksi_database.java
        java.sql.PreparedStatement s = C.prepareStatement(Qsql); //Mengirimkan Parameter
        s.execute(); //Eksekusi SQL
        
        JOptionPane.showMessageDialog(null, "Berhasil Mengubah Data Barang dengan Kode Barang: "+id_pinjam);
        tampil_pinjam();
        
        }catch(NumberFormatException | SQLException se){
            
            JOptionPane.showMessageDialog(null, "Gagal Mengubah Data.."); 
            JOptionPane.showMessageDialog(this, se.getMessage());
            
        }
        
        tampil_pinjam();
            
            // Membersihkan form
            idPinjam.setText("");
            namaBarang.setText("");
            jmlBarang.setText("");
            nipKaryawan.setText("");
            tglPinjam.setText("");
            tglKembali.setText("");
    }//GEN-LAST:event_btnUpdatePinjamActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        tampil_pinjam();
            
            // Membersihkan form
            idPinjam.setText("");
            namaBarang.setText("");
            jmlBarang.setText("");
            nipKaryawan.setText("");
            tglPinjam.setText("");
            tglKembali.setText("");
    }//GEN-LAST:event_btnResetActionPerformed
 
    
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JMenu barangmenu;
    private javax.swing.JPanel barangpage;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdatePinjam;
    private javax.swing.JButton deletePinjam;
    private javax.swing.JMenu homemenu;
    private javax.swing.JPanel homepage;
    private javax.swing.JTextField idPinjam;
    private javax.swing.JButton insertPinjam;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jmlBarang;
    private javax.swing.JMenu karyawanmenu;
    private javax.swing.JPanel karyawanpage;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField nipKaryawan;
    private javax.swing.JMenu peminjamanmenu;
    private javax.swing.JPanel peminjamanpage;
    private javax.swing.JTable tabelPinjam;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTable tblKaryawan;
    private javax.swing.JTextField tglKembali;
    private javax.swing.JTextField tglPinjam;
    private javax.swing.JLabel txtIdPinjam;
    // End of variables declaration//GEN-END:variables
}
