package arep.crudsystem.service;

import arep.crudsystem.model.Property;
import arep.crudsystem.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    // Obtener todas las propiedades con paginación
    public Page<Property> getAllProperties(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return propertyRepository.findAll(pageable);
    }

    // Buscar propiedades con filtros
    public Page<Property> searchProperties(String query, Double maxPrice, Double maxSize, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return propertyRepository.search(query, maxPrice, maxSize, pageable);
    }

    // Obtener una propiedad por ID
    public Optional<Property> getPropertyById(Long id) {
        return propertyRepository.findById(id);
    }

    // Crear una nueva propiedad
    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    // Actualizar una propiedad existente
    public Property updateProperty(Long id, Property propertyDetails) {
        Property property = propertyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Propiedad no encontrada"));
        property.setAddress(propertyDetails.getAddress());
        property.setPrice(propertyDetails.getPrice());
        property.setSize(propertyDetails.getSize());
        property.setDescription(propertyDetails.getDescription());
        return propertyRepository.save(property);
    }

    // Eliminar una propiedad
    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }
}