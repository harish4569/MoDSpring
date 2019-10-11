package mod.payments.repository;

import org.springframework.data.repository.CrudRepository;

import mod.payments.model.Payment;

public interface PaymentsRepository extends CrudRepository<Payment,Long> {

}
