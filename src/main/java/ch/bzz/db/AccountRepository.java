package ch.bzz.db;
import org.springframework.data.jpa.repository.JpaRepository;

import ch.bzz.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    
}

