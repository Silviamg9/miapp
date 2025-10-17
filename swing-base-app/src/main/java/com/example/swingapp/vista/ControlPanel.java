package com.example.swingapp.vista;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
	public JButton btnRun, btnClear, btnExit, btnDate, btnCurl;
	public JTextField txtUrl;

    public ControlPanel() {
        // grid con 6 filas (una por botón)
        setLayout(new GridLayout(6, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        txtUrl = new JTextField ("https://example.com");
        txtUrl.setForeground(new Color(255, 255, 255));
        txtUrl.setBackground(new Color(0, 0, 0));
        btnDate  = new JButton("📅 Fecha");
        btnDate.setForeground(new Color(139, 0, 139));
        btnDate.setBackground(new Color(98, 160, 234));
        btnCurl = new JButton("🌐 Consultar");
        btnCurl.setForeground(new Color(255, 255, 255));
        btnCurl.setBackground(SystemColor.desktop);
        btnRun   = new JButton("▶ Ejecutar");
        btnRun.setForeground(Color.RED);
        btnRun.setBackground(new Color(111, 229, 158));
        btnClear = new JButton("🧹 Limpiar");
        btnClear.setBackground(SystemColor.info);
        btnExit  = new JButton("🚪 Salir");
        btnExit.setForeground(new Color(99, 69, 44));

        add(txtUrl);
        add(btnDate);
        add(btnCurl);
        add(btnRun);
        add(btnClear);
        add(btnExit);
    }
}