package com.PatikaTurizm.view;

import com.PatikaTurizm.Helper.Config;
import com.PatikaTurizm.Helper.Helper;
import com.PatikaTurizm.model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame{
    private JPanel wrapper;
    private JPanel pnl_top;
    private JPanel pnl_bottom;
    private JTextField fld_kullanici_adi;
    private JTextField fld_sifre;
    private JButton btn_login;


    public LoginGUI(){
        add(wrapper);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(Helper.screenCenter("x",getSize()),Helper.screenCenter("y",getSize()));
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);


        btn_login.addActionListener(e -> {
            String kAdi = fld_kullanici_adi.getText();
            String sifre = fld_sifre.getText();

            if (Helper.isFieldEmpty(fld_kullanici_adi) || Helper.isFieldEmpty(fld_sifre)){
                Helper.showMsg("fill");
            } else{
                User user = User.getFetch(kAdi,sifre);
                if (user == null){
                    Helper.showMsg("Kullanıcı Bulunamadı");
                } else{
                    Helper.setLayout();
                    switch (user.getType()){
                        case "acente" -> new AcenteGUI(user);
                        case "otel" -> new OtelGUI(user);
                    }
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI lGUI = new LoginGUI();
    }
}
