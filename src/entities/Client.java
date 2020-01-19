/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 * Está classe representa o cliente que fez o pedido.
 * @author br03329
 */
public final class Client {
    private String name;
    private String email;
    private Date birthDate;

    /**
     *
     * @param name String que deve armazenar o nome do cliente.
     * @param email String que deve armazenar o email do cliente.
     * @param birthDate Date que deve guardar a data de aniversário do cliente.
     */
    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    /**
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return String email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return Data de aniversário
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     *
     * @param birthDate Date
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
    
}
