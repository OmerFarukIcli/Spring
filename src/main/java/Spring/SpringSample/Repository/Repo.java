package Spring.SpringSample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring.SpringSample.Model.Ulkeler;

public interface Repo extends JpaRepository<Ulkeler,Integer> {

}
