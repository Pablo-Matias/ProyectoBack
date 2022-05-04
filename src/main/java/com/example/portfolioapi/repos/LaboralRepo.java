

package com.example.portfolioapi.repos;

import com.example.portfolioapi.models.LaboralModel;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JLG
 */
@Repository
public interface LaboralRepo extends CrudRepository<LaboralModel, Integer> {

    public Optional<LaboralModel> findById(long id);

    public void deleteById(long id);
    
}
