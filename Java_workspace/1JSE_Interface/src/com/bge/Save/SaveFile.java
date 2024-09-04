package com.bge.Save;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.bge.InterfaceEntity.Vendable;


public class SaveFile {
	
	File file = new File("save the file");

	public void save(Vendable[] vends) throws IOException{ // vends is the array in the main 
		FileWriter fw = new FileWriter("vends.txt");
		for (Vendable ve : vends) {
			//fw.write(ve.toString());
			fw.write(ve.getId() + "\t" + ve.getPrice() + "\t " + ve.getDesc());
		}
		fw.close();
	}
}
