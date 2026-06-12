package Oexcecao.exception.dominio;

public class LoginInvalidoException extends Exception{
    /*
    E outra coisa interessante, você pode criar uma exceção personalizada
     */
    public LoginInvalidoException() {
        super("Login Invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
