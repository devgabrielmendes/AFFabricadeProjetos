package objects;

public class User {
    
    //Atributos User.
    
    public String cpfUser;
    public String nomeUser;
    public String emailUser;
    public String senhaUser;
    public String nascimentoUser;
    public int valorUser;
    
    //Gets

    public String getCpfUser() {
        return cpfUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getSenhaUser() {
        return senhaUser;
    }

    public String getNascimentoUser() {
        return nascimentoUser;
    }

    public int getValorUser() {
        return valorUser;
    }
    
    //Sets

    public void setCpfUser(String cpfUser) {
        this.cpfUser = cpfUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public void setSenhaUser(String senhaUser) {
        this.senhaUser = senhaUser;
    }

    public void setNascimentoUser(String nascimentoUser) {
        this.nascimentoUser = nascimentoUser;
    }

    public void setValorUser(int valorUser) {
        this.valorUser = valorUser;
    }
    
    //Método Construtor.
    
    public User () {
        this.cpfUser = "";
        this.nomeUser = "";
        this.emailUser = "";
        this.senhaUser = "";
        this.nascimentoUser = "";
        this.valorUser = 0;
    }
 
    //Método Limpar User
    
    public void LimparUser () {
        this.setCpfUser ("");
        this.setNomeUser ("");
        this.setEmailUser ("");
        this.setSenhaUser ("");
        this.setNascimentoUser("");
        this.setValorUser (0);
    } 
}