package com.example.restControlleur;

import com.example.Service.ISkier;

import com.example.entities.Skieur;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class SkieurRestControlleur {
    private ISkier iSkier;

    @PostMapping("/addSk")
    public Skieur addSk(@RequestBody Skieur sk){
       return iSkier.addSkieur(sk);
    }
    @PutMapping ("/updateSk")
    public Skieur updateSk(@RequestBody Skieur sk){
        return iSkier.updateSkieur(sk);
    }
    @GetMapping  ("/getllSk")
    public List<Skieur> getAllSk(@RequestBody Skieur sk){
        return iSkier.getAllSkieur();
    }
    @GetMapping  ("/getsk/{numsk}")
    public Skieur getByIdsk(@PathVariable long numsk){
        return iSkier.getSkById(numsk);
    }
    @DeleteMapping  ("/deletesk/{numsk}")
    public void deleteById(@PathVariable long numsk){
        iSkier.deleteSkieur(numsk);
    }
}
