/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;

public interface DAO <T , K> {
    void insert (T a) throws DAOexception;
    void modify (T a) throws DAOexception;
    void delete (T a) throws DAOexception;
    List<T> getAll () throws DAOexception;
    T get(K id) throws DAOexception;
}
