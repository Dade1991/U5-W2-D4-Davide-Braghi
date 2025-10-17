package epicode.u5d9hw.repositories;

import epicode.u5d9hw.entities.Author;
import epicode.u5d9hw.entities.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogsRepository extends JpaRepository<Blogpost, Integer> {
	List<Blogpost> findByAuthor(Author author);
}
