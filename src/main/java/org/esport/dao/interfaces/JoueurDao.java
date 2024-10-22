package org.esport.dao.interfaces;

import org.esport.model.Joueur;
import java.util.List;
import java.util.Optional;

public interface JoueurDao {
    Joueur inscrire(Joueur joueur);

    Joueur modifier(Joueur joueur);

    void supprimer(Long id);

    Optional<Joueur> trouverParId(Long id);

    List<Joueur> trouverTous();

    List<Joueur> trouverParEquipe(Long equipeId);

    boolean existeParPseudo(String pseudo);

    Optional<Joueur> trouverParPseudo(String pseudo);
}
