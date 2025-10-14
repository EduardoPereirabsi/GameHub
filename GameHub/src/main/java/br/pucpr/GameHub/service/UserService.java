package br.pucpr.GameHub.service;

import br.pucpr.GameHub.Repository.UserRepository;
import br.pucpr.GameHub.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //LISTAR
    public List<User> getAll() {
        return userRepository.findAll();
    }
    //CRIAR
    public User save(User user) {
        return userRepository.save(user);
    }
    //DELETAR
    public void delete(Long id)  {
        userRepository.deleteById(id);
    }

}
