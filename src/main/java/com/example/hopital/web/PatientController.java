package com.example.hopital.web;


import com.example.hopital.entities.Patient;
import com.example.hopital.repository.PatientRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model, @RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue = "4") int size,
                        @RequestParam(name = "keyword",defaultValue = "") String keyword
                        ){
        Page<Patient> pagePatients=patientRepository.findByNomContains(keyword,PageRequest.of(page,size));
        model.addAttribute("listPatients",pagePatients.getContent());
       model.addAttribute("pages",new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",keyword);

        return "patients";
    }

    @GetMapping("/delete")
    public String delete(Long id,String keyword, int page){
        patientRepository.deleteById(id);
        return  "redirect:/index?page="+page+"&keyword="+keyword;
    }

    @GetMapping("/")
    public String home(){
        return  "redirect:/index";
    }

    @GetMapping("/formPatients")
    public String formPatients(Model model){
        model.addAttribute("patient",new Patient());
        return "formPatients";
    }

    @PostMapping(path="/save")
    public String save(Model model, @Valid Patient patient, BindingResult bindingResult,@RequestParam(defaultValue = "0") Long page,@RequestParam(defaultValue = "")String keyword ){
        if(bindingResult.hasErrors()) return "formPatients";
        patientRepository.save(patient);
        return  "redirect:/index?page="+page+"&keyword="+keyword;
    }

    @GetMapping("/editPatient")
    public String editPatient(Model model,Long id,String keyword, int page){
        Patient patient=patientRepository.findById(id).orElse(null);
        if(patient==null) throw  new RuntimeException("Patient introuvable");
        model.addAttribute("patient",patient);

        model.addAttribute("page",page);
        model.addAttribute("keyword",keyword);
        return "editPatient";
    }

}
