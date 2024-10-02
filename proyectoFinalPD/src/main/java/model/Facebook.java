/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author paul-
 */
public class Facebook implements SocialNetwork {
    // Método para crear un iterador de amigos
    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    // Método para crear un iterador de compañeros de trabajo
    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }

    // Método simulado que obtiene perfiles de la red social
public List<Profile> socialGraphRequest(String profileId, String type) {
    if (profileId.equals("123")) {
        if (type.equals("friends")) {
            return List.of(new Profile("John Doe", "john@example.com"),
                           new Profile("Jane Smith", "jane@example.com"));
        } else if (type.equals("coworkers")) {
            return List.of(new Profile("Alice Brown", "alice@company.com"));
        }
    } else if (profileId.equals("456")) {
        if (type.equals("friends")) {
            return List.of(new Profile("Emily White", "emily@example.com"));
        } else if (type.equals("coworkers")) {
            return List.of(new Profile("David Black", "david@company.com"));
        }
    }
    return List.of(); // Retorna una lista vacía si no se encuentra el perfil
}
}
