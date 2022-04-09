package arreglo_clases;

import clases_padres.Ventas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Arreglo_Ventas {
    private ArrayList<Ventas> ven;
    public Arreglo_Ventas(){
        ven = new ArrayList<Ventas>();
        try{
            BufferedReader lec= new BufferedReader(new FileReader("Ventas.txt"));
		String x,nroBoleta, idArticulo, medida, material;
                double peso, montoAmortiguado;
                int cantidad;
                String nombre, apellido, dni;
		while((x=lec.readLine())!=null){
			String[] archivo=x.split(",");
                        nroBoleta=archivo[0];
			idArticulo=archivo[1];
			medida=archivo[2];
			material=archivo[3];
                        peso=Double.parseDouble(archivo[4]);
                        montoAmortiguado=Double.parseDouble(archivo[5]);
			cantidad=Integer.parseInt(archivo[6]);
                        nombre=archivo[7];
                        apellido=archivo[8];
                        dni=archivo[9];
			adicionar(new Ventas(nroBoleta, idArticulo, medida, material, peso, montoAmortiguado, cantidad, nombre, apellido, dni));
		}lec.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR EN LECTURA DE DATOS");
        }
    }
    
    public int tamaño(){
	return ven.size();
    }
    public Ventas obtener(int i){
            return ven.get(i);
    }
    public void adicionar(Ventas x){
            ven.add(x);
    }
    public void eliminar(Ventas x){
            ven.remove(x);
    }
}
