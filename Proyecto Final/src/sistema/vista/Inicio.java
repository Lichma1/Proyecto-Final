package sistema.vista;

import sistema.controlador.controlador;
import sistema.modelo.cliente;
import sistema.modelo.metodos;
import sistema.modelo.producto;
import sistema.modelo.proveedor;
import sistema.modelo.usuario;
import sistema.modelo.venta;

/**
 *
 * @author manua
 */
public class Inicio {
    
             metodos met=new metodos();
    
    //USUARIO,LOGIN Y REGISTROS 
    usuario user=new usuario();
    LogIn log=new LogIn();
    registroUsuario reg=new registroUsuario();
    
    //MENU PRINCIPAL 
    Menu m_pri=new Menu();
    
    //CLIENTE
    cliente cli=new cliente();
    Clientes cr_cli=new Clientes();
    
    //PROVEEDOR
    proveedor pro=new proveedor();
    Proveedor cr_pro=new Proveedor();
    
    //PRODUCTO
    producto prod=new producto();
    Producto cr_prod=new Producto();
    
    //VENTA
    venta ven=new venta();
    Ventas v_ven=new Ventas();
    
    controlador con = new controlador(log,reg,user,cli,cr_cli,m_pri,pro,cr_pro,prod,cr_prod,ven,v_ven);
    
        
}
