package Reto3.Reto3.repositorios.CRUD;

import Reto3.Reto3.entidades.Message;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryCrudMessage extends CrudRepository<Message,Integer> {
}
