package com.pinnoserv.portal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pinnoserv.portal.entity.DelinquencyModel;
import org.springframework.stereotype.Repository;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author mwendwakelvin
 */
@Repository
public interface DelinquencyRepository extends JpaRepository<DelinquencyModel, Long> {
//    Optional<DelinquencyModel> findByDeliquencyModelId(Integer id);

//    List<DelinquencyModel> findAllByProductIdFk(Integer productId);
}