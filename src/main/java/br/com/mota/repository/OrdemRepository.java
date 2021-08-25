package br.com.mota.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import br.com.mota.model.Ordem;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrdemRepository implements PanacheRepository<Ordem> {
}
