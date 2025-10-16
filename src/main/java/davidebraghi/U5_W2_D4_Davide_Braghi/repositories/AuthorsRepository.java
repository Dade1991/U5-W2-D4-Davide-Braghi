package davidebraghi.U5_W2_D4_Davide_Braghi.repositories;

import davidebraghi.U5_W2_D4_Davide_Braghi.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findByEmail(String email);
}
