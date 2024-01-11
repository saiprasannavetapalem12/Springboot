package com.animal.Animals.controller;

import com.animal.Animals.model.Animal;
import com.animal.Animals.service.AnimalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/animals")
@AllArgsConstructor

public class AnimalController {

    private AnimalService animalService;

    @GetMapping("/getAllAnimals")
    public List<Animal> getAllAnimals()
    {
        return animalService.getAllAnimals();
    }
    @PostMapping("/addAnimal")
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }
    //findbyid
    //deletebyid
    //update the name by id
    @GetMapping("/getAnimal/{id}")
    public Optional<Animal> getAnimal(@PathVariable String id)
    {
        return animalService.getAnimal(id);

    }
    @DeleteMapping("/deleteAnimal/{id}")
    public void deleteAnimal(@PathVariable String id)
    {
        animalService.deleteAnimal(id);

    }
    @PutMapping("/updateAnimal/{id}")
    public Animal updateAnimal(@PathVariable String id,@RequestBody String name)
    {
        return animalService.updateAnimal(id,name);
    }
}


