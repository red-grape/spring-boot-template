package ir.redgrape.repo;

import org.springframework.data.repository.CrudRepository;
import ir.redgrape.model.entities.*;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonDataRepo extends  CrudRepository<CommonDataEntitiy,Long> {
}
