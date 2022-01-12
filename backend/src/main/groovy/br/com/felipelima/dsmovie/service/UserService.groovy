package br.com.felipelima.dsmovie.service

import br.com.felipelima.dsmovie.model.User
import br.com.felipelima.dsmovie.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    UserRepository userRepository

    User findByEmail(String email) {
        return userRepository.findByEmail(email)
    }

}
