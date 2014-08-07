package inscricao.faces.mngbeans;

import inscricao.entity.Usuario;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Guilherme
 */
@ManagedBean
@Named
@SessionScoped
public class LoginBean extends PageBean {
    private String usuario;
    private String senha;
    private boolean adm;

     
    @Inject
    private DadosBean dados;
    
    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public LoginBean() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String entrar() {
        String action = null;
        if (usuario.equals(senha) && isAdm()) {            
            dados.getDados().add(new Usuario(usuario, new Date()));
            action = "admin";
        } else if (usuario.equals(senha) && !isAdm()){
            dados.getDados().add(new Usuario(usuario, new Date()));
            action = "cadastro";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Favor preencher os campos", null));
        }
        return action;
    }
    
    public String logar() {
        return "login";
    }
    
    public String cadastrar() {
        return "cadastro";
    }
    
    public String administrar() {
        return "admin";
    }
}
