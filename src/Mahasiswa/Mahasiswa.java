package Mahasiswa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Mahasiswa extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox tanggal;
    private JComboBox bulan;
    private JComboBox tahun;
    private JButton proses;
    private JTextArea Nama;
    private JTextArea Tanggallahir;
    private JTextArea Usia;
    private JTextArea Alamat;


    public Mahasiswa () {
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        proses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField1.getText();
                int tlTanggal = Integer.parseInt((String) tanggal.getSelectedItem());
                int tlBulan = bulan.getSelectedIndex() + 1;
                int tlTahun = Integer.parseInt ((String) tahun.getSelectedItem());
                String alamat = textField2.getText();

                Nama.setText("Nama          :" + " " + nama);
                Tanggallahir.setText("Tanggal Lahir           :" + " " + tlTanggal + " " + bulan.getSelectedItem() + " " + tlTahun);
                Alamat.setText("Alamat          :" + " " + alamat);

                LocalDate birthdate = LocalDate.of(tlTahun, tlBulan, tlTanggal);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();

                Usia.setText("Usia          :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }
        });
    }

    public static void main(String[] args) {
        Mahasiswa Mahasiswa= new Mahasiswa();
        Mahasiswa.setVisible(true);
    }
}
