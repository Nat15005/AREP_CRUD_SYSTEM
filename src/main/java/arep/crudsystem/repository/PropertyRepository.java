package arep.crudsystem.repository;

import arep.crudsystem.model.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {

    // Metodo para buscar propiedades con paginación
    @Query("SELECT p FROM Property p WHERE " +
            "(:query IS NULL OR p.address LIKE %:query% OR p.description LIKE %:query%) AND " +
            "(:maxPrice IS NULL OR p.price <= :maxPrice) AND " +
            "(:maxSize IS NULL OR p.size <= :maxSize)")
    Page<Property> search(@Param("query") String query,
                          @Param("maxPrice") Double maxPrice,
                          @Param("maxSize") Double maxSize,
                          Pageable pageable);
}
