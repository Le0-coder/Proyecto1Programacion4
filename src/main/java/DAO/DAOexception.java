/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author leosa
 */
public class DAOexception extends Exception{

    public DAOexception(String message) {
        super(message);
    }

    public DAOexception(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOexception(Throwable cause) {
        super(cause);
    }
    
}
