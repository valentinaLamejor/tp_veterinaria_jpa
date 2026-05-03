package veterinaria_tp_jpa.demo2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import veterinaria_tp_jpa.demo2.Model.Cliente;
import veterinaria_tp_jpa.demo2.Repository.ClienteRepository;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    @GetMapping
    public List<Cliente> obtenerTodos(){
        return clienteRepository.findAll();
    }
}
