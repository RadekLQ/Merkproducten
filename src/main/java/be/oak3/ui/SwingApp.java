package be.oak3.ui;

import be.oak3.model.Data;
import be.oak3.model.Product;

import javax.swing.*;
import java.awt.*;

public class SwingApp extends JFrame {

    private JLabel lblTitel, lblResultaatInvoer, lblRestulaatButton;
    private JList<Product> lstProducten;
    private JButton btnResultaat;

    public SwingApp() {
        super("First Swing application");
        initComponents();
        layoutComponents();
        initListeners();
    }

    public static void main(String[] args) {
        new SwingApp();
    }

    private void initComponents() {
        setSize(700, 700);
        setLocation(100, 100);

        lblTitel = new JLabel("Swing application");
        lblResultaatInvoer = new JLabel();
        lblRestulaatButton = new JLabel();
        lstProducten = new JList<>();
        lstProducten.setListData(Data.artikels);

        btnResultaat = new JButton("Do iets!");

        setVisible(true);
    }

    private void layoutComponents() {
        add(lblTitel, BorderLayout.NORTH);
        add(lstProducten, BorderLayout.CENTER);
        JPanel southPanel = new JPanel();

        southPanel.add(btnResultaat);
        southPanel.add(lblRestulaatButton);
        southPanel.add(lblResultaatInvoer);

        add(southPanel, BorderLayout.SOUTH);
    }

    private void initListeners() {
        btnResultaat.addActionListener(e -> {
            lblRestulaatButton.setText("Ik heb iets gedaan!");
            lblResultaatInvoer.setText("Hello");
            lblResultaatInvoer.setBackground(Color.BLACK);
            lblRestulaatButton.setBackground(Color.CYAN);
        });
    }

}
