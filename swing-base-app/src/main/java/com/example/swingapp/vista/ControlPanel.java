package com.example.swingapp.vista;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
	public JButton btnRun, btnClear, btnExit, btnDate, btnCurl;
	public JTextField txtUrl;

    public ControlPanel() {
        // grid con 5 filas (una por botón)
        setLayout(new GridLayout(5, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        txtUrl = new JTextField ("https://example.com");
        btnDate  = new JButton("📅 Fecha");
        btnCurl = new JButton("🌐 Consultar");
        btnRun   = new JButton("▶ Ejecutar");
        btnClear = new JButton("🧹 Limpiar");
        btnExit  = new JButton("🚪 Salir");

        add(txtUrl);
        add(btnDate);
        add(btnCurl);
        add(btnRun);
        add(btnClear);
        add(btnExit);
    }
}