package sistema.modelo;
/**
 *
 * @author manua
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class metodos {
    
        public static boolean InsertarUsuario(usuario x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    
    String sql="INSERT INTO USUARIO (NOMBRE,APELLIDO,CORREO,USUARIO,CONTRASEÑA) VALUES (?,?,?,?,?)";
    
    try{
        ps=cn.prepareStatement(sql);
        ps.setString(1, x.getNombre());
        ps.setString(2, x.getApellido());
        ps.setString(3, x.getCorreo());
        ps.setString(4, x.getUsuario());
        ps.setString(5, x.getContraseña());
        ps.execute();
        cn.close();
    return true;    
   
    }catch(SQLException e){
        System.out.println(e);
    }
    return false;
    }
    //AUTENTICACION DE LOGIN
    public static boolean Autenticacion(String Puser, String Ppass){
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    String sql="SELECT USER, PASS FROM USUARIO WHERE USER=? AND PASS=?";
    try{
        ps=cn.prepareStatement(sql);
        ps.setString(1, Puser);
        ps.setString(2, Ppass);
        rs=ps.executeQuery();
        
        while(rs.next()){
            cn.close();
            return true;
        }
        
    }catch(SQLException e){
        System.out.println(e);
    }  
            return false;
    }
    //CLIENTES
    public static boolean InsertarCliente(cliente x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    
    String sql="INSERT INTO CLIENTE (NOMBRE,APELLIDO,DOCUMENTO,DIRECCION,CORREO,TELEFONO,TIPODEPRODUCTO) VALUES (?,?,?,?,?,?,?,?,?)";
    
    try{
        ps=cn.prepareStatement(sql);
        ps.setString(1, x.getNombre());
        ps.setString(2, x.getApellido());
        ps.setString(3, x.getDocumento());
        ps.setString(4, x.getDireccion());
        ps.setString(5, x.getCorreo());
        ps.setString(6, x.getTelefono());
        ps.setString(7, x.getTipo_de_producto());

        ps.execute();
        cn.close();
    return true;    
   
    }catch(SQLException e){
        System.out.println(e);
    }
    return false;
    }
    
    public static boolean BuscarCliente(cliente x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    ResultSet rs=null;

    String sql="SELECT * FROM CLIENTE WHERE DOCUMENTO=?";
    
    try{
        ps = cn.prepareStatement(sql);
        ps.setString(1,x.getDocumento());
        rs=ps.executeQuery();
    if(rs.next()){
        x.setNombre(rs.getString("nombre"));
        x.setApellido(rs.getString("apellido"));
        x.setDireccion(rs.getString("direccion"));
        x.setCorreo(rs.getString("correo"));
        x.setTelefono(rs.getString("telefono"));
        x.setTipo_de_producto(rs.getString("tipo"));

        return true;
    } return false; 
    
    }catch(SQLException e){
        System.out.println(e);
    }
    return false;
    }
    
    public static boolean EliminarCliente(cliente x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;

    String sql="DELETE FROM CLIENTE WHERE DOCUMENTO=?";
    
    try{
        ps = cn.prepareStatement(sql);
        ps.setString(1,x.getDocumento());
        ps.execute();
        return true;
    }
   
    catch(SQLException e){
        System.out.println(e);
    }
return false;
    }
    
    public static boolean ModificarCliente(cliente x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;

    String sql="UPDATE CLIENTE SET NOMBRE=?, APELLIDO=?, DIRECCION=?, CORREO=?, TELEFONO=?, TIPO=?,WHERE DOCUMENTO=?";
    
    try{
        ps = cn.prepareStatement(sql);

        ps.setString(1,x.getNombre());
        ps.setString(2,x.getApellido());
        ps.setString(3,x.getDireccion());
        ps.setString(4,x.getCorreo());
        ps.setString(5,x.getTelefono());
        ps.setString(6,x.getTipo_de_producto());
        ps.setString(9,x.getDocumento());
        ps.execute();
        return true;
    }
   
    catch(SQLException e){
        System.out.println(e);
    }
return false;
    }
    
    //PROVEEDORES
    public static boolean InsertarProveedor(proveedor x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    
    String sql="INSERT INTO PROVEEDOR (NOMBRE,APELLIDO,DOCUMENTO,DIRECCION,CORREO,TELEFONO,TIPO,OBSERVACION) VALUES (?,?,?,?,?,?,?,?,?)";
    
    try{
        ps=cn.prepareStatement(sql);
        ps.setString(1, x.getNombre());
        ps.setString(2, x.getApellido());
        ps.setString(3, x.getDocumento());
        ps.setString(4, x.getDireccion());
        ps.setString(5, x.getCorreo());
        ps.setString(6, x.getTelefono());
        ps.setString(7, x.getTipo_producto());;
        ps.setString(9, x.getObservacion());
        ps.execute();
        cn.close();
    return true;    
   
    }catch(SQLException e){
        System.out.println(e);
    }
    return false;
    }
    
    public static boolean BuscarProveedor(proveedor x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    ResultSet rs=null;

    String sql="SELECT * FROM PROVEEDOR WHERE DNI=?";
    
    try{
        ps = cn.prepareStatement(sql);
        ps.setString(1,x.getDocumento());
        rs=ps.executeQuery();
    if(rs.next()){
        x.setNombre(rs.getString("nombre"));
        x.setApellido(rs.getString("apellido"));
        x.setDireccion(rs.getString("direccion"));
        x.setCorreo(rs.getString("correo"));
        x.setTelefono(rs.getString("telefono"));
        x.setTipo_producto(rs.getString("tipo"));
        x.setObservacion(rs.getString("observacion"));
        return true;
    } return false; 
    
    }catch(SQLException e){
        System.out.println(e);
    }
    return false;
    }
    
    public static boolean EliminarProveedor(proveedor x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;

    String sql="DELETE FROM PROVEEDOR WHERE DNI=?";
    
    try{
        ps = cn.prepareStatement(sql);
        ps.setString(1,x.getDocumento());
        ps.execute();
        return true;
    }
   
    catch(SQLException e){
        System.out.println(e);
    }
return false;
    }
    
    public static boolean ModificarProveedor(proveedor x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;

    String sql="UPDATE PROVEEDOR SET NOMBRE=?, APELLIDO=?, DIRECCION=?, CORREO=?, TELEFONO=?, WHERE DOCUMENTO=?";
    
    try{
        ps = cn.prepareStatement(sql);

        ps.setString(1,x.getNombre());
        ps.setString(2,x.getApellido());
        ps.setString(3,x.getDireccion());
        ps.setString(4,x.getCorreo());
        ps.setString(5,x.getTelefono());
        ps.setString(6,x.getTipo_producto());
        ps.setString(7,x.getObservacion());
        ps.setString(8,x.getDocumento());
        ps.execute();
        return true;
    }
   
    catch(SQLException e){
        System.out.println(e);
    }
return false;
    }
    
    //PRODUCTOS
    public static boolean InsertarProducto(producto x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    
    String sql="INSERT INTO PRODUCTO (ID,,TIPO,COSTOCOMP,COSTOVENT) VALUES (?,?,?,?,?,?)";
    
    try{
        ps=cn.prepareStatement(sql);
        ps.setInt(1, x.getId());
        ps.setString(2, x.getTipo());
        ps.setInt(3, x.getCostocomp());
        ps.setInt(4, x.getCostovent());
     
        ps.execute();
        cn.close();
    return true;    
   
    }catch(SQLException e){
        System.out.println(e);
    }
    return false;
    }

    public static boolean BuscarProducto(producto x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    ResultSet rs=null;

    String sql="SELECT * FROM PRODUCTO WHERE ID=?";
    
    try{
        ps = cn.prepareStatement(sql);
        ps.setInt(1,x.getId());
        rs=ps.executeQuery();
    if(rs.next()){
        x.setTipo(rs.getString("tipo"));
        x.setCostocomp(rs.getInt("costocomp"));
        x.setCostovent(rs.getInt("costovent"));
        return true;
    } return false; 
    
    }catch(SQLException e){
        System.out.println(e);
    }
    return false;
    }

    public static boolean EliminarProducto(producto x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;

    String sql="DELETE FROM PRODUCTO WHERE ID=?";
    
    try{
        ps = cn.prepareStatement(sql);
        ps.setInt(1,x.getId());
        ps.execute();
        return true;
    }
   
    catch(SQLException e){
        System.out.println(e);
    }
return false;
    }

    public static boolean ModificarProducto(producto x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;

    String sql="UPDATE PRODUCTO SET TIPO=?, PRECIO_COMPRA=?, Costovent=?, WHERE ID=?";
    
    try{
        ps = cn.prepareStatement(sql);

        ps.setString(1,x.getTipo());
        ps.setInt(2,x.getCostocomp());
        ps.setInt(3,x.getCostovent());
        ps.setInt(4,x.getId());
        ps.execute();
        return true;
    }
   
    catch(SQLException e){
        System.out.println(e);
    }
return false;
    }  
    
    //VENTAS
    public static boolean CargarVenta(venta x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    
    String sql="INSERT INTO VENTA (DOC_CLIENTE,ID_PRODUCTO,CANTIDAD,TOTVENTA,FORMAPAGO) VALUES (?,?,?,?,?,?)";
    
    try{
        ps=cn.prepareStatement(sql);
        ps.setString(1, x.getDoc_cliente());
        ps.setInt(2, x.getId_producto());
        ps.setInt(3, x.getCantidad());
        ps.setInt(4, x.getTotventa());
        ps.setString(5, x.Formapago());

        
        ps.execute();
        cn.close();
    return true;    
   
    }catch(SQLException e){
        System.out.println(e);
    }
    return false;
    }

    public static boolean BuscarProducto_Venta(producto x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    ResultSet rs=null;

    String sql="SELECT * FROM PRODUCTO WHERE ID=?";
    
    try{
        ps = cn.prepareStatement(sql);
        ps.setInt(1,x.getId());
        rs=ps.executeQuery();
    if(rs.next()){
        x.setTipo(rs.getString("tipo"));
        x.setCostovent(rs.getInt("totventa"));
        return true;
    } return false; 
    
    }catch(SQLException e){
        System.out.println(e);
    }
    return false;
    }

    public static boolean BuscarCliente_Venta(cliente x){
    
    Connection cn=conexion.Conectar();
    PreparedStatement ps=null;
    ResultSet rs=null;

    String sql="SELECT * FROM CLIENTE WHERE DNI=?";
    
    try{
        ps = cn.prepareStatement(sql);
        ps.setString(1,x.getDocumento());
        rs=ps.executeQuery();
    if(rs.next()){
        x.setNombre(rs.getString("nombre"));
        x.setApellido(rs.getString("apellido"));
        x.setTelefono(rs.getString("telefono"));
        return true;
    } return false; 
    
    }catch(SQLException e){
        System.out.println(e);
    }
    return false;
    }    
}

