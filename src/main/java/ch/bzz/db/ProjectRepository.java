package ch.bzz.db;
import org.springframework.data.jpa.repository.JpaRepository;

import ch.bzz.model.Project;

public interface ProjectRepository extends JpaRepository<Project, String> {
    
}

