package demo.src.main.java.com.example.demo;


@RestController
@RequestMapping(value="/messages")
public class MessageResource {


    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome() {
    
      return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";

    }

    @GetMapping("/login")
    public String login(@RequestParam String user, String password) {
        String resposta = "";
        if(user == null || user == ""){
            resposta = "USUÁRIO E SENHA NÃO INFORMADOS";
        }else if(user.length() >= 15 || password.length() >= 15){
            resposta = "USUÁRIO E SENHA INVÁLIDOS";

        }else{
            resposta = "LOGIN EFETUADO COM SUCESSO !!!";

        }


      return resposta;

    }
}
