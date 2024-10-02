/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import model.*;

/**
 *
 * @author paul-
 */
public class SocialController {
    private SocialNetwork network;
    private SocialSpammer spammer;

    public SocialController(SocialNetwork network, SocialSpammer spammer) {
        this.network = network;
        this.spammer = spammer;
    }

    public void sendSpamToFriends(String profileId) {
        ProfileIterator iterator = network.createFriendsIterator(profileId);
        spammer.send(iterator, "Important message to friends!");
    }

    public void sendSpamToCoworkers(String profileId) {
        ProfileIterator iterator = network.createCoworkersIterator(profileId);
        spammer.send(iterator, "Important message to coworkers!");
    }
}
