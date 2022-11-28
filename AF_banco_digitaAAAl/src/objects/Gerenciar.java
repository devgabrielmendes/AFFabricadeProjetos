package objects;

public class Gerenciar {
    
    public static String cpfLogado;
    public static User cpfUser;
    
    public static String getCpfLogado(){
        return cpfLogado;
    }
    
    public static void setCpfLogado(String cpfLogado) {
        Gerenciar.cpfLogado = cpfLogado;
    }
    
    public static User getCpfUser(){
        return cpfUser;
    }
    
    public static void setCpfUser(User cpf){
        Gerenciar.cpfUser = cpf;
        Gerenciar.setCpfLogado(cpf.getCpfUser());
    }
    
}