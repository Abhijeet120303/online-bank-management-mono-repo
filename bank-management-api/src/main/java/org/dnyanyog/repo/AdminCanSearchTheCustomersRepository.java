package org.dnyanyog.repo;

import java.util.Optional;
import org.dnyanyog.entity.CustomerResgistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface AdminCanSearchTheCustomersRepository
    extends JpaRepository<CustomerResgistration, Long> {

  Optional<CustomerResgistration> findByCustomerId(Long CustomerId);

  Optional<CustomerResgistration> findByEmailId(String emailId);
}
