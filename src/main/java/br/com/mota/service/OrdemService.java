package br.com.mota.service;

import br.com.mota.repository.OrdemRepository;
import br.com.mota.model.Ordem;
import br.com.mota.model.Usuario;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.SecurityContext;
import java.util.List;
import java.util.Optional;

import static java.time.LocalDate.now;

@ApplicationScoped
public class OrdemService {

    @Inject
    OrdemRepository ordemRepository;

    public void inserir(SecurityContext securityContext, Ordem ordem) {
        Optional<Usuario> usuarioOptional = Usuario.findByIdOptional(ordem.getUserId());
        Usuario usuario = usuarioOptional.orElseThrow();
        if(!usuario.getUsername().equals(securityContext.getUserPrincipal().getName())){
            throw new RuntimeException("O usuário logado é diferente do userID");
        }
        ordem.setData(now());
        ordem.setStatus("ENVIADA");
        ordemRepository.persist(ordem);
    }

    public List<Ordem> listar() {
        return ordemRepository.listAll();
    }
}
