package be.oak3.ui;

import be.oak3.model.Data;
import be.oak3.model.Product;
import be.oak3.persistance.Bestelling;
import be.oak3.persistance.BestellingImpl;

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

        BestellingImpl bestelling = new BestellingImpl() ;
        bestelling.sorteer();

        lstProducten.setListData(bestelling.getProducten().toArray(new Product[0]));
        lstProducten.setListData(bestelling.lijstVanParfums().toArray(new Product[0]));

        bestelling.sorteerOpMerk();

        bestelling.sorteerOpVolume();


        btnResultaat = new JButton("Do iets!");

        setVisible(true);
    }

    private void layoutComponents() {
        setLayout(new FlowLayout());
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
            lblResultaatInvoer.setOpaque(true);
            lblRestulaatButton.setOpaque(true);
            lblResultaatInvoer.setBackground(Color.BLUE);
            lblRestulaatButton.setBackground(Color.CYAN);
        });
    }

}
