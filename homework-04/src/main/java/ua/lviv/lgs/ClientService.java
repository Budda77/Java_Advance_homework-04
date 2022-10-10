package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class ClientService {
	private List<Client> listOfClients = new ArrayList<>();
	
	private static ClientService clientService;
	
	
	private ClientService() {}
	
	public static ClientService getClientsService() {
		if(clientService == null) {
			clientService = new ClientService();
		}
		return clientService;
	}
	
	public List<Client> getListOfClients(){
		return listOfClients;
	}
	
	public void saveClient(Client client) {
		listOfClients.add(client);
		}
	
	public Client getClients(String email) {
		return listOfClients.stream().filter(user->user.getEmail().equals(email)).findAny().orElse(null);
	}

}
