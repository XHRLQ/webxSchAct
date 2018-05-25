package com.luoqing.learning.app1.resource;

import com.luoqing.learning.app1.model.Client;

import java.util.List;

public interface ClientMapper {
    public int insertClient(Client client);

    public int updateClient(Client client);

    public int deleteClient(Client client);

    public Client selectClientByEmail(String email);

    public Client selectClientById(long id);

    public Client selectOriginClient(Client client);

    public List<Client> selectClients();
}
