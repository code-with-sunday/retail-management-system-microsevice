package com.ochefitech.inventoryservice;

import com.ochefitech.inventoryservice.model.Inventory;
import com.ochefitech.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone_13");
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iphone_13_RED");
			inventory1.setQuantity(200);

			Inventory inventory2 = new Inventory();
			inventory2.setSkuCode("iphone_13_WHITE");
			inventory2.setQuantity(300);


		};
	}
}
