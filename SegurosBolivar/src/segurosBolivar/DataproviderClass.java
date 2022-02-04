package segurosBolivar;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import org.testng.annotations.DataProvider;

public class DataproviderClass {
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
		String file = "archivo.txt";
		ArrayList<String> arreglo = new ArrayList<String>();
		try {
			new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF8"));
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
			String linea;
			while((linea=in.readLine())!=null) {
				arreglo.add(linea);
			}
         }
	     catch(Exception e){
	        e.printStackTrace();
	     }
	     String[][] arregloDosDimensiones = new String[arreglo.size()][4];
	     for (int i =0 ; i< arreglo.size() ; i++)
			{
	    	 	for (int j = 0 ; j< 4 ; j ++)
	    	 	{
	    	 		String[] linea = arreglo.get(i).split(",");
					arregloDosDimensiones [ i][j] = linea[j] ;
				}
			}
		return  arregloDosDimensiones;
		}
}
