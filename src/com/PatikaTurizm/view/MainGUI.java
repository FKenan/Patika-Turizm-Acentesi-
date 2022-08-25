package com.PatikaTurizm.view;

import com.PatikaTurizm.Helper.Config;
import com.PatikaTurizm.Helper.Helper;
import com.PatikaTurizm.model.Otel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainGUI extends JFrame {
    private JPanel wrapper;
    private JPanel pnl_main_top;
    private JTable tbl_otel_list;
    private JScrollPane scrl_otel_list;

    private DefaultTableModel mdl_otel_list;
    private Object[] row_otel_list;

    public MainGUI() {
        add(wrapper);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(Helper.screenCenter("x", getSize()), Helper.screenCenter("y", getSize()));
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        // tbl_otel_list
        mdl_otel_list = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Object[] col_otel_list = {"Otel ID","Otel Adı", "Adres", "E-Posta", "Telefon", "Yıldız"};
        mdl_otel_list.setColumnIdentifiers(col_otel_list);
        row_otel_list = new Object[col_otel_list.length];

        tbl_otel_list.setModel(mdl_otel_list);

        tbl_otel_list.getColumnModel().getColumn(5).setMaxWidth(50);
        tbl_otel_list.getColumnModel().getColumn(4).setMaxWidth(100);
        tbl_otel_list.getColumnModel().getColumn(0).setMaxWidth(50);

        tbl_otel_list.getTableHeader().setReorderingAllowed(false);
        load_otel_list();
        // ## tbl_otel_list

    }

    private void load_otel_list() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_otel_list.getModel();
        clearModel.setRowCount(0);
        int i;

        for (Otel o : Otel.getList()) {
            i = 0;
            row_otel_list[i++] = o.getOtel_id();
            row_otel_list[i++] = o.getOtel_adi();
            row_otel_list[i++] = o.getAdres();
            row_otel_list[i++] = o.getEposta();
            row_otel_list[i++] = o.getTelefon();
            row_otel_list[i] = o.getYildiz();

            mdl_otel_list.addRow(row_otel_list);
        }
    }

    public static void main(String[] args) {
        Helper.setLayout();
        MainGUI mainGUI = new MainGUI();
    }
}

