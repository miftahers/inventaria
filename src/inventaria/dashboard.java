package inventaria;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class dashboard extends javax.swing.JFrame {
    
    public dashboard() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        homepage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        barangpage = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_barang = new javax.swing.JTable();
        textField_cariBarang = new javax.swing.JTextField();
        btn_cariBarang = new javax.swing.JButton();
        textField_kodeBarang = new javax.swing.JTextField();
        label_kodeBarang = new javax.swing.JLabel();
        label_namaBarang = new javax.swing.JLabel();
        textField_namaBarang = new javax.swing.JTextField();
        label_jenisBarang = new javax.swing.JLabel();
        textField_jenisBarang = new javax.swing.JTextField();
        label_stok = new javax.swing.JLabel();
        textField_stok = new javax.swing.JTextField();
        btn_kosongkanFormBarang = new javax.swing.JButton();
        btn_hapusBarang = new javax.swing.JButton();
        btn_ubahBarang = new javax.swing.JButton();
        btn_tambahBarang = new javax.swing.JButton();
        btn_showAllBarang = new javax.swing.JButton();
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
        jTextField14 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTextField15 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        homemenu = new javax.swing.JMenu();
        barangmenu = new javax.swing.JMenu();
        karyawanmenu = new javax.swing.JMenu();
        peminjamanmenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);

        background.setLayout(new java.awt.CardLayout());

        homepage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setText("DIBUAT OLEH KELOMPOK 2:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel3.setText("ALFIN");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel4.setText("DHAFIN");

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel15.setText("FADHLI");

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel16.setText("FATHONI");

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel17.setText("MIFTAH");

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel18.setText("SANDI");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO 21-9.png"))); // NOI18N

        javax.swing.GroupLayout homepageLayout = new javax.swing.GroupLayout(homepage);
        homepage.setLayout(homepageLayout);
        homepageLayout.setHorizontalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homepageLayout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(505, 505, 505))
        );
        homepageLayout.setVerticalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepageLayout.createSequentialGroup()
                .addGap(495, 495, 495)
                .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(homepageLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)))
                .addContainerGap(505, Short.MAX_VALUE))
        );

        background.add(homepage, "card2");

        barangpage.setBackground(new java.awt.Color(255, 255, 255));

        tabel_barang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabel_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_barangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel_barang);
        if (tabel_barang.getColumnModel().getColumnCount() > 0) {
            tabel_barang.getColumnModel().getColumn(0).setResizable(false);
        }

        textField_cariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_cariBarangActionPerformed(evt);
            }
        });

        btn_cariBarang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cariBarang.setText("Cari");
        btn_cariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariBarangActionPerformed(evt);
            }
        });

        textField_kodeBarang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textField_kodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_kodeBarangActionPerformed(evt);
            }
        });

        label_kodeBarang.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        label_kodeBarang.setText("Kode Barang");

        label_namaBarang.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        label_namaBarang.setText("Nama Barang");

        textField_namaBarang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        label_jenisBarang.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        label_jenisBarang.setText("Jenis Barang");

        textField_jenisBarang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        label_stok.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        label_stok.setText("Stok");

        textField_stok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_kosongkanFormBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_kosongkanFormBarang.setText("Kosongkan");
        btn_kosongkanFormBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kosongkanFormBarangActionPerformed(evt);
            }
        });

        btn_hapusBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_hapusBarang.setText("Hapus");
        btn_hapusBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusBarangActionPerformed(evt);
            }
        });

        btn_ubahBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ubahBarang.setText("Ubah");
        btn_ubahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahBarangActionPerformed(evt);
            }
        });

        btn_tambahBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_tambahBarang.setText("Tambah");
        btn_tambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahBarangActionPerformed(evt);
            }
        });

        btn_showAllBarang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_showAllBarang.setText("Tampilkan Semua Data");
        btn_showAllBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showAllBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barangpageLayout = new javax.swing.GroupLayout(barangpage);
        barangpage.setLayout(barangpageLayout);
        barangpageLayout.setHorizontalGroup(
            barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barangpageLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(barangpageLayout.createSequentialGroup()
                            .addComponent(label_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(textField_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(barangpageLayout.createSequentialGroup()
                            .addComponent(label_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(textField_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(barangpageLayout.createSequentialGroup()
                            .addComponent(label_jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(textField_jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(barangpageLayout.createSequentialGroup()
                        .addComponent(label_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(textField_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_tambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(barangpageLayout.createSequentialGroup()
                            .addComponent(btn_ubahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_hapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_kosongkanFormBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barangpageLayout.createSequentialGroup()
                        .addComponent(btn_showAllBarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textField_cariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        barangpageLayout.setVerticalGroup(
            barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barangpageLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_cariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_showAllBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(barangpageLayout.createSequentialGroup()
                        .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField_jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(barangpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ubahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kosongkanFormBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_tambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
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

        jTable5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel13.setText("Tgl Pinjam");

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton13.setText("Cari");

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton14.setText("Kosongkan");

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton15.setText("Hapus");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton16.setText("Ubah");

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton17.setText("Tambah");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel14.setText("Tgl Kembali");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Barang", "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(peminjamanpageLayout.createSequentialGroup()
                            .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43)
                            .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(peminjamanpageLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(peminjamanpageLayout.createSequentialGroup()
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(peminjamanpageLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanpageLayout.createSequentialGroup()
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        peminjamanpageLayout.setVerticalGroup(
            peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanpageLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(peminjamanpageLayout.createSequentialGroup()
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
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
        barangmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangmenuActionPerformed(evt);
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

    // Membuat tampil table barang
    private void tampil_table_barang() {
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
            tabel_barang.setModel(tbm);
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan data..");
        }
    }
    private void tampil_cari_barang(String kata_kunci){
        // Membuat object pada table
        DefaultTableModel tbm = new DefaultTableModel();
        tbm.addColumn("Kode Barang");
        tbm.addColumn("Nama Barang");
        tbm.addColumn("Jenis Barang");
        tbm.addColumn("stok");
        
        try {
            // 1. Query
            String query = "SELECT * FROM barang WHERE `nama` LIKE '%"+kata_kunci+"%' OR `jenis` LIKE '%"+kata_kunci+"%'OR `jumlah` LIKE '%"+kata_kunci+"%'";
            
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
            tabel_barang.setModel(tbm);
            
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
        
        tampil_table_barang();
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
        
    }//GEN-LAST:event_peminjamanmenuMouseClicked
    
    // Barang
    // Fetch data from db using search btn
    
    private void btn_hapusBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusBarangActionPerformed
        // Hapus barang
        try {
        // Menampung data textField/form pada variabel
        int kode_barang = Integer.parseInt(textField_kodeBarang.getText());
        
        // SQL Connection
        String Qsql = "DELETE FROM `barang` WHERE `id` = '"+kode_barang+"'";
        java.sql.Connection C = (Connection)koneksi_database.configDB(); //Mengambil fungsi koneksi DB dari koneksi_database.java
        java.sql.PreparedStatement s = C.prepareStatement(Qsql); //Mengirimkan Parameter
        s.execute(); //Eksekusi SQL
        
        JOptionPane.showMessageDialog(null, "Berhasil Menghapus Data Barang dengan Kode Barang: "+kode_barang);
        tampil_table_barang();
        
        }catch(NumberFormatException | SQLException se){
            
            JOptionPane.showMessageDialog(null, "Gagal Menghapus Data.."); 
            JOptionPane.showMessageDialog(this, se.getMessage());
            
        }
    }//GEN-LAST:event_btn_hapusBarangActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void barangmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barangmenuActionPerformed

    private void tabel_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_barangMouseClicked
        // Memindahkan data ke form
        
        // Menampung nilai koordinat barus
        int baris = tabel_barang.rowAtPoint(evt.getPoint());
        
        // Membuat variabel untuk menampung data-data kolom dari baris yang terpilih
        String kb = tabel_barang.getValueAt(baris, 0).toString();
        String nb = tabel_barang.getValueAt(baris, 1).toString();
        String jb = tabel_barang.getValueAt(baris, 2).toString();
        String s = tabel_barang.getValueAt(baris, 3).toString();
        
        textField_kodeBarang.setText(kb);
        textField_namaBarang.setText(nb);
        textField_jenisBarang.setText(jb);
        textField_stok.setText(s);
        
    }//GEN-LAST:event_tabel_barangMouseClicked

    private void textField_cariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_cariBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_cariBarangActionPerformed

    private void textField_kodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_kodeBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_kodeBarangActionPerformed

    private void btn_ubahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahBarangActionPerformed
        //Ubah data barang
        
        try {
        // Menampung data textField/form pada variabel
        int kode_barang = Integer.parseInt(textField_kodeBarang.getText());
        String nama_barang = textField_namaBarang.getText();
        String jenis_barang = textField_jenisBarang.getText();
        int stok = Integer.parseInt(textField_stok.getText());
        
        // SQL Connection
        String Qsql = "UPDATE `barang` SET `nama`='"+nama_barang+"',`jenis`='"+jenis_barang+"',`jumlah`='"+stok+"' WHERE `id` = '"+kode_barang+"'";
        java.sql.Connection C = (Connection)koneksi_database.configDB(); //Mengambil fungsi koneksi DB dari koneksi_database.java
        java.sql.PreparedStatement s = C.prepareStatement(Qsql); //Mengirimkan Parameter
        s.execute(); //Eksekusi SQL
        
        JOptionPane.showMessageDialog(null, "Berhasil Mengubah Data Barang dengan Kode Barang: "+kode_barang);
        tampil_table_barang();
        
        }catch(NumberFormatException | SQLException se){
            
            JOptionPane.showMessageDialog(null, "Gagal Mengubah Data.."); 
            JOptionPane.showMessageDialog(this, se.getMessage());
            
        }
        
    }//GEN-LAST:event_btn_ubahBarangActionPerformed

    private void btn_cariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariBarangActionPerformed
        // Menampung data textField/form pada variabel
        String kata_kunci = textField_cariBarang.getText();
        tampil_cari_barang(kata_kunci);
    }//GEN-LAST:event_btn_cariBarangActionPerformed

    private void btn_tambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahBarangActionPerformed
        // Tambah Barang
        try {
            //  int kode_barang = Integer.parseInt(textField_kodeBarang.getText());
            String nama_barang = textField_namaBarang.getText();
            String jenis_barang = textField_jenisBarang.getText();
            int stok = Integer.parseInt(textField_stok.getText());
            
            String Qsql = "INSERT INTO `barang` (`nama`, `jenis`, `jumlah`) VALUES ('"+nama_barang+"', '"+jenis_barang+"', "+stok+")";
            java.sql.Connection C = (Connection)koneksi_database.configDB(); // Memanggil fungsi koneksi DB
            java.sql.PreparedStatement s = C.prepareStatement(Qsql); // Mengirimkan parameter
            s.execute(); // Eksekusi SQL
            
            JOptionPane.showMessageDialog(null, "Berhasil Memasukan Data.."); 
            tampil_table_barang();
            
            // Membersihkan form
            textField_kodeBarang.setText("");
            textField_namaBarang.setText("");
            textField_jenisBarang.setText("");
            textField_stok.setText("");
            
        } catch (NumberFormatException | SQLException se) {
            
            JOptionPane.showMessageDialog(null, "Gagal Memasukan Data.."); 
            JOptionPane.showMessageDialog(this, se.getMessage());
            
        }
    }//GEN-LAST:event_btn_tambahBarangActionPerformed

    private void btn_kosongkanFormBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kosongkanFormBarangActionPerformed
        
        // Membersihkan form
            textField_kodeBarang.setText("");
            textField_namaBarang.setText("");
            textField_jenisBarang.setText("");
            textField_stok.setText("");
        
    }//GEN-LAST:event_btn_kosongkanFormBarangActionPerformed

    private void btn_showAllBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showAllBarangActionPerformed
        // TODO add your handling code here:
        tampil_table_barang();
    }//GEN-LAST:event_btn_showAllBarangActionPerformed

        
        
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
    private javax.swing.JButton btn_cariBarang;
    private javax.swing.JButton btn_hapusBarang;
    private javax.swing.JButton btn_kosongkanFormBarang;
    private javax.swing.JButton btn_showAllBarang;
    private javax.swing.JButton btn_tambahBarang;
    private javax.swing.JButton btn_ubahBarang;
    private javax.swing.JMenu homemenu;
    private javax.swing.JPanel homepage;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenu karyawanmenu;
    private javax.swing.JPanel karyawanpage;
    private javax.swing.JLabel label_jenisBarang;
    private javax.swing.JLabel label_kodeBarang;
    private javax.swing.JLabel label_namaBarang;
    private javax.swing.JLabel label_stok;
    private javax.swing.JMenu peminjamanmenu;
    private javax.swing.JPanel peminjamanpage;
    private javax.swing.JTable tabel_barang;
    private javax.swing.JTextField textField_cariBarang;
    private javax.swing.JTextField textField_jenisBarang;
    private javax.swing.JTextField textField_kodeBarang;
    private javax.swing.JTextField textField_namaBarang;
    private javax.swing.JTextField textField_stok;
    // End of variables declaration//GEN-END:variables
}
