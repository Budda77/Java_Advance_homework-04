package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class CatalogServis {
	
private List<Catalog> listOfMagasine = new ArrayList<>();
	
	private static CatalogServis catalogServis;
	
	
	private CatalogServis() {}
	
	public static CatalogServis getCatalogServis() {
		if(catalogServis == null) {
			catalogServis = new CatalogServis();
		}
		return catalogServis;
	}
	
	public List<Catalog> getListOfClients(){
		return listOfMagasine;
	}
	
	public void saveCatalog(Catalog catalog) {
		listOfMagasine.add(catalog);
		}
	
	public Catalog getCatalog(String catalogName) {
		return listOfMagasine.stream().filter(item->item.getCatalogName().equals(catalogName)).findAny().orElse(null);
	}

}
