/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controllers.SocialController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author paul-
 */
public class SocialNetworkView {
    private SocialController controller;
    private JFrame frame;

    public SocialNetworkView(SocialController controller) {
        this.controller = controller;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Enviar Mensaje Red Social");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel label = new JLabel("ID del Perfil:");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        JTextField profileIdField = new JTextField(20);
        profileIdField.setBounds(100, 20, 165, 25);
        panel.add(profileIdField);

        JButton friendsButton = new JButton("Enviar a Amigos");
        friendsButton.setBounds(10, 80, 150, 25);
        panel.add(friendsButton);

        JButton coworkersButton = new JButton("Enviar a Colegas");
        coworkersButton.setBounds(10, 110, 150, 25);
        panel.add(coworkersButton);

        friendsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String profileId = profileIdField.getText();
                controller.sendSpamToFriends(profileId);
            }
        });

        coworkersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String profileId = profileIdField.getText();
                controller.sendSpamToCoworkers(profileId);
            }
        });
    }
}
