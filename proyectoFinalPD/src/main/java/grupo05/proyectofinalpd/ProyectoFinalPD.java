/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package grupo05.proyectofinalpd;

import model.*;
import controllers.*;
import view.*;

/**
 *
 * @author paul-
 */
public class ProyectoFinalPD {

    public static void main(String[] args) {
        SocialNetwork facebook = new Facebook();
        SocialSpammer spammer = new SocialSpammer();
        SocialController controller = new SocialController(facebook, spammer);

        // Lanzar la vista gráfica
        new SocialNetworkView(controller);
    }
}