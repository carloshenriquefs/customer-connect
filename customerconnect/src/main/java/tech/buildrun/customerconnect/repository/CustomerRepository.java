package tech.buildrun.customerconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.customerconnect.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
