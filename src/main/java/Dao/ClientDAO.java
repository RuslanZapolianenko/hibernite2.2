package Dao;

import java.util.List;
public interface ClientDAO<Client> {
    void addClient(Client client);

    List<Client > getAllClient ();

    Client getById(int id);

    void updateAge(int age, int id);

    void remove(String name);

}

