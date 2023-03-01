package kodlama.io.languagesUpdate.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.languagesUpdate.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language,Integer> {

}
