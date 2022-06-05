package inventaria;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class dashboard extends javax.swing.JFrame {
    javax.swing.Timer timer;
    public dashboard() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date date = new java.util.Date();
                DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                String time =timeFormat.format(date);
                jLabel5.setText(time);
                
                java.util.Date date1 = new java.util.Date();
                DateFormat timeFormat1 = new SimpleDateFormat("dd/MM/yyyy");
                String time1 =timeFormat1.format(date1);
                jLabel20.setText(time1);
            }
        };
        
        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        homepage = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
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
        nip_k = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nama_k = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_karyawan = new javax.swing.JTable();
        telp_k = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textField_carikaryawan = new javax.swing.JTextField();
        jabatan_k = new javax.swing.JTextField();
        btn_carikaryawan = new javax.swing.JButton();
        reset_form_k = new javax.swing.JButton();
        btn_hapus_k = new javax.swing.JButton();
        btn_ubah_k = new javax.swing.JButton();
        btn_tambah_k = new javax.swing.JButton();
        btn_showAllKaryawan = new javax.swing.JButton();
        peminjamanpage = new javax.swing.JPanel();
        jmlBarang = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        tglPinjam = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nipKaryawan = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelPinjam = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        namaBarang = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tglKembali = new javax.swing.JTextField();
        insertPinjam = new javax.swing.JButton();
        btnUpdatePinjam = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        deletePinjam = new javax.swing.JButton();
        txtIdPinjam = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        idPinjam = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKaryawan = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        homemenu = new javax.swing.JMenu();
        barangmenu = new javax.swing.JMenu();
        karyawanmenu = new javax.swing.JMenu();
        peminjamanmenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setLayout(new java.awt.CardLayout());

        homepage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel17.setText("MIFTAH");

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel16.setText("FATHONI");

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel15.setText("FADHLI");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel4.setText("DHAFIN R");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel3.setText("ALFIN");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setText("Dibuat Oleh Kelompok 2 :");

        jLabel20.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel20.setText("jLabel20");

        jLabel5.setFont(new java.awt.Font("Poppins Black", 0, 72)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO 21-9.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel18.setText("SANDI");

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel19.setText("APLIKASI INVENTARIS TERPERCAYA");

        javax.swing.GroupLayout homepageLayout = new javax.swing.GroupLayout(homepage);
        homepage.setLayout(homepageLayout);
        homepageLayout.setHorizontalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homepageLayout.createSequentialGroup()
                .addGap(0, 613, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(607, 607, 607))
            .addGroup(homepageLayout.createSequentialGroup()
                .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepageLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel5)))
                    .addGroup(homepageLayout.createSequentialGroup()
                        .addGap(704, 704, 704)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(homepageLayout.createSequentialGroup()
                        .addGap(742, 742, 742)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homepageLayout.setVerticalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepageLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        background.add(homepage, "card2");

        barangpage.setBackground(new java.awt.Color(255, 255, 255));

        tabel_barang.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
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
        tabel_barang.setSelectionBackground(new java.awt.Color(255, 134, 47));
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

        btn_cariBarang.setBackground(new java.awt.Color(255, 134, 47));
        btn_cariBarang.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btn_cariBarang.setForeground(new java.awt.Color(255, 255, 255));
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

        btn_kosongkanFormBarang.setBackground(new java.awt.Color(255, 134, 47));
        btn_kosongkanFormBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_kosongkanFormBarang.setForeground(new java.awt.Color(255, 255, 255));
        btn_kosongkanFormBarang.setText("Kosongkan");
        btn_kosongkanFormBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kosongkanFormBarangActionPerformed(evt);
            }
        });

        btn_hapusBarang.setBackground(new java.awt.Color(255, 134, 47));
        btn_hapusBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_hapusBarang.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapusBarang.setText("Hapus");
        btn_hapusBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusBarangActionPerformed(evt);
            }
        });

        btn_ubahBarang.setBackground(new java.awt.Color(255, 134, 47));
        btn_ubahBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ubahBarang.setForeground(new java.awt.Color(255, 255, 255));
        btn_ubahBarang.setText("Ubah");
        btn_ubahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahBarangActionPerformed(evt);
            }
        });

        btn_tambahBarang.setBackground(new java.awt.Color(255, 134, 47));
        btn_tambahBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_tambahBarang.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambahBarang.setText("Tambah");
        btn_tambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahBarangActionPerformed(evt);
            }
        });

        btn_showAllBarang.setBackground(new java.awt.Color(255, 134, 47));
        btn_showAllBarang.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btn_showAllBarang.setForeground(new java.awt.Color(255, 255, 255));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
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
        karyawanpage.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setText("NIP");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel7.setText("Nama ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel8.setText("No Telp");

        table_karyawan.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        table_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIP", "Nama", "No Telepon", "Jabatan"
            }
        ));
        table_karyawan.setSelectionBackground(new java.awt.Color(255, 134, 47));
        table_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_karyawanMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_karyawan);
        if (table_karyawan.getColumnModel().getColumnCount() > 0) {
            table_karyawan.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel9.setText("Jabatan");

        btn_carikaryawan.setBackground(new java.awt.Color(255, 134, 47));
        btn_carikaryawan.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btn_carikaryawan.setForeground(new java.awt.Color(255, 255, 255));
        btn_carikaryawan.setText("Cari");
        btn_carikaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carikaryawanActionPerformed(evt);
            }
        });

        reset_form_k.setBackground(new java.awt.Color(255, 134, 47));
        reset_form_k.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reset_form_k.setForeground(new java.awt.Color(255, 255, 255));
        reset_form_k.setText("Kosongkan");
        reset_form_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_form_kActionPerformed(evt);
            }
        });

        btn_hapus_k.setBackground(new java.awt.Color(255, 134, 47));
        btn_hapus_k.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_hapus_k.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus_k.setText("Hapus");
        btn_hapus_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus_kActionPerformed(evt);
            }
        });

        btn_ubah_k.setBackground(new java.awt.Color(255, 134, 47));
        btn_ubah_k.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ubah_k.setForeground(new java.awt.Color(255, 255, 255));
        btn_ubah_k.setText("Ubah");
        btn_ubah_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubah_kActionPerformed(evt);
            }
        });

        btn_tambah_k.setBackground(new java.awt.Color(255, 134, 47));
        btn_tambah_k.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_tambah_k.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah_k.setText("Tambah");
        btn_tambah_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_kActionPerformed(evt);
            }
        });

        btn_showAllKaryawan.setBackground(new java.awt.Color(255, 134, 47));
        btn_showAllKaryawan.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btn_showAllKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        btn_showAllKaryawan.setText("Tampilkan Semua Data");
        btn_showAllKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showAllKaryawanActionPerformed(evt);
            }
        });

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
                            .addComponent(nip_k, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(karyawanpageLayout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(nama_k, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(karyawanpageLayout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(telp_k, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(karyawanpageLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jabatan_k, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_tambah_k, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(karyawanpageLayout.createSequentialGroup()
                            .addComponent(btn_ubah_k, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_hapus_k, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(reset_form_k, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, karyawanpageLayout.createSequentialGroup()
                        .addComponent(btn_showAllKaryawan)
                        .addGap(42, 42, 42)
                        .addComponent(textField_carikaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_carikaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        karyawanpageLayout.setVerticalGroup(
            karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, karyawanpageLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_carikaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_carikaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_showAllKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(karyawanpageLayout.createSequentialGroup()
                        .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nip_k, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama_k, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telp_k, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jabatan_k, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(karyawanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ubah_k, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapus_k, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset_form_k, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_tambah_k, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );

        background.add(karyawanpage, "card4");

        peminjamanpage.setBackground(new java.awt.Color(255, 255, 255));

        jButton13.setBackground(new java.awt.Color(255, 134, 47));
        jButton13.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Cari");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel13.setText("Tgl Pinjam");

        tabelPinjam.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        tabelPinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "id barang", "jumlah", "nip_karyawan", "tgl_pinjam", "tgl_kembali"
            }
        ));
        tabelPinjam.setSelectionBackground(new java.awt.Color(255, 134, 47));
        tabelPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPinjamMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabelPinjam);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel12.setText("Karyawan");

        tblBarang.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBarang.setSelectionBackground(new java.awt.Color(255, 134, 47));
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel14.setText("Tgl Kembali");

        insertPinjam.setBackground(new java.awt.Color(255, 134, 47));
        insertPinjam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        insertPinjam.setForeground(new java.awt.Color(255, 255, 255));
        insertPinjam.setText("Tambah");
        insertPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPinjamActionPerformed(evt);
            }
        });

        btnUpdatePinjam.setBackground(new java.awt.Color(255, 134, 47));
        btnUpdatePinjam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdatePinjam.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdatePinjam.setText("Ubah");
        btnUpdatePinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePinjamActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel11.setText("Jumlah");

        deletePinjam.setBackground(new java.awt.Color(255, 134, 47));
        deletePinjam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deletePinjam.setForeground(new java.awt.Color(255, 255, 255));
        deletePinjam.setText("Hapus");
        deletePinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePinjamActionPerformed(evt);
            }
        });

        txtIdPinjam.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        txtIdPinjam.setText("Id Pinjam");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel10.setText("Nama Barang");

        btnReset.setBackground(new java.awt.Color(255, 134, 47));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Kosongkan");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tblKaryawan.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        tblKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIP", "Nama Karyawan", "No Telepon", "Jabatan"
            }
        ));
        tblKaryawan.setSelectionBackground(new java.awt.Color(255, 134, 47));
        tblKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKaryawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKaryawan);

        javax.swing.GroupLayout peminjamanpageLayout = new javax.swing.GroupLayout(peminjamanpage);
        peminjamanpage.setLayout(peminjamanpageLayout);
        peminjamanpageLayout.setHorizontalGroup(
            peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanpageLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanpageLayout.createSequentialGroup()
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanpageLayout.createSequentialGroup()
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
                                        .addComponent(jmlBarang, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(namaBarang, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idPinjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addGap(28, 28, 28)
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
                .addGap(44, 44, 44)
                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(peminjamanpageLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(peminjamanpageLayout.createSequentialGroup()
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(peminjamanpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jmlBarang)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(insertPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );

        background.add(peminjamanpage, "card5");

        jMenuBar1.setBackground(new java.awt.Color(255, 134, 47));
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
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
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
        tbm.addColumn("Stok");
        
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
    
    private void tampil_pinjam() {
        // Membuat object pada table
        DefaultTableModel tbp = new DefaultTableModel();
        tbp.addColumn("Id Pinjam");
        tbp.addColumn("Id barang");
        tbp.addColumn("Jumlah");
        tbp.addColumn("nip_karyawan");
        tbp.addColumn("Tgl pinjam");
        tbp.addColumn("Tgl kembali");
        
        try {
            // 1. Query
//            String query = "select pembelian.id, barang.nama, pembelian.jumlah, karyawan.nama, pembelian.tgl_pinjam, pembelian.tgl_kembali from pembelian inner join karyawan on karyawan.nip = pembelian.nip_karyawan inner join barang on barang.id = pembelian.id_barang;";
            String query = "SELECT * FROM peminjaman";
            
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
    
    private void tampil_barang_pinjam() {
        // Membuat object pada table
        DefaultTableModel tbm = new DefaultTableModel();
        tbm.addColumn("Kode Barang");
        tbm.addColumn("Nama Barang");
        tbm.addColumn("Jenis Barang");
        tbm.addColumn("Stok");
        
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
    
    private void tampil_karyawan_pinjam() {
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
        
        tampil_table_barang();
    }//GEN-LAST:event_barangmenuMouseClicked

    private void karyawanmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanmenuMouseClicked
        
        karyawanpage.setVisible(true);
        peminjamanpage.setVisible(false);
        homepage.setVisible(false);
        barangpage.setVisible(false);
        
        tampil_table_k();
    }//GEN-LAST:event_karyawanmenuMouseClicked

    private void peminjamanmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peminjamanmenuMouseClicked
        
        peminjamanpage.setVisible(true);
        homepage.setVisible(false);
        barangpage.setVisible(false);
        karyawanpage.setVisible(false);
        
        tampil_pinjam();
        tampil_barang_pinjam();
        tampil_karyawan_pinjam();
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

    private void btn_hapus_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus_kActionPerformed
        
        try {
        int nipk = Integer.parseInt(nip_k.getText());

        String Dsql = "DELETE FROM `karyawan` WHERE `nip` = '"+ nipk +"'";
        java.sql.Connection C = (Connection)koneksi_database.configDB(); 
        java.sql.PreparedStatement pst = C.prepareStatement(Dsql); 
        pst.execute(); 
        
        JOptionPane.showMessageDialog(null, "Data Karyawan dengan NIP: "+nipk + " Berhasil Dihapus");
        tampil_table_k();
        
        }catch(NumberFormatException | SQLException se){
            
            JOptionPane.showMessageDialog(null, "Gagal Menghapus Data.."); 
            JOptionPane.showMessageDialog(this, se.getMessage());
            
        }
        
    }//GEN-LAST:event_btn_hapus_kActionPerformed

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

    private void btn_tambah_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_kActionPerformed
        String nip = nip_k.getText();
        String nama = nama_k.getText();
        String telp = telp_k.getText();
        String jabatan = jabatan_k.getText();
        
        if(nip.equals("") || nama.equals("") ||telp.equals("") ||jabatan.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data Belum Lengkap bro");
        } else {
            try {
                String Vsql = "INSERT INTO karyawan VALUES ('" + nip + "', '" + nama +"', '" + telp +"', '" + jabatan +"');";

                java.sql.Connection vconn = (Connection)koneksi_database.configDB();

                java.sql.PreparedStatement pst = vconn.prepareStatement(Vsql);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
                        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Ditambah");
                JOptionPane.showMessageDialog(this, e.getMessage());
            };
        
        }
        
        
        tampil_table_k();
    }//GEN-LAST:event_btn_tambah_kActionPerformed

    private void table_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_karyawanMouseClicked
        
        int row = table_karyawan.rowAtPoint(evt.getPoint());
        
        // Membuat variabel untuk menampung data-data kolom dari baris yang terpilih
        String nip = table_karyawan.getValueAt(row, 0).toString();
        String nama = table_karyawan.getValueAt(row, 1).toString();
        String telp = table_karyawan.getValueAt(row, 2).toString();
        String jabatan = table_karyawan.getValueAt(row, 3).toString();
        
        nip_k.setText(nip);
        nama_k.setText(nama);
        telp_k.setText(telp);
        jabatan_k.setText(jabatan);
        
    }//GEN-LAST:event_table_karyawanMouseClicked

    private void btn_ubah_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubah_kActionPerformed
        
        try {
        int nipk = Integer.parseInt(nip_k.getText());
        String namak = nama_k.getText();
        String telpk = telp_k.getText();
        String jabatank = jabatan_k.getText();
            
        String Usql = "UPDATE `karyawan` SET `nip`='"+nipk+"',`nama`='"+namak+"',`no_telp`='"+telpk+"',`jabatan`='"+jabatank+"' WHERE `nip` = '"+nipk+"'";
        java.sql.Connection C = (Connection)koneksi_database.configDB(); //Mengambil fungsi koneksi DB dari koneksi_database.java
        java.sql.PreparedStatement pst = C.prepareStatement(Usql); //Mengirimkan Parameter
        pst.execute(); //Eksekusi SQL
        
        JOptionPane.showMessageDialog(null, "Data Karyawan dengan NIP: "+nipk + " Berhasil Diubah");
        tampil_table_k();
        
        }catch(NumberFormatException | SQLException se){
            
            JOptionPane.showMessageDialog(null, "Gagal Mengubah Data.."); 
            JOptionPane.showMessageDialog(this, se.getMessage());
            
        }
        
    }//GEN-LAST:event_btn_ubah_kActionPerformed

    private void btn_carikaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carikaryawanActionPerformed
        
        String keyword = textField_carikaryawan.getText();
        tampil_cari_karyawan(keyword);
        
    }//GEN-LAST:event_btn_carikaryawanActionPerformed

    private void reset_form_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_form_kActionPerformed
        nip_k.setText("");
        nama_k.setText("");
        telp_k.setText("");
        jabatan_k.setText("");
    }//GEN-LAST:event_reset_form_kActionPerformed

    private void btn_showAllKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showAllKaryawanActionPerformed
        
        tampil_table_k();
        
    }//GEN-LAST:event_btn_showAllKaryawanActionPerformed

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
            String sql = "INSERT INTO peminjaman VALUES (null, "+id_brg+","+jml+","+nip+",'"+pinjam+"','" +kembali+"');";
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
            String Qsql = "UPDATE peminjaman SET id_barang = '"+id_brg+"', jumlah = '"+jml+"', nip_karyawan = '"+nip+"', tgl_pinjam ='"+tgl_p+"', tgl_kembali ='"+tgl_k+"' WHERE peminjaman.id = '"+id_pinjam+"';";
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

    private void deletePinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePinjamActionPerformed
        int id;

        id = Integer.valueOf(idPinjam.getText());
        // gimana cara dapetin id dari nama barang dalem combo box
        //        id = Integer.parseInt(namaBarang);
        try{
            String url="jdbc:mysql://localhost/inventaria"; //url database
            String user="root"; //User database
            String pass="";
            String sql = "DELETE FROM peminjaman WHERE id ="+ id +";";
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

    private void tblKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKaryawanMouseClicked
        // TODO add your handling code here:
        int baris = tblBarang.rowAtPoint(evt.getPoint());

        // Membuat variabel untuk menampung data-data kolom dari baris yang terpilih
        String nip = tblKaryawan.getValueAt(baris, 0).toString();

        nipKaryawan.setText(nip);
    }//GEN-LAST:event_tblKaryawanMouseClicked

        private void tampil_table_k(){
        DefaultTableModel tbk  = new DefaultTableModel ();
        tbk.addColumn("NIP");
        tbk.addColumn("Nama");
        tbk.addColumn("No Telepon");
        tbk.addColumn("Jabatan");
        
        try {
            String query = "SELECT * FROM karyawan";
                    
            java.sql.Connection vconn = (Connection)koneksi_database.configDB();
            
            java.sql.Statement s = vconn.createStatement();
            
            java.sql.ResultSet r = s.executeQuery(query);
            
            while (r.next()) {
                tbk.addRow(new Object[]{
                    r.getString(1), r.getString(2),  r.getString(3),  r.getString(4)
                });
            }
            
            table_karyawan.setModel(tbk);
                        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan data..");
        };
    }
    
    private void tampil_cari_karyawan(String keyword){
        DefaultTableModel tbk = new DefaultTableModel();
        tbk.addColumn("NIP");
        tbk.addColumn("Nama");
        tbk.addColumn("No. Telepon");
        tbk.addColumn("Jabatan");
        
        try {
            String query = "SELECT * FROM karyawan WHERE `nama` LIKE '%"+keyword+"%' OR `nip` LIKE '%"+keyword+"%'OR `no_telp` LIKE '%"+keyword+"%' OR `jabatan` LIKE '%"+keyword+"%'";
            
            java.sql.Connection vconn = (Connection)koneksi_database.configDB();
            
            java.sql.Statement s = vconn.createStatement();
            
            java.sql.ResultSet r = s.executeQuery(query);
            
            while (r.next()) {
                tbk.addRow(new Object[]{
                    r.getString(1), r.getString(2), r.getString(3), r.getString(4)
                });
            }
            // Memasukan data dari penampungan ke tabel
            table_karyawan.setModel(tbk);
            
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan data..");
        }
    }
    
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
    private javax.swing.JButton btn_cariBarang;
    private javax.swing.JButton btn_carikaryawan;
    private javax.swing.JButton btn_hapusBarang;
    private javax.swing.JButton btn_hapus_k;
    private javax.swing.JButton btn_kosongkanFormBarang;
    private javax.swing.JButton btn_showAllBarang;
    private javax.swing.JButton btn_showAllKaryawan;
    private javax.swing.JButton btn_tambahBarang;
    private javax.swing.JButton btn_tambah_k;
    private javax.swing.JButton btn_ubahBarang;
    private javax.swing.JButton btn_ubah_k;
    private javax.swing.JButton deletePinjam;
    private javax.swing.JMenu homemenu;
    private javax.swing.JPanel homepage;
    private javax.swing.JTextField idPinjam;
    private javax.swing.JButton insertPinjam;
    private javax.swing.JButton jButton13;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jabatan_k;
    private javax.swing.JTextField jmlBarang;
    private javax.swing.JMenu karyawanmenu;
    private javax.swing.JPanel karyawanpage;
    private javax.swing.JLabel label_jenisBarang;
    private javax.swing.JLabel label_kodeBarang;
    private javax.swing.JLabel label_namaBarang;
    private javax.swing.JLabel label_stok;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField nama_k;
    private javax.swing.JTextField nipKaryawan;
    private javax.swing.JTextField nip_k;
    private javax.swing.JMenu peminjamanmenu;
    private javax.swing.JPanel peminjamanpage;
    private javax.swing.JButton reset_form_k;
    private javax.swing.JTable tabelPinjam;
    private javax.swing.JTable tabel_barang;
    private javax.swing.JTable table_karyawan;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTable tblKaryawan;
    private javax.swing.JTextField telp_k;
    private javax.swing.JTextField textField_cariBarang;
    private javax.swing.JTextField textField_carikaryawan;
    private javax.swing.JTextField textField_jenisBarang;
    private javax.swing.JTextField textField_kodeBarang;
    private javax.swing.JTextField textField_namaBarang;
    private javax.swing.JTextField textField_stok;
    private javax.swing.JTextField tglKembali;
    private javax.swing.JTextField tglPinjam;
    private javax.swing.JLabel txtIdPinjam;
    // End of variables declaration//GEN-END:variables
}
