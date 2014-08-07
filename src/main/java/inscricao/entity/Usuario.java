/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.entity;

import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class Usuario {
    private String name;
    private Date dataAcesso;

    public Usuario(String name, Date dataAcesso){
        this.name = name;
        this.dataAcesso = dataAcesso;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDataAcesso() {
        return dataAcesso;
    }

    public void setDataAcesso(Date dataAcesso) {
        this.dataAcesso = dataAcesso;
    }
    
    
}
