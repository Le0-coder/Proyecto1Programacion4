/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DAOmysql;

/**
 *
 * @author leosa
 */
import DAO.UserDAO;
import DAO.DAOexception;
import Model.UserModel;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class MysqlUserDAO implements UserDAO {
    
    final String Insert = "INSERT INTO user(id,tel,password,name,email,medioPago,rol) VALUES (?,?,?,?,?,?,?)";
    final String Update = "UPDATE user SET id = ? , tel = ? , password = ? , name = ? , email = ? , medioPago = ?, rol = ? WHERE id = ?";
    final String Delete = "DELETE FROM user WHERE id = ?";
    
    private Connection con;
    
    public MysqlUserDAO(Connection con) {
        this.con = con;
    }

    public MysqlUserDAO() {
    }
    
            
    @Override
    public void insert(UserModel u) throws DAOexception{
       PreparedStatement stat = null;
       
     //  Class.forName("com.mysql.jdbc.Driver");
       
         
        try {
              try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gestorPolizas?useSSL=false", "root", "Leosanpo16");

            stat = con.prepareStatement(Insert);
            stat.setString(1, u.getId());
            stat.setString(2,u.getTel());
            stat.setString(3, u.getPassword());
            stat.setString(4, u.getName());
            stat.setString(5, u.getEmail());
            stat.setString(6, u.getMedioPago());
            stat.setString(7, u.getRol());

            if (stat.executeUpdate() == 0) {
                throw new DAOexception("No se han guardado los datos correctamente");
            }

            System.out.println(stat);

        } catch (SQLException ex) {
            throw new DAOexception("Error SQL", ex);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    throw new DAOexception("Error SQL al cerrar el statement", ex);
                }
            }
        }
       
    }
    
    @Override
    public void modify(UserModel u){
        throw new UnsupportedOperationException("No");
    }
    
    @Override
    public void delete(UserModel u){
        throw new UnsupportedOperationException("No");
    }
    
    @Override
    public List<UserModel> getAll(){
        throw new UnsupportedOperationException("No");
    }
    
      @Override
    public UserModel get(Long id){
        throw new UnsupportedOperationException("No");
    }
    
    
}
