package sistema.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sistema.modelo.cliente;
import sistema.modelo.metodos;
import sistema.modelo.producto;
import sistema.modelo.proveedor;
import sistema.modelo.usuario;
import sistema.modelo.venta;
import sistema.vista.Clientes;
import sistema.vista.LogIn;
import sistema.vista.Menu;
import sistema.vista.Producto;
import sistema.vista.Proveedor;
import sistema.vista.Ventas;
import sistema.vista.registroUsuario;

/**
 *
 * @author manua
 */
public class controlador implements ActionListener{

        //METODOS   
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

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public controlador(LogIn log,registroUsuario reg,usuario user,cliente cli,Clientes cr_cli,Menu m_pri,proveedor pro,Proveedor cr_pro,producto prod,Producto cr_prod, venta ven,Ventas v_ven){
    this.log=log;
    this.reg=reg;
    this.user=user;
    this.cli=cli;
    this.cr_cli=cr_cli;
    this.m_pri=m_pri;
    this.pro=pro;
    this.cr_pro=cr_pro;
    this.prod=prod;
    this.cr_prod=cr_prod;
    this.ven=ven;
    this.v_ven=v_ven;
    
    //registro de usuarios
    this.reg.btnRegistrar.addActionListener(this);
    this.reg.btnAtras.addActionListener(this);
    
    //login de usuarios
    this.log.btnIngresar.addActionListener(this);

    
    //menu principal
    this.m_pri.btnCliente.addActionListener(this);
    this.m_pri.btnProveedor.addActionListener(this);
    this.m_pri.btnProductos.addActionListener(this);
    this.m_pri.btnVenta.addActionListener(this);
       
    
    //Clientes
    this.cr_cli.btnInsertar.addActionListener(this);
    this.cr_cli.btnBuscar.addActionListener(this);
    this.cr_cli.btnEliminar.addActionListener(this);
    this.cr_cli.btnModificar.addActionListener(this);
    this.cr_cli.btnVolver.addActionListener(this);
    
    //Proveedor
    this.cr_pro.btnInsertar.addActionListener(this);
    this.cr_pro.btnBuscar.addActionListener(this);
    this.cr_pro.btnEliminar.addActionListener(this);
    this.cr_pro.btnModificar.addActionListener(this);
    this.cr_pro.btnVolver.addActionListener(this);
    
    //Producto
    this.cr_prod.btnInsertar.addActionListener(this);
    this.cr_prod.btnBuscar.addActionListener(this);
    this.cr_prod.btnEliminar.addActionListener(this);
    this.cr_prod.btnModificar.addActionListener(this);
    this.cr_prod.btnVolver.addActionListener(this);
    
    //Vista Venta
    this.v_ven.btnVaciar.addActionListener(this);
    this.v_ven.btnAtras.addActionListener(this);
    this.v_ven.btnCalcular.addActionListener(this);
    this.v_ven.btnCargar.addActionListener(this);
    this.v_ven.btnClientes.addActionListener(this);
    this.v_ven.btnProductos.addActionListener(this);
    }
    
    
    
}
