/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

 
public class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            sendEmail(profile.getEmail(), message);
        }
    }

    private void sendEmail(String email, String message) {
        // Lógica simulada para enviar correos
        System.out.println("Enviando mensaje a " + email + ": " + message);
    }
}