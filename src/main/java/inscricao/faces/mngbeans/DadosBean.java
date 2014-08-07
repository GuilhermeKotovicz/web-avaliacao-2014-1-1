/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.faces.mngbeans;

import inscricao.entity.Usuario;
import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Guilherme
 */
@Named
@ApplicationScoped
public class DadosBean extends PageBean {
    private ArrayList<Usuario> dados = new ArrayList<>();

    public DadosBean() {
    }

    public ArrayList<Usuario> getDados() {
        return dados;
    }

    public void setDados(ArrayList<Usuario> dados) {
        this.dados = dados;
    }
    
}
