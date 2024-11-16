package com.AOGIRI.API_Rest.DAO;

import com.AOGIRI.API_Rest.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
