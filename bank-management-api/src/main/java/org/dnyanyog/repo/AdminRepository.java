package org.dnyanyog.repo;

import java.util.List;
import org.dnyanyog.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

  List<Admin> findByAdminIdAndPassword(String adminId, String password);
}
