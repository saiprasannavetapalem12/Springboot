package com.animal.Animals.service;

import com.animal.Animals.dao.AnimalRepository;
import com.animal.Animals.model.Animal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AnimalService {

    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal addAnimal(Animal animal) {
        animal.setId(UUID.randomUUID().toString().substring(1,5));
        return animalRepository.save(animal);
    }

    public Optional<Animal> getAnimal(String id) {
        return animalRepository.findById(id);
    }

    public void deleteAnimal(String id)
    {
        animalRepository.deleteById(id);
    }

    public Animal updateAnimal(String id, String name)
    {
        Optional<Animal> animal=animalRepository.findById(id);

            Animal updated_name = animal.get();
            updated_name.setName(name);
            animalRepository.save(updated_name);
            return updated_name;




    }
}
