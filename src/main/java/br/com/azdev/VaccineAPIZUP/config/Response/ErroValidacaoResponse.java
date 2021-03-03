package br.com.azdev.VaccineAPIZUP.config.Response;

public class ErroValidacaoResponse{

    private  String campo;
    private  String erro;

    public ErroValidacaoResponse(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
