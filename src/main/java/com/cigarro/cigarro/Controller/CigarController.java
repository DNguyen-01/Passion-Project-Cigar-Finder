package com.cigarro.cigarro.Controller;

import com.cigarro.cigarro.Cigar.Cigar;
import com.cigarro.cigarro.Service.CigarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cigar-controller") // controller should be calling service
public class CigarController {

    @Autowired
    private CigarService cigarService;


    @GetMapping("/cigar")
    public Iterable<Cigar> getAllCigar(){
        return cigarService.findAll();
    }


    @RequestMapping(value = "/cigar/{id}", method = RequestMethod.GET)
    public Cigar getCigarById(@PathVariable Long id){
        return cigarService.getCigarById(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Cigar create(Cigar name){
        return cigarService.create(name);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Cigar update(@PathVariable Long id, @RequestBody Cigar cigar){
        return cigarService.update(id, cigar);
    }










//    private CigarService cigarService;
//
//    @Autowired
//    public CigarController(CigarService cigarService) {
//        this.cigarService = cigarService;
//    }
//
//    @Autowired
//    private BrandRepo cigarRepository;
//
//
//    @RequestMapping(method = RequestMethod.POST, value = "/create/{id}")
//    public ResponseEntity<Cigar> create(@RequestBody Cigar cigar) {
//        Cigar cigarInDatabase = cigarRepository.save(cigar);
//        ResponseEntity<Cigar> responseEntity = new ResponseEntity<>(cigarInDatabase, HttpStatus.CREATED);
//        return responseEntity;
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value ="/all")
//    public @ResponseBody Iterable<Cigar> getAllUsers() {
//        // This returns a JSON or XML with the users
//        return cigarRepository.findAll();
//    }

//    @RequestMapping(method = RequestMethod.GET, value = "/brand")
//    public ResponseEntity<List<Cigar>> read() {
//        Iterable<Cigar> iterable = cigarRepository.findAll();
//        List<Cigar> cigarList = new ArrayList<>();
//        for (Cigar cigar : iterable) {
//            cigarList.add(cigar);
//        }
//        return new ResponseEntity<>(cigarList, HttpStatus.OK);
//    }
}


