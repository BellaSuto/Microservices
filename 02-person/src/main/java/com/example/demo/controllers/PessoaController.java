<<<<<<< HEAD
package com.example.demo.controllers;

import com.example.demo.models.Pessoa;
import com.example.demo.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pessoa> findAll() {
        return pessoaService.findAll();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa findById(@PathVariable("id") String id) {
        return pessoaService.findById(id);

    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return pessoaService.create(pessoa);
    }

    @RequestMapping(method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa update(@RequestBody Pessoa pessoa) {
        return pessoaService.update(pessoa);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        pessoaService.delete(id);
    }
}
=======
package com.example.demo.controllers;

import com.example.demo.models.Pessoa;
import com.example.demo.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pessoa> findAll() {
        return pessoaService.findAll();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa findById(@PathVariable("id") String id) {
        return pessoaService.findById(id);

    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return pessoaService.create(pessoa);
    }

    @RequestMapping(method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa update(@RequestBody Pessoa pessoa) {
        return pessoaService.update(pessoa);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        pessoaService.delete(id);
    }
}
>>>>>>> db142fbfb68cd0a7637f1f704eaa863658e9a734
