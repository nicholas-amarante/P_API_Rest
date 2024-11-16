package com.AOGIRI.API_Rest.controller;

import com.AOGIRI.API_Rest.DAO.IUsuario;
import com.AOGIRI.API_Rest.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;//Metodos insomnia: POST cria usuario, PUT atualiza usuario e DELETE para deletar

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuario dao;//O Autowired faz uma injeção automática dos métodos do Crudrepository através do dao

    @GetMapping
    public List<Usuario> listaUsuarios(){
        return (List<Usuario>) dao.findAll();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return dao.save(usuario);//como o Intellij resumiu

//        Usuario usuarioNovo=dao.save(usuario);//como foi feito no vídeo https://www.youtube.com/watch?v=ga3Fj47hBLU
//        return usuarioNovo;
    }

    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNovo=dao.save(usuario);
        return usuarioNovo;
    }

    @DeleteMapping("/{id}")
    public Optional<Usuario> deletarUsuario(@PathVariable Integer id){
        Optional<Usuario> usuario=dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }

}
