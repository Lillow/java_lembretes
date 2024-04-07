package chamadas_de_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author danil
 */
public class ApiExemplo {

    public void getTeste(String link) {
        try {
            // Fazer uma chamada de API
            var url = new URL(link);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            // Ler a resposta da API
            BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuilder resposta = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                resposta.append(linha);
            }
            reader.close();
            // Exibir a resposta recebida
            System.out.println("Resposta da API:");
            System.out.println(resposta.toString());
        } catch (IOException e) {
            System.out.println("Erro ao fazer chamada de API.");
        }
    }

    public void requestTeste(String httpspokeapicoapiv2pokemonditto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
