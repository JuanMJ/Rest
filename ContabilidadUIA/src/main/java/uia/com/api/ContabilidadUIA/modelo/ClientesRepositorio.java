package uia.com.api.ContabilidadUIA.modelo;

import java.util.ArrayList;

import uia.com.api.ContabilidadUIA.modelo.clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.gestor.DecoradorProveedores;
import uia.com.api.ContabilidadUIA.modelo.gestor.Gestor;
import uia.com.api.ContabilidadUIA.modelo.proveedores.Proveedor;


public class ClientesRepositorio {
		
	    public Gestor contabilidad =  null;
		public DecoradorProveedores gestorProveedores = null;		
		public ArrayList<InfoUIA> listaProveedores = null;
		public ArrayList<InfoUIA> listaCuentas = null;
		public ArrayList<InfoUIA> listaCompras = null;
		public Proveedor proveedor = null;
		public String clienteId="";

		public ClientesRepositorio()
		{
		 contabilidad = new Gestor("C:\\TSU-UIA\\2021-P\\GitHubWeb\\ContabilidadUIA-web\\ListaProveedores.json");		
		 gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");		 
		 gestorProveedores.Print();
		 listaProveedores = gestorProveedores.getLista();
		}
		
		
		public ArrayList<InfoUIA> getListaProveedores(String clienteName) {
			return listaProveedores;
		}

		public ArrayList<InfoUIA> getListaProveedores() {
			return listaProveedores;
		}


		public void setListaProveedores(ArrayList<InfoUIA> listaProveedores) {
			this.listaProveedores = listaProveedores;
		}


		public DecoradorProveedores getGestorProveedores() {
			return gestorProveedores;
		}

		public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
			this.gestorProveedores = gestorProveedores;
		}


		public InfoUIA getClienteById(String clienteId) {
			// TODO Auto-generated method stub
			return null;
		}


		public void borraCliente(String clienteId) {
			// TODO Auto-generated method stub
			
		}


		public ArrayList<InfoUIA> getAllClientes() {
			// TODO Auto-generated method stub
			return null;
		}


		public void checkCliente(InfoUIA cliente) {
			// TODO Auto-generated method stub
			
		}


		public ArrayList<InfoUIA> getCuentas(String clienteName) 
		{
			this.listaCuentas = proveedor.getListaCuentas();
			return this.listaCuentas;
		}


		public ArrayList<InfoUIA> getCompras(String clienteId) {
			this.clienteId = clienteId;
			proveedor = (Proveedor) this.gestorProveedores.busca(clienteId);
			listaCompras = proveedor.getLista();
			this.getCuentas(clienteId);
			return listaCompras;
		}

		public ArrayList<InfoUIA> getListaCompras(String clienteId) {
			this.clienteId = clienteId;
			getCompras(this.clienteId);
			return listaCompras;
		}

		public ArrayList<InfoUIA> getListaCompras() {
			return listaCompras;
		}

		public ArrayList<InfoUIA> getListaCuentas() {
			return listaCuentas;
		}
		
		
		public ArrayList<InfoUIA> getCheques(String clienteId2) {
			// TODO Auto-generated method stub
			return null;
		}
}
