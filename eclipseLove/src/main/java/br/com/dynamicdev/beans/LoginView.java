package br.com.dynamicdev.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;

@ManagedBean
@RequestScoped
public class LoginView {

    private String username = "Teste";
    private String password = "123";

    public String login() {
    	
        // Lógica de autenticação 
        if ("usuario".equals(username.trim()) && "senha".equals(password.trim())) {
        	
            // Login bem-sucedido, redirecionar para a página de notificações
            FacesContext facesContext = FacesContext.getCurrentInstance();
            ExternalContext externalContext = facesContext.getExternalContext();
            try {
                externalContext.redirect("/eclipse/basic.xhtml");
            } catch (IOException e) {
                e.printStackTrace(); // Lidar com qualquer exceção de redirecionamento
            }
            return null; // Retornar null para evitar a navegação padrão do JSF
        } else {
            // Login falhou
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de autenticação", "Usuário ou senha inválidos"));
            return null;
        }
    }

    // Getters e setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
